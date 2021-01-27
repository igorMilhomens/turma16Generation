programa
{
	
	funcao inicio()
	{
		const inteiro TAM = 3
		
		inteiro matriz[TAM][TAM], somaTotal = 0, somaDiagonal = 0

		para(inteiro i=0; i<TAM; i++)
		{
			para(inteiro j=0; j<TAM; j++)
			{
				escreva("Entre com o valor da posição [",i,"][",j,"]: ")
				leia(matriz[i][j])

				somaTotal += matriz[i][j]
				
				se(i == j)
				{
					somaDiagonal += matriz[i][j]
				}
				
			}
		}
		escreva("A soma total dos valores da matriz é: ",somaTotal,".\nA soma da diagonal principal é: ",somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 451; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */