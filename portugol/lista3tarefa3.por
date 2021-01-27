programa
{
	
	funcao inicio()
	{
		logico repete = verdadeiro
		inteiro contador = 0, num = 0, soma = 0
		real media=0
		
		enquanto(repete)
		{	
			
			
			escreva("Digite um valor :")
			leia(num)

			se(num>=0)
			{
				soma += num
				contador++
			}
			senao
			{
				repete = falso
			}
		}
		
		media = ((soma * 1.0) / (contador*1.0))
		
		escreva("A soma total é: ",soma,"\nA média é: ",media, "\nForam inseridos ",contador, " numeros")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 457; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */