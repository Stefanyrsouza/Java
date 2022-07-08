package Familia55;

import java.util.Scanner;

public class Exe1Decisao {

	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor de A: ");
		a = leia.nextInt();
		System.out.println("\nEntre com o valor de B: ");
		b = leia.nextInt();
		System.out.println("\nEntre com o valor de C: ");
		c = leia.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("\nO maior número é: "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("\nO maior número é: "+b);
		}
		else if(c>a && c>b)
		{
			System.out.println("\nO maior número é: "+c);
		}

	}

}
