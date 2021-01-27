programa
{
	
	funcao inicio()
	{
		//exercicio3
		inteiro valor, seg=0, min=0, hora=0
		
		
		escreva("Digite o tempo de duração do evento em segundos: ")
		leia(valor)

		//calculando seg, min, hora
		se (valor >= 3600)
		{
			hora = valor/3600
			valor = valor%3600
		}
		se(valor>=60)
		{
			min = valor/60
			valor = valor%60
		}
		se(valor>0) 
		{
			seg = valor
		}
		
		
		//resultado

		escreva("O evento durou: ","\nhora(s): " ,hora,"\nminuto(s): ",min, "\nsegundo(s): ", seg)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 490; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */