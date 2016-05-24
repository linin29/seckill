/**
 * <b>项目名：</b>区域教育信息化综合解决方案<br/>
 * <b>包   名：</b>com.glinin.seckill.dao<br/>
 * <b>文件名：</b>SeckillDaoTest.java<br/>
 * <b>版本信息：</b>3.1<br/>
 * <b>日期：</b>2016年5月24日-下午4:47:20<br/>
 * 
 */
package com.glinin.seckill.dao;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.glinin.seckill.entity.Seckill;

/**
 * <b>类 名：</b>SeckillDaoTest<br/>
 * <b>类描述：</b>描述这个类的功能<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年5月24日 下午4:47:20<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年5月24日 下午4:47:20<br/>
 * <b>修改备注：</b><br/>
 * 
 * @version 3.1<br/>
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class SeckillDaoTest
{
    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void testReduceNumber() throws Exception
    {
        Date killTime = new Date();
        int count = seckillDao.reduceNumber(1000, killTime);
        System.out.println(count);
    }

    @Test
    public void testQueryById() throws Exception
    {
        long seckillId = 1000;
        Seckill seckill = seckillDao.queryById(seckillId);
        System.out.println(seckill.getName());
    }

    @Test
    public void testQueryAll() throws Exception
    {
        List<Seckill> seckillList = seckillDao.queryAll(0, 100);
        for (Seckill seckill : seckillList)
        {
            System.out.println(seckill.getName());
        }
    }
}
