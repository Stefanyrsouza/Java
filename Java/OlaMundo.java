package Familia55;

import java.util.Scanner;

public class OlaMundo {

public static void main(String[] args) {
	
	double n1,n2,n3,media;
	int op;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nEntre com a primeira nota: ");
	n1 = leia.nextFloat();
	System.out.println("\nEntre com a segunda nota: ");
	n2 = leia.nextFloat();
	System.out.println("\nEntre com a terceira nota: ");
	n3 = leia.nextFloat();
	
	media = (n1+n2+n3)/3;
	System.out.println("\nMedia: "+media);
	System.out.printf("\nMedia: %2.2f", media);
	
	if(media>=7 && media<=10)
	{
		System.out.println("\nAlune aprovade!!!");
	}
	else if(media>=5 && media<7)
	{
		System.out.println("\nAlune de Exame!!!");
	}
	else
	{
		System.out.println("\nAlune reprovade!!!");
	}
	
	System.out.println("\n\t\tMenu de Java");
	System.out.println("\n1-Seja mais simples");
	System.out.println("\n2-Me traga dinheiro");
	System.out.println("\n3-Voce vai me ajudar muito");
	System.out.println("\n4-Foi o Java que me deu");
	System.out.println("\nDigite sua opcao: ");		
	op = leia.nextInt();
	
	switch(op)
	{
	case 1:
		System.out.println("\nSeja mais simples");
		break;
	case 2:
		System.out.println("\nMe traga dinheiro");
		break;
	case 3:
		System.out.println("\nVoce vai me ajudar muito");
		break;
	case 4:
		System.out.println("\nFoi o Java que me deu");
		break;
		default:
			System.out.println("\nOpção inválida!!!");
	}
	
	n1 = Math.sqrt(n2);
	n2 = Math.pow(n1, 3);		
}

}
