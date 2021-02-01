package aulas;

import java.util.Scanner;

public class Agenda 
{
	public static boolean confirma(char c)
	{
		
		if(c=='s' || c=='S' || c=='n' || c=='N')
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		boolean reinicia = true;
		
		while(reinicia)
		{
			boolean controle = true;
			String nome;
			String evento[][] = new String [31][24];
			int dia, hora;
			char repita, continua, agendaAtual;

			System.out.println("Bem Vindo,  realize seu agendamento.");
			
			while(controle)
			{	
				System.out.print("Digite o seu nome: ");
				nome = scan.next();
				
				System.out.print("Escolha um dia para o Cadastro [1/31]: ");
				dia = scan.nextInt();
				
				System.out.print("Selecione a hora do evento [0/23]: ");
				hora = scan.nextInt();
			
				System.out.print("Deseja continuar agendamento? [S/N]: ");
				continua = scan.next().charAt(0);
				
				//INSERIR LAÇO DE VALIDAÇÃO S/N
				while(confirma(continua))
				{
					System.out.print("Valor inválido, digite [S] para SIM, ou [N] para NÃO. : ");
					continua = scan.next().charAt(0);
				}
				
				evento[dia-1][hora] = nome+" - Evento no dia "+ dia +" - "+  hora + "h.";
				
				if(continua == 's' || continua =='S')
				{
					controle = true;
				}
				else 
				{
					controle = false;

					System.out.print("Mostrar a agenda atual? [S/N]: ");
					agendaAtual = scan.next().charAt(0);
					
					//INSERIR LAÇO DE VALIDAÇÃO S/N
					
					while(confirma(agendaAtual))
					{
						System.out.print("Valor inválido, digite [S] para SIM, ou [N] para NÃO. : ");
						agendaAtual = scan.next().charAt(0);
					}
		
					if(agendaAtual == 's' || agendaAtual =='S')
					{
						System.out.println("\nOs eventos cadastrados para a agenda atual são: \n");
		
						for(int i = 0; i< 31; i++)
						{
							for(int j = 0; j<24; j++)
							{
		
								if( evento[i][j] != null)
								{
									System.out.print(evento[i][j]+ "\n");
								}
							}
						}
					}	
				} 
			}
	
			System.out.print("\nDeseja limpar a agenda e Recomeçar? [S/N]: ");
			repita = scan.next().charAt(0);

			while(confirma(repita))
			{
				System.out.print("Valor inválido, digite [S] para SIM, ou [N] para NÃO. : ");
				repita = scan.next().charAt(0);
			}
			
			if(repita =='s' || repita == 'S')
			{
				reinicia = true;
				System.out.println("\n----------------------------------------------------------------\n");
			}
			else
			{
				reinicia = false;
			}
		}
	}
}
