package lista1;

import java.util.Scanner;

public class Tarefa8 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		double custo, distribuidor, imposto, result;
		
		System.out.print("Digite o valor do custo de fábrica R$");
		custo = scan.nextDouble();
		
		distribuidor = (custo*0.28);
		imposto = (custo*0.45);
		result = custo + distribuidor + imposto;

		System.out.printf("%nCusto ao consumidor é de R$%.2f", result);
		
		scan.close();
	}
}
