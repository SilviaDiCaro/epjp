select lpad('tom', 30, '.') tom,
	rpad('tim', 30, '_- -_') tim
from dual;

select ltrim(' Hi!'),
	rtrim('Hi!abab', 'ab'),
	trim('0' from '00Hi!000')
from dual;

select employee_id, nvl(commission_pct, 0)--sostituisci il valore null con 0
from employees;

select employee_id, nvl2(commission_pct, 'value', 'no value')--se il valore è null ritorno l'ultimo, se no il penultimo
from employees;

select replace('Begin here', 'Begin', 'End'),--cerca la stringa begin e sostituiscila con end
	substr('ABCDEFG',3,4)--estrarre la substring (prendi la substring che comincia 3 e prendi 4 posizioni)
from dual;

select replace('7-NOV-2015', 'NOV', 'LUG'), 
	substr('ABCDEFG',3,4)
from dual;