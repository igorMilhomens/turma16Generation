programa
{
	
	funcao inicio()
	{
	//exercicio4
		inteiro num1,num2,num3, soma1,soma2
		real result
		
		escreva("Digite 3 numeros inteiros Positivos")
		
		escreva("\nDigite o 1°Numero: ")
		leia(num1)
		
		escreva("Digite o 2°Numero: ")
		leia(num2)
		
		escreva("Digite o 3°Numero: ")
		leia(num3)

		soma1 = ( num1 + num2 )
		soma2 = ( num2 + num3 )

		result = (soma1*soma1 + soma2*soma2)/2.0

		escreva(result)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 401; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */