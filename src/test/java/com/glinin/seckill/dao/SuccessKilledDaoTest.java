/**
 * <b>��Ŀ����</b>���������Ϣ���ۺϽ������<br/>
 * <b>��   ����</b>com.glinin.seckill.dao<br/>
 * <b>�ļ�����</b>SuccessKilledDaoTest.java<br/>
 * <b>�汾��Ϣ��</b>3.1<br/>
 * <b>���ڣ�</b>2016��5��24��-����6:31:43<br/>
 * 
 */
package com.glinin.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.glinin.seckill.entity.SuccessKilled;

/**
 * <b>�� ����</b>SuccessKilledDaoTest<br/>
 * <b>��������</b>���������Ĺ���<br/>
 * <b>�����ˣ�</b>ningli<br/>
 * <b>����ʱ�䣺</b>2016��5��24�� ����6:31:43<br/>
 * <b>�޸��ˣ�</b>ningli<br/>
 * <b>�޸�ʱ�䣺</b>2016��5��24�� ����6:31:43<br/>
 * <b>�޸ı�ע��</b><br/>
 * 
 * @version 3.1<br/>
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class SuccessKilledDaoTest
{
    @Autowired
    private SuccessKilledDao successKilledDao;

    @Test
    public void testInsertSuccessKilled() throws Exception
    {
        long id = 1001;
        long phone = 1345677;
        int cout = successKilledDao.insertSuccessKilled(id, phone);
        System.out.println(cout);
    }

    @Test
    public void testQueryByIdWithSeckill() throws Exception
    {
        long id = 1001;
        long phone = 1345677;
        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id, phone);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());
    }
}
