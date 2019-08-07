-- preparation
create table x (value integer);--creo tabella x che ha colonna che si chiama value e ha interi

insert into x values(42); --inserisco una riga col valore 42

commit;

select * from x; 

-- delete and rollback
delete from x; --cancello le righe da x

select * from x;

rollback;

select * from x;--i valori sono tornati

-- truncate, no rollback

truncate table x;

rollback; -- no use

select * from x;

-- drop, adieu table

drop table x;
