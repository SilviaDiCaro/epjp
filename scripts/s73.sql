set serveroutput on

begin
    dbms_output.put_line('Hello PL/SQL'); --è come se fosse una classe, mentre pur_line è come se fosse un metodo statico se facessimo un paragone con java
end;
/

declare --devo dichiarare TUTTE le variabili qui dentro
    v_width integer;--non inizializzata (prima si dice il nome e poi il tipo)
    v_height integer := 2;
    v_area integer := 6;
begin
    v_width := v_area / v_height; 
    dbms_output.put_line('v_width = ' || v_width); 
end;
/