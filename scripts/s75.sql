set serveroutput on

begin
    dbms_output.put_line(6 / 0);
exception
    when zero_divide then--selettore del tipo di eccezione
        dbms_output.put_line('Zero divide!');
end;
/--poiché dovrei conoscere tutte le eccezioni, uso il successivo 

begin
    dbms_output.put_line(1 / 0);
exception
    when others then
        dbms_output.put_line('Exception!');
end;
/
