package lista1;

import java.util.Scanner;

public class Tarefa6 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		double x1, x2, y1, y2, s1, s2, s3, quad1, quad2, result;

		System.out.println("Entre com as coordenasdas (x,y) do ponto P1");

		System.out.print("\nDigite a coordenada x1: ");
		x1 = scan.nextDouble();

		System.out.print("Digite a coordenada y1: ");
		y1 = scan.nextDouble();

		System.out.print("Digite a coordenada x2: ");
		x2 = scan.nextDouble();

		System.out.print("Digite a coordenada y2: ");
		y2 = scan.nextDouble();

		s1 = ( x2 - x1 );
		s2 = ( y2 - y1 );

		quad1 = Math.pow(s1,2.0);
		quad2 = Math.pow(s2,2.0);

		s3 = (quad1 + quad2);
		
		result = Math.sqrt(s3);
		
		System.out.printf("%nO resultado da formula é: %.2f", result);
		
		scan.close();
	}
}
