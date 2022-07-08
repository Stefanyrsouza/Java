package Familia55;

import java.util.Scanner;

public class Exe3Decisao {

	public static void main(String[] args) 
	{
		int x;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite sua idade: ");
		x = leia.nextInt();
		
		if(x>=10 && x<=14)
		{
			System.out.println("\nVocê está na categotia infantil!!!");
		}
		else if(x>=15 && x<=17)
		{
			System.out.println("\nVocê está na categoria juvenil!!!");
		}
		else if(x>=18 && x<=25)
		{
			System.out.println("\nVocê está na categoria adulto!!!");
		}
		else
		{
			System.out.println("\nVocê não se encaixa em nenhuma categoria!");
		}

	}

}
