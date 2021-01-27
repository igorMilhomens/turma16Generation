package lista1;

import java.util.Scanner;

public class Tarefa2 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int valor, dia = 0, mes = 0, ano = 0;
		String a , b , c;
		
		System.out.print("Digite sua idade em dias: ");
		valor = scan.nextInt();
		
		if (valor >= 365)
		{
			ano = valor/365;
			valor = valor%365;
		}
		
		if(valor>=30)
		{
			mes = valor/30;
			valor = valor%30;
		}
		
		if(valor>0) 
		{
			dia = valor;
		}
		
		if(ano == 1)
		{
			a = "ano";
		}
		else
		{
			a = "anos";
		}
		
		if(mes == 1)
		{
			b = "mês";
		}
		else
		{
			b = "meses";
		}
		
		if(dia == 1)
		{
			c = "dia";
		}
		else
		{
			c = "dias";
		}

		System.out.println("\nSua idade é de "+ ano+" "+ a+ ", " +mes+ " "+ b+ " e "+ dia+ " "+ c);
		
		scan.close();
		
	}
	
}
