/**
 * <b>��Ŀ����</b>��ɱ�<br/>
 * <b>��  ����</b>com.glinin.seckill.web<br/>
 * <b>�ļ�����</b>SeckillController.java<br/>
 * <b>�汾��Ϣ��</b>1.0<br/>
 * <b>���ڣ�</b>2016��5��26��-����11:25:48<br/>
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
 * <b>�� ����</b>SeckillController<br/>
 * <b>��������</b>��ɱ�controller��<br/>
 * <b>�����ˣ�</b>ningli<br/>
 * <b>����ʱ�䣺</b>2016��5��26�� ����11:25:48<br/>
 * <b>�޸��ˣ�</b>ningli<br/>
 * <b>�޸�ʱ�䣺</b>2016��5��26�� ����11:25:48<br/>
 * <b>�޸ı�ע��</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
@Controller
@RequestMapping("/seckill")
// url:ģ��/��Դ/{id}/ϸ��
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
            return new SeckillResult<SeckillExecution>(false, "δע���ֻ�����");
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
