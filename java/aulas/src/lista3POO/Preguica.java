package lista3POO;

public class Preguica extends Animal{

	public Preguica(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	@Override
	void emitirSom() {
		// TODO Auto-generated method stub
		System.out.printf("O som emitido pela Preguiça %s é desconhecido.%n%n",this.getNome());
	}

	@Override
	void tipoDeMovimento() {
		// TODO Auto-generated method stub
		System.out.printf("A Preguiça %s, sobe em árvores.%n%n",this.getNome());
	}

}
