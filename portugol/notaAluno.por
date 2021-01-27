programa
{
	
	funcao inicio()
	{
		real nota1, nota2,nota3,nota4, maiorNota = 0
		cadeia nome1, nome2,nome3, nome4
		
		escreva("Digite o nome do 1° aluno: ")
		leia(nome1)
		escreva("Digite a nota do 1° aluno: ")
		leia(nota1)

		se(maiorNota < nota1)
		{
			maiorNota = nota1
		}
		
		escreva("Digite o nome do 2° aluno: ")
		leia(nome2)
		escreva("Digite a nota do 2° aluno: ")
		leia(nota2)
		se(maiorNota < nota2)
		{
			maiorNota = nota2
		}
		
		escreva("Digite o nome do 3° aluno: ")
		leia(nome3)
		escreva("Digite a nota do 3° aluno: ")
		leia(nota3)
		
		se(maiorNota < nota3)
		{
			maiorNota = nota3
		}
		escreva("Digite o nome do 4° aluno: ")
		leia(nome4)
		escreva("Digite a nota do 4° aluno: ")
		leia(nota4)
		se(maiorNota < nota4)
		{
			maiorNota = nota4
		}
		
		escreva(nome1," nota: ",nota1,"\n",nome2," nota: ",nota2,"\n",nome3," nota: ",nota3,
				"\n",nome4," nota: ",nota4,"\nA maior nota foi: ", maiorNota)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 718; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */