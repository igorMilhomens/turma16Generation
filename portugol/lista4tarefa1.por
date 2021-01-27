programa
{
	
	funcao inicio()
	{
		real pontos[5], maiorValor = 0
		
		para(inteiro i=0; i<5; i++)
		{
			escreva("Digite o ",(i+1), "° valor: ")
			leia(pontos[i])
			se(maiorValor < pontos[i])
			{
				maiorValor = pontos[i]
			}
		}
		escreva("O vetor formado foi { ",pontos[0]," , ", pontos[1]," , ",pontos[2]," , ",pontos[3]," , ", pontos[4], "  }") 
		escreva("\nO maior valor é: ", maiorValor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 403; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */