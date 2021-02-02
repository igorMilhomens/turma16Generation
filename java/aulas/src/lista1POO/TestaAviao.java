package lista1POO;

//import java.util.Scanner;

public class TestaAviao {

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		
		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();
		
		aviao1.modelo = "Boing";
		aviao1.fabricante = "CopaAirlines";
		aviao1.identificacao = "737-800A";
		aviao1.assentos = 160;
		aviao1.estacionado = false;
		
		aviao2.modelo = "Boing";
		aviao2.fabricante = "CopaAirlines";
		aviao2.identificacao = "737-800B";
		aviao2.assentos = 154;
		aviao2.estacionado = true;
		
		System.out.println("============================================");
		
		System.out.printf("Aeronave %s %s\n",aviao1.modelo, aviao1.identificacao);
		System.out.printf("Fabricante: %s\n", aviao1.fabricante);
		System.out.printf("Quantidade de assentos: %d\n", aviao1.assentos);
		System.out.printf("Status: %s\n",aviao1.status());
		
		System.out.println("============================================");
		
		System.out.printf("Aeronave %s %s\n",aviao2.modelo, aviao2.identificacao);
		System.out.printf("Fabricante: %s\n", aviao2.fabricante);
		System.out.printf("Quantidade de assentos: %d\n", aviao2.assentos);
		System.out.printf("Status: %s\n", aviao2.status());
		
		System.out.println("============================================");

	}

}
