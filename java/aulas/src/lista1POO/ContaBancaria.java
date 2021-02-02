package lista1POO;

public class ContaBancaria {
	
	public String tipo;
	public String cpf;
	public String nome;
	public double saldo;
	
	
	
	public ContaBancaria(String tipo, String cpf) {
		super();
		this.tipo = tipo;
		this.cpf = cpf;
	}
	
	public ContaBancaria(String tipo, String cpf, double saldo) {
		super();
		this.tipo = tipo;
		this.cpf = cpf;
		this.saldo = saldo;
	}



	public ContaBancaria(String tipo, String cpf, String nome, double saldo) {
		super();
		this.tipo = tipo;
		this.cpf = cpf;
		this.nome = nome;
		this.saldo = saldo;
	}

	public String status(){
		String status;
		if(saldo > 0){
			status = "ATIVO";
		}
		else {
			status = "CONGELADA";
		}
		return status;
	}
	
}
