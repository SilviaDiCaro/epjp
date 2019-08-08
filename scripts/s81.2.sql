set serveroutput on

declare
    cursor v_coder_cursor is
     select first_name, last_name, salary from coders;
begin    
for v_cur in v_coder_cursor loop
dbms_output.put_line('[' || v_cur.first_name || ', ' || v_cur.last_name || ', ' || v_cur.salary ||']');
    end loop;
end;
/