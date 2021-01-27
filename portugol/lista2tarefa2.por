programa
{
	
	funcao inicio()
	{
	cadeia cod
	inteiro hora, excesso = 0
	real salario1, salario2
	
		escreva("Digite o codigo do funcionário: ")
		leia(cod)
		escreva("Digite a quantidade de horas trabalhadas: ")
		leia(hora)
		
		se (hora > 50)
		{
			excesso = hora-50
			hora = 50
		}

		salario1 = (hora * 10.0 + excesso * 20.0)
		salario2 = (excesso * 20.0)

		escreva("O salario total do trabalhador ",cod," é de R$",salario1," e o salario excedente foi de R$",salario2)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 481; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */