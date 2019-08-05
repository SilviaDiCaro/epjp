select first_name, department_name
from employees left outer join departments --preservo l'impiegato anche se non c'è dipartimento. si può fare anche una right join
using(department_id)
where last_name = 'Grant';
