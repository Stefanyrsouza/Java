package POO;

public class Pessoa {
	private String primeiroNome; //TRIBUTOS
	private String nomesDoMeio; //TRIBUTOS
	private String ultimoNome; //TRIBUTOS
	
	public Pessoa (String primeiro,String meio,String ultimo)
	{
		primeiroNome=primeiro;
		nomesDoMeio=meio;
		ultimoNome=ultimo;
	}
	 
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;		
	}
	

}
