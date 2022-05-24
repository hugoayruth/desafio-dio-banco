
public class Poupanca extends Conta  {

	public Poupanca(cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
			System.out.println("===Extrato Poupanca===");
			super.imprimirInfosComuns();
	}
}