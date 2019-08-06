select last_name
from employees
where regexp_like(last_name, '^[AE].*'); --voglio tutti i cognomi che cominciano per A o per E
--^inizio stringa
--[] uno dei caratteri compresi "qui dentro"
--. ci deve essere uno solo di quei caratteri
--voglio una stringa che cominci per A o E
--].$ se voglio che ci sia una lettera alla fine

--Qual è il salario corrente, quale sarebbe con un incremento dell’8.5%, qual è il delta come valore assoluto
select salary, salary+salary*0.085, salary*0.085
from employees;
--Chi ha ‘a’ nel nome o cognome
select first_name, last_name
from employees
where regexp_like(last_name, '*[aA].*')or regexp_like(first_name, '*[aA].*');

--Quanti mesi sono passati dall’assunzione a oggi
select  months_between('06-AGO-2019', HIRE_DATE)
from employees;

--Salario mostrato come una serie di asterischi (1 = 1000€)
select lpad('*',salary/1000, '*')
from employees;

select employee_id, nvl2(commission_pct,(to_char(commission_pct)), 'no value')--se il valore è null ritorno l'ultimo, se no il penultimo
from employees;
