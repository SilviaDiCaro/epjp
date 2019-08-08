set serveroutput on

declare
    cursor v_coder_cursor is-- la variabile si chiama coder cursor e la devo definire cos�. quando uso il cursore ci dev'essere il risultato di questa select:
        select last_name, hire_date from coders;
begin
    for v_cur in v_coder_cursor loop--quando faccio un for su un cursore, automaticamente alla end del for, viene chiuso.Non devo neanche fare il fetch, devo solo creare una variabile locale al for 
        dbms_output.put_line('[' || v_cur.last_name || ', ' || v_cur.hire_date || ']');
    end loop;
end;
/

--v_cur � come se fosse l'iteratore che corre sul cursor
--v_cur non � dichiarata nel blocco declare ma � nel for, il declare � implicito. 
--prendi gli elementi riga per riga finch� ce n'�.
--v_cur contiene oggetti delle colonne definiti da select.
--pi� che oggetto � una struttura, un contenitore di elementi eterogenei. Non ha funzionalit� come le ha un oggetto, qui sono solo dati.

