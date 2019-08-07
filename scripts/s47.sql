select round(avg(salary)), sum(salary) --poiché avg è troppo precisa, inserisco round per arrotondare
from employees
where department_id = 50;


select count(rownum)-- tutte le funzioni di questa famiglia scartano i null. per passare una colonna senza null, passo rownum
from employees;

select max(salary), min(salary)
from employees;

select round (avg(salary),2)--due numeri dopo la virgola
from employees;

select median(salary), round(stddev(salary)), round(variance(salary))
from employees;
