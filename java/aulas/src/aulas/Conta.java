package aulas;

import java.util.Scanner;

public class Conta 
{

		public static void main(String[] args) 
		{
			Scanner ler = new Scanner(System.in);

			String continua;
			int tipoConta;
			double valor;
			String descricao;
			double saldo = 0.0;
			String movimento = "";

			System.out.println("Banco G2");
			System.out.println("10 minutos pra fazer");
			System.out.println("1 - CONTA POUPANÇA"); // IGOR
			System.out.println("2 - CONTA CORRENTE"); // KAREN
			System.out.println("3 - CONTA ESPECIAL"); // JEAN
			System.out.println("4 - CONTA EMPRESA"); // CASAO
			System.out.println("5 - CONTA ESTUDANTIL"); // MARIA
			System.out.println("6 - SAIR");
			System.out.print("\nSelecione o tipo da conta: ");
			tipoConta = ler.nextInt();

			if (tipoConta == 1) 
			{
				boolean repete = true, repete1 = true;
				while (repete) 
				{
					repete1 = true;
	
					System.out.println("Selecione o movimento (D/C): ");
					movimento = ler.next();
	
					while (repete1) 
					{
						if (movimento.compareTo("D") == 0 || movimento.compareTo("d") == 0 || movimento.compareTo("C") == 0
								|| movimento.compareTo("c") == 0) 
						{
							repete1 = false;
						} else 
						{
							System.out.println("Comando inválido!\nSelecione o movimento (D/C): ");
							movimento = ler.next();
						}
					}

					System.out.println("Informe o valor: ");
					valor = ler.nextDouble();
	
					System.out.println("Informe a descrição: ");
					descricao = ler.next();

					if (movimento.compareTo("C") == 0 || movimento.compareTo("c") == 0) 
					{
						saldo += valor;
					} else if (movimento.compareTo("D") == 0 || movimento.compareTo("d") == 0) 
					{
						if (saldo < valor) 
						{
							System.out.println("Transação não aprovada, saldo insuficiente.\nSeu saldo é de:" + saldo
									+ "\nDigite novo valor para saque: R$");
							valor = ler.nextDouble();
						} else 
						{
							saldo -= valor;
						}
					}

					repete1 = true;
					System.out.println("Continua a fazer movimentação ? (S/N): ");
					continua = ler.next();
	
					while (repete1) 
					{
						if (continua.compareTo("n") == 0 || continua.compareTo("N") == 0) 
						{
							repete = false;
							repete1 = false;
						} else if (continua.compareTo("s") == 0 || continua.compareTo("S") == 0) 
						{
							repete1 = false;
						} else 
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

				while (repete1) 
				{
					if (continua.compareTo("n") == 0 || continua.compareTo("N") == 0 || continua.compareTo("s") == 0
							|| continua.compareTo("S") == 0) 
					{
						repete1 = false;
					} 
					else 
					{
						System.out.println("Comando inválido!\nDeseja ver a correção monetária? [S/N]: ");
						continua = ler.next();
					}

				}
				System.out.printf("Valor com correção monetária é de R$%.2f%n", (saldo + saldo * 0.0005));

				System.out.println("\n\n\\nFazer nova movimentação? (S/N): ");// não coloquei While pq depende de qual valor
																				// vc usar pra repetir td
				continua = ler.next();
			}
			else if (tipoConta == 2) {
				// Karen
			} else if (tipoConta == 3) {
				do {
					String usarLimite = "";
					double limiteSolicitado = 0.0;
					double limite = 1000.00;
					System.out.print("Selecione o movimento (D/C): ");
					movimento = ler.next();
					movimento = movimento.toUpperCase();
					while (!movimento.equals("D") && !movimento.equals("C")) {
						System.out.print("Selecione o movimento (D/C): ");
						movimento = ler.next();
					}
					System.out.print("Informe o valor: ");
					valor = ler.nextDouble();
					while (valor <= 0) {
						System.out.println("Informe um valor válido: ");
						valor = ler.nextDouble();
					}
					System.out.print("Informe a descrição: ");
					descricao = ler.next();

					if (movimento.equals("D")) {
						if (valor > saldo) {
							System.out.println("Saldo insuficiente!");
						} else {
							saldo -= valor;
						}
					} else {
						saldo += valor;
					}

					System.out.println("Saldo atual: R$" + saldo);
					System.out.print("Continua? (S/N): ");
					continua = ler.next();
					continua = continua.toUpperCase();

					if (continua.equals("S")) {
						System.out.print("Deseja usar o limite? (S/N): ");
						usarLimite = ler.next();
						usarLimite = usarLimite.toUpperCase();
						if (usarLimite.equals("S")) {
							System.out.printf("[Limite Disponível %.2f]", limite);
							System.out.print("\nQuanto de limite gostaria de usar: ");
							limiteSolicitado = ler.nextDouble();
							if (limiteSolicitado < limite) {
								saldo += limiteSolicitado;
								limite -= limiteSolicitado;
							}
						}
					}
					System.out.println("Saldo atual: R$" + saldo);
					System.out.printf("[Limite Disponível %.2f]", limite);

					System.out.print("\nFazer nova movimentação? (S/N): ");
					continua = ler.next();
					continua = continua.toUpperCase();

				} while (continua.equals("S"));
				System.out.println("Obrigado por usar nossa rede de bancos! <3");
			} else if (tipoConta == 4) {
				// Casao
			} else if (tipoConta == 5) {
				// Maria
			} else if (tipoConta == 6) {
				System.out.println("Obrigado por usar nossa rede de bancos! <3");
			} else {
				System.out.println("Opção inválida!");
				System.out.println("Obrigado por usar nossa rede de bancos! <3");
			}

			ler.close();
		}

	}


}
