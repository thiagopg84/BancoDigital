import java.util.Scanner;

public class Cliente {

	protected String nomeCliente;
	protected String cpfCliente;
	
	public void setDadosCliente(String nomeCliente, String cpfCliente) {
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
	}
	
	public String getNomeCliente() {
		return this.nomeCliente;
	}
	
	public String getCpfCliente() {
		return this.cpfCliente;
	}
	
	public class ContaPoupanca extends Conta {
		public void getDadosConta() {
			System.out.println("Titular da conta: " + getNomeCliente() + "\n" + "Agência: " + this.agenciaConta + "\n" + "Conta: " + this.numeroConta + "\n" + "CPF do titular: " + getCpfCliente() + "\n");
		}
		
		@Override
		public void depositarFundos() {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Valor do depósito: ");
			valorOperacao = keyboard.nextDouble();
				
			this.valorOperacao = valorOperacao;
			this.montanteConta += this.valorOperacao + (this.valorOperacao * .01);
			this.chequeEspecial = this.montanteConta * 2;
			System.out.println("Saldo da conta: R$ " + this.montanteConta + "\n" + "Cheque Especial: R$ " + this.chequeEspecial + "\n");
		}
		
		@Override
		public void setDadosConta() {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Agência: ");
			agenciaConta = keyboard.nextLine();
			
			System.out.print("Conta: ");
			numeroConta = keyboard.nextLine();
			
			this.agenciaConta = agenciaConta;
			this.numeroConta = numeroConta;
			this.montanteConta = montanteConta;
		}
		
		@Override
		public void sacarFundos() {
			
			
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Valor do saque: ");
			valorOperacao = keyboard.nextDouble();
			this.valorOperacao = valorOperacao;
					
			if (this.chequeEspecial > 0) {
				if(this.valorOperacao > this.chequeEspecial) {
					System.out.println("Valor acima do seu cheque especial!");
				} else {
					this.montanteConta -= this.valorOperacao;
					if (this.montanteConta > 0) {
						this.chequeEspecial = this.montanteConta * 2;
					} else {
						this.chequeEspecial = 0;
					}
					System.out.println("Saldo da conta: R$ " + this.montanteConta + "\n" + "Cheque especial: R$ " + this.chequeEspecial + "\n");
				}
			} else {
				System.out.println("Não há saldo disponível na conta! Saldo da conta: R$ " + this.montanteConta);
			}
		}
	}

	public class ContaCorrente extends Conta {
		public void getDadosConta() {
			System.out.println("Titular da conta: " + getNomeCliente() + "\n" + "Agência: " + this.agenciaConta + "\n" +"Conta: " + this.numeroConta + "-"+ this.digitoConta + "\n" + "CPF do titular: " + getCpfCliente() + "\n");
		}
	}
}