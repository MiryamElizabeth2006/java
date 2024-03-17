package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class testCuenta {

	public static void main(String[] args) {
		//Crear objeto y refereciarlo.
		Cuenta cuenta1 = new Cuenta("03476", "");
		Cuenta cuenta2 = new Cuenta("03476", "C", 98);
		Cuenta cuenta3 = new Cuenta("03476", "");
		Cuenta cuenta4 = new Cuenta("0987", "");
		Cuenta cuenta5 = new Cuenta("0557", "C", 10);
		Cuenta cuenta6 = new Cuenta("0666", "A",0);
		
		//Setar el valor de saldo.
		cuenta1.setSaldo(675);
		
		//modifico el tipo de cuenta
		cuenta3.setTipo("C");
		
		//modificar valores de cuenta4
		cuenta4.setSaldo(10);	
		
		//Imprimo Cuenta 1, 2 , 3	
	System.out.println("-----Valores Iniciales-----");	
	System.out.println("                              ");
	System.out.println("******Cuenta1******");
	cuenta1.imprimir();
	System.out.println("                              ");
	System.out.println("******Cuenta2******");
	cuenta2.imprimir();
	System.out.println("                              ");
	System.out.println("******Cuenta3******");
	cuenta3.imprimir();
	
	//Modificar los valres de las cuentas
	cuenta1.setSaldo(444);
	cuenta3.setSaldo(567);
	cuenta2.setTipo("D");
	System.out.println("                              ");
	
	System.out.println("-----Valores Modificados-----");
	System.out.println("                              ");
	System.out.println("******Cuenta1******");
	cuenta1.imprimir();
	System.out.println("                              ");
	System.out.println("******Cuenta2******");
	cuenta2.imprimir();
	System.out.println("                              ");
	System.out.println("******Cuenta3******");
	cuenta3.imprimir();
	
	
	//Imprimir con mi estilo
	System.out.println("                              ");
	System.out.println("-----Imprimir con mi Estilo-----");
	System.out.println("                              ");
	System.out.println("******Cuenta4******");
	cuenta4.imprimrConMiEstilo();
	System.out.println("                              ");
	System.out.println("******Cuenta5******");
	cuenta5.imprimrConMiEstilo();
	System.out.println("                              ");
	System.out.println("******Cuenta6******");
	cuenta6.imprimrConMiEstilo();
	}
	
}

