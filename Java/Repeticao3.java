package Familia55;

import java.util.Scanner;

public class Repeticao3 {

	public static void main(String[] args) 
		{
			Scanner ler = new Scanner (System.in);
			
			int idade;
			System.out.println("\nEntre com sua idade: ");
			idade = ler.nextInt();		
			
			do
			{							
				System.out.printf("\nSua idade: %d",idade);
				if(idade>=18)
				{
					System.out.println("\nVocê é de maior...");				
				}
				else
				{
					System.out.println("\nVocê é de menor...");
				}
				System.out.println("\nEntre com sua idade: ");
				idade = ler.nextInt();
			}			
			while(idade>=1);
	}

}
