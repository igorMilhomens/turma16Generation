package lista1;

import java.util.Scanner;

public class Tarefa1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int ano, mes, dia, soma;
	
		
		System.out.print("Escreva sua idade, no formato ANO MES DIA");
		
		System.out.print("\nDigite os anos: ");
		ano = scan.nextInt();
		
		System.out.print( "Digite os meses:");
		mes = scan.nextInt();
		
		System.out.print("Digite os dias:");
		dia = scan.nextInt();

		
		soma = (ano*365 + mes*30 + dia);
		
		System.out.println("\nSua idade em dias é de "+ soma + " dias.");
		
		scan.close();
		
	}
}
