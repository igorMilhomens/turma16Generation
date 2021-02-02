package exemplos;

import entidades.Pessoa;

public class PessoasEstaVivo {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Marcos");
		Pessoa pessoa2 = new Pessoa("Maria",true);
		Pessoa pessoa3 = new Pessoa("João",false);
		Pessoa pessoa4 = new Pessoa("Mata");
		
		System.out.println("============================================");
		
		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("Está vivo: " + pessoa1.estaVivo);
		
		System.out.println("============================================");
		
		System.out.println("Nome: " + pessoa2.nome);
		System.out.println("Está vivo: " + pessoa2.estaVivo);
		
		System.out.println("============================================");
		
		System.out.println("Nome: " + pessoa3.nome);
		System.out.println("Está vivo: " + pessoa3.estaVivo);
		
		System.out.println("============================================");
		
		System.out.println("Nome: " + pessoa4.nome);
		System.out.println("Está vivo: " + pessoa4.estaVivo);
		
		System.out.println("============================================");
	}
}
