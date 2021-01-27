programa
{
	
	funcao inicio()
	{
		inteiro num 
		logico repita = verdadeiro
		
		escreva("Digite um Numero Entre [1 , 100]: ")
		leia(num)
		
		enquanto(repita)
		{
			se(num>0 e num<=100)
			{
				num *= 3

				escreva (num," ")
			}
			senao se (num > 100 )
			{
				repita = falso
			}
			senao
			{
				repita = falso
				escreva("Desculpe, não foi possivel calcular. Numero indicado está fora do intervalo determinado.\n")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 432; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */