package lista3POO;

public class Cachorro extends Animal{

	public Cachorro(String nome) {
		super(nome);	
	}
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	void emitirSom() {
		System.out.printf("O Cachorro %s está latindo.%n%n",this.getNome());
		
	}

	@Override
	void tipoDeMovimento() {
		System.out.printf("O Cachorro %s, corre.%n%n",this.getNome());
		
	}

}
