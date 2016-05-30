/**
 * <b>项目名：</b>秒杀活动<br/>
 * <b>包   名：</b>com.glinin.seckill.dao<br/>
 * <b>文件名：</b>RedisDaoTest.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年5月28日-下午1:48:46<br/>
 * 
 */
package com.glinin.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.glinin.seckill.dao.cache.RedisDao;
import com.glinin.seckill.entity.Seckill;

/**
 * <b>类 名：</b>RedisDaoTest<br/>
 * <b>类描述：</b>redisDao测试类<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年5月28日 下午1:48:46<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年5月28日 下午1:48:46<br/>
 * <b>修改备注：</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class RedisDaoTest
{
    @Autowired
    private RedisDao redisDao;
    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void testGetSeckill() throws Exception
    {
        Seckill seckill = redisDao.getSeckill(1001);
        if (seckill == null)
        {
            seckill = seckillDao.queryById(1001);
            if (seckill != null)
            {
                String result = redisDao.putSeckill(seckill);
                System.out.println(result);
                System.out.println(redisDao.getSeckill(1001));
            }
        }
    }

    @Test
    public void testPutSeckill() throws Exception
    {

    }

}
