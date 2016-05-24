/**
 * <b>��Ŀ����</b>���������Ϣ���ۺϽ������<br/>
 * <b>��   ����</b>com.glinin.seckill.dao<br/>
 * <b>�ļ�����</b>SuccessKilledDao.java<br/>
 * <b>�汾��Ϣ��</b>3.1<br/>
 * <b>���ڣ�</b>2016��5��24��-����2:48:01<br/>
 * 
 */
package com.glinin.seckill.dao;

import org.apache.ibatis.annotations.Param;

import com.glinin.seckill.entity.SuccessKilled;

/**
 * <b>�� ����</b>SuccessKilledDao<br/>
 * <b>��������</b>���������Ĺ���<br/>
 * <b>�����ˣ�</b>ningli<br/>
 * <b>����ʱ�䣺</b>2016��5��24�� ����2:48:01<br/>
 * <b>�޸��ˣ�</b>ningli<br/>
 * <b>�޸�ʱ�䣺</b>2016��5��24�� ����2:48:01<br/>
 * <b>�޸ı�ע��</b><br/>
 * 
 * @version 3.1<br/>
 * 
 */
public interface SuccessKilledDao
{

    int insertSuccessKilled(@Param("seckillId")long seckillId, @Param("userPhone")long userPhone);

    SuccessKilled queryByIdWithSeckill(@Param("seckillId")long seckillId, @Param("userPhone")long userPhone);
}
