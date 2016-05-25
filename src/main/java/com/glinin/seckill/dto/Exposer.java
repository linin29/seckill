/**
 * <b>项目名：</b>秒杀活动<br/>
 * <b>包  名：</b>com.glinin.seckill.dto<br/>
 * <b>文件名：</b>Exposer.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年5月25日-下午3:24:08<br/>
 * 
 */
package com.glinin.seckill.dto;

/**
 * <b>类 名：</b>Exposer<br/>
 * <b>类描述：</b>暴露秒杀地址dto<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年5月25日 下午3:24:08<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年5月25日 下午3:24:08<br/>
 * <b>修改备注：</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
public class Exposer
{
    /**
     * exposed:（是否暴露地址）
     */
    private boolean exposed;

    /**
     * md5:（md5加密）
     */
    private String md5;

    /**
     * seckillId:（秒杀活动id）
     */
    private long seckillId;

    /**
     * now:（当前时间，毫秒）
     */
    private long now;

    /**
     * start:（开始时间，毫秒）
     */
    private long start;

    /**
     * end:（结束时间，毫秒）
     */
    private long end;

    /**
     * 创建一个新的实例 Exposer.
     * 
     * @param exposed 是否暴露地址
     * @param md5 md5加密
     * @param seckillId 秒杀活动id
     */
    public Exposer(boolean exposed, String md5, long seckillId)
    {
        super();
        this.exposed = exposed;
        this.md5 = md5;
        this.seckillId = seckillId;
    }

    /**
     * 创建一个新的实例 Exposer.
     * 
     * @param exposed 是否暴露地址
     * @param now 当前时间，毫秒
     * @param start 开始时间，毫秒
     * @param end 结束时间，毫秒
     */
    public Exposer(boolean exposed, long now, long start, long end)
    {
        super();
        this.exposed = exposed;
        this.now = now;
        this.start = start;
        this.end = end;
    }

    /**
     * 创建一个新的实例 Exposer.
     * 
     * @param exposed 是否暴露地址
     * @param seckillId 秒杀活动id
     * @param now 当前时间，毫秒
     * @param start 开始时间，毫秒
     * @param end 结束时间，毫秒
     */
    public Exposer(boolean exposed, long seckillId, long now, long start, long end)
    {
        super();
        this.exposed = exposed;
        this.seckillId = seckillId;
        this.now = now;
        this.start = start;
        this.end = end;
    }

    /**
     * 创建一个新的实例 Exposer.
     * 
     * @param exposed 是否暴露地址
     * @param seckillId 秒杀活动id
     */
    public Exposer(boolean exposed, long seckillId)
    {
        super();
        this.exposed = exposed;
        this.seckillId = seckillId;
    }

    /**
     * 取得 exposed
     * 
     * @return exposed
     */
    public boolean isExposed()
    {
        return exposed;
    }

    /**
     * 设置 exposed
     * 
     * @param exposed
     */
    public void setExposed(boolean exposed)
    {
        this.exposed = exposed;
    }

    /**
     * 取得 md5
     * 
     * @return md5
     */
    public String getMd5()
    {
        return md5;
    }

    /**
     * 设置 md5
     * 
     * @param md5
     */
    public void setMd5(String md5)
    {
        this.md5 = md5;
    }

    /**
     * 取得 seckillId
     * 
     * @return seckillId
     */
    public long getSeckillId()
    {
        return seckillId;
    }

    /**
     * 设置 seckillId
     * 
     * @param seckillId
     */
    public void setSeckillId(long seckillId)
    {
        this.seckillId = seckillId;
    }

    /**
     * 取得 now
     * 
     * @return now
     */
    public long getNow()
    {
        return now;
    }

    /**
     * 设置 now
     * 
     * @param now
     */
    public void setNow(long now)
    {
        this.now = now;
    }

    /**
     * 取得 start
     * 
     * @return start
     */
    public long getStart()
    {
        return start;
    }

    /**
     * 设置 start
     * 
     * @param start
     */
    public void setStart(long start)
    {
        this.start = start;
    }

    /**
     * 取得 end
     * 
     * @return end
     */
    public long getEnd()
    {
        return end;
    }

    /**
     * 设置 end
     * 
     * @param end
     */
    public void setEnd(long end)
    {
        this.end = end;
    }

}
