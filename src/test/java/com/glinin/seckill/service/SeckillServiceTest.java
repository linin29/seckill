/**
 * <b>��Ŀ����</b>��ɱ�<br/>
 * <b>��   ����</b>com.glinin.seckill.service<br/>
 * <b>�ļ�����</b>SeckillServiceTest.java<br/>
 * <b>�汾��Ϣ��</b>1.0<br/>
 * <b>���ڣ�</b>2016��5��25��-����4:34:30<br/>
 * 
 */
package com.glinin.seckill.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.glinin.seckill.dto.Exposer;
import com.glinin.seckill.dto.SeckillExecution;
import com.glinin.seckill.entity.Seckill;
import com.glinin.seckill.exception.RepeatKillException;
import com.glinin.seckill.exception.SeckillCloseException;

/**
 * <b>�� ����</b>SeckillServiceTest<br/>
 * <b>��������</b>��ɱ�service�������<br/>
 * <b>�����ˣ�</b>ningli<br/>
 * <b>����ʱ�䣺</b>2016��5��25�� ����4:34:30<br/>
 * <b>�޸��ˣ�</b>ningli<br/>
 * <b>�޸�ʱ�䣺</b>2016��5��25�� ����4:34:30<br/>
 * <b>�޸ı�ע��</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class SeckillServiceTest
{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SeckillService seckillService;

    @Test
    public void TestGetSeckillList() throws Exception
    {
        List<Seckill> seckillList = seckillService.getSeckillList();
        logger.info("list={}", seckillList);
    }

    @Test
    public void TestGetById() throws Exception
    {
        long seckillId = 1000;
        Seckill seckill = seckillService.getById(seckillId);
        logger.info("seckill={}", seckill);
    }

    @Test
    public void TestExportSeckillUrl() throws Exception
    {
        long seckillId = 1000;
        Exposer exposer = seckillService.exportSeckillUrl(seckillId);
        logger.info("exposer={}", exposer);
    }

    @Test
    public void TestExecuteSeckill() throws SecurityException, RepeatKillException, SeckillCloseException
    {
        long seckillId = 1000;
        long userPhone = 1234566;
        String md5 = "dadfadfadfadfadsfasdfasd";
        SeckillExecution execution = seckillService.executeSeckill(seckillId, userPhone, md5);
        logger.info("execution={}", execution);
    }
}
