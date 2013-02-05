package surch_redef;

public class SousClasseB extends SousClasseA 
{
	public SousClasseB()
	{
		super.id="SousClasseB";
	}
	
	public void foo(ClasseT x)
	{
		System.out.println("Je suis dans la classe B");
		System.out.println("Son type dynamique est: "+this.getClass().toString());
		this.whoamI();
	}
	
	public void bar(SousClasseU x)
	{
		System.out.println("Je suis dans la classe B");
		System.out.println("Son type dynamique est: "+this.getClass().toString());
		this.whoamI();
	}
}
