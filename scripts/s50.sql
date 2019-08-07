select first_name, last_name
from employees
where employee_id = (
	select manager_id from employees where last_name = 'Chen');--leggi il manager id del dipendente chan
    --è come fare una self join

select department_id, trunc(avg(salary))
from employees
group by department_id having avg(salary) < (
    select max(avg(salary)) from employees group by department_id); --dipartimento col salario medio più alto

select employee_id
from (
	select employee_id
	from employees
	where employee_id between 112 and 115);