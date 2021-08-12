drop table score_table CASCADE CONSTRAINTS;
drop table student_table CASCADE CONSTRAINTS;
drop table teacher_table CASCADE CONSTRAINTS;


/* 선생님 테이블*/
create table teacher_table
(TCH_NO number(10) NOT NULL,
USER_ID varchar2(20),
USER_PW varchar2(20),
NAME varchar2(20),
CLASS_NO number(10),
constraint TEACHER_TABLE_TCH_NO_PK primary key (TCH_NO)
);

/*학생 테이블*/
create table student_table
(STU_NO number(10) NOT NULL,
USER_ID varchar2(20),
USER_PW varchar2(20),
NAME varchar2(10),
TCH_NO number(10) NOT NULL,
CLASS_NO number(10),
constraint STUDENT_TABLE_STU_NO_PK primary key (STU_NO),
constraint STUDENT_TABLE_TCH_NO_FK foreign key (TCH_NO)
references TEACHER_TABLE (TCH_NO)
); 

/*점수 테이블*/
create table score_table
(STU_NO number(10) NOT NULL,
TEST_DAY varchar2(20),
KOR number(10),
ENG number(10),
MATH number(10),
SOCIETY number(10),
SCIENCE number(10),
constraint SCORE_TABLE_STU_NO_FK foreign key (STU_NO)
references STUDENT_TABLE (STU_NO),
constraint SCORE_TABLE_TEST_DAY_CK check (test_day in('1-m', '1-e', '2-m', '2-e'))
);

/*테스트용 데이터 입력 : 선생님*/
insert into teacher_table
values (101, 'aaa', '1111', '임명진', 1);
insert into teacher_table
values (102, 'bbb', '2222', '채수민', 2);
insert into teacher_table
values (103, 'ccc', '3333', '김일성', 3);

/*테스트용 데이터 입력 : 학생*/
insert into student_table
values (201, 'ss', '1111', '고길동', 101, 1);
insert into student_table
values (202, 'ff', '1112', '이무송', 101, 1);
insert into student_table
values (203, 'ww', '1113', '엄준식', 102, 2);
insert into student_table
values (204, 'qq', '1114', '조자룡', 103, 3);

/*테스트용 데이터 입력 : 성적*/
insert into score_table
values (201, '1-m', 80, 56, 54, 44, 50);
insert into score_table
values (201, '1-e', 70, 90, 45, 69, 78);
insert into score_table
values (201, '2-m', 55, 66, 77, 88, 99);
insert into score_table
values (201, '2-e', 80, 56, 54, 44, 50);
insert into score_table
values (202, '1-m', 80, 56, 54, 44, 50);
insert into score_table
values (202, '1-e', 80, 56, 54, 44, 50);
insert into score_table
values (202, '2-m', 80, 56, 54, 44, 50);
insert into score_table
values (203, '1-m', 80, 56, 54, 44, 50);
insert into score_table
values (203, '1-e', 80, 56, 54, 44, 50);
insert into score_table
values (204, '1-m', 80, 56, 54, 44, 50);
/
