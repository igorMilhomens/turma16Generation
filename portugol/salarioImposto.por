programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		cadeia nome, pronome = "", imposto = ""
		real salario, impostoDescontado = 0, salarioFinal, valorDescontado
		caracter c
		
		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Digite seu salário R$: ")
		leia(salario)
		escreva("Digite o genero que se identifica [M/F/X]: ")
		leia(c)

		se( c == 'm' ou c == 'M')
		{
			pronome = "Sr."
		}
		senao se ( c == 'f' ou c =='F')
		{
			pronome = "Sra."
		}
		senao 
		{
			pronome = "Sre."
		}

		se ( salario <= 1100.0)
		{
			imposto = "ISENTO"
		}
		senao se( salario > 1100.0 e salario <= 3500.0)
		{
			imposto = "9%"
			impostoDescontado = 0.09
		}
		senao se( salario > 3500.0 e salario <= 10000.0)
		{
			imposto = "15%"
			impostoDescontado = 0.15
		}
		senao
		{
			imposto = "27%"
			impostoDescontado = 0.27
		}


		valorDescontado = mat.arredondar((salario * impostoDescontado),2)
		salarioFinal = mat.arredondar((salario - valorDescontado),2)

		escreva ("Bom dia ", pronome ," ", nome, "!\nValor do imposto é igual a: ", imposto,
				", valor do desconto: R$ ", valorDescontado, "\nSalario final é de R$ " , salarioFinal,"\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 853; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */