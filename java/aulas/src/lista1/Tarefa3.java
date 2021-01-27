package lista1;

import java.util.Scanner;

public class Tarefa3 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int valor, seg = 0, min = 0, hora = 0;	
				
		System.out.print("Digite o tempo de duração do evento em segundos: ");		
		valor = scan.nextInt();

		if(valor >= 3600)
		{
			hora = valor/3600;
			valor = valor%3600;
		}
		
		if(valor>=60)
		{
			min = valor/60;
			valor = valor%60;
		}
		
		if(valor>0) 
		{
			seg = valor;
		}

		System.out.println("O evento durou: " + "\nhora(s): " + hora + "\nminuto(s): "+ min + "\nsegundo(s): " + seg);
		
		scan.close();
	}	
}
