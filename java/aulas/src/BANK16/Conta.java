package BANK16;

public class Conta {
	
	private String numero;
	private String cpf;
	private double saldo;
	public Conta(String numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	public void debitar(double x) {
		if(x>0) {
			if(this.saldo - x >= 0){
				this.saldo -= x;
				System.out.printf("Valor debitado com sucesso, novo saldo R$%.2f%n", this.saldo);
			}
			else{
				System.out.printf("Opera��o Invalida, n�o � possivel debitar valor maior que o Saldo.\nSaldo: R$%.2f%n" , this.saldo);
			}
		}
		else {
				System.out.println("Opera��o inv�lida, para efetuar d�bito o valor da opera��o deve ser Maior que Zero");
		}
	}
	public void creditar(double x) {
		if(x>0)	{
			this.saldo += x;
			System.out.printf("Valor creditado com sucesso, novo saldo R$%.2f%n", this.saldo);
		}
		else {
			System.out.println("Opera��o inv�lida, para efetuar cr�dito o valor da opera��o deve ser Maior que Zero");
		}
	}
}
