-- 数据库初始化脚本
-- 创建数据库
create database seckill;
-- 使用数据库
use seckill;
-- 创建秒杀库存表
create table seckill(
`seckill_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '商品库存ID',
`name` varchar(120) NOT NULL COMMENT '商品名称',
`number` INT NOT NULL COMMENT '库存数量',
`start_time` TIMESTAMP NOT NULL COMMENT '秒杀开启时间',
`end_time` TIMESTAMP NOT NULL COMMENT '秒杀结束时间',
`create_time` TIMESTAMP NOT NULL  COMMENT '创建时间',
PRIMARY KEY (seckill_id),
KEY idx_start_time(start_time),
KEY idx_end_time(end_time),
KEY idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀库存表';
-- 秒杀成功明细表
-- 用户登录认证相关的信息
create table success_killed(
`seckill_id` bigint NOT NULL COMMENT '秒杀商品ID',
`user_phone` bigint NOT NULL COMMENT '用户手机号',
`state` TINYINT NOT NULL DEFAULT -1 COMMENT '状态表示:-1:无效 0 成功 1 已付款 2 已发货',
`create_time` TIMESTAMP NOT NULL COMMENT '创建时间',
PRIMARY KEY (seckill_id,user_phone),/*联合主键:*/
key idx_create_time(create_time)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细表';
-- 初始化数据
insert into 
   seckill(name, number, start_time, end_time)
values
   ('100元秒杀iphone', 100, '2016-05-24 00:00:00', '2016-05-25 00:00:00'),
   ('1000元秒杀iphone6', 100, '2016-05-25 00:00:00', '2016-05-29 00:00:00'),
   ('100元秒杀小米4', 100, '2016-05-24 05:00:00', '2016-06-25 00:00:00'),
   ('400元秒杀ipad', 100, '2016-05-24 06:00:00', '2016-05-29 00:00:00'),
   ('300元秒杀魅蓝note3', 100, '2016-05-24 00:00:00', '2016-05-29 00:00:00'),
   ('100元秒杀iphone2', 100, '2016-05-24 00:00:00', '2016-06-25 00:00:00');
 -- 连接数据库控制台
   mysql -uroot -p