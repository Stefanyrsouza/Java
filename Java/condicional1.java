package Familia55;

import java.util.Scanner;

public class condicional1 {
public static void main (String args[])
{
	Scanner ler = new Scanner (System.in);
	int idade;
	String nome;
	
	System.out.println("\nEntre com a sua idade: ");
	idade = ler.nextInt();
	ler.nextLine();
	System.out.println("\nEntre com o seu nome: ");
	nome = ler.nextLine();
	System.out.printf("\nSua idade: %d",idade);
	
	if(idade>=18)
	{
		System.out.printf("\nVocê é maior de idade...");			
	}
	else if(idade>=1 && idade<18)
	{
		System.out.printf("Você é menor de idade...");		
	}
	else
	{
		System.out.printf("\nVocê entrou com uma idade inválida...");	
	}
}
}
