package collections;

public class Colecao {
	private String nome;
	private int ano;
	private double valorEstimado;
	private double valorVenda;
	
	public Colecao(String nome, int cod) {
		super();
		this.nome = nome;

	}
	public Colecao(String nome, int ano, double valorEstimado) {
		super();
		this.nome = nome;
		this.ano = ano;
		this.valorEstimado = valorEstimado;
		this.valorVenda = valorEstimado*0.2;
	
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValorEstimado() {
		return valorEstimado;
	}

	public void setValorEstimado(double valorEstimado) {
		this.valorEstimado = valorEstimado;
	}
	
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	
	public void comprar(){
		if(valorEstimado == 0)
		{
			System.out.println("Item sem Valor Estimado. Faça uma proposta: R$");
		}
		else {
			System.out.printf("Valor para venda. R$%.2f%n", (valorEstimado*0.2));
		}
	}
}
