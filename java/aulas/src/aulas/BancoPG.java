package aulas;

import java.util.Scanner;

public class BancoPG
{

	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String continua;
		int tipoConta;
		double valor;
		String descricao;
		double saldo = 0.0;
		String movimento = "";
		
		
		linhaDivisao();
		System.out.println("Bem Vindo ao Banco POT of GOLD\nAqui o seu dinheiro rende MAIS!!!");
		linhaDivisao();
		System.out.println("Opções do Menu: ");
		System.out.println("1 - CONTA POUPANÇA"); //IGOR
		System.out.println("2 - CONTA CORRENTE"); // KAREN
		System.out.println("3 - CONTA ESPECIAL"); // JEAN
		System.out.println("4 - CONTA EMPRESA"); // CASAO
		System.out.println("5 - CONTA ESTUDANTIL"); // MARIA
		System.out.println("6 - SAIR");
		System.out.print("\nSelecione uma das opções: ");
		
		do 
		{
			tipoConta = scan.nextInt();
			if(tipoConta== 6) 
			{
				contaPoupanca();
			}
			
		}
		while(tipoConta!= 6);
	}
	public static void linhaDivisao()
	{
		for(int i=0; i<40;i++)
		{
			System.out.print("=");
		}
		System.out.println();
	}
	public static void contaPoupanca()
	{
		
	}
}	
		/*
		if(tipoConta == 1) 
		{
			boolean repete = true, repete1 = true;
			while(repete)
			{
				repete1=true;
				
				System.out.println("Selecione o movimento (D/C): ");
				movimento = ler.next();
				
				while(repete1)
				{
					if(movimento.compareTo("D") == 0 || movimento.compareTo("d") == 0 || movimento.compareTo("C") == 0 || movimento.compareTo("c") == 0)
					{
						repete1 = false;
					}
					else
					{
						System.out.println("Comando inválido!\nSelecione o movimento (D/C): ");
						movimento= ler.next();
					}
				}
				
				
				System.out.println("Informe o valor: ");
				valor = ler.nextDouble();
				
				System.out.println("Informe a descrição: ");
				descricao = ler.next();
				
				if(movimento.compareTo("C") == 0   || movimento.compareTo("c") == 0  )
				{
					saldo += valor;
				}
				else if(movimento.compareTo("D") == 0  || movimento.compareTo("d") == 0)
				{
					if(saldo<valor)
					{
						System.out.println("Transação não aprovada, saldo insuficiente.\nSeu saldo é de:"+saldo+
																							"\nDigite novo valor para saque: R$");
						valor = ler.nextDouble();
					}
					else
					{
						saldo -=valor;
					}
				}
				
				repete1 = true;
				System.out.println("Continua a fazer movimentação ? (S/N): ");
				continua = ler.next();
				
				while(repete1)
				{
					if(continua.compareTo("n") == 0 || continua.compareTo("N") == 0)
					{
						repete = false;
						repete1 = false;
					}
					else if(continua.compareTo("s") == 0 || continua.compareTo("S")== 0)
					{
						repete1 = false;
					}
					else
					{
						System.out.println("Comando inválido!\nDeseja continuar[S/N]: ");
						continua = ler.next();
					}
				}
			}
			
			repete1 = true;
			
			System.out.println("Saldo atual: " + saldo);
			System.out.println("Deseja ver a correção monetária? [S/N]");
			continua = ler.next();
			
			while(repete1)
			{
				if(continua.compareTo("n") == 0 || continua.compareTo("N") == 0 || continua.compareTo("s") == 0 || continua.compareTo("S")== 0)
				{
					repete1 = false;
				}
				else
				{
					System.out.println("Comando inválido!\nDeseja ver a correção monetária? [S/N]: ");
					continua = ler.next();
				}
		
			}
			System.out.printf("Valor com correção monetária é de R$%.2f%n", (saldo+saldo*0.0005));
			
			System.out.println("\n\n\n#############pradronizar o Continua? (S/N): ");//não coloquei While pq depende de qual valor vc usar pra repetir td
			continua = ler.next();

		}
		ler.close();
		*/

