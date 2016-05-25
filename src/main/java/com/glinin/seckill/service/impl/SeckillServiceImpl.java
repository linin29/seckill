/**
 * <b>项目名：</b>秒杀活动<br/>
 * <b>包  名：</b>com.glinin.seckill.service.impl<br/>
 * <b>文件名：</b>SeckillServiceImpl.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年5月25日-下午1:32:55<br/>
 * 
 */
package com.glinin.seckill.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import com.glinin.seckill.dao.SeckillDao;
import com.glinin.seckill.dao.SuccessKilledDao;
import com.glinin.seckill.dto.Exposer;
import com.glinin.seckill.dto.SeckillExecution;
import com.glinin.seckill.entity.Seckill;
import com.glinin.seckill.entity.SuccessKilled;
import com.glinin.seckill.enums.SeckillEnum;
import com.glinin.seckill.exception.RepeatKillException;
import com.glinin.seckill.exception.SeckillCloseException;
import com.glinin.seckill.exception.SeckillException;
import com.glinin.seckill.service.SeckillService;

/**
 * <b>类 名：</b>SeckillServiceImpl<br/>
 * <b>类描述：</b>秒杀活动sevice层实现类<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年5月25日 下午1:32:55<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年5月25日 下午1:32:55<br/>
 * <b>修改备注：</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
@Service
public class SeckillServiceImpl implements SeckillService
{
    /**
     * logger:（日志）
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * flt:（用于md5加密）
     */
    private final String flt = "afafdadfa?%d$#FDddfdedaef!@dsdagfgdfg";

    @Autowired
    private SeckillDao seckillDao;
    
    @Autowired
    private SuccessKilledDao successKilledDao;

    @Override
    public List<Seckill> getSeckillList()
    {
        return seckillDao.queryAll(0, 10);
    }

    @Override
    public Seckill getById(long seckillId)
    {
        return seckillDao.queryById(seckillId);
    }

    @Override
    public Exposer exportSeckillUrl(long seckillId)
    {
        Seckill seckill = seckillDao.queryById(seckillId);
        if (seckill == null)
        {
            return new Exposer(false, seckillId);
        }
        Date startTime = seckill.getStartTime();
        Date endTime = seckill.getEndTime();
        Date nowTime = new Date();
        if (nowTime.getTime() < startTime.getTime() || nowTime.getTime() > endTime.getTime())
        {
            return new Exposer(false, seckillId, nowTime.getTime(), startTime.getTime(), endTime.getTime());
        }
        String md5 = getMD5(seckillId);
        return new Exposer(true, md5, seckillId);
    }

    @Override
    @Transactional
    public SeckillExecution executeSeckill(long seckillId, long userPhone, String md5) throws SecurityException, RepeatKillException,
            SeckillCloseException
    {
        if (md5 == null || !md5.equals(getMD5(seckillId)))
        {
            throw new SeckillException("seckill data rewrite");
        }
        Date now = new Date();
        try
        {
            int updateCount = seckillDao.reduceNumber(seckillId, now);
            if (updateCount <= 0)
            {
                throw new SeckillCloseException("seckill is closed");
            }
            else
            {
                int insertCount = successKilledDao.insertSuccessKilled(seckillId, userPhone);
                if (insertCount <= 0)
                {
                    throw new RepeatKillException("seckill repeat");
                }
                else
                {
                    SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(seckillId, userPhone);
                    return new SeckillExecution(seckillId, SeckillEnum.SUCCESS, successKilled);
                }
            }
        }
        catch (SeckillCloseException e1)
        {
            throw e1;
        }
        catch (RepeatKillException e2)
        {
            throw e2;
        }
        catch (Exception e)
        {
            logger.error(e.getMessage(), e);
            throw new SeckillException("seckill inner error" + e.getMessage());
        }
    }

    private String getMD5(long seckillId)
    {
        String base = seckillId + "/" + flt;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }

}
