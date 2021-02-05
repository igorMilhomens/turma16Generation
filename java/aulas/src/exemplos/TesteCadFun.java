package exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TesteCadFun {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);		
		List <Empregado> lista = new ArrayList<>(); 
		//List <Interger> lista = new ArrayList<>(); ou List <String> lista = new ArrayList<>(); cria uma lista do tipo primitivo indicado.
		//List é uma interface, precisa do ArrayList pq não da pra implementar uma interrface
		
		String nome;
		int tipo,matricula, horas;
		double valorHora, acrescimo;
		boolean aux;
		
		System.out.println("                        Inicio de Cadastro.");
		System.out.println("--------------------------------------------------------------------------");
		do {
			
			System.out.print("Informe se é (1-Empregado / 2- Terceiro): ");
			
			do {
				tipo = scan.nextInt();
				if(tipo == 1 || tipo == 2) {
					aux  = false;
				}
				else {
					System.out.print("Informação Inválida, selecione [1] para Empregado e [2] para Terceiro: ");
					aux = true;
				}
			}
			while(aux);
			
			if(tipo == 1) {
				System.out.print("Digite seu nome: ");
				scan.nextLine();
				nome = scan.nextLine();
				
				System.out.print("Digite a Matricula ex.[11111]: ");
				matricula = scan.nextInt();
				
				System.out.print("Digite a quantidade de horas Trabalhadas: ");
				horas = scan.nextInt();
				
				System.out.print("Digiteo valor da hora Trabalhada: ");
				valorHora = scan.nextDouble();
				
				lista.add(new Empregado(nome,matricula,horas,valorHora));
			}
			else {
				System.out.print("Digite seu nome: ");
				scan.nextLine();
				nome = scan.nextLine();
				
				System.out.print("Digite a Matricula ex.[11111]: ");
				matricula = scan.nextInt();
				
				System.out.print("Digite a quantidade de horas Trabalhadas: ");
				horas = scan.nextInt();
				
				System.out.print("Digiteo valor da hora Trabalhada: ");
				valorHora = scan.nextDouble();
				
				System.out.print("Digiteo valor do acrescimo entre 0 e 1, ex.[0.33]: ");
				acrescimo = scan.nextDouble();
	
				lista.add(new Terceiro(nome,matricula,horas,valorHora,acrescimo));
			}
			System.out.print("Continuar cadastro?: (1-Sim / 2- Não): ");
			
			do {
				tipo = scan.nextInt();
				if(tipo == 1 || tipo == 2) {
					aux  = false;
				}
				else {
					System.out.print("Informação Inválida, selecione [1]- Continuar Cadastro e [2]- Parar Cadastro: ");
					aux = true;
				}
				
			}
			while(aux);
			if(tipo ==1) {
				aux  = true;
			}
			else {
				aux = false;
			}
			
			System.out.println("--------------------------------------------------------------------------");
		}
		while(aux);
		
		System.out.println();
		System.out.println("PAGAMENTOS:");
		for (Empregado emp : lista) 
		{
			System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.salario()));
		}
	}
}


/*
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
 */