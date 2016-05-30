/**
 * <b>项目名：</b>秒杀活动<br/>
 * <b>包   名：</b>com.glinin.seckill.dao.cache<br/>
 * <b>文件名：</b>RedisDao.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年5月28日-下午1:27:18<br/>
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
 * <b>类 名：</b>RedisDao<br/>
 * <b>类描述：</b>redis缓存DAO层<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年5月28日 下午1:27:18<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年5月28日 下午1:27:18<br/>
 * <b>修改备注：</b><br/>
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
                // 实现内部序列化操作
                // 自定义序列化
                byte[] bytes = jedis.get(key.getBytes());
                if (bytes != null)
                {
                    // 空对象
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
                // 实现内部序列化操作
                // 自定义序列化
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
