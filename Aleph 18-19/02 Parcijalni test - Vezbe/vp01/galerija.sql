create database galerija;

USE galerija;

-- -----------------------------------------------------
-- Table Slikar
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Slikar (
  id INT NOT NULL AUTO_INCREMENT,
  ime VARCHAR(100) NULL,
  prezime VARCHAR(100) NULL,
  PRIMARY KEY (id))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table Pravac
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Pravac (
  id INT NOT NULL AUTO_INCREMENT,
  naziv VARCHAR(100) NULL,
  PRIMARY KEY (id))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table Tehnika
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Tehnika (
  id INT NOT NULL AUTO_INCREMENT,
  naziv VARCHAR(100) NULL,
  PRIMARY KEY (id))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table Slika
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Slika (
  id INT NOT NULL AUTO_INCREMENT,
  naslov VARCHAR(200) NULL,
  sirina INT NULL,
  visina INT NULL,
  godina INT NULL,
  Slikar_id INT NOT NULL,
  Pravac_id INT NOT NULL,
  Tehnika_id INT NOT NULL,
  PRIMARY KEY (id),
  INDEX fk_Slika_Slikar_idx (Slikar_id ASC),
  INDEX fk_Slika_Pravac1_idx (Pravac_id ASC),
  INDEX fk_Slika_Tehnika1_idx (Tehnika_id ASC),
  CONSTRAINT fk_Slika_Slikar
    FOREIGN KEY (Slikar_id)
    REFERENCES Slikar (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_Slika_Pravac1
    FOREIGN KEY (Pravac_id)
    REFERENCES Pravac (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_Slika_Tehnika1
    FOREIGN KEY (Tehnika_id)
    REFERENCES Tehnika (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Data for table Slikar
-- -----------------------------------------------------
START TRANSACTION;
USE galerija;
INSERT INTO Slikar (id, ime, prezime) VALUES (1, 'Nadezda', 'Petrovic');
INSERT INTO Slikar (id, ime, prezime) VALUES (2, 'Milo', 'Milunovic');
INSERT INTO Slikar (id, ime, prezime) VALUES (3, 'Ljuba', 'Popovic');
INSERT INTO Slikar (id, ime, prezime) VALUES (4, 'Mica', 'Popovic');
INSERT INTO Slikar (id, ime, prezime) VALUES (5, 'Sava', 'Sumanovic');

COMMIT;


-- -----------------------------------------------------
-- Data for table Pravac
-- -----------------------------------------------------
START TRANSACTION;
USE galerija;
INSERT INTO Pravac (id, naziv) VALUES (1, 'Impresionizam');
INSERT INTO Pravac (id, naziv) VALUES (2, 'Ekspresionizam');
INSERT INTO Pravac (id, naziv) VALUES (3, 'Nadrealizam');
INSERT INTO Pravac (id, naziv) VALUES (4, 'Hiperrealizam');
INSERT INTO Pravac (id, naziv) VALUES (5, 'Enformel');

COMMIT;


-- -----------------------------------------------------
-- Data for table Tehnika
-- -----------------------------------------------------
START TRANSACTION;
USE galerija;
INSERT INTO Tehnika (id, naziv) VALUES (1, 'Ulje na platnu');
INSERT INTO Tehnika (id, naziv) VALUES (2, 'Ulje na kartonu');
INSERT INTO Tehnika (id, naziv) VALUES (3, 'Crtez');
INSERT INTO Tehnika (id, naziv) VALUES (4, 'Akrilik na platnu');

COMMIT;


-- -----------------------------------------------------
-- Data for table Slika
-- -----------------------------------------------------
START TRANSACTION;
USE galerija;
INSERT INTO Slika (id, naslov, sirina, visina, godina, Slikar_id, Pravac_id, Tehnika_id) VALUES (NULL, 'Portret starice', 40, 60, 1909, 1, 2, 1);
INSERT INTO Slika (id, naslov, sirina, visina, godina, Slikar_id, Pravac_id, Tehnika_id) VALUES (NULL, 'Prizrenka', 45, 70, 1905, 1, 2, 1);
INSERT INTO Slika (id, naslov, sirina, visina, godina, Slikar_id, Pravac_id, Tehnika_id) VALUES (NULL, 'Pejzaz iz primorja', 45, 31, 1935, 2, 1, 2);
INSERT INTO Slika (id, naslov, sirina, visina, godina, Slikar_id, Pravac_id, Tehnika_id) VALUES (NULL, 'Odisej i Kalipso', 46, 55, 1992, 3, 3, 1);
INSERT INTO Slika (id, naslov, sirina, visina, godina, Slikar_id, Pravac_id, Tehnika_id) VALUES (NULL, 'Nakon iskusenja', 50, 70, 1988, 3, 3, 1);
INSERT INTO Slika (id, naslov, sirina, visina, godina, Slikar_id, Pravac_id, Tehnika_id) VALUES (NULL, 'Bez naslova', 20, 30, 1990, 3, 3, 3);

COMMIT;

-- zadatak 1.a
select slikar.ime, slikar.prezime from slikar;

-- zadatak 1.b
select pravac.naziv from pravac
where naziv like '%izam';

-- zadatak 1.c
select slika.naslov, slikar.ime, slikar.prezime, pravac.naziv, tehnika.naziv 
from slika
left join slikar on slika.slikar_id = slikar.id
left join pravac on slika.pravac_id = pravac.id
left join tehnika on slika.tehnika_id = tehnika.id;

-- zadatak 1.d
select pravac.naziv, count(slika.id) from
pravac right join slika on slika.pravac_id = pravac.id
group by pravac.naziv;

-- zadatak 1.e 
select tehnika.naziv, slikar.ime, slikar.prezime from
slika left join slikar on slika.slikar_id = slikar.id
left join tehnika on slika.tehnika_id = tehnika.id
where 
tehnika.naziv = 'ulje na platnu'; -- how can i stop it from doubling?

-- zadatak 1.e modification
select slikar.ime, slikar.prezime, count(slikar.id) from
slika left join slikar on slika.slikar_id = slikar.id
left join tehnika on slika.tehnika_id = tehnika.id
where 
tehnika.naziv = 'ulje na platnu'
group by slikar.id;