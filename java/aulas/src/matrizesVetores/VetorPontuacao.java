package matrizesVetores;

import java.util.Arrays;
import java.util.Scanner;

public class VetorPontuacao 
{
	public static void main(String [] args)
	{
		/* 1.Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida.
		 *  Encontre após a maior pontuação e a apresente. 
		 */
		Scanner scan = new Scanner(System.in);
		
		double notas [] = new double[5] ;
		//double maiorNota =0;
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Digite a "+(i+1)+ "° nota: ");
			notas[i] = scan.nextDouble();
			
			/*
			if(maiorNota<notas[i])
			{
				maiorNota = notas[i];
			}
			*/
		}
		Arrays.sort(notas);
		
		System.out.println("O vetor formado foi: "+Arrays.toString(notas));
		System.out.println("A maior nota foi: "+ notas[4]);
		//System.out.println("A maior nota foi: "+maiorNota);
		scan.close();
	}
}
