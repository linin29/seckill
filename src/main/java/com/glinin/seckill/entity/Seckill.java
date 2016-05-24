/**
 * <b>项目名：</b>区域教育信息化综合解决方案<br/>
 * <b>包   名：</b>com.glinin.seckill.entity<br/>
 * <b>文件名：</b>Seckill.java<br/>
 * <b>版本信息：</b>3.1<br/>
 * <b>日期：</b>2016年5月24日-下午2:21:11<br/>
 * 
 */
package com.glinin.seckill.entity;

import java.util.Date;


/**
 * <b>类 名：</b>Seckill<br/>
 * <b>类描述：</b>m<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年5月24日 下午2:21:11<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年5月24日 下午2:21:11<br/>
 * <b>修改备注：</b><br/>
 * 
 * @version 3.1<br/>
 * 
 */
public class Seckill
{
    private long seckillId;
    private String name;
    private int number;
    private Date startTime;
    private Date endTime;
    private Date createTime;

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
     * 取得 name
     * 
     * @return name
     */
    public String getName()
    {
        return name;
    }

    /**
     * 设置 name
     * 
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * 取得 number
     * 
     * @return number
     */
    public int getNumber()
    {
        return number;
    }

    /**
     * 设置 number
     * 
     * @param number
     */
    public void setNumber(int number)
    {
        this.number = number;
    }

    /**
     * 取得 startTime
     * 
     * @return startTime
     */
    public Date getStartTime()
    {
        return startTime;
    }

    /**
     * 设置 startTime
     * 
     * @param startTime
     */
    public void setStartTime(Date startTime)
    {
        this.startTime = startTime;
    }

    /**
     * 取得 endTime
     * 
     * @return endTime
     */
    public Date getEndTime()
    {
        return endTime;
    }

    /**
     * 设置 endTime
     * 
     * @param endTime
     */
    public void setEndTime(Date endTime)
    {
        this.endTime = endTime;
    }

    /**
     * 取得 createTime
     * 
     * @return createTime
     */
    public Date getCreateTime()
    {
        return createTime;
    }

    /**
     * 设置 createTime
     * 
     * @param createTime
     */
    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }


    @Override
    public String toString()
    {
        return "Seckill [seckillId=" + seckillId + ", name=" + name + ", number=" + number + ", startTime=" + startTime + ", endTime=" + endTime
                + ", createTime=" + createTime + "]";
    }
}
