/**
 * <b>项目名：</b>秒杀活动<br/>
 * <b>包  名：</b>com.glinin.seckill.service<br/>
 * <b>文件名：</b>SeckillService.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年5月25日-下午1:32:05<br/>
 * 
 */
package com.glinin.seckill.service;

import java.util.List;

import com.glinin.seckill.dto.Exposer;
import com.glinin.seckill.dto.SeckillExecution;
import com.glinin.seckill.entity.Seckill;
import com.glinin.seckill.exception.RepeatKillException;
import com.glinin.seckill.exception.SeckillCloseException;

/**
 * <b>类 名：</b>SeckillService<br/>
 * <b>类描述：</b>秒杀活动sevice层接口<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年5月25日 下午1:32:05<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年5月25日 下午1:32:05<br/>
 * <b>修改备注：</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
public interface SeckillService
{

    /**
     * getSeckillList(获取秒杀活动列表)
     * 
     * @return 秒杀活动列表
     * @exception
     * @since 1.0
     * @author ningli
     */
    public List<Seckill> getSeckillList();

    /**
     * getById(根据id获取秒杀活动)
     * 
     * @param seckillId 秒杀活动id
     * @return 秒杀活动实体
     * @exception
     * @since 1.0
     * @author ningli
     */
    public Seckill getById(long seckillId);

    /**
     * exportSeckillUrl(暴露秒杀地址)
     * 
     * @param seckillId 秒杀活动id
     * @return 秒杀地址
     * @exception
     * @since 1.0
     * @author ningli
     */
    public Exposer exportSeckillUrl(long seckillId);

    /**
     * executeSeckill(执行秒杀)
     * 
     * @param seckillId 秒杀活动id
     * @param userPhone 用户手机号码
     * @param md5 md5加密
     * @return 秒杀成功执行实体
     * @throws SecurityException 秒杀活动异常
     * @throws RepeatKillException 重复秒杀异常
     * @throws SeckillCloseException 秒杀结束异常
     * @exception
     * @since 1.0
     * @author ningli
     */
    public SeckillExecution executeSeckill(long seckillId, long userPhone, String md5) throws SecurityException, RepeatKillException,
            SeckillCloseException;
    
    /**
     * executeSeckillProcedure(执行秒杀,用存储过程)
     * 
     * @param seckillId 秒杀活动id
     * @param userPhone 用户手机号码
     * @param md5 md5加密
     * @return 秒杀成功执行实体
     * @throws SecurityException 秒杀活动异常
     * @throws RepeatKillException 重复秒杀异常
     * @throws SeckillCloseException 秒杀结束异常
     * @exception
     * @since 1.0
     * @author ningli
     */
    public SeckillExecution executeSeckillProcedure(long seckillId, long userPhone, String md5) throws SecurityException, RepeatKillException,
            SeckillCloseException;

}
