programa
{
	
	funcao inicio()
	{
		inteiro num
		cadeia par
	
		escreva("Digite um numero Inteiro : ")
		leia(num)

		se(num>0)
		{
			se(num%2 == 0)
			{
				par = "par"
			}
			senao
			{
				par = "ímpar"
			}
			escreva("O numero ", num, " é um numero ", par, ", positivo")
		}
		senao se (num == 0)
		{
			escreva ("Zero é um numero neutro.")
		}
		senao se(num < 0)
		{
			escreva("O numero ",num, " é negativo, logo não é possivel definir sua paridade.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 266; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */