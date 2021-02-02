package entidades;

public class Pessoa 
{
	//ATRIBUTOS
	
	public String nome;
	public char sexo;
	public int anoNascimento;
	public boolean estaVivo;
	
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	public Pessoa(String nome,boolean estaVivo) {
		this.nome = nome;
		this.estaVivo = estaVivo;
	}

	public int idadeAproximada()
	{
		return (2021 - anoNascimento);
	}
	
	public String statusIdade()
	{
		String status;
		
		if(this.idadeAproximada() < 18)
		{
			status= "MENOR de 18 anos";
		}
		else
		{
			status = "MAIOR de 18 anos";
		}
		return status;
	}
	public String tratamento()
	{
		String tratamento = "Você é "; //trata erro caso não venha M ou F *## Colocar um controle de entrada, para repetir caso o usuario tente entrar com dado invalido
		
		if(this.idadeAproximada() < 18)
		{
			tratamento = "Você é ";	
		}
		else if(this.sexo == 'M')
		{
			tratamento = "O Sr. é ";
		}
		else if(this.sexo == 'F')
		{
			tratamento = "A Sra. é ";
		}
		return tratamento;
	}
}
