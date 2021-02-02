package lista1POO;

public class Cliente {
	
	public String nome;
	public String interesse;
	public String endereco;
	public long telefone;
	public char sexo;
	public int anoNascimento;
	public double renda;
	
	public int idadeAproximada()
	{
		return (2021 - anoNascimento);
	}
	public String opcaoSexo()
	{
		String tratamento;
		
		if(this.sexo == 'M')
		{
			tratamento = "Masculino";
		}
		else if(this.sexo == 'F')
		{
			tratamento = "Feminino";
		}
		else
		{
			tratamento = "Outro";
		}
		return tratamento;
	}
}
