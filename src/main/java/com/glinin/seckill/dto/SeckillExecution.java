/**
 * <b>项目名：</b>秒杀活动<br/>
 * <b>包  名：</b>com.glinin.seckill.dto<br/>
 * <b>文件名：</b>SeckillExecution.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年5月25日-下午3:32:27<br/>
 * 
 */
package com.glinin.seckill.dto;

import com.glinin.seckill.entity.SuccessKilled;
import com.glinin.seckill.enums.SeckillEnum;

/**
 * <b>类 名：</b>SeckillExecution<br/>
 * <b>类描述：</b>秒杀成功后的结果dto<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年5月25日 下午3:32:27<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年5月25日 下午3:32:27<br/>
 * <b>修改备注：</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
public class SeckillExecution
{
    /**
     * seckillId:（秒杀活动id）
     */
    private long seckillId;

    /**
     * state:（状态）
     */
    private int state;

    /**
     * stateInfo:（状态信息）
     */
    private String stateInfo;

    /**
     * successKilled:（秒杀成功实体）
     */
    private SuccessKilled successKilled;

    /**
     * 创建一个新的实例 SeckillExecution.
     * 
     * @param seckillId 秒杀活动id
     * @param state 状态
     * @param stateInfo 状态信息
     * @param successKilled 秒杀成功实体
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
     * 创建一个新的实例 SeckillExecution.
     * 
     * @param seckillId 秒杀活动id
     * @param state 状态
     * @param stateInfo 状态信息
     */
    public SeckillExecution(long seckillId, SeckillEnum seckillEnum)
    {
        super();
        this.seckillId = seckillId;
        this.state = seckillEnum.getState();
        this.stateInfo = seckillEnum.getStateInfo();
    }

    /**
     * 取得 seckillId
     * 
     * @return seckillId
     */
    public long getSeckillId()
    {
        return seckillId;
    }

    /**
     * 设置 seckillId
     * 
     * @param seckillId
     */
    public void setSeckillId(long seckillId)
    {
        this.seckillId = seckillId;
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
     * 设置 state
     * 
     * @param state
     */
    public void setState(int state)
    {
        this.state = state;
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

    /**
     * 设置 stateInfo
     * 
     * @param stateInfo
     */
    public void setStateInfo(String stateInfo)
    {
        this.stateInfo = stateInfo;
    }

    /**
     * 取得 successKilled
     * 
     * @return successKilled
     */
    public SuccessKilled getSuccessKilled()
    {
        return successKilled;
    }

    /**
     * 设置 successKilled
     * 
     * @param successKilled
     */
    public void setSuccessKilled(SuccessKilled successKilled)
    {
        this.successKilled = successKilled;
    }

}
