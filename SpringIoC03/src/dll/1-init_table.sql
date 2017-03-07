prompt PL/SQL Developer import file
set feedback off
set define off
prompt Dropping T_LOG...
drop table T_LOG cascade constraints;
prompt Dropping T_USER...
drop table T_USER cascade constraints;
prompt Creating T_LOG...
create table T_LOG
(
  ID      NUMBER not null,
  CONTENT VARCHAR2(500)
)
;
alter table T_LOG
  add constraint PK_T_LOG_ID primary key (ID);

prompt Creating T_USER...
create table T_USER
(
  ID       NUMBER not null,
  USERNAME VARCHAR2(20) not null,
  PASSWORD VARCHAR2(20) not null,
  REALNAME VARCHAR2(20) not null,
  EMAIL    VARCHAR2(20),
  AGE      NUMBER,
  MEMO     VARCHAR2(50)
)
;
alter table T_USER
  add constraint PK_T_USER_ID primary key (ID);
alter table T_USER
  add constraint UK_T_USER_USERNAME unique (USERNAME);

prompt Disabling triggers for T_LOG...
alter table T_LOG disable all triggers;
prompt Disabling triggers for T_USER...
alter table T_USER disable all triggers;
prompt Loading T_LOG...
prompt Table is empty
prompt Loading T_USER...
insert into T_USER (ID, USERNAME, PASSWORD, REALNAME, EMAIL, AGE, MEMO)
values (1, 'java', 'java', 'zhangsan', '1@2.3', 20, 'for test');
commit;
prompt 1 records loaded
prompt Enabling triggers for T_LOG...
alter table T_LOG enable all triggers;
prompt Enabling triggers for T_USER...
alter table T_USER enable all triggers;
set feedback on
set define on
prompt Done.
