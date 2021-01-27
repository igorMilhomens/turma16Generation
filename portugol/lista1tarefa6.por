programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		//exercicio6
		real x1, x2, y1, y2, s1, s2,s3, quad1, quad2, result

		escreva("Entre com as coordenasdas (x,y) do ponto P1")

		escreva("\nDigite a coordenada x1: ")
		leia(x1)

		escreva("Digite a coordenada y1: ")
		leia(y1)

		escreva("Digite a coordenada x2: ")
		leia(x2)

		escreva("Digite a coordenada y2: ")
		leia(y2)

		//calculando

		s1 = ( x2 - x1 )
		s2 = ( y2 - y1 )

		quad1 = Matematica.potencia(s1,2)
		quad2 = Matematica.potencia(s2,2)

		s3 = (quad1 + quad2)
		
		result = Matematica.raiz(s3,2)
		
		escreva("O resultado da formula é: ", result)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 624; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */