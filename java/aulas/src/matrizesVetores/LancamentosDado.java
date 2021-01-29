package matrizesVetores;

import java.util.Arrays;
import java.util.Random;

public class LancamentosDado {

	public static void main(String[] args)
	{
		/*
		 * 2.	Um dado � lan�ado 10 vezes e o valor correspondente � anotado.
		 * Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor.
		 * A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
		 */
		
		Random r = new Random();
		
		int resultadoLancamentos[]  = new int[10];
		int maiorValor = 0, contador=0;
		
		for(int i=0; i<10; i++)
		{
			resultadoLancamentos[i] = (r.nextInt(6) + 1);//r.nextInt(6) gera um num de 0-5, soma um pra corrigir o problema e gerar de 1-6
			
			if(maiorValor<resultadoLancamentos[i])
			{
				maiorValor = resultadoLancamentos[i];
				contador = 1;
			}
			else if(maiorValor == resultadoLancamentos[i])
			{
				contador++;
			}
		}
		
		System.out.printf("O resultado dos lan�amentos foram: %s%n%n",Arrays.toString(resultadoLancamentos));
		System.out.printf("O maior valor de lan�amento �: %d, ele apareceu %dx.", maiorValor, contador);
	}
}
