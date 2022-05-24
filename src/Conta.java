
public abstract class Conta implements iConta {
	
		private static final int AGENCIA_PADRAO = 1;
		private static  int SEQUENCIAL = 1;

		protected int agencia;
		protected  int numero;
		protected double saldo;
		protected cliente cliente;
		protected int salario;
		protected int depositar;
		protected int transferir;
		
		public Conta(cliente cliente)  {
				this.agencia = Conta.AGENCIA_PADRAO;
				this.numero = SEQUENCIAL++;
				this.cliente = cliente;
		}
		
		@Override
		public void sacar(double valor) {
				saldo -= valor;
		}

		@Override
		public void depositar(double valor) {
				saldo += valor;
		}
		
		@Override
		public void transferir(double valor, iConta contaDestino) {
				this.sacar(valor);
				contaDestino.depositar(valor);
		}
		
		@Override
		public void salario(double valor) {
				salario = 2000;
		}
		
		@Override
		public void saldo(double valor) {
				saldo = 2000;
		}
		
		public void sacar() {
			
		}
		
		public void depositar() {
			
		}
		
		public void transferir() {
			
		}
		
		public void saldo() {
			
		}
	
		public int getAgencia() {
			return agencia;
		}
	
		public int getNumero() {
			return numero;
		}
		
		public int getSalario() {
			return salario;
		}
		
		public double getSaldo() {
			return saldo;
		}
		
		protected void imprimirInfosComuns() {
			System.out.println(String.format("Titular: %s", this.cliente.getNome()));
			System.out.println(String.format("Agencia: %d", this.agencia));
			System.out.println(String.format("Numero: %d", this.numero));
			System.out.println(String.format("Provento: %2d", this.salario));
			System.out.println(String.format("Saldo: %.2f", this.saldo));
			
		}
}	
