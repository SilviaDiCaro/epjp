set serveroutput on

declare--variabili locali usate nel blocco
    v_last_name coders.last_name%type;
    v_hire_date coders.hire_date%type;
    cursor v_coder_cursor is-- la variabile si chiama coder cursor e la devo definire così. quando uso il cursore ci dev'essere il risultato di questa select:
        select last_name, hire_date from coders;--il risultato avrà dentro sorta di oggetti che rappresentano la coppia last_name, hire_date. La select comincia dopo
begin
    open v_coder_cursor;--esegui la select che definisce il cursore
    loop--poiché i dati sono pià di uno, faccio un loop
        fetch v_coder_cursor --fetch into accede al cursore e legge i dati dal cursore in variabili locali. 
        into v_last_name, v_hire_date;--Dal cursore porto i dati in due variabili locali
        exit when v_coder_cursor%notfound;--prova a eseguire ciò che ho detto, se non c'è nulla  %nonfound

        dbms_output.put_line('[' || v_last_name || ', ' || v_hire_date || ']');
    end loop;--se ha una riga fa la fetch, se no end. Looppo fino a che non trovo che ho letto tutte le righe nel cursore. 
    close v_coder_cursor;--poi va chiuso esplicitamente
end;
/

--contiene elementi e permette di looppare gli elementi