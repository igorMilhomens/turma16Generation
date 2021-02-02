package lista1POO;

public class Produto {
	
	public String codigo;
	public String descricao;
	public double valorUnitario;
	
	public Produto(String descricao) {
		
		this.descricao = descricao;
	}

	public Produto( String descricao,String codigo) {

		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Produto(String descricao, String codigo, double valorUnitario) {
		
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
	}

}
