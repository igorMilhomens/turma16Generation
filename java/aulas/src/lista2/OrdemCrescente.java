package lista2;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemCrescente 
{
	public static void main(String [] args)
	{
		//Faça um programa que entre com três números e coloque em ordem crescente.

		Scanner scan = new Scanner(System.in);
		
		int num[] = new int[3];
		System.out.print("Informe o primeiro valor: ");
		num[0] = scan.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		num[1] = scan.nextInt();
		
		System.out.print("Informe o terceiro valor: ");
		num[2] = scan.nextInt();
		
		Arrays.sort(num);
		
		System.out.printf("\nOs numero em ordem crescentes são: %s",Arrays.toString(num));
		
		scan.close();
	}
}
