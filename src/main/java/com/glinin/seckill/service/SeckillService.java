/**
 * <b>��Ŀ����</b>��ɱ�<br/>
 * <b>��  ����</b>com.glinin.seckill.service<br/>
 * <b>�ļ�����</b>SeckillService.java<br/>
 * <b>�汾��Ϣ��</b>1.0<br/>
 * <b>���ڣ�</b>2016��5��25��-����1:32:05<br/>
 * 
 */
package com.glinin.seckill.service;

import java.util.List;

import com.glinin.seckill.dto.Exposer;
import com.glinin.seckill.dto.SeckillExecution;
import com.glinin.seckill.entity.Seckill;
import com.glinin.seckill.exception.RepeatKillException;
import com.glinin.seckill.exception.SeckillCloseException;

/**
 * <b>�� ����</b>SeckillService<br/>
 * <b>��������</b>��ɱ�sevice��ӿ�<br/>
 * <b>�����ˣ�</b>ningli<br/>
 * <b>����ʱ�䣺</b>2016��5��25�� ����1:32:05<br/>
 * <b>�޸��ˣ�</b>ningli<br/>
 * <b>�޸�ʱ�䣺</b>2016��5��25�� ����1:32:05<br/>
 * <b>�޸ı�ע��</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
public interface SeckillService
{

    /**
     * getSeckillList(��ȡ��ɱ��б�)
     * 
     * @return ��ɱ��б�
     * @exception
     * @since 1.0
     * @author ningli
     */
    public List<Seckill> getSeckillList();

    /**
     * getById(����id��ȡ��ɱ�)
     * 
     * @param seckillId ��ɱ�id
     * @return ��ɱ�ʵ��
     * @exception
     * @since 1.0
     * @author ningli
     */
    public Seckill getById(long seckillId);

    /**
     * exportSeckillUrl(��¶��ɱ��ַ)
     * 
     * @param seckillId ��ɱ�id
     * @return ��ɱ��ַ
     * @exception
     * @since 1.0
     * @author ningli
     */
    public Exposer exportSeckillUrl(long seckillId);

    /**
     * executeSeckill(ִ����ɱ)
     * 
     * @param seckillId ��ɱ�id
     * @param userPhone �û��ֻ�����
     * @param md5 md5����
     * @return ��ɱ�ɹ�ִ��ʵ��
     * @throws SecurityException ��ɱ��쳣
     * @throws RepeatKillException �ظ���ɱ�쳣
     * @throws SeckillCloseException ��ɱ�����쳣
     * @exception
     * @since 1.0
     * @author ningli
     */
    public SeckillExecution executeSeckill(long seckillId, long userPhone, String md5) throws SecurityException, RepeatKillException,
            SeckillCloseException;
    
    /**
     * executeSeckillProcedure(ִ����ɱ,�ô洢����)
     * 
     * @param seckillId ��ɱ�id
     * @param userPhone �û��ֻ�����
     * @param md5 md5����
     * @return ��ɱ�ɹ�ִ��ʵ��
     * @throws SecurityException ��ɱ��쳣
     * @throws RepeatKillException �ظ���ɱ�쳣
     * @throws SeckillCloseException ��ɱ�����쳣
     * @exception
     * @since 1.0
     * @author ningli
     */
    public SeckillExecution executeSeckillProcedure(long seckillId, long userPhone, String md5) throws SecurityException, RepeatKillException,
            SeckillCloseException;

}
