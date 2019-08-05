select last_name
from employees
where last_name like '_ul%';

select last_name
from employees
where last_name like '_ul_';


select last_name
from employees
where last_name like 'B%';


select *
from regions
where region_id not in (2, 3);

-- !! NOT IN(..., NULL) -> FALSE !!
select *
from regions
where region_id not in (2, 3, null);

select *
from regions
where region_id between 2 and 3;--intervalli chiusi, 2 e 3 sono inclusi

select *
from employees
where salary BETWEEN 10000 AND 20000;

select *
from employees
where manager_id is null;
