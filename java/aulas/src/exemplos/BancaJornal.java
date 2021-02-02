package exemplos;

import java.util.Scanner;

import entidades.Pessoa;

public class BancaJornal {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Pessoa cliente1 = new Pessoa();
		
		System.out.println("Bem vindo a banca do Igor\n");
		
		System.out.print("Digite seu nome: ");
		cliente1.nome = scan.next();
		
		System.out.print("Digite seu ano de Nascimento[aaaa]:");
		cliente1.anoNascimento = scan.nextInt();
		
		System.out.println("Digite o sexo ([M]-Masculino / [F]-Feminino): ");
		cliente1.sexo = scan.next().toUpperCase().charAt(0);
		
		System.out.printf("%s%s, a lista de produtos disponíveis para voce é: ",cliente1.tratamento(), cliente1.statusIdade());
		/*
		 * inserir lista personalizada
		 * livre
		 * +18
		 */
	}

}
