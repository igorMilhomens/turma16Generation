package lista3POO;

public class Cavalo extends Animal {

	public Cavalo(String nome) {
		super(nome);
	}
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	@Override
	void emitirSom() {
	
		System.out.printf("O Cavalo %s está relinchando.%n%n",this.getNome());
	}

	@Override
	void tipoDeMovimento() {
		System.out.printf("O Cavalo %s, corre.%n%n",this.getNome()); 
	}

}
