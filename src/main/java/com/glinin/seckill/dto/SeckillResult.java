/**
 * <b>��Ŀ����</b>��ɱ�<br/>
 * <b>��   ����</b>com.glinin.seckill.dto<br/>
 * <b>�ļ�����</b>SeckillResult.java<br/>
 * <b>�汾��Ϣ��</b>1.0<br/>
 * <b>���ڣ�</b>2016��5��26��-����1:37:04<br/>
 * 
 */
package com.glinin.seckill.dto;

/**
 * <b>�� ����</b>SeckillResult<br/>
 * <b>��������</b>web�㷵�ؽ����װ��<br/>
 * <b>�����ˣ�</b>ningli<br/>
 * <b>����ʱ�䣺</b>2016��5��26�� ����1:37:04<br/>
 * <b>�޸��ˣ�</b>ningli<br/>
 * <b>�޸�ʱ�䣺</b>2016��5��26�� ����1:37:04<br/>
 * <b>�޸ı�ע��</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
public class SeckillResult<T>
{
    private boolean success;

    private T data;

    private String error;

    /**
     * ����һ���µ�ʵ�� SeckillResult.
     * 
     * @param success
     * @param data
     * @param error
     */
    public SeckillResult(boolean success, T data, String error)
    {
        super();
        this.success = success;
        this.data = data;
        this.error = error;
    }

    /**
     * ����һ���µ�ʵ�� SeckillResult.
     * 
     * @param success
     * @param data
     */
    public SeckillResult(boolean success, T data)
    {
        super();
        this.success = success;
        this.data = data;
    }

    /**
     * ����һ���µ�ʵ�� SeckillResult.
     * 
     * @param success
     * @param error
     */
    public SeckillResult(boolean success, String error)
    {
        super();
        this.success = success;
        this.error = error;
    }

    /**
     * ȡ�� success
     * 
     * @return success
     */
    public boolean isSuccess()
    {
        return success;
    }

    /**
     * ���� success
     * 
     * @param success
     */
    public void setSuccess(boolean success)
    {
        this.success = success;
    }

    /**
     * ȡ�� data
     * 
     * @return data
     */
    public T getData()
    {
        return data;
    }

    /**
     * ���� data
     * 
     * @param data
     */
    public void setData(T data)
    {
        this.data = data;
    }

    /**
     * ȡ�� error
     * 
     * @return error
     */
    public String getError()
    {
        return error;
    }

    /**
     * ���� error
     * 
     * @param error
     */
    public void setError(String error)
    {
        this.error = error;
    }

}
