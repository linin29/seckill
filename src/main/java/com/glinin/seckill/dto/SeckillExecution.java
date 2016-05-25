/**
 * <b>��Ŀ����</b>��ɱ�<br/>
 * <b>��  ����</b>com.glinin.seckill.dto<br/>
 * <b>�ļ�����</b>SeckillExecution.java<br/>
 * <b>�汾��Ϣ��</b>1.0<br/>
 * <b>���ڣ�</b>2016��5��25��-����3:32:27<br/>
 * 
 */
package com.glinin.seckill.dto;

import com.glinin.seckill.entity.SuccessKilled;
import com.glinin.seckill.enums.SeckillEnum;

/**
 * <b>�� ����</b>SeckillExecution<br/>
 * <b>��������</b>��ɱ�ɹ���Ľ��dto<br/>
 * <b>�����ˣ�</b>ningli<br/>
 * <b>����ʱ�䣺</b>2016��5��25�� ����3:32:27<br/>
 * <b>�޸��ˣ�</b>ningli<br/>
 * <b>�޸�ʱ�䣺</b>2016��5��25�� ����3:32:27<br/>
 * <b>�޸ı�ע��</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
public class SeckillExecution
{
    /**
     * seckillId:����ɱ�id��
     */
    private long seckillId;

    /**
     * state:��״̬��
     */
    private int state;

    /**
     * stateInfo:��״̬��Ϣ��
     */
    private String stateInfo;

    /**
     * successKilled:����ɱ�ɹ�ʵ�壩
     */
    private SuccessKilled successKilled;

    /**
     * ����һ���µ�ʵ�� SeckillExecution.
     * 
     * @param seckillId ��ɱ�id
     * @param state ״̬
     * @param stateInfo ״̬��Ϣ
     * @param successKilled ��ɱ�ɹ�ʵ��
     */
    public SeckillExecution(long seckillId, SeckillEnum seckillEnum, SuccessKilled successKilled)
    {
        super();
        this.seckillId = seckillId;
        this.state = seckillEnum.getState();
        this.stateInfo = seckillEnum.getStateInfo();
        this.successKilled = successKilled;
    }

    /**
     * ����һ���µ�ʵ�� SeckillExecution.
     * 
     * @param seckillId ��ɱ�id
     * @param state ״̬
     * @param stateInfo ״̬��Ϣ
     */
    public SeckillExecution(long seckillId, SeckillEnum seckillEnum)
    {
        super();
        this.seckillId = seckillId;
        this.state = seckillEnum.getState();
        this.stateInfo = seckillEnum.getStateInfo();
    }

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
     * ȡ�� state
     * 
     * @return state
     */
    public int getState()
    {
        return state;
    }

    /**
     * ���� state
     * 
     * @param state
     */
    public void setState(int state)
    {
        this.state = state;
    }

    /**
     * ȡ�� stateInfo
     * 
     * @return stateInfo
     */
    public String getStateInfo()
    {
        return stateInfo;
    }

    /**
     * ���� stateInfo
     * 
     * @param stateInfo
     */
    public void setStateInfo(String stateInfo)
    {
        this.stateInfo = stateInfo;
    }

    /**
     * ȡ�� successKilled
     * 
     * @return successKilled
     */
    public SuccessKilled getSuccessKilled()
    {
        return successKilled;
    }

    /**
     * ���� successKilled
     * 
     * @param successKilled
     */
    public void setSuccessKilled(SuccessKilled successKilled)
    {
        this.successKilled = successKilled;
    }

}
