/**
 * <b>项目名：</b>秒杀活动<br/>
 * <b>包   名：</b>com.glinin.seckill.dto<br/>
 * <b>文件名：</b>SeckillResult.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年5月26日-下午1:37:04<br/>
 * 
 */
package com.glinin.seckill.dto;

/**
 * <b>类 名：</b>SeckillResult<br/>
 * <b>类描述：</b>web层返回结果封装类<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年5月26日 下午1:37:04<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年5月26日 下午1:37:04<br/>
 * <b>修改备注：</b><br/>
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
     * 创建一个新的实例 SeckillResult.
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
     * 创建一个新的实例 SeckillResult.
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
     * 创建一个新的实例 SeckillResult.
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
     * 取得 success
     * 
     * @return success
     */
    public boolean isSuccess()
    {
        return success;
    }

    /**
     * 设置 success
     * 
     * @param success
     */
    public void setSuccess(boolean success)
    {
        this.success = success;
    }

    /**
     * 取得 data
     * 
     * @return data
     */
    public T getData()
    {
        return data;
    }

    /**
     * 设置 data
     * 
     * @param data
     */
    public void setData(T data)
    {
        this.data = data;
    }

    /**
     * 取得 error
     * 
     * @return error
     */
    public String getError()
    {
        return error;
    }

    /**
     * 设置 error
     * 
     * @param error
     */
    public void setError(String error)
    {
        this.error = error;
    }

}
