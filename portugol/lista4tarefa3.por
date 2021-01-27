programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro n1 [4][6] , n2[4][6], m1[4][6], m2[4][6]

		para(inteiro i=0; i<4; i++)
		{
			para(inteiro j=0; j<6; j++)
			{
				n1[i][j] = Util.sorteia(0, 9)
				n2[i][j] = Util.sorteia(0, 9)

				m1[i][j] = (n1[i][j] + n2[i][j])
				m2[i][j] = (n1[i][j] - n2[i][j])
			}
		}

		escreva("Matriz N1\n")
		
		para(inteiro i=0; i<4; i++)
		{
			para(inteiro j=0; j<6; j++)
			{
				escreva(n1[i][j]," ")
				se(j==5)
				{
					escreva("\n")
				}
			}
		}

		escreva("\nMatriz N2\n")
				
		para(inteiro i=0; i<4; i++)
		{
			para(inteiro j=0; j<6; j++)
			{
				escreva(n2[i][j]," ")
				se(j==5)
				{
					escreva("\n")
				}
			}
		}

		escreva("\nMatriz M1\n")
		
		para(inteiro i=0; i<4; i++)
		{
			para(inteiro j=0; j<6; j++)
			{
				escreva(m1[i][j]," ")
				se(j==5)
				{
					escreva("\n")
				}
			}
		}

		escreva("\nMatriz M2\n")
		
		para(inteiro i=0; i<4; i++)
		{
			para(inteiro j=0; j<6; j++)
			{
				escreva(m2[i][j]," ")
				se(j==5)
				{
					escreva("\n")
				}
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 245; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */