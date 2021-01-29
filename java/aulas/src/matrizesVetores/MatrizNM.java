package matrizesVetores;

import java.util.Arrays;
import java.util.Random;

public class MatrizNM 
{
	public static void main(String[]args)
	{
		Random r = new Random();
		
		int n1[][] = new int [4][6];
		int n2[][] = new int [4][6];
		int m1[][] = new int [4][6];
		int m2[][] = new int [4][6];
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<6; j++)
			{
				n1[i][j] = r.nextInt(10);
				n2[i][j] = r.nextInt(10);

				m1[i][j] = (n1[i][j] + n2[i][j]);
				m2[i][j] = (n1[i][j] - n2[i][j]);
			}
		}
		System.out.println("Matriz N1");
		
		for(int i=0; i<4; i++)
		{
			System.out.println(Arrays.toString(n1[i]));
		}
		
		System.out.println("\nMatriz N2");
		for(int i=0; i<4; i++)
		{
			System.out.println(Arrays.toString(n2[i]));
		}
		System.out.println("\nMatriz M1");
		for(int i=0; i<4; i++)
		{
			System.out.println(Arrays.toString(m1[i]));
		}
		System.out.println("\nMatriz M2");
		for(int i=0; i<4; i++)
		{
			System.out.println(Arrays.toString(m2[i]));
		}
		
		/*
		 
		System.out.println("Matriz N1\n");
		 
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<6; j++)
			{
				System.out.print(n1[i][j]+" ");
				if(j==5)
				{
					System.out.print("\n");
				}
			}
		}

		System.out.println("\nMatriz N2\n");
				
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<6; j++)
			{
				System.out.print(n2[i][j]+" ");
				if(j==5)
				{
					System.out.print("\n");
				}
			}
		}

		System.out.println("\nMatriz M1\n");
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<6; j++)
			{
				System.out.print(m1[i][j]+" ");
				if(j==5)
				{
					System.out.print("\n");
				}
			}
		}

		System.out.println("\nMatriz M2\n");
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<6; j++)
			{
				System.out.print(m2[i][j]+" ");
				if(j==5)
				{
					System.out.print("\n");
				}
			}
		}*/
	}
}
