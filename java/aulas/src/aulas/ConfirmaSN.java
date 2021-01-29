package aulas;

import java.util.Scanner;

public class ConfirmaSN {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		char opcaoSN;
		//usar daqui*
		System.out.print("Deseja Continuar?[S/N]: ");
		do 
		{
			opcaoSN = scan.next().toUpperCase().charAt(0);
		}
		while(validaSN(opcaoSN));	
		//até aqui, + função validaSN valore retornado é o char S, N*
		
		//OBS: para transformar um char em maiusculo usar ex. "c = Character.toUpperCase(c);"
		
		System.out.println("Resposta validaSN: "+opcaoSN);
		scan.close();
	}
	
	public static boolean validaSN (char c)
	{
		if(c != 'N' && c != 'S')
		{
			System.out.println("Opção Invalida!\r\nDeseja continuar?[S/N]: ");
			return true;
		}
		else
		{
			return false;
		}
	}
}
