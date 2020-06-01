import java.util.*;

public class Conta {

	protected String agenciaConta;
	protected String numeroConta;
	protected String digitoConta;
	protected double montanteConta = 0;
	protected double valorOperacao;
	protected double chequeEspecial;

	public void setDadosConta() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Agência: ");
		agenciaConta = keyboard.nextLine();
		
		System.out.print("Conta: ");
		numeroConta = keyboard.nextLine();
		
		System.out.print("Digito: ");
		digitoConta = keyboard.nextLine();
		
		this.agenciaConta = agenciaConta;
		this.numeroConta = numeroConta;
		this.digitoConta = digitoConta;
		this.montanteConta = montanteConta;
		
	}
	
	public void depositarFundos() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Valor do depósito: ");
		valorOperacao = keyboard.nextDouble();
			
		this.valorOperacao = valorOperacao;
		this.montanteConta += this.valorOperacao;
		System.out.println("Saldo da conta: R$ " + this.montanteConta + "\n");
	}
	
	public void sacarFundos() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Valor do saque: ");
		valorOperacao = keyboard.nextDouble();
		
		this.valorOperacao = valorOperacao;
		this.montanteConta -= this.valorOperacao;
		System.out.println("Saldo da conta: R$ " + this.montanteConta + "\n");
	}
	
	public void extratoConta() {
		System.out.println("Saldo da conta: R$" + this.montanteConta + "\n");
	}
}