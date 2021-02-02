package exemplos;

import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoa;

public class CadAmigos {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US); 
		Scanner scan = new Scanner(System.in);
		Pessoa pessoa1 = new Pessoa();
		
		System.out.print("Digite o nome: ");
		pessoa1.nome = scan.next();
		
		System.out.println("Digite o sexo ([M]-Masculino / [F]-Feminino): ");
		pessoa1.sexo = scan.next().toUpperCase().charAt(0);
		
		System.out.println("Digite o ano de nascimento ([aaaa]): ");
		pessoa1.anoNascimento = scan.nextInt();
		
		
	}

}
