package lista3;

import java.util.Scanner;

public class CaracteristeicaIndividuo {

	public static void main(String[] args) {
		/*
		Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. 
		Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
		e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		o n�mero de pessoas calmas; 
		o n�mero de mulheres nervosas; 
		o n�mero de homens agressivos; 
		o n�mero de outros calmos;
		o n�mero de pessoas nervosas com mais de 40 anos; 
		o n�mero de pessoas calmas com menos de 18 anos.
		*/
		Scanner scan = new Scanner(System.in)
				;
		final int TAM = 150;
		
		int contador = 0, idade = 0, sexo = 0, opcao = 0, pessoaCalma = 0, mulherNervosa = 0, homemAgressivo = 0, 
			outroCalmo = 0, nervosaMais40 = 0, calmoMenor18 = 0;
		
		while(contador<TAM)
		{
			contador ++;
			
			System.out.print("Digite sua idade: ");
			idade = scan.nextInt();
			
			System.out.print("Qual dua identifica��o sexual(1-feminino / 2-masculino / 3-Outros): ");
			sexo = scan.nextInt();
			
			System.out.print("Voc� � uma (1- Pessoa calma / 2-Pessoa  nervosa / 3-Pessoa agressiva):  ");
			opcao = scan.nextInt();
			
			if(opcao == 1)
			{
				pessoaCalma++;
			}
			if(sexo == 1 && opcao == 2)
			{
				mulherNervosa++;
			}
			if(sexo == 2 && opcao == 3)
			{
				homemAgressivo++;
			}
			if(sexo == 3 && opcao == 1)
			{
				outroCalmo++;
			}
			if(idade > 40 && opcao == 2)
			{
				nervosaMais40++;
			}
			if(idade<18 && opcao == 1)
			{
				calmoMenor18++;
			}
			
		}
		
		System.out.println("O n�mero de pessoas calmas�: " + pessoaCalma
						+ "	O n�mero de mulheres nervosas �: " + mulherNervosa
						+ "	O n�mero de homens agressivos �: " + homemAgressivo
						+ "	O n�mero de outros calmos �: " + outroCalmo
						+ "	O n�mero de pessoas nervosas com mais de 40 anos �: " + nervosaMais40
						+ "	O n�mero de pessoas calmas com menos de 18 anos �: " + calmoMenor18);
		scan.close();
	}
}
