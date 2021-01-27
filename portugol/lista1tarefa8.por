programa
{
	
	funcao inicio()
	{
		//exercicio8
		real custo, distribuidor, imposto, result
		
		escreva ("Digite o valor do custo de fábrica R$")
		leia(custo)
		
		distribuidor = (custo*0.28)
		imposto = (custo*0.45)
		result = custo + distribuidor + imposto

		escreva("Custo ao consumidor é de R$", result)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 52; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */