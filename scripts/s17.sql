select manager_id
from employees;
--guardo la colonna manager id e vedo quelli che hanno una "persona sotto"
select distinct manager_id --prendi una colonna e ritorna solo i valori senza null
from employees; --i manager sono 18

select first_name, last_name
from employees
where last_name = 'King';

select distinct job_id
from employees;
