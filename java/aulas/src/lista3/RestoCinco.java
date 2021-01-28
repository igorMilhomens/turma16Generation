package lista3;

public class RestoCinco {

	public static void main(String[] args) 
	{
		// 1- Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		
		System.out.println("O conjunto dos números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5, é:\n");
		
		int aux = 0;
		
		for(int i = 1000; i<2000; i++)
		{
			if(i%11==5)
			{
				aux ++;
				System.out.printf(aux==1? "C = { %d": ", %d", i);
			}
			
			if(i==1999)
			{
				System.out.println(" }");
			}
		}
	}

}
