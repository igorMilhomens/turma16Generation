package lista3;

import java.util.Arrays;
import java.util.Scanner;

public class QuantidadeParidade
{
	public static void main(String[] args)
	{
		//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		// numero pares e impares fazem parte do conjunto dos Naturais
		// zero é considerado um numero neutro
		// Invalidos, numeros que nao fazem parte do conjunto N* = {1, 2, 3, 4, 5..., n, ...} conjuntos dos números naturais não-nulos, e não são considerados neutros.
		
		Scanner scan = new Scanner(System.in);
		
		double num[] = new double[10];
		int auxPar = 0, auxImpar = 0, auxNeutro = 0, auxInvalido = 0 ;
		
		for(int i= 0; i<10; i++)
		{
			System.out.print("digite o "+ (i+1) +"° valor: ");
			num[i]= scan.nextDouble();
			if(num[i]>0)
			{
				if(num[i]%2 == 0)
				{
					auxPar++;
				}
				else if(num[i]%2 == 1)
				{
					auxImpar++;
				}
			}
			else if (num[i] == 0)
			{
				auxNeutro++;
			}
			else if (num[i] < 0)
			{
				auxInvalido++;
			}
		}
		
		Arrays.sort(num);
		
		System.out.print("\nOs numeros digitados foram:\n\n"+ Arrays.toString(num)+"\n\nDentre eles:");
		System.out.printf((auxPar>1)?"\t%d são pares.%n":"\t%d é par.%n", auxPar);
		System.out.printf((auxImpar>1)?"\t\t%d são ímpares.%n":"\t\t%d é ímpar.%n", auxImpar);
		//System.out.printf((auxNeutro>1)?"%d são neutros.":"%d é neutro.%n", auxNeutro);
		//System.out.printf((auxInvalido>1)?"%d são inválidos.":"%d é invalido.%n", auxInvalido);
		
		scan.close();
	}
}
