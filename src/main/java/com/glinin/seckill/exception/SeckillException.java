/**
 * <b>项目名：</b>秒杀活动<br/>
 * <b>包   名：</b>com.glinin.seckill.exception<br/>
 * <b>文件名：</b>SeckillException.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年5月25日-下午3:39:24<br/>
 * 
 */
package com.glinin.seckill.exception;

/**
 * <b>类 名：</b>SeckillException<br/>
 * <b>类描述：</b>描述这个类的功能<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年5月25日 下午3:39:24<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年5月25日 下午3:39:24<br/>
 * <b>修改备注：</b><br/>
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
     * 创建一个新的实例 SeckillException.
     * 
     * @param message 信息
     * @param cause 异常
     */
    public SeckillException(String message, Throwable cause)
    {
        super(message, cause);
    }

    /**
     * 创建一个新的实例 SeckillException.
     * 
     * @param message 信息
     */
    public SeckillException(String message)
    {
        super(message);
    }

}
