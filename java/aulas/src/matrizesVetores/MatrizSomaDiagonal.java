package matrizesVetores;

import java.util.Scanner;

public class MatrizSomaDiagonal {

	public static void main(String[] args) 
	{
		/*
		 *  4.	Crie um programa que receba valores do usuário para preencher uma matriz 3X3,e em seguida,
		 *   exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		final int TAM = 3;
		int matriz[][] = new int[TAM][TAM];
		int somaTotal = 0, somaDiagonal = 0;

		for(int i=0; i<TAM; i++)
		{
			for(int j =0; j<TAM; j++)
			{
				System.out.printf("Entre com o valor da posição [%d][%d]: ", i,j);
				matriz[i][j] = scan.nextInt();

				somaTotal += matriz[i][j];
				
				if(i == j)
				{
					somaDiagonal += matriz[i][j];
				}
				
			}
		}
		System.out.printf("A soma total dos valores da matriz é: %d.\nA soma da diagonal principal é: %d",somaTotal ,somaDiagonal);
	}
}
