/**
 * <b>��Ŀ����</b>���������Ϣ���ۺϽ������<br/>
 * <b>��   ����</b>com.glinin.seckill.dao<br/>
 * <b>�ļ�����</b>SeckillDaoTest.java<br/>
 * <b>�汾��Ϣ��</b>3.1<br/>
 * <b>���ڣ�</b>2016��5��24��-����4:47:20<br/>
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
 * <b>�� ����</b>SeckillDaoTest<br/>
 * <b>��������</b>���������Ĺ���<br/>
 * <b>�����ˣ�</b>ningli<br/>
 * <b>����ʱ�䣺</b>2016��5��24�� ����4:47:20<br/>
 * <b>�޸��ˣ�</b>ningli<br/>
 * <b>�޸�ʱ�䣺</b>2016��5��24�� ����4:47:20<br/>
 * <b>�޸ı�ע��</b><br/>
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
