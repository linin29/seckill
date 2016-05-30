/**
 * <b>项目名：</b>秒杀活动<br/>
 * <b>包  名：</b>com.glinin.seckill.web<br/>
 * <b>文件名：</b>SeckillController.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年5月26日-上午11:25:48<br/>
 * 
 */
package com.glinin.seckill.web;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.glinin.seckill.dto.Exposer;
import com.glinin.seckill.dto.SeckillExecution;
import com.glinin.seckill.dto.SeckillResult;
import com.glinin.seckill.entity.Seckill;
import com.glinin.seckill.enums.SeckillEnum;
import com.glinin.seckill.exception.RepeatKillException;
import com.glinin.seckill.exception.SeckillCloseException;
import com.glinin.seckill.service.SeckillService;

/**
 * <b>类 名：</b>SeckillController<br/>
 * <b>类描述：</b>秒杀活动controller层<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年5月26日 上午11:25:48<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年5月26日 上午11:25:48<br/>
 * <b>修改备注：</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
@Controller
@RequestMapping("/seckill")
// url:模块/资源/{id}/细分
public class SeckillController
{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SeckillService seckillService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model)
    {
        List<Seckill> list = seckillService.getSeckillList();
        model.addAttribute("list", list);
        return "list";
    }

    @RequestMapping(value = "/{seckillId}/detail", method = RequestMethod.GET)
    public String detail(@PathVariable("seckillId") Long seckillId, Model model)
    {
        if (seckillId == null)
        {
            return "redirect:/seckill/list";
        }
        Seckill seckill = seckillService.getById(seckillId);
        if (seckill == null)
        {
            return "forward:/seckill/list";
        }
        model.addAttribute("seckill", seckill);
        return "detail";
    }

    @RequestMapping(value = "/{seckillId}/exposer", method = RequestMethod.POST, produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public SeckillResult<Exposer> exposer(@PathVariable Long seckillId)
    {
        SeckillResult<Exposer> result;
        try
        {
            Exposer exposer = seckillService.exportSeckillUrl(seckillId);
            result = new SeckillResult<Exposer>(true, exposer);
        }
        catch (Exception e)
        {
            logger.error(e.getMessage(), e);
            result = new SeckillResult<>(false, e.getMessage());
        }
        return result;
    }

    @RequestMapping(value = "/{seckillId}/{md5}/execution", method = RequestMethod.POST, produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public SeckillResult<SeckillExecution> execute(@PathVariable("seckillId") Long seckillId, @PathVariable("md5") String md5,
            @CookieValue(value = "killPhone", required = false) Long userPhone)
    {
        if (userPhone == null)
        {
            return new SeckillResult<SeckillExecution>(false, "未注册手机号码");
        }
        try
        {
            //SeckillExecution execution = seckillService.executeSeckill(seckillId, userPhone, md5);
            SeckillExecution execution = seckillService.executeSeckillProcedure(seckillId, userPhone, md5);
            return new SeckillResult<SeckillExecution>(true, execution);
        }
        catch (RepeatKillException e)
        {
            SeckillExecution execution = new SeckillExecution(seckillId, SeckillEnum.REPEAT_KILL);
            return new SeckillResult<SeckillExecution>(true, execution);
        }
        catch (SeckillCloseException e)
        {
            SeckillExecution execution = new SeckillExecution(seckillId, SeckillEnum.END);
            return new SeckillResult<SeckillExecution>(true, execution);
        }
        catch (Exception e)
        {
            logger.error(e.getMessage(), e);
            SeckillExecution execution = new SeckillExecution(seckillId, SeckillEnum.INNER_ERROR);
            return new SeckillResult<SeckillExecution>(true, execution);
        }
    }

    @RequestMapping(value = "/now/time", method = RequestMethod.GET)
    @ResponseBody
    public SeckillResult<Long> time()
    {
        Date date = new Date();
        return new SeckillResult<Long>(true, date.getTime());
    }
}
