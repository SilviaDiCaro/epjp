set serveroutput on

--? Scrivere e invocare la procedura tomorrow() che stampa la data di domani

create or replace procedure tomorrow 
is begin
dbms_output.put_line('Tomorrow is ' ||(sysdate +1));
end tomorrow;
/

begin tomorrow();
end;
/

--Modificare tomorrow() per fargli accettare come parametro un nome da stampare
declare
name varchar2(10)
;
begin
get_coder_salary(v_id, v_salary);
dbms_output.put_line('Salary is ' || v_salary);
exception
when others then
dbms_output.put_line('Can''t get salary for ' || v_id);
end;
/

