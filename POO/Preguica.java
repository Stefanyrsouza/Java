package POO;

public class Preguica extends Animal {
	
	public Preguica()
	{
		super("Preguica");
	}
	public void Nome (String nomeanimal)
	{
		System.out.println("\nNome da preguiça: "+nomeanimal);
	}
	@Override
	public void Idade (int idadeanimal)
	{
		System.out.println("Idade: "+idadeanimal);
	}
	@Override
	public void Som (String somanimal)
	{
		System.out.println("\nSom que a sua preguiça emite: "+somanimal);
	}
	public void SubirArvores() 
	{
		System.out.println("\nUma das características da preguiça é subir em árvores!");
	}
	public void infoPreguica() {
	
	}

}
