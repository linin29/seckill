-- �洢����
DELIMITER $$ --;ת��Ϊ$$
-- in���������, out:�������
-- row_count()������һ���޸����ͣ�update insert delete�ȣ���Ӱ������
-- row_count() 0:δ�޸ģ�����0 ��ʾ�޸ĵ�������С��0 sql�������δִ���޸�
CREATE PROCEDURE `seckill`.`execute_seckill`
       (in v_seckill_id bigint, in v_phone bigint, in v_kill_time timestamp, out r_result int)
    BEGIN
	    DECLARE insert_count int DEFAULT 0;
	    START TRANSACTION;
	    insert ignore into success_killed(seckill_id, user_phone, create_time)
	    values(v_seckill_id, v_phone, v_kill_time);
	    select row_count() into insert_count;
	    if(insert_count = 0) then
	    ROLLBACK;
	    set r_result = -1;
	    elseif(insert_count < 0) then
	    ROLLBACK;
	    set r_result = -2;
	    else
	    update seckill set number = number - 1 
	    where seckill_id = v_seckill_id
	    and end_time > v_kill_time
	    and start_time < v_kill_time
	    and number > 0;
	    select row_count() into insert_count;
	    if(insert_count = 0) then 
	    ROLLBACK;
	    set r_result = 0;
	    elseif(insert_count < 0) then 
	    set r_result = -2;
	    else commit;set r_result=1;
	    end if;
	    end if;
    END;
    $$
    DELIMITER ;
    set r_result = -3;