/**
 * <b>��Ŀ����</b>��ɱ�<br/>
 * <b>��  ����</b>com.glinin.seckill.entity<br/>
 * <b>�ļ�����</b>Seckill.java<br/>
 * <b>�汾��Ϣ��</b>1.0<br/>
 * <b>���ڣ�</b>2016��5��24��-����2:21:11<br/>
 * 
 */
package com.glinin.seckill.entity;

import java.util.Date;

/**
 * <b>�� ����</b>Seckill<br/>
 * <b>��������</b>��ɱ�ʵ����<br/>
 * <b>�����ˣ�</b>ningli<br/>
 * <b>����ʱ�䣺</b>2016��5��24�� ����2:21:11<br/>
 * <b>�޸��ˣ�</b>ningli<br/>
 * <b>�޸�ʱ�䣺</b>2016��5��24�� ����2:21:11<br/>
 * <b>�޸ı�ע��</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
public class Seckill
{
    /**
     * seckillId:����ɱ�id��
     */
    private long seckillId;

    /**
     * name:����ɱ����ƣ�
     */
    private String name;

    /**
     * number:��������
     */
    private int number;

    /**
     * startTime:����ɱ��ʼʱ�䣩
     */
    private Date startTime;

    /**
     * endTime:����ɱ����ʱ�䣩
     */
    private Date endTime;

    /**
     * createTime:����ɱ�����ʱ�䣩
     */
    private Date createTime;

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
     * ȡ�� name
     * 
     * @return name
     */
    public String getName()
    {
        return name;
    }

    /**
     * ���� name
     * 
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * ȡ�� number
     * 
     * @return number
     */
    public int getNumber()
    {
        return number;
    }

    /**
     * ���� number
     * 
     * @param number
     */
    public void setNumber(int number)
    {
        this.number = number;
    }

    /**
     * ȡ�� startTime
     * 
     * @return startTime
     */
    public Date getStartTime()
    {
        return startTime;
    }

    /**
     * ���� startTime
     * 
     * @param startTime
     */
    public void setStartTime(Date startTime)
    {
        this.startTime = startTime;
    }

    /**
     * ȡ�� endTime
     * 
     * @return endTime
     */
    public Date getEndTime()
    {
        return endTime;
    }

    /**
     * ���� endTime
     * 
     * @param endTime
     */
    public void setEndTime(Date endTime)
    {
        this.endTime = endTime;
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

    @Override
    public String toString()
    {
        return "Seckill [seckillId=" + seckillId + ", name=" + name + ", number=" + number + ", startTime=" + startTime + ", endTime=" + endTime
                + ", createTime=" + createTime + "]";
    }
}
