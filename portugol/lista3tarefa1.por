programa
{
	
	funcao inicio()
	{
		real salario, somaSalario = 0, maiorSalario = 0, mediaSalario = 0, somaPercentual = 0, 
		percentual100 = 0, mediaFilho = 0
		
		inteiro filho, somaFilho = 0, tamanho = 20
		
		para(inteiro i = 0; i < tamanho; i++)
		{
			escreva("Qual o seu salário em Reais? R: R$")
			leia(salario)
			escreva("Quantos filhos você tem? R: ")
			leia(filho)

			somaSalario += salario
			somaFilho += filho
			
			se(salario <= 100.0)
			{
				somaPercentual ++
			}
			se(salario > maiorSalario)
			{
				maiorSalario = salario
			}


		}

		percentual100 = (somaPercentual / tamanho)*100
		mediaSalario = (somaSalario / tamanho)
		mediaFilho = ((somaFilho * 1.0) / (tamanho * 1.0))
		
		escreva("A média do salário da população é de R$", mediaSalario,
				"\nO maior salário da população é de R$",maiorSalario,
				"\nO percentual de salários de R$100,00 é de ",percentual100," %",
				"\nA média de filhos da população é de ",mediaFilho, " filhos.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */