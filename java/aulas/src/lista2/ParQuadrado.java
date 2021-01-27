package lista2;

import java.util.Scanner;

public class ParQuadrado 
{
	
	public static void main(String[] args)
	{
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer 
		 * E exiba se este n�mero � par ou �mpar.
		 *  Se for par exiba tamb�m a raiz quadrada do mesmo;
		 *   se for �mpar exiba o n�mero elevado ao quadrado.
		 */
		Scanner scan = new Scanner(System.in);
		
		double num;
		
		System.out.print("Insira um Numero: ");
		num = scan.nextInt();
		if(num == 0) 
		{
			System.out.println("Zero � um numero neutro.");
		}
		else if(num > 0 && num%2 == 0)
		{
			System.out.printf("O numero %.2f � par, e sua raiz quadrada � %.2f", num , Math.sqrt(num));
		}
		else if(num > 0 && num%2 == 1)
		{
			System.out.printf("O numero %.2f � �mpar, e o seu quadrado � %.2f", num , Math.pow(num,2));
		}
		else 
		{
			System.out.println("O numero n�o � inteiro. N�o � possivel calcular a paridade do numero.");
		}
		
		scan.close();
	}
}
