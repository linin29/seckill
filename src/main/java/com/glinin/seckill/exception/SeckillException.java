/**
 * <b>��Ŀ����</b>��ɱ�<br/>
 * <b>��   ����</b>com.glinin.seckill.exception<br/>
 * <b>�ļ�����</b>SeckillException.java<br/>
 * <b>�汾��Ϣ��</b>1.0<br/>
 * <b>���ڣ�</b>2016��5��25��-����3:39:24<br/>
 * 
 */
package com.glinin.seckill.exception;

/**
 * <b>�� ����</b>SeckillException<br/>
 * <b>��������</b>���������Ĺ���<br/>
 * <b>�����ˣ�</b>ningli<br/>
 * <b>����ʱ�䣺</b>2016��5��25�� ����3:39:24<br/>
 * <b>�޸��ˣ�</b>ningli<br/>
 * <b>�޸�ʱ�䣺</b>2016��5��25�� ����3:39:24<br/>
 * <b>�޸ı�ע��</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
public class SeckillException extends RuntimeException
{

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * ����һ���µ�ʵ�� SeckillException.
     * 
     * @param message ��Ϣ
     * @param cause �쳣
     */
    public SeckillException(String message, Throwable cause)
    {
        super(message, cause);
    }

    /**
     * ����һ���µ�ʵ�� SeckillException.
     * 
     * @param message ��Ϣ
     */
    public SeckillException(String message)
    {
        super(message);
    }

}
