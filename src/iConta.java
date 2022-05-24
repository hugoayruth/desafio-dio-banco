

public interface iConta {
		
		 void sacar(double valor);
		
		 void depositar(double valor);		
		
		 void transferir(double valor, iConta contaDestino);
		 
		 void imprimirExtrato();

		 void salario(double valor);
		 
		 void saldo(double valor);
}