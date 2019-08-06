select to_char(12345.67), to_char(12345.67, '99,999.99')--ho un numero e lo formatto in un certo formato
from dual;

select to_char(2019, 'RN')
from dual;--2019, formatto in stringa usando roman number
    
select to_number('970,13') * 2 --stringa * 2 usando to_number
from dual;

select cast('05-APR-19' as date) + 2 --dopo il parametro as, specifico in cosa voglio convertire
from dual;

select cast(12345.678 as number(10,2))--formatto nel formato atteso e inserico, ad esempio in una tabella
from dual;
