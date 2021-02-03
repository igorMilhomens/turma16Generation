package BANK16;

public class Poupanca extends Conta{

	private int diaAniversario;
	
	public Poupanca(String numero, String cpf,int diaAniversario) {
		super(numero, cpf);
		this.diaAniversario = diaAniversario;
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	public void aniversario(int x) {
		if(diaAniversario == x)
		{
			System.out.println("Operação efetuada com sucesso.");
			this.creditar(0.0005*super.getSaldo());
		}
		else {
			System.out.println("Operação Inválida");
		}
	}
}
