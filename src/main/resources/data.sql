DROP TABLE IF EXISTS cientificos;
DROP TABLE IF EXISTS proyectos;
DROP TABLE IF EXISTS asignado_a;

CREATE TABLE cientificos (
    DNI varchar(8) auto_increment primary key,
    nomApels nvarchar(255)
);

CREATE TABLE proyectos (
    id char(4) primary key,
    nombre nvarchar(255),
    horas int
);

CREATE TABLE asignado_a (
    cientifico varchar(8),
    proyecto char(4),
    primary key(cientifico, proyecto),
    foreign key (cientifico) references cientificos(DNI) on delete cascade on update cascade,
    foreign key (proyecto) references proyectos(id) on delete cascade on update cascade
);

INSERT INTO cientificos VALUES ('39931225','Joel');
INSERT INTO cientificos VALUES ('45879265','Carlos');
INSERT INTO cientificos VALUES ('78921365','Pedro');
INSERT INTO cientificos VALUES ('12547865','Hugo');
INSERT INTO cientificos VALUES ('95632154','Laura');

INSERT INTO proyectos VALUES ('4563','Proyecto 1', 30);
INSERT INTO proyectos VALUES ('6547','Proyecto 2', 23);
INSERT INTO proyectos VALUES ('1543','Proyecto 3', 40);
INSERT INTO proyectos VALUES ('6548','Proyecto 4', 32);
INSERT INTO proyectos VALUES ('7854','Proyecto 5', 28);

INSERT INTO asignado_a VALUES ('39931225','4563');
INSERT INTO asignado_a VALUES ('45879265','6547');
INSERT INTO asignado_a VALUES ('78921365','1543');
INSERT INTO asignado_a VALUES ('12547865','6548');
INSERT INTO asignado_a VALUES ('95632154','7854');