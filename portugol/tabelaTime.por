programa
{
	
	funcao inicio()
	{	
	

		cadeia time [] = { "CORINTHIANS", "PALMEIRAS", "SANTOS", "SPFC" }
		inteiro pontos [] = {0 , 0 , 0, 0}
		caracter c

		para(inteiro i = 0; i < 4; i++)
		{
			para(inteiro j = 0; j < 4; j++)
			{
				//fazer novo programa recebendo resultados por rodada, ajustar escreva
				escreva("Partida ",(j+1)," ",time[i], " - GANHOU, PERDEU, EMPATOU? [G/P/E]: " )
				leia(c)
				
				se ( c != 'g' e c != 'G'  e c != 'e' e c != 'E' e c != 'P' e c != 'p')
				{
					escreva("Partida invalida, digite novo resultado da partida: ")
					leia(c)
				}

				se ( c == 'g' ou c == 'G')
				{
					pontos[i] += 3
				}
				senao se(c == 'e' ou c == 'E')
				{
					pontos[i] += 1
				}

			}
		}

		para(inteiro i=0; i < 4; i++)
		{
			escreva(time[i], " possui ", pontos[i], " pontos\n" )
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 313; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */