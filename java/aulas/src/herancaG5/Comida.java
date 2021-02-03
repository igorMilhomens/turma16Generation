package herancaG5;

public class Comida {
	
	public String nome;
	public String sabor;
	public boolean temperaturaQuente;
	
	
	
	public Comida(String nome, String sabor) {
		super();
		this.nome = nome;
		this.sabor = sabor;
	}

	public void quente()
	{
		this.temperaturaQuente = true;
		System.out.println("Esquentando Comida");
	}
	
	public void frio()
	{
		this.temperaturaQuente = false;
		System.out.println("A comida esfriou.");
	}
	
}
