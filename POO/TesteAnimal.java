package POO;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		Animal animal = null;
		int x=0;
		
		do
		{
			System.out.println("Qual tipo do seu animal?\n\n1 - CACHORRO | 2 - CAVALO | 3 - PREGUIÇA |\n ");
			x = leia.nextInt();
			
			if(x==1)
			{
				animal = cachorro;
				System.out.println("\nQual o nome do seu cachorro? ");
				String nome = leia.next();
				System.out.println("\nQuantos anos seu cachorro tem?");
				int idade = leia.nextInt();
				System.out.println("\nEssa é legal! Qual som seu cachorro emite?");
				String som = leia.next();
				System.out.println("\n---------------------------------------------");
				cachorro.Nome(nome);
				cachorro.Idade(idade);
				cachorro.Som(som);
				cachorro.Corre();
			}
			else if(x==2)
			{
				animal = cavalo;
				System.out.println("\nQual o nome do seu cavalo? ");
				String nome = leia.next();
				System.out.println("\nQuantos anos seu cavalo tem?");
				int idade = leia.nextInt();
				System.out.println("\nEssa é legal! Qual som seu cavalo emite?");
				String som = leia.next();
				System.out.println("\n---------------------------------------------");
				cavalo.Nome(nome);
				cavalo.Idade(idade);
				cavalo.Som(som);
				cavalo.Corre();
			}
			else if(x==3)
			{
				animal = preguica;
				System.out.println("\nQual o nome da sua preguiça? ");
				String nome = leia.next();
				System.out.println("\nQuantos anos sua preguiça tem?");
				int idade = leia.nextInt();
				System.out.println("\nEssa é legal! Qual som seu preguiça emite?");
				String som = leia.next();
				System.out.println("\n---------------------------------------------");
				preguica.Nome(nome);
				preguica.Idade(idade);
				preguica.Som(som);
				preguica.SubirArvores();
			}
			else 
			{
				System.out.println("\nOpção inválida!!!");
			}
		}
		while(x<=0 || x>=4);
		

	}

}
