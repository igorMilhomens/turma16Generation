package lista2POO;
/*
 	4- 	Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
		administrador tem como atributos da classe Pessoa e também os atributos próprios como
		ajudaDeCusto (ajudas referentes a viagens, estadias).
 */
public class Administrador extends Pessoa {
	//ATRINUTOS
	private double ajudaDeCusto;
	private double prestarContas;
	
	public Administrador(String nome, double ajudaDeCusto, double prestarContas) {
		super(nome);
		this.ajudaDeCusto = ajudaDeCusto;
		this.prestarContas = prestarContas;
	}
	
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getPrestarContas() {
		return prestarContas;
	}

	public void setPrestarContas(double prestarContas) {
		this.prestarContas = prestarContas;
	}

	public void statusContas() {
		System.out.printf("Você retirou o valor de R$%.2f%n", this.ajudaDeCusto);
		System.out.printf("Sua prestação de contas foi de R$%.2f%n",this.prestarContas);
		
		if(this.ajudaDeCusto < this.prestarContas) {
			System.out.printf("%nValor a receber R$%.2f%n%n",(this.prestarContas - this.ajudaDeCusto));
		}
		else {
			System.out.printf("%nValor a devolver R$%.2f%n%n",(this.ajudaDeCusto - this.prestarContas));
		}
	}
}
