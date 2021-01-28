package aulas;

import java.util.Scanner;

public class PesquisaPrefeitura 
{
	public static void main(String[] args)
	{
		/*	A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
		 *  coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
			a) média do salário da população; 
			b) média do número de filhos; 
			c) maior salário; 
			d) percentual de pessoas com salário até R$100,00.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int tam = 20;
		
		double salario[] = new double[20];
		int filhos[]= new int[20];
		
		double mediaSalario = 0, mediaFilhos = 0, somaSalario = 0, maiorSalario = 0, percentualSalario = 0;
		int somaFilhos = 0, contador = 0;
		char c = '%';
		
		for(int i=0; i<tam;i++)
		{
			System.out.print("Digite o seu Salario em R$");
			salario[i] = scan.nextDouble();
			
			System.out.print("Digite a quantidade de filhos que você possui: ");
			filhos[i] = scan.nextInt();
			
			somaSalario += salario[i];
			somaFilhos += filhos[i];
			
			if(maiorSalario < salario[i])
			{
				maiorSalario = salario[i];
			}
			if (salario[i] <= 100)
			{
				contador ++;
			}
			
		}
		mediaSalario = (somaSalario/tam);
		mediaFilhos = (somaFilhos*1.0/tam*1.0);
		percentualSalario = (contador*100.0/tam);
		
		System.out.printf("\nA média do salário da população é  R$%.2f\n", mediaSalario);
		System.out.printf("A média do número de filhos é %.2f\n", mediaFilhos);
		System.out.printf("O maior salário é de R$%.2f\n", maiorSalario);
		System.out.printf("O percentual de pessoas com salário até R$100,00 é de %.2f %c ", percentualSalario, c);
		
		scan.close();
	}
}
