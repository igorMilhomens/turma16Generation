programa
{
	
	funcao inicio()
	{
		real indice
		
		escreva("Digite o índice de poluição: ")
		leia(indice)
		
		//exercicio5
		// o exercicio deixa vago o q ocorre de 0,25 até a,3
		
		se(indice >= 0.05 e indice< = 0.25)
		{
			escreva("Indice aceitável, as industrias podem manter suas atividades.")
		}
		senao se (indice >= 0.3 e indice <0.4)
		{
			escreva("As industrias do 1°grupo devem suspender suas atividades.")
		}
		senao se (indice >= 0.4 e indice <0.5)
		{
			escreva("As industrias do 1° e 2° grupos devem suspender suas atividades.")
		}
		senao se (indice >= 0.5)
		{
			escreva("As industrias de todos os grupos devem suspender suas atividades.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 116; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */