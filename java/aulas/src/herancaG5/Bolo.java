package herancaG5;

public class Bolo extends Comida{
	
	public String cobertura;
	public String recheio;
	public int camadas;
	public int numeroFatias;
	
	public Bolo(String nome, String sabor, int numeroFatias) {
		
		super(nome, sabor);
		this.numeroFatias = numeroFatias;
		
	}
	
	public void retiraPedaco(){
		
		if(numeroFatias > 0) {
			System.out.println("Uma fatia retirada");
			numeroFatias --;
		}
		else
		{
			System.out.println("Acabou o BOLO :(");
		}
		
	}

}
