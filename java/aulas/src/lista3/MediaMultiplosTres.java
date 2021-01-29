package lista3;

import java.util.Scanner;

public class MediaMultiplosTres 
{
	public static void main(String[] args) 
	{
		/*
		 	6- Escrever um programa que receba vários números inteiros no teclado.
		 	E no final imprimir a média dos números múltiplos de 3.
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
			System.out.println("Nenhum numero digitado é multiplos de 3, não foi pssivel calcular a média");
		}
		else 
		{
			System.out.printf("A média dos numeros multiplo de 3, é = %.2f. ",(soma*1.0/cont));
		}
			
		scan.close();
	}
}
