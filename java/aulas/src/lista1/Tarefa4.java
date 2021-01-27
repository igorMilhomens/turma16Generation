package lista1;

import java.util.Scanner;

public class Tarefa4 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3, soma1, soma2;
		double result;
		
		System.out.print("Digite 3 numeros inteiros Positivos");
		
		System.out.print("\nDigite o 1°Numero: ");
		num1 = scan.nextInt();
		
		System.out.print("Digite o 2°Numero: ");
		num2 = scan.nextInt();
		
		System.out.print("Digite o 3°Numero: ");
		num3 = scan.nextInt();

		soma1 = ( num1 + num2 );
		soma2 = ( num2 + num3 );

		result = (soma1*soma1 + soma2*soma2)/2.0;

		System.out.println("\n1" + result);
		
		scan.close();
	}
}
