package exemplos;

import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		try
		{
		
			System.out.println("Digite uma sequencia de nomes:");
			String[] vetor = leia.nextLine().split(" ");//{"ed","rafao","milton"}
			System.out.println("Digite uma posição da lista: ");
			int posicao = leia.nextInt();
			System.out.println("O nome na posição escolhida é "+ vetor[posicao]);
		}
		/*
		catch(Exception e) //trata qualquer exceção
		{
			System.out.println("Digite bem as Informações!");
		}
		
		
		catch (java.lang.ArrayIndexOutOfBoundsException erro)//  trata o erro individual
		{
			System.out.println("Amigão, tu digitou um tamanho de indice errado!!!");
		}
		catch(java.util.InputMismatchException erro) 
		{
			System.out.println("Amigão, tu digitou uma letra não um numero!!!");
		}
		*/
		finally
		{
			System.out.println("Digite bem as Informações!");
			System.out.println("Termino da verificação de erro");
			System.out.println("Executa independente do erro");
		}
		
		System.out.println("Fim de programa!!!!");
	}
	
}
