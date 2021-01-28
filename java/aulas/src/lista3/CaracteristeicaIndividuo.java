package lista3;

import java.util.Scanner;

public class CaracteristeicaIndividuo {

	public static void main(String[] args) {
		/*
		Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
		Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
		e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		o número de pessoas calmas; 
		o número de mulheres nervosas; 
		o número de homens agressivos; 
		o número de outros calmos;
		o número de pessoas nervosas com mais de 40 anos; 
		o número de pessoas calmas com menos de 18 anos.
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
			
			System.out.print("Qual dua identificação sexual(1-feminino / 2-masculino / 3-Outros): ");
			sexo = scan.nextInt();
			
			System.out.print("Você é uma (1- Pessoa calma / 2-Pessoa  nervosa / 3-Pessoa agressiva):  ");
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
		
		System.out.println("O número de pessoas calmasé: " + pessoaCalma
						+ "	O número de mulheres nervosas é: " + mulherNervosa
						+ "	O número de homens agressivos é: " + homemAgressivo
						+ "	O número de outros calmos é: " + outroCalmo
						+ "	O número de pessoas nervosas com mais de 40 anos é: " + nervosaMais40
						+ "	O número de pessoas calmas com menos de 18 anos é: " + calmoMenor18);
		scan.close();
	}
}
