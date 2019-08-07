--Inserire come assunti oggi: 201, Maria Rossi, 5000€ e 202, Franco Bianchi, 4500€

--INSERT INTO table (columns…) VALUES (values…);

insert into coders
values(201, 'Mario', 'Rossi', SYSDATE, 5000);

insert into coders
values(202, 'Franco', 'Bianchi', SYSDATE, 4500);

--– Cambiare il nome da Maria a Mariangela
update coders
set first_name = 'Mariangela' 
where first_name = 'Mario';

--Aumentare di 500€ i salari minori di 6000€

update coders
set  salary = (salary + 500)
where salary < 6000;

--Eliminare Franco Bianchi

delete from coders
where last_name = 'Bianchi';

--– Committare i cambiamenti
commit;