package POO;

public class Cavalo extends Animal{
	
	public Cavalo() 
	{
		super("Cavalo");
	}
	@Override
	public void Nome (String nomeanimal)
	{
		System.out.println("\nNome do cavalo: "+nomeanimal);
	}
	@Override
	public void Idade (int idadeanimal)
	{
		System.out.println("Idade: "+idadeanimal);
	}
	@Override
	public void Som (String somanimal)
	{
		System.out.println("\nSom que o seu cavalo emite: "+somanimal);
	}
	public void Corre() 
	{
		System.out.println("Uma das características do cavalo é correr!");
	}


}
