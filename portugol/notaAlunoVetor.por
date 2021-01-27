programa
{
	
	funcao inicio()
	{
		real nota[4], maiorNota=0
		cadeia nome[4]
		
		para(inteiro i=0; i<4; i++)
		{
			
			escreva("Digite o nome do aluno:")
			leia(nome[i])
			escreva("Digite a nota do aluno:")
			leia(nota[i])
			
			se(maiorNota<nota[i])
			{
				maiorNota = nota[i]	
			}
		}
		para(inteiro i=0; i<4; i++)
		{
			escreva(nome[i]," nota ", nota[i],"\n")
		}

		escreva("A Maior nota é: ", maiorNota)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 434; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */