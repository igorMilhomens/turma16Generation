programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real imc, altura, massa
		
		escreva("Digite seu peso: ")
		leia(massa)
		
		escreva("Digite sua altura: ")
		leia(altura)
		
		imc = massa/(altura*altura)
		
		escreva("Seu IMC é igual a: ", imc,"\n")

		se ( imc <18.5)
		{
			escreva("Você esta abaixo do peso")
		}
		senao se (imc>= 18.5 e imc < 25)
		{
			escreva("Você esta no seu peso ideal")
		}
		senao se (imc >=25 e imc < 30)
		{
			escreva("Você está com  sobrepeso")
		}
		senao se (imc >=30 e imc < 35)
		{
			escreva("Você está com Obesidade grau 1") 
		}
		senao se (imc >=35 e imc<40)
		{
			escreva("Você está com Obesidade grau 2") 
		}
		senao{
			escreva("Você está com Obesidade grau 3")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 270; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */