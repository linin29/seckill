/**
 * <b>��Ŀ����</b>��ɱ�<br/>
 * <b>��    ����</b>com.glinin.seckill.dao<br/>
 * <b>�ļ�����</b>SuccessKilledDao.java<br/>
 * <b>�汾��Ϣ��</b>1.0<br/>
 * <b>���ڣ�</b>2016��5��24��-����2:48:01<br/>
 * 
 */
package com.glinin.seckill.dao;

import org.apache.ibatis.annotations.Param;

import com.glinin.seckill.entity.SuccessKilled;

/**
 * <b>�� ����</b>SuccessKilledDao<br/>
 * <b>��������</b>��ɱ�ɹ�DAO��ӿ�<br/>
 * <b>�����ˣ�</b>ningli<br/>
 * <b>����ʱ�䣺</b>2016��5��24�� ����2:48:01<br/>
 * <b>�޸��ˣ�</b>ningli<br/>
 * <b>�޸�ʱ�䣺</b>2016��5��24�� ����2:48:01<br/>
 * <b>�޸ı�ע��</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
public interface SuccessKilledDao
{

    /**
     * insertSuccessKilled(�����ɱ�ɹ���¼)
     * 
     * @param seckillId ��ɱ�id
     * @param userPhone �û��ֻ�����
     * @return ����������ɹ����� 1��ʧ�ܷ��� 0
     * @exception
     * @since 1.0
     * @author ningli
     */
    public int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    /**
     * queryByIdWithSeckill(������ɱ�id���û��ֻ������ѯ��ɱ�ɹ���¼)
     * 
     * @param seckillId ��ɱ�id
     * @param userPhone �û��ֻ�����
     * @return ��ɱ�ɹ���¼ʵ��
     * @exception
     * @since 1.0
     * @author ningli
     */
    public SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);
}
