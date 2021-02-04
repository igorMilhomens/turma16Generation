package lista3POO;

public class TesteAnimais {

	public static void main(String[] args) {

		Cachorro c1 = new Cachorro("Vira Lata Caramelo");
		Cachorro c2 = new Cachorro("Marrom", 3);
		
		Cavalo cavalo1 = new Cavalo("Pocotó");
		Cavalo cavalo2 = new Cavalo("Galópe",5);
		
		Preguica p1 = new Preguica("Zzzz");
		Preguica p2 = new Preguica("Soneca",8);
		
		System.out.println("----------------------------------------------------");
		
		c1.emitirSom();
		c1.tipoDeMovimento();
		
		c2.emitirSom();
		c2.tipoDeMovimento();
		
		System.out.println("----------------------------------------------------");
		
		cavalo1.emitirSom();
		cavalo1.tipoDeMovimento();
		
		cavalo2.emitirSom();
		cavalo2.tipoDeMovimento();
		
		System.out.println("----------------------------------------------------");

	}

}
