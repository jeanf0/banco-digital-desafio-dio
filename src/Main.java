
public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco("Banrisul");
		
		Cliente jean = new Cliente();
		jean.setNome("Jean");
		
		Conta cc = new ContaCorrente(jean);
		banco.addConta(cc);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(jean);
		banco.addConta(poupanca);
		
		cc.transferir(100, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		Cliente gabriel = new Cliente();
		
		gabriel.setNome("Gabriel");
		
		Conta poupancaGab = new ContaPoupanca(gabriel);
		banco.addConta(poupancaGab);
		poupancaGab.depositar(500);
		
		
		
		//imprimir todas as contas cadastradas no banco
		banco.imprimirContas();

	}

}
