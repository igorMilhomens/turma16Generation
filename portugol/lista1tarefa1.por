programa
{
	
	funcao inicio()
	{
		//exercicio1
		
		inteiro ano, mes, dia, soma
		cadeia a,b,c
		
		escreva("Escreva sua idade, no formato ANO MES DIA")
		
		escreva("\nDigite os anos: ")
		leia(ano)
		
		escreva( "Digite os meses:")
		leia(mes)
		
		escreva("Digite os dias:")
		leia(dia)

		
		
		//Ano = 365 dias, meses = 30 dias
		
		soma = (ano*365 + mes*30 + dia) //calculando a quantidade de dias
		
		escreva("Sua idade em dias é de ", soma, " dias.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 291; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */