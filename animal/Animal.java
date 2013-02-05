package animal;

public class Animal {
	public String nom;
	
	public Animal(String p_nom){
		nom=p_nom;
	}
	
	public void mange(Aliment ali) throws AlimentException{
		System.out.println("Je mange: "+ali.toString());
	}
	
	public String toString(){
		return nom;
	}
}
