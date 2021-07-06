drop table member_table

create table member_table
(id varchar2(50)NOT NULL,
name varchar2(50)NOT NULL,
pw varchar2(50)NOT NULL,
tel varchar2(50),
email varchar2(50),
address varchar2(100),
constraint member_table_id_pk primary key(id)
);

select * from member_table;

drop table dog_table

create table dog_table
(dg_id varchar2(50)NOT NULL, 
 dg_cty varchar2(50),
 dg_cm varchar2(50),
 dg_kg varchar2(50),
 dg_wei varchar2(50),
 dg_fac varchar2(50),
 dg_cha varchar2(50),
 dg_chu varchar2(50),
 dg_med varchar2(50),
 dg_clr varchar2(50),
 dg_grp varchar2(50),
 dg_chi varchar2(50),
 dg_mo varchar2(50),
 dg_hom varchar2(50),
 dg_oi varchar2(50),
constraint dog_table_dg_id_pk primary key(dg_id));


drop table notice_table

create table notice_table
(notice varchar2(100),
 even varchar2(100),
 qna varchar2(100));