-- 用户信息
create table t_custinfo(
	id int primary key auto_increment,
	name varchar(50) not null,
	password varchar(50) not null,
	status varchar(1) not null default '1' comment '1:在职 0:离职',
	mobile_no varchar(20),
	email_address varchar(30),
	session_key  varchar(64),
	insert_time timestamp not null default now()
)comment '用户信息表';


-- 招聘专员
create table t_interviewer(
 id int primary key not null auto_increment ,
 cust_id int not null
)comment '招聘专员';
ALTER TABLE t_interviewer ADD CONSTRAINT fk_interviewer_cust_id FOREIGN KEY(cust_id) REFERENCES t_custinfo (id);

-- 面试者
create table t_interviewee(
 id int primary key not null auto_increment ,
 interviewer_id int not null,
 cust_id int not null
)comment '面试者';
ALTER TABLE t_interviewee ADD CONSTRAINT fk_interviewee_cust_id FOREIGN KEY(cust_id) REFERENCES t_custinfo (id);
ALTER TABLE t_interviewee ADD CONSTRAINT fk_interviewee_interviewer_id FOREIGN KEY(interviewer_id) REFERENCES t_interviewer (id);



--其他语句
-- 删除外检
-- alter TABLE  t_interviewee drop FOREIGN KEY fk_interviewee_cust_id ;