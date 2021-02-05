package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exemplos.Empregado;

public class LojaColecionaveis {
	
	public static boolean continua(){
		Scanner scan1 = new Scanner(System.in);
		int continua;
		boolean aux1;
		
		do {
			
			continua = scan1.nextInt();
			if(continua == 1 || continua == 2){
				aux1 = false;
			}
			else {
				aux1 = true;
				System.out.print("Operação Inválida, digite [1]-Continuar / [2]-Sair.: ");
			}
		}
		while(aux1);
			
		if(continua == 1) {
			aux1 = true;
		}
		else {
			aux1 = false;
		}	
		
		return aux1;
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		List<Colecao> catalogo = new ArrayList<>();
		
		boolean aux;
		String nome;
		int cod, ano, compra;
		double valorEstimado, proposta;
		
		//INSERINDO ITENS
		
		System.out.println("                     Inserir Itens do Catalogo:");
		System.out.println("------------------------------------------------------------------------------");
		do {
			nome = "";
			ano = 0;
			valorEstimado = 0;
			cod =0;
			
			System.out.print("Digite o nome do produto: ");
			nome = scan.nextLine();
			System.out.print("Digite o ano de fabricação do produto: ");
			ano = scan.nextInt();
			System.out.print("Digite o valor estimado do produto: ");
			valorEstimado = scan.nextDouble();
			
			catalogo.add(new Colecao(nome,ano,valorEstimado));
			
			System.out.println("------------------------------------------------------------------------------");
			System.out.print("Deseja continuar?([1]-SIM / [2]-NÃO): ");
			aux = continua();
			//CRIADO FUNÇÃO CONTINUA
			/*do {				
				continua = scan.nextInt();
				if(continua == 1 || continua == 2){
					aux = false;
				}
				else {
					aux = true;
					System.out.print("Operação Inválida, digite [1] Para Cadastrar Novo produto / [2] Para Sair.: ");
				}
			}
			while(aux);
				
			if(continua == 1) {
				aux = true;
			}
			else {
				aux = false;
			}*/	
			
			System.out.println("------------------------------------------------------------------------------");
			scan.nextLine();
		}
		while(aux);
		
		// MOSTRAR LISTA
		System.out.println( "Cód:\tPreço:\t\tAno:\tItem:"); 
		cod = 0;
		for (Colecao item: catalogo)
		{
			cod ++;
			System.out.printf("%d\t",cod);
			System.out.printf(item.getValorVenda()== 0? "Negociar\t":"%.2f\t\t",item.getValorVenda());
			System.out.printf("%d\t",item.getAno());
			System.out.printf("%s%n",item.getNome());
		}
		
		System.out.println("------------------------------------------------------------------------------");
		
		//COMPRAR
		System.out.println("realizar compra? ([1]-SIM / [2]-NÃO): ");
		aux = continua();
		
		while(aux){
			System.out.println("Digite o Cod do produto que deseja comprar: ");
			compra = scan.nextInt();
			
			System.out.printf("Deseja comprar o produto: %s ? ([1]-SIM / [2]-NÃO): ",catalogo.get(compra-1).getNome());
			aux = continua();
			if(aux) {
				if(catalogo.get(compra-1).getValorVenda() != 0) {
					System.out.printf("valor do Item: %s é de R$%.2f%n",catalogo.get(compra-1).getNome(),catalogo.get(compra-1).getValorVenda());
					System.out.println("Venda Concluida com Sucesso!");
					
					catalogo.remove(compra-1);
				}
				else {
					System.out.print("Faça sua proposta: R$");
					proposta = scan.nextDouble();
					
					System.out.println("Vendedor aceita proposta? ([1]-SIM / [2]-NÃO): ");
					aux = continua();
					if(aux)
					{
						System.out.println("Compra Concluida com Sucesso!");
						catalogo.remove(compra-1);
					}
					else {
						System.out.println("Proposta Recusada!");
					}
				}
			}
			System.out.println("------------------------------------------------------------------------------");
			
			System.out.println("Novo Catalogo:");
			cod = 0;
			System.out.println( "Cód:\tPreço:\t\tAno:\tItem:"); 
			for (Colecao item: catalogo)
			{
				cod ++;
				System.out.printf("%d\t",cod);
				System.out.printf(item.getValorVenda()== 0? "Negociar\t":"%.2f\t\t",item.getValorVenda());
				System.out.printf("%d\t",item.getAno());
				System.out.printf("%s%n",item.getNome());
			}
			
			System.out.println("------------------------------------------------------------------------------");

			System.out.println("Continuar Comprando?([1]-SIM / [2]-NÃO): ");
			aux = continua();
		}
	}
}
