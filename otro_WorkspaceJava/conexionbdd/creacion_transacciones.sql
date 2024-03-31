--creación tabla 6

create table transacciones(
	codigo int not null,
	numero_cuenta char(5) not null,
	monto money not null,
	tipo char (1) not null,
	fecha date not null,
	hora time not null,
	constraint transacciones_pk primary key(codigo)
)

drop table transacciones

insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values (1025,'14785',600000,'D','13/12/2023','10:18')

delete from transacciones where codigo = 1001

1001	"22002"	"$100,12"	"C"	"2022-02-12"	"12:45:00"	

delete from transacciones

select *from transacciones
