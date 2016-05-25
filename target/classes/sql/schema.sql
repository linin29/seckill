-- ���ݿ��ʼ���ű�
-- �������ݿ�
create database seckill;
-- ʹ�����ݿ�
use seckill;
-- ������ɱ����
create table seckill(
`seckill_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '��Ʒ���ID',
`name` varchar(120) NOT NULL COMMENT '��Ʒ����',
`number` INT NOT NULL COMMENT '�������',
`start_time` TIMESTAMP NOT NULL COMMENT '��ɱ����ʱ��',
`end_time` TIMESTAMP NOT NULL COMMENT '��ɱ����ʱ��',
`create_time` TIMESTAMP NOT NULL  COMMENT '����ʱ��',
PRIMARY KEY (seckill_id),
KEY idx_start_time(start_time),
KEY idx_end_time(end_time),
KEY idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='��ɱ����';
-- ��ɱ�ɹ���ϸ��
-- �û���¼��֤��ص���Ϣ
create table success_killed(
`seckill_id` bigint NOT NULL COMMENT '��ɱ��ƷID',
`user_phone` bigint NOT NULL COMMENT '�û��ֻ���',
`state` TINYINT NOT NULL DEFAULT -1 COMMENT '״̬��ʾ:-1:��Ч 0 �ɹ� 1 �Ѹ��� 2 �ѷ���',
`create_time` TIMESTAMP NOT NULL COMMENT '����ʱ��',
PRIMARY KEY (seckill_id,user_phone),/*��������:*/
key idx_create_time(create_time)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��ɱ�ɹ���ϸ��';
-- ��ʼ������
insert into 
   seckill(name, number, start_time, end_time)
values
   ('100Ԫ��ɱiphone', 100, '2016-05-24 00:00:00', '2016-05-25 00:00:00'),
   ('1000Ԫ��ɱiphone6', 100, '2016-05-25 00:00:00', '2016-05-29 00:00:00'),
   ('100Ԫ��ɱС��4', 100, '2016-05-24 05:00:00', '2016-06-25 00:00:00'),
   ('400Ԫ��ɱipad', 100, '2016-05-24 06:00:00', '2016-05-29 00:00:00'),
   ('300Ԫ��ɱ����note3', 100, '2016-05-24 00:00:00', '2016-05-29 00:00:00'),
   ('100Ԫ��ɱiphone2', 100, '2016-05-24 00:00:00', '2016-06-25 00:00:00');
 -- �������ݿ����̨
   mysql -uroot -p