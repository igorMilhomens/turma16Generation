package lista1POO;

import java.util.Locale;
import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner scan = new Scanner(System.in);
		Cliente cliente1 = new Cliente();
		
	//	System.out.println("Bem vindo ao cadastro de clientes.\nResponda as perguntas para que possamos oferecer os melhores serviços dentro do seu perfil");
		
		//System.out.print("Digite seu nome: ");
		cliente1.nome = "Jõao Paulo";//scan.nextLine();
		
		//System.out.print("Digite o sexo ([F]-Feminino/[M]-Masculino): ");
		cliente1.sexo = 'M';//scan.next().toUpperCase().charAt(0);
		
		//System.out.print("Digite o ano de nascimento ([aaaa]): ");
		cliente1.anoNascimento = 1989;//scan.nextInt();
		
		//System.out.print("Digite seu telefone (apenas numeros ex: 987990979): ");
		cliente1.telefone = 988779905 ;//scan.nextLong();
		
		//scan.nextLine();
		//System.out.print("Digite seu endereço: ");
		cliente1.endereco = "Rua Generation, 179";//scan.nextLine();
		
		//System.out.print("Digite sua renda mensal R$");
		cliente1.renda = 5789.90;//scan.nextDouble();
		
		//scan.nextLine();
		//System.out.print("Digite seus interesses: ");
		cliente1.interesse = "Esportes, carros e viagens.";//scan.nextLine();
		
		System.out.println("===========================================================================================");
		
		System.out.printf("Cliente: %s%n",cliente1.nome);
		System.out.printf("Idade Aproximada: %d anos%n",cliente1.idadeAproximada());
		System.out.printf("Sexo: %s%n",cliente1.opcaoSexo());
		System.out.printf("Telefone: %d%n",cliente1.telefone);
		System.out.printf("Endereço: %s%n",cliente1.endereco);
		System.out.printf("Renda mensal: %.2f%n",cliente1.renda);
		System.out.printf("Interesses: %s%n",cliente1.interesse);
		
		System.out.println("===========================================================================================");
	}
}
