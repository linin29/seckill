/**
 * <b>��Ŀ����</b>���������Ϣ���ۺϽ������<br/>
 * <b>��   ����</b>com.glinin.seckill.dao<br/>
 * <b>�ļ�����</b>SeckillDao.java<br/>
 * <b>�汾��Ϣ��</b>3.1<br/>
 * <b>���ڣ�</b>2016��5��24��-����2:44:20<br/>
 * 
 */
package com.glinin.seckill.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.glinin.seckill.entity.Seckill;

/**
 * <b>�� ����</b>SeckillDao<br/>
 * <b>��������</b>���������Ĺ���<br/>
 * <b>�����ˣ�</b>ningli<br/>
 * <b>����ʱ�䣺</b>2016��5��24�� ����2:44:20<br/>
 * <b>�޸��ˣ�</b>ningli<br/>
 * <b>�޸�ʱ�䣺</b>2016��5��24�� ����2:44:20<br/>
 * <b>�޸ı�ע��</b><br/>
 * 
 * @version 3.1<br/>
 * 
 */
public interface SeckillDao
{

    int reduceNumber(@Param("seckillId")long seckillId, @Param("killTime")Date killTime);

    Seckill queryById(long seckillId);

    List<Seckill> queryAll(@Param("offset")int offset, @Param("limit")int limit);
}
