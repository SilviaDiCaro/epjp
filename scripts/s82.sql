set serveroutput on

-- a procedure: funzione che ritorna void

create or replace procedure get_coder_salary( --crealo se non c'� gi�, se c'� gi� eliminalo e crealo . nome della procedura
    p_coder_id in coders.coder_id%type,--nelle tonde i parametri seguendo una modalit� un po' diversa. Il nome comincia con p_ come parameter e non con v_ perch� non � una variabile locale
    p_salary out coders.salary%type) is--in/out per dire se una variabile � di input o di output (output-->il chiamante passa alla locazione di memoria che vogliamo usare e noi riempiamo col valore che vogliamo tornare indietro)
begin-- in Java ci sono soltanto in--is o as vanno bene uguale. 
    select salary --select salary into p_salary. metto in salary quello che c'� in salary in coders
    into p_salary
    from coders
    where coder_id = p_coder_id;
end get_coder_salary;--dopo l'end va messo il nome della procedure
/

-- run it
declare
    v_id coders.coder_id%type := 105;--stampa il salario di 105
    v_salary coders.salary%type;
begin
    get_coder_salary(v_id, v_salary);
    dbms_output.put_line('Salary is ' || v_salary);
exception
    when others then
        dbms_output.put_line('Can''t get salary for ' || v_id);
end;
/

-- just for demonstration
drop procedure get_coder_salary; --non � obbligatorio
--chiunque ha gli accessi, pu� accedere alla procedura

