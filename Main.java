
public class Main {

	public static void main(String[] args) {
		Cliente cliente01 = new Cliente();
		cliente01.setDadosCliente("José Silva", "123456789");
		Cliente.ContaCorrente contaCorrente01 = cliente01.new ContaCorrente();
		Cliente.ContaPoupanca contaPoupanca01 = cliente01.new ContaPoupanca();
		contaPoupanca01.setDadosConta();
		contaPoupanca01.depositarFundos();
		contaPoupanca01.sacarFundos();

		contaCorrente01.setDadosConta();
		contaCorrente01.depositarFundos();
		contaCorrente01.extratoConta();		

		contaPoupanca01.getDadosConta();
	}

}
