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
			System.out.println("Digite uma posi��o da lista: ");
			int posicao = leia.nextInt();
			System.out.println("O nome na posi��o escolhida � "+ vetor[posicao]);
		}
		/*
		catch(Exception e) //trata qualquer exce��o
		{
			System.out.println("Digite bem as Informa��es!");
		}
		
		
		catch (java.lang.ArrayIndexOutOfBoundsException erro)//  trata o erro individual
		{
			System.out.println("Amig�o, tu digitou um tamanho de indice errado!!!");
		}
		catch(java.util.InputMismatchException erro) 
		{
			System.out.println("Amig�o, tu digitou uma letra n�o um numero!!!");
		}
		*/
		finally
		{
			System.out.println("Digite bem as Informa��es!");
			System.out.println("Termino da verifica��o de erro");
			System.out.println("Executa independente do erro");
		}
		
		System.out.println("Fim de programa!!!!");
	}
	
}
