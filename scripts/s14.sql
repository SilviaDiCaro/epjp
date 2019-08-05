select job_title, min_salary as original, min_salary salary
from jobs;

select job_title, min_salary + 2000 "increased min salary" --doppi apici se ci sono spazi bianchi
from jobs;
