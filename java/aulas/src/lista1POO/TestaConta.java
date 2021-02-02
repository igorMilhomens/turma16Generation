package lista1POO;

import java.util.Locale;

public class TestaConta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		
		ContaBancaria conta1 = new ContaBancaria("CC","987676546-98");
		ContaBancaria conta2 = new ContaBancaria("CP","976676888-75",8900.89);
		ContaBancaria conta3 = new ContaBancaria("CS","834676887-44",5649.95);
	
		System.out.println("============================================");
		
		System.out.println("Tipo de conta: " + conta1.tipo);
		System.out.println("CPF: " + conta1.cpf);
		System.out.println("Status da conta: " + conta1.status());
		System.out.printf("Saldo: R$%.2f\n",conta1.saldo);
		
		System.out.println("============================================");

		System.out.println("Tipo de conta: " + conta2.tipo);
		System.out.println("CPF: " + conta2.cpf);
		System.out.println("Status da conta: " + conta2.status());
		System.out.printf("Saldo: R$%.2f\n",conta2.saldo);
		
		System.out.println("============================================");

		System.out.println("Tipo de conta: " + conta3.tipo);
		System.out.println("CPF: " + conta3.cpf);
		System.out.println("Status da conta: " + conta3.status());
		System.out.printf("Saldo: R$%.2f\n",conta3.saldo);
		
		System.out.println("============================================");
		
	}

}
