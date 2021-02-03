package BANK16;

public class Corrente extends Conta {

	private int contador=0;

	
	public Corrente(String numero, String cpf) {
		super(numero, cpf);
	}
	
	public void qtMesTalao(int n) {
		n += contador;
		if(n > 0 && n <= 3) {
			for(int i = 0; i < n-contador; i++) {
				System.out.println("Emitido talão");
			}
			contador+=n;
		}
		else {
			System.out.println("Não é possivel emitir talão");
		}
	}
}
