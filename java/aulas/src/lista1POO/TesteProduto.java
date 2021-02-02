package lista1POO;

import java.util.Locale;

public class TesteProduto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		
		Produto equipamento1 = new Produto("CPU");
		Produto equipamento2 = new Produto("MOUSE","SP00197-89");
		Produto equipamento3 = new Produto("WEBCAN","SP00198-90",89.00);
		
		System.out.println("============================================");
		
		System.out.println("Descrição: " + equipamento1.descricao);
		System.out.println("Cód: " + equipamento1.codigo);
		System.out.printf("valor: R$%.2f\n",equipamento1.valorUnitario);
		
		
		System.out.println("============================================");
		
		System.out.println("Descrição: " + equipamento2.descricao);
		System.out.println("Cód: " + equipamento2.codigo);
		System.out.printf("valor: R$%.2f\n",equipamento2.valorUnitario);
		
		System.out.println("============================================");
		
		System.out.println("Descrição: " + equipamento3.descricao);
		System.out.println("Cód: " + equipamento3.codigo);
		System.out.printf("valor: R$%.2f\n",equipamento3.valorUnitario);
		
		System.out.println("============================================");
	}
}
