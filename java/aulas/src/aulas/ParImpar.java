package aulas;

import java.util.Scanner;

public class ParImpar 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int num;
		String c;
	
		System.out.print("Digite um numero Natural maior que 0, ex.[1, 2, 3,..., 5] : ");
		num = scan.nextInt();

		if(num>0)
		{
			if(num%2 == 0)
			{
				c = "par";
			}
			else
			{
				c = "�mpar";
			}
			System.out.printf("O numero %d  � um numero %s.", num, c );
		}
		else if (num == 0)
		{
			System.out.println("Zero � um numero neutro.");
		}
		else if (num < 0)
		{
			System.out.println("Desculpe, o numedo indicado � negativo, n�o � possivel definir paridade.");
		}
		scan.close();
	}
}
