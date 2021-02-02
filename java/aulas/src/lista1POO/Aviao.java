package lista1POO;

public class Aviao {
	
	public String modelo;
	public String identificacao;
	public String fabricante;
	public int assentos;
	public boolean estacionado;
	
	public String status(){
		String result;
		if(estacionado){
			result = "Estacionado";
		}
		else {
			result = "Em Vôo";
		}
		return result;
	}
}
	