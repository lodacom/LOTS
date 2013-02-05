package animal;

@SuppressWarnings("serial")
/**
 * @author Lolo
 * classe qui permet de signaler une exception spécifique à la
 * surcharge statique (ou surcharge)
 */
public class AlimentException extends Exception {
	Herbivore herbi;
	Aliment alim;
	
	public AlimentException(Herbivore her,Aliment ali){
		herbi=her;
		alim=ali;
	}
	
	/**
	 * @return un message d'erreur spécifique
	 * On surcharge la méthode getMessage présente dans la classe
	 * Throwable
	 */
	public String getMessage(){
		return "Erreur de type avec "+
				herbi.toString()+" et "+
				alim.toString();
		
	}
}
