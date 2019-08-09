--Creo la tabella books
create table books
(book_id number (7,0) primary key,  
title varchar2(80),   
publication_date date);
--Sbaglio a inserire una informazione in books, elimino tutta la tabella col drop table. Riscrivo la tabella in maniera corretta e--> ctrl+invio

drop table books;

--Inserisco i dati nella tabella books
insert into books
values (01, 'Adelchi', '1-AGO-1822');
insert into books
values (02, 'I promessi sposi', '7-SET-1827');
insert into books
values (03, 'Dracula', '4-NOV-1897');
insert into books
values (04, 'Orgoglio e pregiudizio', '9-FEB-1813');
insert into books
values (05, 'La locandiera', '23-LUG-1752');
insert into books
values (06, 'IL', '30-DIC-2010');


--Creo la tabella authors
create table authors
(author_id number (7,0) primary key,  
first_name varchar2(30),  
last_name varchar2(30));

--Inserisco i dati nella tabella degli autori
insert into authors
values (1010, 'Alessandro', 'Manzoni'); --1822 Adelchi, tragedia/ 1827 i promessi sposi, romanzo storico
insert into authors
values (1020, 'Bram', 'Stoker'); --Dracula 1897 romanzo epistolare
insert into authors
values (1030, 'Jane', 'Austen'); --Orgoglio e pregiudizio 1813 romanzo
insert into authors
values (1040, 'Carlo', 'Goldoni');--La locandiera 1752
insert into authors
values (1050, 'Luigi', 'Castiglioni');--IL, dizionario 2010
insert into authors
values (1060, 'Scevola', 'Mariotti'); --IL, dizionario 2010

--Creo la tabella col nome degli utenti
create table name_users
(users_id integer primary key,  
first_name varchar2(30),  
last_name varchar2(30),
email varchar2(30),
phone_number varchar2(13));

--Inserisco i dati nella tabella degli utenti
insert into name_users
values (101, 'Adriana', 'Bianchi', 'adrianabianchi@libero.it', 3291234567);
insert into name_users
values (102, 'Claudio', 'Rossi', 'claudiorossi@libero.it', 3201236568);
insert into name_users
values (103, 'Flavia', 'Verdi', 'flaviaverdi@libero.it', 3401239965);
insert into name_users
values (104, 'Giulia', 'Gialli', 'giuliagialli@libero.it', 3902539965);
insert into name_users
values (105, 'Fausto', 'Neri', 'faustoneri@libero.it', 3482535663);

--RIVEDERE 
create table books_authors(
book_id number (7, 0) not null,
author_id number (7, 0) not null,
foreign key (book_id) references books(book_id),
foreign key (author_id) references authors(author_id),
unique (book_id, author_id));

--Inserisco i dati nella tabella books_authors
insert into books_authors
values(1,1010);
insert into books_authors
values (2,1010);
insert into books_authors
values (3, 1020);
insert into books_authors
values (4,1030);
insert into books_authors
values(5, 1040);
insert into books_authors
values (6, 1050);
insert into books_authors
values (6, 1060);


--Creo la tabella genres
create table genres(
genre_id integer
constraint user_pk primary key,
name VARCHAR2(50));
 
drop table genres;
--Definisco i generi
insert into genres 
values (1011, 'tragedia');
insert into genres 
values (1022, 'romanzo storico');
insert into genres 
values (1033, 'romanzo epistolare');
insert into genres 
values (1044, 'romanzo');
insert into genres 
values (1055, 'dizionario');

--Creo la tabella generi-libri
create table books_genres(
book_id number (7, 0) not null,
genre_id integer not null,
foreign key (book_id) references books(book_id),
foreign key (genre_id) references genres(genre_id),
unique (book_id, genre_id));

--Inserisco i dati nella tabella libri-generi
insert into books_genres
values (1, 1011);
insert into books_genres
values (2, 1022);
insert into books_genres
values(3, 1033);
insert into books_genres
values(4, 1044);
insert into books_genres
values (5, 1044);
insert into books_genres
values (6, 1055);
insert into books_genres
values (1, 1044);
insert into books_genres
values (2, 1044);
insert into books_genres
values (3, 1044);


 