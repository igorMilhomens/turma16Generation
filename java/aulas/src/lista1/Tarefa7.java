package lista1;

import java.util.Scanner;

public class Tarefa7 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		double a, b, c, d, p, f, x, y;
	
		System.out.print("Digite a variavel A:");
		a = scan.nextDouble();

		System.out.print("Digite a variavel B:");
		b = scan.nextDouble();
		
		System.out.print("Digite a variavel C:");
		c = scan.nextDouble();
		
		System.out.print("Digite a variavel D:");
		d = scan.nextDouble();
		
		System.out.print("Digite a variavel E:");
		p = scan.nextDouble();
		
		System.out.print("Digite a variavel F:");
		f = scan.nextDouble();

		x = ((c*p - b*f)/(a*p - b*d));

		y = ((a*f - c*d)/(a*p - b*d));
		
		System.out.println("\nValor de x é: "+ x + "\nValor de y é: " + y);
		
		scan.close();
	}
}
