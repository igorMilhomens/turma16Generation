package exemplos;

import java.util.Locale;

public class TesteCadFun {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Empregado empregado1 = new Empregado("joão",1234);
		Empregado empregado2 = new Empregado("josé",1904, 160,205.99);
		
		Terceiro terceiro1 = new Terceiro("Renata",4567,160,205.99,0.1);
		Terceiro terceiro2 = new Terceiro("joana",1116,100,100,0.1);
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.printf("O valor do salario do funcionario %s é de: R$%.2f%n",empregado1.getNome(),empregado1.salario());
		
		empregado1.setHoras(100);
		empregado1.setValorHora(190.99);
		
		System.out.printf("O valor do salario do funcionario %s é de: R$%.2f%n",empregado1.getNome(),empregado1.salario());
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.printf("O valor do salario do funcionario %s é de: R$%.2f%n",empregado2.getNome(),empregado2.salario());
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.printf("O valor do salario do funcionario %s é de: R$%.2f%n",terceiro1.getNome(),terceiro1.salario());
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.printf("O valor do salario do funcionario %s é de: R$%.2f%n",terceiro2.getNome(),terceiro2.salario());
		terceiro2.setAcrescimo(0.5);
		System.out.printf("O valor do salario do funcionario %s é de: R$%.2f%n",terceiro2.getNome(),terceiro2.salario());
		System.out.printf("O valor do salario do funcionario %s é de: R$%.2f%n",terceiro1.getNome(),terceiro1.salario());
		System.out.println("----------------------------------------------------------------");
	}

}
