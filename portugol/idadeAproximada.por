programa
{
	inclua biblioteca Calendario
	
	funcao inicio()
	{
		cadeia nome, sexo = "", considera = "", tipo = ""
		caracter c
		inteiro ano,anoAtual, idade
		
		//const ANOATUAL = 2021  
		//usar const pra definir o anoAtual como constante
		//ANOATUAL // por boas praticas Constante é declarada com letras maiusculas


		anoAtual = Calendario.ano_atual()

		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Digite o seu sexo 'ex.[M/F]': ")
		leia(c)
		escreva("Digite o seu ano de nascimento'ex. [1999]': ")
		leia(ano)
		
		idade = anoAtual - ano

		se (c=='M' ou c =='m')
		{
			considera = "Considerado"
			sexo = "Sr."
		}
		senao se( c =='F' ou c == 'f')
		{
			considera = "Considerada"
			sexo = "Sra."
		}
		senao
		{
			considera = "considerade"
			sexo = ""
		}
		se(idade >= 60)
		{
			se(c == 'f' ou c == 'F')
			{
				tipo = "idosa"
			}
			senao se(c=='M' ou c =='m') {
				tipo = "idoso"
			}
			senao 
			{
				tipo = "melhor idade"
			}
			
		}
		senao se( idade >= 18)
		{
			se(c == 'f' ou c == 'F')
			{
				tipo = "adulta"
			}
			senao se(c=='M' ou c =='m') 
			{
				tipo = "adulto"
			}
			senao
			{
				tipo = "maior idade"
			}
		}
		senao 
		{
			tipo = "jovem"
		}

		escreva("Bom dia, ", sexo, " ", nome, ". Sua idade aproximada é de ", idade, " anos. Você é ", considera, " ", tipo, ".")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 160; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */