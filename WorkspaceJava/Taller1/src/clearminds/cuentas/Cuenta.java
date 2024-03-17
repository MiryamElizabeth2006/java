package clearminds.cuentas;

public class Cuenta {
		private String id;
		private String tipo;
		private double  saldo;
		
		public Cuenta (String id, String tipo) {
			this.id = id;
			this.tipo = "A";
		}

		public Cuenta (String tipo, String id, double saldo) {
			this.tipo = tipo;
			this.id = id;
			this.saldo = saldo;
		}
		
		public String getId() {
			return id;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		public void imprimir() {
			System.out.println("Número de Cuenta: "+id);
			System.out.println("Tipo: "+tipo);
			System.out.println("Saldo: "+saldo);
		}
		
		public void imprimrConMiEstilo () {
			System.out.println("Cuenta: "+id);
			System.out.println("Asignación: "+tipo);
			System.out.println("Valor: "+saldo);
		}
		                                   
		
		
		
}


