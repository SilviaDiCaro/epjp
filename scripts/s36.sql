select e.last_name, d.department_name
from employees e full outer join departments d
on (e.department_id = d.department_id)
where last_name = 'Grant'
or d.department_id between 110 and 120;

select region_name from regions where region_id = 1;
select country_name from countries where region_id = 1;
-- region_id = 1 .. 4

select e.last_name, d.department_name
from employees e join departments d
on (e.department_id=d.department_id);

--Nome degli employees e job title (da JOBS)

select e.first_name, j.job_title
from employees e join jobs j
on (e.job_id= j.job_id);

--Nome degli employees che hanno il salario minimo o massimo previsto per il loro job title
select e.first_name
from employees e join jobs j
on (e.job_id= j.job_id) and (e.salary =j.min_salary or e.salary=j.max_salary);
--oppure posso dire--> 
select first_name
from employees natural join jobs
where salary in (min_salary, max_salary);

 
--Nome degli employees basati in UK (LOCATIONS)
select e.first_name, l.country_id
from employees e join departments d on d.department_id = e.department_id  
join locations l on d.location_id = l.location_id and country_id = 'UK';

--Nome dei departments e manager associato (comanda departments)
select last_name as Manager, department_name
from employees right outer join departments
using(department_id);

--Nome di ogni department e, se esiste, del relativo manager
select last_name as Manager, department_name
from employees join departments
using(department_id);

--Nome dei department che non hanno un manager associato
select department_name
from departments
where manager_id is null;

--Nome degli employees e del loro manager
select e.last_name as employee, m.last_name as manager
from employees e join employees m
on (e.manager_id = m.employee_id);

--Nome degli employees che non sono manager
select e.last_name as employee, m.last_name as manager
from employees e left OUTER join employees m on(e.manager_id = m.employee_id)
where m.manager_id not in e.employee_id
order by 1;