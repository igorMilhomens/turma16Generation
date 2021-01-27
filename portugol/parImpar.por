programa
{
	
	funcao inicio()
	{
		inteiro num
		cadeia par
	
		escreva("Digite um numero Natural maior que 0, ex.[1, 2, 3,..., 5] : ")
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
			escreva("O numero ", num, " é um numero ", par )
		}
		senao se (num == 0)
		{
			escreva ("Zero é um numero neutro.")
		}
		senao se(num < 0)
		{
			escreva("Desculpe, o numedo indicado é negativo, não é possivel definir paridade.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 177; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */