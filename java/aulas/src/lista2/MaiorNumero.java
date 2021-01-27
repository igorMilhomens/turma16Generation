package lista2;

import java.util.Scanner;

public class MaiorNumero 
{
	public static void main (String [] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		int x1 , x2, x3, maiorNumero;
		
		System.out.println("Digite 3 Numeros Inteiros, e te direi qual é o maior deles!");
		System.out.print("\nDigite o Primeiro Numero: ");
		
		x1 = scan.nextInt();
		
		System.out.print("Digite o Segundo Numero: ");
		
		x2 = scan.nextInt();
		
		System.out.print("Digite o Terceiro Numero: ");
		
		x3 = scan.nextInt();
		
		maiorNumero = x1;
		
		if(maiorNumero < x2)
		{
			maiorNumero = x2;
		}
		if(maiorNumero < x3) 
		{
			maiorNumero = x3;
		}
		
		System.out.printf("\nO Maior Numero é o: %d", maiorNumero);
		
		scan.close();
	}
}
