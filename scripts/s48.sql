select department_id, trunc(avg(salary))--salario medio raggruppato per ogni dipartimento (per dipartimento, fai la media considerando il dipartimento come blocco unico)
from employees
group by department_id
order by 1;
--avrò tante medie quanti sono i dipartimenti

select max(salary)
from employees
group by department_id
order by 1;
