programa
{
	
	funcao inicio()
	{
		//exercicio2
		
		inteiro valor, dia=0, mes=0, ano=0
		cadeia a,b,c
		
		escreva("Digite sua idade em dias: ")
		leia(valor)

		//calculando anos, meses e dias
		se (valor >= 365)
		{
			ano = valor/365
			valor = valor%365
		}
		se(valor>=30)
		{
			mes = valor/30
			valor = valor%30
		}
		se(valor>0) 
		{
			dia = valor
		}
		// selecionando plural ou singular
		se(ano == 1)
		{
			a = "ano"
		}
		senao
		{
			a ="anos"
		}
		se(mes == 1)
		{
			b = "mês"
		}
		senao
		{
			b="meses"
		}
		se(dia == 1)
		{
			c = "dia"
		}
		senao
		{
			c = "dias"
		}
		
		//resultado

		escreva("Sua idade é de ", ano," ", a, ", " ,mes, " ", b, " e ", dia, " ", c)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 324; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */