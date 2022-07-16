package POO;

public class Cachorro extends Animal {
	
	public Cachorro()
	{
		super("Cachorro");
	}
	
	@Override
	public void Nome (String nomeanimal)
	{
		System.out.println("\nNome do cachorro: "+nomeanimal);
	}
	@Override
	public void Idade (int idadeanimal)
	{
		System.out.println("Idade: "+idadeanimal);
	}
	@Override
	public void Som (String somanimal)
	{
		System.out.println("\nSom que o seu cachorro emite: "+somanimal);
	}
	public void Corre() 
	{
		System.out.println("Uma das características do cachorro é correr!");
	}

}
