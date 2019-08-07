select first_name, last_name
from employees
where employee_id in(
    select distinct manager_id
    from employees where manager_id is not null)
order by 2;--voglio vederli per nome e cognome
--id di tutti i manager tranne i null

-- Salary: maggiore, minore, somma, media
select  max(salary), min(salary), sum(salary), avg(salary)  
from employees
group by  job_id;

-- Quanti dipendenti per ogni job_id
select count(employee_id), job_id 
from employees
group by job_id;

--Quanti sono gli IT_PROG
select count(employee_id), job_id 
from employees
where job_id = 'IT_PROG'
group by job_id;

--Quanti sono i manager
select count (distinct(MANAGER_ID))
from employees;

--Qual è la differenza tra il salario maggiore e il minore
select  (max(salary)- min(salary))
from employees;

--Come sopra, ma per ogni job_id, non considerando dove non c’è differenza
select  (max(salary)- min(salary))
from employees
group by job_id
having (max(salary)- min(salary))>0 ;

-- Qual è il salario minimo con i dipendenti raggruppati per manager, non considerare chi non ha manager, né i gruppi con salario minimo inferiore a 6.000€
select min(salary)
from employees
where employee_id in (
select distinct manager_id 
from employees where manager_id is not null and salary >6000)
group by manager_id;

--Indirizzi completi, tra locations e countries
select c.country_name, l.street_address
from countries c join locations l
on (c.country_id=l.country_id);

--Employees – Name e department name

select e.last_name, d.department_name
from employees e join departments d
on (e.department_id=d.department_id);

--Come sopra, ma solo per chi è basato a Toronto
select last_name, city, department_name
from employees e join departments d on d.department_id = e.department_id 
join locations l on d.location_id = l.location_id
where city = 'Toronto';

--– Chi è stato assunto dopo David Lee (23-FEB-2008)
select last_name, first_name
from employees
where (hire_date)>( select hire_date from employees where last_name = 'Lee' and first_name='David');

--Chi è stato assunto prima del proprio manager
select last_name, first_name
from employees
where (hire_date)>( select hire_date from employees where Manager_id );

--– Chi ha lo stesso manager di Lisa Ozer
select last_name, first_name
from employees
where MANAGER_ID = (select MANAGER_ID from employees where last_name = 'Ozer' and first_name='Lisa');

--Chi lavora in un department in cui c’è almeno un employee con una ‘u’ nel cognome
select last_name
from employees e join departments d on d.department_id = e.department_id 
where regexp_like(last_name, '*[uU].*');
 
--Chi lavora nel department Shipping 





 







