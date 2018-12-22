create database knjizara;

use knjizara;

CREATE TABLE knjiga (
  id INT NOT NULL,
  naziv VARCHAR(45) NOT NULL,
  zanr VARCHAR(45) NULL,
  PRIMARY KEY (id));


CREATE TABLE autor (
  id INT NOT NULL,
  ime VARCHAR(45) NOT NULL,
  prezime VARCHAR(45) NOT NULL,
  PRIMARY KEY (id));

CREATE TABLE autorknjige (
  id INT NOT NULL AUTO_INCREMENT,
  knjiga_id INT NOT NULL,
  autor_id INT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (knjiga_id) REFERENCES knjiga (id),
  FOREIGN KEY (autor_id) REFERENCES autor(id));

insert into knjiga (id, naziv, zanr) values (1, 'Na Drini cuprija', 'Klasici');
insert into knjiga (id, naziv, zanr) values (2, 'Maja - pricice za cvrst san', 'Knjige za decu');
insert into knjiga (id, naziv, zanr) values (3, 'Nauci da programiras', 'Knjige za decu');
insert into knjiga (id, naziv, zanr) values (4, 'Velicanstvena knjiga o zivotinjama', 'Knjige za decu');
insert into knjiga (id, naziv, zanr) values (5, 'Sta Evropa zeli?', 'Filozofija');
insert into knjiga (id, naziv, zanr) values (6, 'Biblija', 'Religija');

insert into autor (id, ime, prezime) values (1, 'Ivo', 'Andric');
insert into autor (id, ime, prezime) values (2, 'Srecko', 'Horvat');
insert into autor (id, ime, prezime) values (3, 'Zilber', 'Delae');
insert into autor (id, ime, prezime) values (4, 'Marsel', 'Marlije');
insert into autor (id, ime, prezime) values (5, 'Maks', 'Vejnrajt');
insert into autor (id, ime, prezime) values (6, 'Tom', 'Dzekson');
insert into autor (id, ime, prezime) values (7, 'Val', 'Valercuk');
insert into autor (id, ime, prezime) values (8, 'Slavoj', 'Zizek');


insert into autorknjige (knjiga_id, autor_id) values (1, 1);
insert into autorknjige (knjiga_id, autor_id) values (2, 3);
insert into autorknjige (knjiga_id, autor_id) values (2, 4);
insert into autorknjige (knjiga_id, autor_id) values (3, 5);
insert into autorknjige (knjiga_id, autor_id) values (4, 6);
insert into autorknjige (knjiga_id, autor_id) values (4, 7);
insert into autorknjige (knjiga_id, autor_id) values (5, 2);
insert into autorknjige (knjiga_id, autor_id) values (5, 8);

-- zadatak 1.a
select knjiga.naziv from knjiga;

-- zadatak 1.b
select autor.ime, autor.prezime
from autor
where prezime like 'A%' 
order by autor.prezime asc;

-- zadatak 1.c 
select knjiga.naziv, autor.ime, autor.prezime
from autorknjige left join autor on autorknjige.autor_id = autor.id
left join knjiga on autorknjige.knjiga_id = knjiga.id;

-- zadatak 1.d
select knjiga.naziv from
knjiga left join autorknjige on knjiga.id = autorknjige.knjiga_id
where autorknjige.id is null;

-- zadatak 1.e
select knjiga.naziv, count(autorknjige.autor_id) from
knjiga left join autorknjige on autorknjige.knjiga_id = knjiga.id
left join autor on autorknjige.autor_id = autor.id
group by knjiga.naziv;

-- zadatak 1.f
select knjiga.naziv, autor.ime, autor.prezime from
knjiga left join autorknjige on knjiga.id = autorknjige.knjiga_id
left join autor on autorknjige.autor_id = autor.id
where knjiga.zanr = 'Knjige za decu';

-- zadatak 1.f modification
select autor.ime, autor.prezime from
knjiga left join autorknjige on knjiga.id = autorknjige.knjiga_id
left join autor on autorknjige.autor_id = autor.id
where knjiga.zanr = 'Knjige za decu';
