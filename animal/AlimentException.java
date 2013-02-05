package animal;

@SuppressWarnings("serial")
public class AlimentException extends Exception {
	Herbivore herbi;
	Aliment alim;
	
	public AlimentException(Herbivore her,Aliment ali){
		herbi=her;
		alim=ali;
	}
	
	public String getMessage(){
		return "Erreur de type avec "+
				herbi.toString()+" et "+
				alim.toString();
		
	}
}
