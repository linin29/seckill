/**
 * <b>��Ŀ����</b>��ɱ�<br/>
 * <b>��    ����</b>com.glinin.seckill.dao<br/>
 * <b>�ļ�����</b>SeckillDao.java<br/>
 * <b>�汾��Ϣ��</b>1.0<br/>
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
 * <b>��������</b>��ɱDAO��ӿ�<br/>
 * <b>�����ˣ�</b>ningli<br/>
 * <b>����ʱ�䣺</b>2016��5��24�� ����2:44:20<br/>
 * <b>�޸��ˣ�</b>ningli<br/>
 * <b>�޸�ʱ�䣺</b>2016��5��24�� ����2:44:20<br/>
 * <b>�޸ı�ע��</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
public interface SeckillDao
{

    /**
     * reduceNumber(���ٿ������)
     * 
     * @param seckillId ��ɱ�id
     * @param killTime ��ɱʱ��
     * @return ����������ɹ����� 1��ʧ�ܷ��� 0
     * @exception
     * @since 1.0
     * @author ningli
     */
    public int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * queryById(����id��ѯ��ɱ�)
     * 
     * @param seckillId ��ɱ�id
     * @return ��ɱ�ʵ��
     * @exception
     * @since 1.0
     * @author ningli
     */
    public Seckill queryById(long seckillId);

    /**
     * queryAll(��ѯ���е���ɱ�)
     * 
     * @param offset ҳ��
     * @param limit ÿҳ��ʾ������
     * @return ��ɱ��б�
     * @exception
     * @since 1.0
     * @author ningli
     */
    public List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
