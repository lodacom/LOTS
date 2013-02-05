package surch_redef;

public class SousClasseA extends Racine 
{
	public SousClasseA()
	{
		super.id="SousClasseA";
	}
	
	public void foo(ClasseT x)
	{
		System.out.println("Je suis dans la classe A");
		System.out.println("Son type dynamique est: "+this.getClass().toString());
		this.whoamI();
	}
	
	public void bar(ClasseT x)
	{
		
	}
}
