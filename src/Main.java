
public class Main {

	public static void main(String[] args) {
			cliente hugo = new cliente();
			hugo.setNome("Hugo");
		
			Conta cc = new ContaCorrente(hugo);
			Conta poupanca = new Poupanca(hugo);
			
			cc.depositar(2000+1000);
			cc.transferir(1000, poupanca);
			cc.salario(2000);
			
			
			cc.imprimirExtrato();
			poupanca.imprimirExtrato();
	}

}
