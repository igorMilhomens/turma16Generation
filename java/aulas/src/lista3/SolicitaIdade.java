package lista3;

import java.util.Scanner;

public class SolicitaIdade {

	public static void main(String[] args) 
	{
		//3- Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		
		Scanner scan = new Scanner(System.in);
		int num = 0, aux1 = 0 ,aux2 = 0;
		
		while(num!= -99)
		{
			System.out.print("Digite sua idade: ");
			
			num = scan.nextInt();
			
			if (num<21 && num!=-99)
			{
				aux1++;
			}
			else if(num>50)
			{
				aux2++;
			}
		}
		
		System.out.printf((aux1>1)?"%n%d pessoas s�o menores de 21 anos.":(aux1==0)?"%nNenhuma pessoa � menor de 21 anos.":"%n%d pessoa � menor de 21 anos.", aux1);
		System.out.printf((aux2>1)?"%n%d pessoas s�o maiores de 50 anos.":(aux2==0)?"%nNenhuma pessoa � maior de 50 anos.":"%n%d pessoa � maior de 50 anos.", aux2);
	}

}
