package lista3;

import java.util.Scanner;

public class FacaAteZero {

	public static void main(String[] args) {
		/*
		 	Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
		 	No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		*/
		Scanner scan = new Scanner(System.in);
		
		int num = 0, soma = 0;
		
		do
		{
			System.out.print("Digite um numero do teclado: ");
			num = scan.nextInt();
			
			soma += num;
		}
		while(num!=0);
			
		System.out.println("A soma dos numeros digitados � igual � "+soma+".");
		scan.close();
	}

}
