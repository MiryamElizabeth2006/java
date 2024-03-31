--creaacion tabla 2

create table cuentas(
	numero_cuenta char (5) not null,
	cedula_propietario char (5) not null,
	fecha_creacion date not null,
	saldo money not null,
	 constraint cuentas_pk primary key(numero_cuenta)
)


drop table cuentas

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('00001','17556','11/11/2016',200.50)

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('00002','17551','02/08/2011',800.40)

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('00003','15552','17/12/2020',450)

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('00004','18553','20/01/2015',350.50)

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('00005','17554','03/07/2016',200)

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('00006','17254','07/04/2022',52)

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('00007','06055','11/02/2017',200000)

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('00008','17557','03/12/2016',25.000)

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('00009','06035','31/12/1955',1000000000)

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('00010','17854','08/03/2024',12)

delete from cuentas

select * from cuentas

