select add_months(sysdate, 3) --aggiungo mesi a una certa data
from dual;

select months_between(sysdate, '01-FEB-2019')--differenza tra due dati in mesi (risultato flooting point)
from dual;

select last_day(sysdate) --ultimo giorno del mese
from dual;

select next_day(sysdate, 'lun')--giorno della settimana successivo
from dual;

select round(sysdate, 'year'), round(sysdate, 'month')--primo giorno anno successivo, primo giorno del mese corrente
from dual;

select trunc(sysdate, 'year'), trunc(sysdate, 'month')--primo giorno dell'anno corrente, primo giorno del mese corrente
from dual;