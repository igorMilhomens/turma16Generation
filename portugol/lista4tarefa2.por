programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{	
		const inteiro TAM = 10
			
		inteiro resultados[TAM], maiorValor = 0, contador = 0
		real media, soma = 0.0

		
		para(inteiro i = 0; i<TAM; i++)
		{
			/*escreva("Digite o resultado do lançamento ",(i+1),": ")
			leia(resultados[i])*/
			resultados[i] = Util.sorteia(1, 6)
			
			soma += resultados[i]
			
			se(maiorValor < resultados[i]) //poderia ter contato o maiorValor uzando >=
			{
				maiorValor = resultados[i] // acrescentando um se e reiniciando o contador=1 no senao
			}
		}
		media = (soma/TAM)

		escreva("Os numeros sorteados foram { ")
		para(inteiro i = 0; i<TAM; i++)
		{
			escreva( resultados[i], " ")
			
			se(maiorValor == resultados[i])
			{
				contador++
			}
		}
		escreva("}\n")
		escreva("A média aritmética é: ",media, "\nO maior valor é: ",maiorValor,
												" e ele apareceu ", contador, "x")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 748; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */