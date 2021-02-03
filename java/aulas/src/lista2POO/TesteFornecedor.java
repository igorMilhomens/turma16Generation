package lista2POO;

import java.util.Locale;

public class TesteFornecedor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Fornecedor f1 = new Fornecedor("Parafusos3000",1800.90,750.98);
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa("Zé");
		Pessoa p3 = new Pessoa("Manel","Rua logo ali,8000 - MG");
		
		p1.setNome("Paulão");
		p1.setTelefone("(81)97070-7070");
		p1.setEndereco("Av. Ingrid, 1800 - PE");
		
		
		f1.setEndereco("Rua das porca frouxa, 750 - RJ");
		f1.setTelefone("(21)97171-0171");
		
		p1.quebraLinha();
		System.out.println("Nome: "+ p1.getNome());
		System.out.println("Endereço: "+ p1.getEndereco());
		System.out.println("Telefone: "+ p1.getTelefone());
		p1.quebraLinha();
		
		p2.quebraLinha();
		System.out.println("Nome: "+ p2.getNome());
		System.out.println("Endereço: "+ p2.getEndereco());
		System.out.println("Telefone: "+ p2.getTelefone());
		p2.quebraLinha();
		
		p3.quebraLinha();
		System.out.println("Nome: "+ p3.getNome());
		System.out.println("Endereço: "+ p3.getEndereco());
		System.out.println("Telefone: "+ p3.getTelefone());
		p3.quebraLinha();
		
		f1.quebraLinha();
		System.out.println("Fornecedor: "+ f1.getNome());
		System.out.println("Endereço: "+ f1.getEndereco());
		System.out.println("Telefone: "+ f1.getTelefone());
		System.out.printf("Valor Crédito: R$%.2f%n", f1.getValorCredito());
		System.out.printf("Valor Débito: R$%.2f%n", f1.getValorDivida());
		f1.obterSaldo();
		f1.setValorCredito(7500.89);
		f1.setValorDivida(9000.80);
		System.out.printf("Valor Crédito: R$%.2f%n", f1.getValorCredito());
		System.out.printf("Valor Débito: R$%.2f%n", f1.getValorDivida());
		f1.obterSaldo();
		f1.quebraLinha();

	}
}
