package surch_redef;

public class Racine 
{
	public String id;
	
	public Racine()
	{
		this.id="Classe Racine";
	}
	
	public void whoamI()
	{
		System.out.println("L'identifiant du receveur est: "+this.id);
		System.out.println("Son type dynamique est: "+this.getClass().toString());
	}
}
