select first_name, last_name, commission_pct
from employees
where commission_pct is null;

select first_name, last_name, 12 * salary * commission_pct
from employees;

select first_name, last_name, 12 * salary * nvl(commission_pct, 0) --NVL null value: se il campo � null ritornami un valore(zero in questo caso)
from employees;

select first_name, last_name, 12 * salary * nvl(commission_pct, 1)  
from employees;

select first_name, last_name, (12 * salary) * + nvl (commission_pct, 1)  
from employees;