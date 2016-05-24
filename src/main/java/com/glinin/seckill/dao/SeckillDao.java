/**
 * <b>项目名：</b>区域教育信息化综合解决方案<br/>
 * <b>包   名：</b>com.glinin.seckill.dao<br/>
 * <b>文件名：</b>SeckillDao.java<br/>
 * <b>版本信息：</b>3.1<br/>
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
 * <b>类描述：</b>描述这个类的功能<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年5月24日 下午2:44:20<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年5月24日 下午2:44:20<br/>
 * <b>修改备注：</b><br/>
 * 
 * @version 3.1<br/>
 * 
 */
public interface SeckillDao
{

    int reduceNumber(@Param("seckillId")long seckillId, @Param("killTime")Date killTime);

    Seckill queryById(long seckillId);

    List<Seckill> queryAll(@Param("offset")int offset, @Param("limit")int limit);
}
