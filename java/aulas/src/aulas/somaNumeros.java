package aulas;

import java.util.Scanner;

public class somaNumeros {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int num, cont = 0, soma = 0;
		char c ='+';
		
		//boolean controle = true;
		
		System.out.print("Digite um numero do teclado: ");
		
		num = scan.nextInt();
		
		/*while(controle)
		{
			if(num > cont)
			{
				cont ++; 
				soma +=cont; 
			}
			else
			{
				controle = false;
			}
			
		}*/
		
		System.out.println("A soma dos valores até o numero é:");
		
		for(int i = 0; i <= num; i++)
		{
			if(num > cont)
			{
				cont ++; 
				soma += cont; 
			}
			
			System.out.printf(i==0 ? "%d ":"+ %d ",i);
		}
		
		System.out.println("= " + soma);
	}
}
