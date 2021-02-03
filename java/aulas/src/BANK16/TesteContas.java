package BANK16;

import java.util.Locale;

public class TesteContas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String nome1 ="Maria", nome2 = "João", nome3 = "Marta" ;
		String cpf1 = "111.111.111-11",cpf2 = "222.222.222-22",cpf3 ="333.333.333-33";
		
		Conta c = new Conta(nome1,cpf1);
		Corrente cC = new Corrente(nome2,cpf2);
		Poupanca cP = new Poupanca(nome3,cpf3,18);
		
		System.out.println("----------------------------------------------------");
		c.creditar(1678.9);
		c.debitar(700.9);
		System.out.println("----------------------------------------------------");
		cC.creditar(9800.7);
		cC.debitar(8000.9);
		System.out.println("----------------------------------------------------");
		cP.creditar(9000);
		cP.debitar(800);
		System.out.println("----------------------------------------------------");
		cC.qtMesTalao(2);
		cC.qtMesTalao(3);
		cC.qtMesTalao(1);
		System.out.println("----------------------------------------------------");
		cP.aniversario(9);
		cP.aniversario(18);
		cP.aniversario(17);
		cP.aniversario(18);
		System.out.println("----------------------------------------------------");
	}
}
