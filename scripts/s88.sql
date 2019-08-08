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
create or replace procedure tomorrow 
is begin dbms_output.put_line(' ');
end tomorrow;
/

declare
p_name varchar2(10) := 'Silvia';
begin
tomorrow();
dbms_output.put_line('Name is ' || p_name);
end;
/



create or replace procedure get_coder(
p_coder_id in coders.coder_id%type,
p_last_name out coders.last_name%type,
p_first_name out coders.first_name%type)
is begin 
select first_name, last_name
into p_last_name, p_first_name
from coders 
where coder_id=p_coder_id;
end get_coder;
/

declare
v_id coders.coder_id%type := 105;
v_first_name coders.first_name%type;
v_last_name coders.last_name%type;
begin
get_coder (v_id, v_first_name, v_last_name);
dbms_output.put_line('Name is ' ||v_id, v_first_name, v_last_name);
end;
/

--? Scrivere e invocare la funzione tomorrow() che stampa function day_after(date, after)

