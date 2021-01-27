programa
{
	
	funcao inicio()
	{
		//exercicio1
		inteiro peso, excesso = 0
		real multa = 0.0
		
		escreva("Entre com o peso em [Kg]: ")
		leia(peso)

		se (peso>50)
		{
			excesso = (peso - 50)
			multa = (excesso * 4.00)
		}
		escreva("excesso igual a ",excesso,"Kg. Valor da Multa igual a R$",multa)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 262; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */