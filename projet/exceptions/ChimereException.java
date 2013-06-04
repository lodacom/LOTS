package projet.exceptions;

@SuppressWarnings("serial")
/**
 * Classe permettant de signaler une exception spécifique 
 * concernant la simulation de la covariance (surcharge statique ou
 * surchage). 
 * @author Lolo
 * @version 1.0
 */
public class ChimereException extends Exception {

	public ChimereException(){
		
	}

	/**
	 * On surchage la méthode getMessage présente dans la classe
	 * Throwable
	 * @return un message d'erreur spécifique
	 */
	public String getMessage(){
		return "Attention vous essayez de construire une chimère";
	}
}
