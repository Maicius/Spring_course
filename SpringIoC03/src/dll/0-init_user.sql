--使用 system 用户登录：
--创建该项目的表空间
drop tablespace ts_sshDemo including contents and datafiles;
CREATE TABLESPACE ts_sshDemo DATAFILE '%oracle_base%\oradata\TS_SSHDEMO_01.dbf' SIZE 20M REUSE AUTOEXTEND ON NEXT 5M MAXSIZE 150M;

--建立用户
create user ssh identified by ssh default tablespace ts_sshDemo;
--授权
grant resource,connect to ssh;

