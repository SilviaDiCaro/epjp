select manager_id, trunc(avg(salary))--filtro le righe della tabella employees
from employees
where salary < 8000 --quant'è la media del salario tra chi guadagna meno di 8000 (il where è su tutte le righe). scarto chi guadagna più di 8000
group by manager_id--raggruppo
having avg(salary) > 6000 --filtra le righe dopo che sono state raggruppate (scarto chi ha meno di 6000)
order by 2 desc;
