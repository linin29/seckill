/**
 * <b>��Ŀ����</b>��ɱ�<br/>
 * <b>��  ����</b>com.glinin.seckill.dto<br/>
 * <b>�ļ�����</b>Exposer.java<br/>
 * <b>�汾��Ϣ��</b>1.0<br/>
 * <b>���ڣ�</b>2016��5��25��-����3:24:08<br/>
 * 
 */
package com.glinin.seckill.dto;

/**
 * <b>�� ����</b>Exposer<br/>
 * <b>��������</b>��¶��ɱ��ַdto<br/>
 * <b>�����ˣ�</b>ningli<br/>
 * <b>����ʱ�䣺</b>2016��5��25�� ����3:24:08<br/>
 * <b>�޸��ˣ�</b>ningli<br/>
 * <b>�޸�ʱ�䣺</b>2016��5��25�� ����3:24:08<br/>
 * <b>�޸ı�ע��</b><br/>
 * 
 * @version 1.0<br/>
 * 
 */
public class Exposer
{
    /**
     * exposed:���Ƿ�¶��ַ��
     */
    private boolean exposed;

    /**
     * md5:��md5���ܣ�
     */
    private String md5;

    /**
     * seckillId:����ɱ�id��
     */
    private long seckillId;

    /**
     * now:����ǰʱ�䣬���룩
     */
    private long now;

    /**
     * start:����ʼʱ�䣬���룩
     */
    private long start;

    /**
     * end:������ʱ�䣬���룩
     */
    private long end;

    /**
     * ����һ���µ�ʵ�� Exposer.
     * 
     * @param exposed �Ƿ�¶��ַ
     * @param md5 md5����
     * @param seckillId ��ɱ�id
     */
    public Exposer(boolean exposed, String md5, long seckillId)
    {
        super();
        this.exposed = exposed;
        this.md5 = md5;
        this.seckillId = seckillId;
    }

    /**
     * ����һ���µ�ʵ�� Exposer.
     * 
     * @param exposed �Ƿ�¶��ַ
     * @param now ��ǰʱ�䣬����
     * @param start ��ʼʱ�䣬����
     * @param end ����ʱ�䣬����
     */
    public Exposer(boolean exposed, long now, long start, long end)
    {
        super();
        this.exposed = exposed;
        this.now = now;
        this.start = start;
        this.end = end;
    }

    /**
     * ����һ���µ�ʵ�� Exposer.
     * 
     * @param exposed �Ƿ�¶��ַ
     * @param seckillId ��ɱ�id
     * @param now ��ǰʱ�䣬����
     * @param start ��ʼʱ�䣬����
     * @param end ����ʱ�䣬����
     */
    public Exposer(boolean exposed, long seckillId, long now, long start, long end)
    {
        super();
        this.exposed = exposed;
        this.seckillId = seckillId;
        this.now = now;
        this.start = start;
        this.end = end;
    }

    /**
     * ����һ���µ�ʵ�� Exposer.
     * 
     * @param exposed �Ƿ�¶��ַ
     * @param seckillId ��ɱ�id
     */
    public Exposer(boolean exposed, long seckillId)
    {
        super();
        this.exposed = exposed;
        this.seckillId = seckillId;
    }

    /**
     * ȡ�� exposed
     * 
     * @return exposed
     */
    public boolean isExposed()
    {
        return exposed;
    }

    /**
     * ���� exposed
     * 
     * @param exposed
     */
    public void setExposed(boolean exposed)
    {
        this.exposed = exposed;
    }

    /**
     * ȡ�� md5
     * 
     * @return md5
     */
    public String getMd5()
    {
        return md5;
    }

    /**
     * ���� md5
     * 
     * @param md5
     */
    public void setMd5(String md5)
    {
        this.md5 = md5;
    }

    /**
     * ȡ�� seckillId
     * 
     * @return seckillId
     */
    public long getSeckillId()
    {
        return seckillId;
    }

    /**
     * ���� seckillId
     * 
     * @param seckillId
     */
    public void setSeckillId(long seckillId)
    {
        this.seckillId = seckillId;
    }

    /**
     * ȡ�� now
     * 
     * @return now
     */
    public long getNow()
    {
        return now;
    }

    /**
     * ���� now
     * 
     * @param now
     */
    public void setNow(long now)
    {
        this.now = now;
    }

    /**
     * ȡ�� start
     * 
     * @return start
     */
    public long getStart()
    {
        return start;
    }

    /**
     * ���� start
     * 
     * @param start
     */
    public void setStart(long start)
    {
        this.start = start;
    }

    /**
     * ȡ�� end
     * 
     * @return end
     */
    public long getEnd()
    {
        return end;
    }

    /**
     * ���� end
     * 
     * @param end
     */
    public void setEnd(long end)
    {
        this.end = end;
    }

}
