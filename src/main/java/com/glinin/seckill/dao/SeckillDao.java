/**
 * <b>项目名：</b>秒杀活动<br/>
 * <b>包    名：</b>com.glinin.seckill.dao<br/>
 * <b>文件名：</b>SeckillDao.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年5月24日-下午2:44:20<br/>
 * 
 */
package com.glinin.seckill.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.glinin.seckill.entity.Seckill;

/**
 * <b>类 名：</b>SeckillDao<br/>
 * <b>类描述：</b>秒杀DAO层接口<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年5月24日 下午2:44:20<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年5月24日 下午2:44:20<br/>
 * <b>修改备注：</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
public interface SeckillDao
{

    /**
     * reduceNumber(减少库存数量)
     * 
     * @param seckillId 秒杀活动id
     * @param killTime 秒杀时间
     * @return 操作结果：成功返回 1，失败返回 0
     * @exception
     * @since 1.0
     * @author ningli
     */
    public int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * queryById(根据id查询秒杀活动)
     * 
     * @param seckillId 秒杀活动id
     * @return 秒杀活动实体
     * @exception
     * @since 1.0
     * @author ningli
     */
    public Seckill queryById(long seckillId);

    /**
     * queryAll(查询所有的秒杀活动)
     * 
     * @param offset 页数
     * @param limit 每页显示的条数
     * @return 秒杀活动列表
     * @exception
     * @since 1.0
     * @author ningli
     */
    public List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
