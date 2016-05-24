/**
 * <b>项目名：</b>区域教育信息化综合解决方案<br/>
 * <b>包   名：</b>com.glinin.seckill.entity<br/>
 * <b>文件名：</b>SuccessKilled.java<br/>
 * <b>版本信息：</b>3.1<br/>
 * <b>日期：</b>2016年5月24日-下午2:40:29<br/>
 * 
 */
package com.glinin.seckill.entity;

import java.util.Date;


/**
 * <b>类 名：</b>SuccessKilled<br/>
 * <b>类描述：</b>描述这个类的功能<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年5月24日 下午2:40:29<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年5月24日 下午2:40:29<br/>
 * <b>修改备注：</b><br/>
 * 
 * @version 3.1<br/>
 * 
 */
public class SuccessKilled
{
    private long seckillId;
    private long userPhone;
    private short state;
    private Date createTime;
    private Seckill seckill;

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
     * 取得 userPhone
     * 
     * @return userPhone
     */
    public long getUserPhone()
    {
        return userPhone;
    }

    /**
     * 设置 userPhone
     * 
     * @param userPhone
     */
    public void setUserPhone(long userPhone)
    {
        this.userPhone = userPhone;
    }

    /**
     * 取得 state
     * 
     * @return state
     */
    public short getState()
    {
        return state;
    }

    /**
     * 设置 state
     * 
     * @param state
     */
    public void setState(short state)
    {
        this.state = state;
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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "SuccessKilled [seckillId=" + seckillId + ", userPhone=" + userPhone + ", state=" + state + ", createTime=" + createTime + "]";
    }

    /**
     * 取得 seckill
     *
     * @return seckill
     */
    public Seckill getSeckill()
    {
        return seckill;
    }

    /**
     * 设置 seckill
     *
     * @param seckill
     */
    public void setSeckill(Seckill seckill)
    {
        this.seckill = seckill;
    }
}
