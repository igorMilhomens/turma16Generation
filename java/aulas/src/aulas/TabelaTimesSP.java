package aulas;

import java.util.Scanner;

public class TabelaTimesSP 
{
	public static boolean validaGPE (char c)
	{
		if(c != 'G' && c != 'P'  && c!='E')
		{
			System.out.println("Opção Invalida!\r\nDigite novo resultado da partida:  ");
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean validaSN (char c)
	{
		if(c != 'N' && c != 'S')
		{
			System.out.println("Opção Invalida!\r\nDeseja continuar?[S/N]: ");
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String time [] = { "CORINTHIANS", "PALMEIRAS", "SANTOS", "SPFC" };
		int pontos [] = new int[4];
		
		char c, opcaoSN;
		int tabela;

		for(int i = 0; i < 4; i++)
		{
			System.out.println("Rodada "+ (i+1)+"\n");
			for(int j = 0; j < 4; j++)
			{
				
				System.out.print( time[j] + " - GANHOU, PERDEU, EMPATOU? [G/P/E]: " );
				
				do 
				{
					c = scan.next().toUpperCase().charAt(0);
					
				}
				while(validaGPE(c));
				
				if (c == 'G')
				{
					pontos[j] += 3;
				}
				else if (c == 'E')
				{
					pontos[j] += 1;
				}
			}
		}
		System.out.println("\nDeseja ver a pontuação de algum Time?");
		do 
		{
			opcaoSN = scan.next().toUpperCase().charAt(0);
		}
		while(validaSN(opcaoSN));
		
		while(opcaoSN == 'S')
		{
			//fazer controle para entrar só times de 1-4
			System.out.println("Selecione um dos times:\n1-CORINTHIANS\n2-PALMEIRAS\n3-SANTOS\n4-SPFC\n");
			tabela = scan.nextInt();
			
			System.out.print(time[tabela-1]+ " possui "+ pontos[tabela-1]+ " pontos\n" );	
			System.out.println("Deseja ver a pontuação de algum Time?");
			do 
			{
				opcaoSN = scan.next().toUpperCase().charAt(0);
			}
			while(validaSN(opcaoSN));
		}
	}
}
