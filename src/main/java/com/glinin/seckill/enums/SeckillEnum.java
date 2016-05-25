/**
 * <b>��Ŀ����</b>��ɱ�<br/>
 * <b>��  ����</b>com.glinin.seckill.enums<br/>
 * <b>�ļ�����</b>SeckillEnum.java<br/>
 * <b>�汾��Ϣ��</b>1.0<br/>
 * <b>���ڣ�</b>2016��5��25��-����4:07:01<br/>
 * 
 */
package com.glinin.seckill.enums;

/**
 * <b>�� ����</b>SeckillEnum<br/>
 * <b>��������</b>��ɱ�ö��<br/>
 * <b>�����ˣ�</b>ningli<br/>
 * <b>����ʱ�䣺</b>2016��5��25�� ����4:07:01<br/>
 * <b>�޸��ˣ�</b>ningli<br/>
 * <b>�޸�ʱ�䣺</b>2016��5��25�� ����4:07:01<br/>
 * <b>�޸ı�ע��</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
public enum SeckillEnum
{
    /**
     * SUCCESS:����ɱ�ɹ���
     */
    SUCCESS(1, "��ɱ�ɹ�"),

    /**
     * END:����ɱ������
     */
    END(0, "��ɱ����"),

    /**
     * REPEAT_KILL:���ظ���ɱ��
     */
    REPEAT_KILL(-1, "�ظ���ɱ"),

    /**
     * INNER_ERROR:��ϵͳ�쳣��
     */
    INNER_ERROR(-2, "ϵͳ�쳣"),

    /**
     * DATA_REWRITE:�����ݴ۸ģ�
     */
    DATA_REWRITE(-3, "���ݴ۸�");

    /**
     * state:��״̬��
     */
    private int state;

    /**
     * stateInfo:��״̬��Ϣ��
     */
    private String stateInfo;

    /**
     * ����һ���µ�ʵ�� SeckillEnum.
     * 
     * @param state ״̬
     * @param stateInfo ״̬��Ϣ
     */
    SeckillEnum(int state, String stateInfo)
    {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    /**
     * stateof(����״̬��ȡö����Ϣ)
     * 
     * @param index ״̬
     * @return SeckillEnum
     * @exception
     * @since 1.0
     * @author ningli
     */
    public static SeckillEnum stateof(int index)
    {
        for (SeckillEnum seckillEnum : SeckillEnum.values())
        {
            if (seckillEnum.getState() == index)
            {
                return seckillEnum;
            }
        }
        return null;
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
     * ȡ�� stateInfo
     * 
     * @return stateInfo
     */
    public String getStateInfo()
    {
        return stateInfo;
    }

}
