/**
 * <b>��Ŀ����</b>��ɱ�<br/>
 * <b>��   ����</b>com.glinin.seckill.dao<br/>
 * <b>�ļ�����</b>RedisDaoTest.java<br/>
 * <b>�汾��Ϣ��</b>1.0<br/>
 * <b>���ڣ�</b>2016��5��28��-����1:48:46<br/>
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
 * <b>�� ����</b>RedisDaoTest<br/>
 * <b>��������</b>redisDao������<br/>
 * <b>�����ˣ�</b>ningli<br/>
 * <b>����ʱ�䣺</b>2016��5��28�� ����1:48:46<br/>
 * <b>�޸��ˣ�</b>ningli<br/>
 * <b>�޸�ʱ�䣺</b>2016��5��28�� ����1:48:46<br/>
 * <b>�޸ı�ע��</b><br/>
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
