package lista2;

import java.util.Scanner;

public class ParQuadrado 
{
	
	public static void main(String[] args)
	{
		/*Faça um programa em que permita a entrada de um número qualquer 
		 * E exiba se este número é par ou ímpar.
		 *  Se for par exiba também a raiz quadrada do mesmo;
		 *   se for ímpar exiba o número elevado ao quadrado.
		 */
		Scanner scan = new Scanner(System.in);
		
		double num;
		
		System.out.print("Insira um Numero: ");
		num = scan.nextInt();
		if(num == 0) 
		{
			System.out.println("Zero é um numero neutro.");
		}
		else if(num > 0 && num%2 == 0)
		{
			System.out.printf("O numero %.2f é par, e sua raiz quadrada é %.2f", num , Math.sqrt(num));
		}
		else if(num > 0 && num%2 == 1)
		{
			System.out.printf("O numero %.2f é ímpar, e o seu quadrado é %.2f", num , Math.pow(num,2));
		}
		else 
		{
			System.out.println("O numero não é inteiro. Não é possivel calcular a paridade do numero.");
		}
		
		scan.close();
	}
}
