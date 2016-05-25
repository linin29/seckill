/**
 * <b>项目名：</b>秒杀活动<br/>
 * <b>包  名：</b>com.glinin.seckill.enums<br/>
 * <b>文件名：</b>SeckillEnum.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年5月25日-下午4:07:01<br/>
 * 
 */
package com.glinin.seckill.enums;

/**
 * <b>类 名：</b>SeckillEnum<br/>
 * <b>类描述：</b>秒杀活动枚举<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年5月25日 下午4:07:01<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年5月25日 下午4:07:01<br/>
 * <b>修改备注：</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
public enum SeckillEnum
{
    /**
     * SUCCESS:（秒杀成功）
     */
    SUCCESS(1, "秒杀成功"),

    /**
     * END:（秒杀结束）
     */
    END(0, "秒杀结束"),

    /**
     * REPEAT_KILL:（重复秒杀）
     */
    REPEAT_KILL(-1, "重复秒杀"),

    /**
     * INNER_ERROR:（系统异常）
     */
    INNER_ERROR(-2, "系统异常"),

    /**
     * DATA_REWRITE:（数据篡改）
     */
    DATA_REWRITE(-3, "数据篡改");

    /**
     * state:（状态）
     */
    private int state;

    /**
     * stateInfo:（状态信息）
     */
    private String stateInfo;

    /**
     * 创建一个新的实例 SeckillEnum.
     * 
     * @param state 状态
     * @param stateInfo 状态信息
     */
    SeckillEnum(int state, String stateInfo)
    {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    /**
     * stateof(根据状态获取枚举信息)
     * 
     * @param index 状态
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
     * 取得 state
     * 
     * @return state
     */
    public int getState()
    {
        return state;
    }

    /**
     * 取得 stateInfo
     * 
     * @return stateInfo
     */
    public String getStateInfo()
    {
        return stateInfo;
    }

}
