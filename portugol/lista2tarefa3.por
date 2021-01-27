programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro n1, n2, n3, n4
		real q1, q2, q3, q4
		
		escreva("Digite 4 Numeros")
		escreva("\nDigite o 1° Numero: ")
		leia(n1)
		escreva("Digite o 2° Numero: ")
		leia(n2)
		escreva("Digite o 3° Numero: ")
		leia(n3)
		escreva("Digite o 4° Numero: ")
		leia(n4)

		q1 = mat.potencia(n1,2)
		q2 = mat.potencia(n2,2)
		q3 = mat.potencia(n3,2)
		q4 = mat.potencia(n4,2)

		se( q3>=1000)
		{
			escreva("\nO valor do quadrado do 3°  numero é ",q3)
		}
		senao
		{
			escreva("\n",n1,"² = ", q1,"\n",n2,"² = ", q2,"\n",n3,"² = ", q3,"\n",n4,"² = ", q4,"\n")
		}	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 632; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */