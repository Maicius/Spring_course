--ʹ�� system �û���¼��
--��������Ŀ�ı�ռ�
drop tablespace ts_sshDemo including contents and datafiles;
CREATE TABLESPACE ts_sshDemo DATAFILE '%oracle_base%\oradata\TS_SSHDEMO_01.dbf' SIZE 20M REUSE AUTOEXTEND ON NEXT 5M MAXSIZE 150M;

--�����û�
create user ssh identified by ssh default tablespace ts_sshDemo;
--��Ȩ
grant resource,connect to ssh;

