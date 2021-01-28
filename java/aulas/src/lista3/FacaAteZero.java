package lista3;

import java.util.Scanner;

public class FacaAteZero {

	public static void main(String[] args) {
		/*
		 	Crie um programa que leia um número do teclado até que encontre um número igual a zero.
		 	No final, mostre a soma dos números digitados.(DO...WHILE)
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
			
		System.out.println("A soma dos numeros digitados é igual à "+soma+".");
		scan.close();
	}

}
