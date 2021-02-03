package lista2POO;

/*
 	1- 	Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
		(getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas
		opções de construtores conforme sua percepção. Atributos: String nome; String endereço;
		String telefone;
 */
public class Pessoa {
	//ATRIBUTOS
	private String nome; 
	private String endereco;
	private String telefone;
	
	//CONSTRUTORES
	public Pessoa() {
		super();
	}

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public Pessoa(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}
	
	//METODOS GETs E SETs

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void quebraLinha() {
		System.out.println("-------------------------------------------");
	}
	
}
