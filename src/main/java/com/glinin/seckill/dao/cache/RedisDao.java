/**
 * <b>��Ŀ����</b>��ɱ�<br/>
 * <b>��   ����</b>com.glinin.seckill.dao.cache<br/>
 * <b>�ļ�����</b>RedisDao.java<br/>
 * <b>�汾��Ϣ��</b>1.0<br/>
 * <b>���ڣ�</b>2016��5��28��-����1:27:18<br/>
 * 
 */
package com.glinin.seckill.dao.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtobufIOUtil;
import com.dyuproject.protostuff.runtime.RuntimeSchema;
import com.glinin.seckill.entity.Seckill;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * <b>�� ����</b>RedisDao<br/>
 * <b>��������</b>redis����DAO��<br/>
 * <b>�����ˣ�</b>ningli<br/>
 * <b>����ʱ�䣺</b>2016��5��28�� ����1:27:18<br/>
 * <b>�޸��ˣ�</b>ningli<br/>
 * <b>�޸�ʱ�䣺</b>2016��5��28�� ����1:27:18<br/>
 * <b>�޸ı�ע��</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
public class RedisDao
{
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final JedisPool jedisPool;
    private RuntimeSchema<Seckill> schema = RuntimeSchema.createFrom(Seckill.class);

    public RedisDao(String ip, int port)
    {
        jedisPool = new JedisPool(ip, port);
    }

    public Seckill getSeckill(long seckillId)
    {
        try
        {
            Jedis jedis = jedisPool.getResource();
            try
            {
                String key = "seckill:" + seckillId;
                // ʵ���ڲ����л�����
                // �Զ������л�
                byte[] bytes = jedis.get(key.getBytes());
                if (bytes != null)
                {
                    // �ն���
                    Seckill seckill = schema.newMessage();
                    ProtobufIOUtil.mergeFrom(bytes, seckill, schema);
                    return seckill;
                }
            }
            finally
            {
                jedis.close();
            }
        }
        catch (Exception e)
        {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    public String putSeckill(Seckill seckill)
    {
        try
        {
            Jedis jedis = jedisPool.getResource();
            try
            {
                String key = "seckill:" + seckill.getSeckillId();
                // ʵ���ڲ����л�����
                // �Զ������л�
                byte[] bytes = ProtobufIOUtil.toByteArray(seckill, schema, LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));
                int timeout = 60 * 60;
                String result = jedis.setex(key.getBytes(), timeout, bytes);
                return result;
            }
            finally
            {
                jedis.close();
            }
        }
        catch (Exception e)
        {
            logger.error(e.getMessage(), e);
        }
        return null;
    }
}
