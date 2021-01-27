package lista2;
import java.util.Scanner;

public class IdadeCategoria 
{
	public static void main(String [] args)
	{
		/*	Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
			10-14 infantil
			15-17 juvenil
			18-25 adulto
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Insira sua idade: ");
		idade = scan.nextInt();
		
		if(idade > 9 && idade < 15)
		{
			System.out.println("Sua categoria é 'Infantil'.");
		}
		else if (idade >= 15 && idade < 18)
		{
			System.out.println("Sua categoria é 'Juvenil'.");
		}
		else if (idade >= 18 && idade < 26)
		{
			System.out.println("Sua categoria é 'Adulto'.");
		}
		else
		{
			System.out.println("Você não se enquadra em nenhuma das categorias.");
		}
		
		scan.close();
	}
}
