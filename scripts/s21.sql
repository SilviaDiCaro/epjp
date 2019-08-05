select *
from employees
order by last_name;

select *
from employees
order by last_name desc, first_name asc;

select first_name, last_name
from employees
order by 2; 

select  last_name, first_name, email, phone_number, hire_date
from employees
order by  last_name, first_name ;

select *
from employees
where first_name = 'David' or first_name= 'Peter';

select *
from employees
where Department_id = 60;

select *
from employees
where Department_id = 30 or department_id = 50;

select *
from employees
where salary >10000;

select *
from employees
where salary <4000 or salary>15000;

select *
from employees
where (salary <4000 or salary>15000) and (department_id=50 or department_id=80);



select *
from employees
where hire_date between ( '1-GEN-2005') and ('31-DIC-2005'); 

select job_id
from employees
order by job_id;

select *
from employees
where commission_pct !=0;

select *
from employees
where  last_name like '%a%' or first_name like '%a%';

select department_name
from departments
order by department_name;

select street_address
from locations;

select *
from employees
where manager_id = 108;


select *
from employees
where  last_name like '%a%' and first_name like '%a%';