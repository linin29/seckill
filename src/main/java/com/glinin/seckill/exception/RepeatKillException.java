/**
 * <b>��Ŀ����</b>��ɱ�<br/>
 * <b>��  ����</b>com.glinin.seckill.exception<br/>
 * <b>�ļ�����</b>RepeatKillException.java<br/>
 * <b>�汾��Ϣ��</b>1.0<br/>
 * <b>���ڣ�</b>2016��5��25��-����3:36:23<br/>
 * 
 */
package com.glinin.seckill.exception;

/**
 * <b>�� ����</b>RepeatKillException<br/>
 * <b>��������</b>�ظ���ɱ�쳣<br/>
 * <b>�����ˣ�</b>ningli<br/>
 * <b>����ʱ�䣺</b>2016��5��25�� ����3:36:23<br/>
 * <b>�޸��ˣ�</b>ningli<br/>
 * <b>�޸�ʱ�䣺</b>2016��5��25�� ����3:36:23<br/>
 * <b>�޸ı�ע��</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
public class RepeatKillException extends SeckillException
{

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * ����һ���µ�ʵ�� RepeatKillException.
     * 
     * @param message ��Ϣ
     */
    public RepeatKillException(String message)
    {
        super(message);
    }

    /**
     * ����һ���µ�ʵ�� RepeatKillException.
     * 
     * @param message ��Ϣ
     * @param cause �쳣
     */
    public RepeatKillException(String message, Throwable cause)
    {
        super(message, cause);
    }

}
