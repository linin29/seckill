/**
 * <b>��Ŀ����</b>���������Ϣ���ۺϽ������<br/>
 * <b>��   ����</b>com.glinin.seckill.entity<br/>
 * <b>�ļ�����</b>SuccessKilled.java<br/>
 * <b>�汾��Ϣ��</b>3.1<br/>
 * <b>���ڣ�</b>2016��5��24��-����2:40:29<br/>
 * 
 */
package com.glinin.seckill.entity;

import java.util.Date;


/**
 * <b>�� ����</b>SuccessKilled<br/>
 * <b>��������</b>���������Ĺ���<br/>
 * <b>�����ˣ�</b>ningli<br/>
 * <b>����ʱ�䣺</b>2016��5��24�� ����2:40:29<br/>
 * <b>�޸��ˣ�</b>ningli<br/>
 * <b>�޸�ʱ�䣺</b>2016��5��24�� ����2:40:29<br/>
 * <b>�޸ı�ע��</b><br/>
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
     * ȡ�� seckillId
     * 
     * @return seckillId
     */
    public long getSeckillId()
    {
        return seckillId;
    }

    /**
     * ���� seckillId
     * 
     * @param seckillId
     */
    public void setSeckillId(long seckillId)
    {
        this.seckillId = seckillId;
    }

    /**
     * ȡ�� userPhone
     * 
     * @return userPhone
     */
    public long getUserPhone()
    {
        return userPhone;
    }

    /**
     * ���� userPhone
     * 
     * @param userPhone
     */
    public void setUserPhone(long userPhone)
    {
        this.userPhone = userPhone;
    }

    /**
     * ȡ�� state
     * 
     * @return state
     */
    public short getState()
    {
        return state;
    }

    /**
     * ���� state
     * 
     * @param state
     */
    public void setState(short state)
    {
        this.state = state;
    }

    /**
     * ȡ�� createTime
     * 
     * @return createTime
     */
    public Date getCreateTime()
    {
        return createTime;
    }

    /**
     * ���� createTime
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
     * ȡ�� seckill
     *
     * @return seckill
     */
    public Seckill getSeckill()
    {
        return seckill;
    }

    /**
     * ���� seckill
     *
     * @param seckill
     */
    public void setSeckill(Seckill seckill)
    {
        this.seckill = seckill;
    }
}
