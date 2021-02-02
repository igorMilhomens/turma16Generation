package aulas;

import java.util.Locale;
import java.util.Scanner;

public class AreaTriangulo 
{

	public static void main(String[] args) 
	{
		
		Locale.setDefault(Locale.US);   // Seta configuração de teclado para padrao americano "ponto" ao inves de "virgula"

		Scanner scan = new Scanner(System.in);
		double area1, area2, area3, base1, base2, base3, altura1, altura2, altura3, maiorArea = 0;
		int aux=0;
		
		System.out.println("Digite a base do 1° triangulo: ");
		base1 = scan.nextDouble();
		System.out.println("Digite a altura do 1° triangulo: ");
		altura1 = scan.nextDouble();
		
		System.out.println("Digite a base do 2° triangulo: ");
		base2 = scan.nextDouble();
		System.out.println("Digite a altura do 2° triangulo: ");
		altura2 = scan.nextDouble();
		
		System.out.println("Digite a base do 3° triangulo: ");
		base3 = scan.nextDouble();
		System.out.println("Digite a altura do 3° triangulo: ");
		altura3 = scan.nextDouble();
		
		area1 = ((base1*altura1)/2);
		
		if(maiorArea < area1)
		{
			maiorArea = area1;
			aux = 1;
		}
		area2 = ((base2*altura2)/2);
		
		if(maiorArea < area2)
		{
			maiorArea = area2;
			aux = 2;
		}
		area3 = ((base3*altura3)/2);
		
		if(maiorArea < area3)
		{
			maiorArea = area3;
			aux = 3;
		}
		
		System.out.printf("A area do 1° triangulo é %.2f, a do 2° triangulo é %.2f e a do 3°triangulo é %.2f. "
		+ "\nA maior area é a do %d° triangulo, que é %.2f.", area1, area2, area3, aux, maiorArea);
	}
}
