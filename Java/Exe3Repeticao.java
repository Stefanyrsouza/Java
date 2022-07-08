package Familia55;

import java.util.Scanner;

public class Exe3Repeticao {

	public static void main(String[] args) {
		int mv=0,mc=0,idade;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite sua idade: ");
		idade = ler.nextInt();
		
		while(idade!=-99)
		{
			if(idade<21)
				mv++;
			if(idade>50)
				mc++;
			System.out.println("\nDigite sua idade: ");
			idade = ler.nextInt();
		}
		System.out.println("\nO total de pessoas com menos de 21 é: "+mv);
		System.out.println("\nO total de pessoas com mais de 50 é: "+mc);

	}

}
