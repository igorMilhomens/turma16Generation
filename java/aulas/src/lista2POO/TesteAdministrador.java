package lista2POO;

import java.util.Locale;

public class TesteAdministrador {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Administrador a1 = new Administrador("Marcia",7000.90,6500.50);
		
		a1.setEndereco("Rua das Flores, 52");
		a1.setTelefone("(41)98877-9865");
		
		a1.quebraLinha();
		System.out.println("Nome: "+ a1.getNome());
		System.out.println("Endereço: "+ a1.getEndereco());
		System.out.println("Telefone: "+ a1.getTelefone());
		System.out.printf("Valor da Ajuda de Custos: R$%.2f%n", a1.getAjudaDeCusto());
		System.out.printf("Valor Prestação de Contas: R$%.2f%n", a1.getPrestarContas());
		a1.statusContas();
		a1.setAjudaDeCusto(5000.75);
		a1.setPrestarContas(5789.90);
		a1.statusContas();
		a1.quebraLinha();
	}

}
