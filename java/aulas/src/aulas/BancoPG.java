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
		System.out.println("Op��es do Menu: ");
		System.out.println("1 - CONTA POUPAN�A"); //IGOR
		System.out.println("2 - CONTA CORRENTE"); // KAREN
		System.out.println("3 - CONTA ESPECIAL"); // JEAN
		System.out.println("4 - CONTA EMPRESA"); // CASAO
		System.out.println("5 - CONTA ESTUDANTIL"); // MARIA
		System.out.println("6 - SAIR");
		System.out.print("\nSelecione uma das op��es: ");
		
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
						System.out.println("Comando inv�lido!\nSelecione o movimento (D/C): ");
						movimento= ler.next();
					}
				}
				
				
				System.out.println("Informe o valor: ");
				valor = ler.nextDouble();
				
				System.out.println("Informe a descri��o: ");
				descricao = ler.next();
				
				if(movimento.compareTo("C") == 0   || movimento.compareTo("c") == 0  )
				{
					saldo += valor;
				}
				else if(movimento.compareTo("D") == 0  || movimento.compareTo("d") == 0)
				{
					if(saldo<valor)
					{
						System.out.println("Transa��o n�o aprovada, saldo insuficiente.\nSeu saldo � de:"+saldo+
																							"\nDigite novo valor para saque: R$");
						valor = ler.nextDouble();
					}
					else
					{
						saldo -=valor;
					}
				}
				
				repete1 = true;
				System.out.println("Continua a fazer movimenta��o ? (S/N): ");
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
						System.out.println("Comando inv�lido!\nDeseja continuar[S/N]: ");
						continua = ler.next();
					}
				}
			}
			
			repete1 = true;
			
			System.out.println("Saldo atual: " + saldo);
			System.out.println("Deseja ver a corre��o monet�ria? [S/N]");
			continua = ler.next();
			
			while(repete1)
			{
				if(continua.compareTo("n") == 0 || continua.compareTo("N") == 0 || continua.compareTo("s") == 0 || continua.compareTo("S")== 0)
				{
					repete1 = false;
				}
				else
				{
					System.out.println("Comando inv�lido!\nDeseja ver a corre��o monet�ria? [S/N]: ");
					continua = ler.next();
				}
		
			}
			System.out.printf("Valor com corre��o monet�ria � de R$%.2f%n", (saldo+saldo*0.0005));
			
			System.out.println("\n\n\n#############pradronizar o Continua? (S/N): ");//n�o coloquei While pq depende de qual valor vc usar pra repetir td
			continua = ler.next();

		}
		ler.close();
		*/

