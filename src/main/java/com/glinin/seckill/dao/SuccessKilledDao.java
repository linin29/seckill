/**
 * <b>项目名：</b>秒杀活动<br/>
 * <b>包    名：</b>com.glinin.seckill.dao<br/>
 * <b>文件名：</b>SuccessKilledDao.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年5月24日-下午2:48:01<br/>
 * 
 */
package com.glinin.seckill.dao;

import org.apache.ibatis.annotations.Param;

import com.glinin.seckill.entity.SuccessKilled;

/**
 * <b>类 名：</b>SuccessKilledDao<br/>
 * <b>类描述：</b>秒杀成功DAO层接口<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年5月24日 下午2:48:01<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年5月24日 下午2:48:01<br/>
 * <b>修改备注：</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
public interface SuccessKilledDao
{

    /**
     * insertSuccessKilled(添加秒杀成功记录)
     * 
     * @param seckillId 秒杀活动id
     * @param userPhone 用户手机号码
     * @return 操作结果，成功返回 1，失败返回 0
     * @exception
     * @since 1.0
     * @author ningli
     */
    public int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    /**
     * queryByIdWithSeckill(根据秒杀活动id和用户手机号码查询秒杀成功记录)
     * 
     * @param seckillId 秒杀活动id
     * @param userPhone 用户手机号码
     * @return 秒杀成功记录实体
     * @exception
     * @since 1.0
     * @author ningli
     */
    public SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);
}
