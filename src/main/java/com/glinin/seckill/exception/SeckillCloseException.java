/**
 * <b>��Ŀ����</b>��ɱ�<br/>
 * <b>��  ����</b>com.glinin.seckill.exception<br/>
 * <b>�ļ�����</b>SeckillCloseException.java<br/>
 * <b>�汾��Ϣ��</b>1.0<br/>
 * <b>���ڣ�</b>2016��5��25��-����3:38:15<br/>
 * 
 */
package com.glinin.seckill.exception;

/**
 * <b>�� ����</b>SeckillCloseException<br/>
 * <b>��������</b>��ɱ�ر��쳣<br/>
 * <b>�����ˣ�</b>ningli<br/>
 * <b>����ʱ�䣺</b>2016��5��25�� ����3:38:15<br/>
 * <b>�޸��ˣ�</b>ningli<br/>
 * <b>�޸�ʱ�䣺</b>2016��5��25�� ����3:38:15<br/>
 * <b>�޸ı�ע��</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
public class SeckillCloseException extends SeckillException
{

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * ����һ���µ�ʵ�� SeckillCloseException.
     * 
     * @param message ��Ϣ
     * @param cause �쳣
     */
    public SeckillCloseException(String message, Throwable cause)
    {
        super(message, cause);
    }

    /**
     * ����һ���µ�ʵ�� SeckillCloseException.
     * 
     * @param message ��Ϣ
     */
    public SeckillCloseException(String message)
    {
        super(message);
    }

}
