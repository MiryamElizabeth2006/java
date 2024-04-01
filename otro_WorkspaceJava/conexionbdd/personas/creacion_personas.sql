--crear la tabla personas
create table personas(
	cedula char(10) not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	estatura decimal,
	fecha_nacimiento date,
	hora_nacimiento time,
	cantidad_ahorrada money,
	numero_hijos int,
	constraint personas_pk primary key(cedula)
)

drop table personas
select cedula,nombre,apellido from personas

--buscar datos entre algunos designados
select * from personas
where fecha_nacimiento 
between '12/05/2000' and '23/12/2005'

--buscar dato por letras
select * from personas
where nombre like 'P%' 

--buscar las casillas en null
select *from personas where hora_nacimiento is not null

select *from personas where estatura <> 1.60

--actualizar datos en la misma fila
update personas set estatura = 1.70
where cedula = '1755646735'

--actualizar datos en donde se requiera
update personas set cantidad_ahorrada = 0.0
where cantidad_ahorrada is null

update personas set numero_hijos = 0
where numero_hijos is null

--actualizar en algunas columnas
update personas set estatura = 1.50, fecha_nacimiento = '28/11/2006', hora_nacimiento = '14:00'
where cedula = '1755646732'

--Eliminar dato de la fila
delete from personas
where cedula = '1755646735'

delete from personas
where fecha_nacimiento is null

--Operador and y or para la consulta
select * from personas
where nombre = 'Jhon' and apellido = 'León' and estatura = '1.60'

select * from personas
where nombre = 'Jhon' or nombre = 'Luisa' 

--personas que se llamen jhon o luisa y estatura null
select * from personas 
where (nombre = 'Jhon' or nombre = 'Luisa')
and (estatura = 1.60 or estatura < 1.70)



alter table personas
add column estado_civil char (1) not null

create table estado_civil(
	codigo char(1) not null,
	descripcion varchar(20) not null,
	constraint registro_civil_pk primary key(codigo)
)

drop table estado_civil

alter table personas 
add constraint personas_estado_civil_fk
foreign key (estado_civil)
references estado_civil(codigo)

insert into personas (cedula,nombre,apellido,fecha_nacimiento,estado_civil)
values ('1745127874','Elizabeth','Nono','28/11/2006','U')

delete from personas where cedula = '1745127874'

insert into personas (cedula,nombre,apellido,fecha_nacimiento,estado_civil)
values ('1845789612','Juan','Sanchez','12/09/2007','C');
insert into personas (cedula,nombre,apellido,fecha_nacimiento,estado_civil)
values ('1703578161','Leonel','Messi','11/02/2007','U')

select * from estado_civil

insert into estado_civil(codigo,descripcion)
values('U','UNION LIBRE');
insert into estado_civil(codigo,descripcion)
values('C','CASADO');
insert into estado_civil(codigo,descripcion)
values('S','SOLTERO');

select * from personas



