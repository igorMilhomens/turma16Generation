package lista3;

import java.util.Scanner;

public class MediaMultiplosTres 
{
	public static void main(String[] args) 
	{
		/*
		 	6- Escrever um programa que receba v�rios n�meros inteiros no teclado.
		 	E no final imprimir a m�dia dos n�meros m�ltiplos de 3.
		 	Para sair digitar 0(zero).(DO...WHILE)
		 */
		Scanner scan = new Scanner(System.in);
		int num = 0, soma = 0, cont = 0;
		
		do
		{
			System.out.print("Digite um numero: ");
			num = scan.nextInt();
			if(num%3 == 0 && num!=0)
			{
				soma += num;
				cont++;
			}
		}
		while(num!=0);
		if(cont == 0)
		{
			System.out.println("Nenhum numero digitado � multiplos de 3, n�o foi pssivel calcular a m�dia");
		}
		else 
		{
			System.out.printf("A m�dia dos numeros multiplo de 3, � = %.2f. ",(soma*1.0/cont));
		}
			
		scan.close();
	}
}
