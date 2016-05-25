/**
 * <b>项目名：</b>秒杀活动<br/>
 * <b>包   名：</b>com.glinin.seckill.service<br/>
 * <b>文件名：</b>SeckillServiceTest.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年5月25日-下午4:34:30<br/>
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
 * <b>类 名：</b>SeckillServiceTest<br/>
 * <b>类描述：</b>秒杀活动service层测试类<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年5月25日 下午4:34:30<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年5月25日 下午4:34:30<br/>
 * <b>修改备注：</b><br/>
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
