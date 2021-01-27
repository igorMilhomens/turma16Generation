programa
{
	
	funcao inicio()
	{	

		logico controle1 = verdadeiro, controle2 = verdadeiro
		real n1=0, n2=0
		
		escreva("Digite 2 valores, base e altura do triângulo")
		escreva("\nDigite o valor da base do triângulo em metro[m]: ")
		leia(n1)// apagar essa linha leia(n1) para usar a parte comentada
		/*	
	 	enquanto(controle1)
		{
			
			leia(n1)
			
			se(n1>0)
			{
				controle1 = falso
			}
			senao
			{
				escreva("Valor inválido, digite um valor para base do triângulo maior que zero: ")
			}
		}
		*/
		
		escreva("Digite o valor da altura do triângulo em metro[m]: ")
		leia(n2)// apagar essa linha leia(n2) para usar a parte comentada
		
		/*
		enquanto(controle2)
		{
			
			leia(n2)
			
			se(n2>0)
			{
				controle2 = falso
			}
			senao
			{
				escreva("Valor inválido, digite um valor para altura do triângulo maior que zero: ")
			}
		}
		*/

		se(n1>0 e n2>0)
		{
			escreva("a area do triangulo é ", (n1*n2)/2.0,"m²")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 621; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */