package projet.exceptions;

import projet.Aretes;
import projet.Graphes;
import projet.Sommets;

@SuppressWarnings("serial")
/**
 * Classe permettant de signaler une exception spécifique 
 * concernant la simulation de la covariance (surcharge statique ou
 * surchage). 
 * @author Lolo
 * @version 1.0
 */
public class ChimereException extends Exception {
	Graphes grape;
	Aretes aret;
	Sommets somm;
	
	/**
	 * Constructeur pour détecter la construction d'une
	 * chimère côté Aretes
	 * @param p_grape
	 * @param p_aret
	 */
	public ChimereException(Graphes p_grape,Aretes p_aret){
		grape=p_grape;
		aret=p_aret;
	}
	
	/**
	 * Constructeur pour détecter la construction d'une
	 * chimère côté Sommets
	 * @param p_grape
	 * @param p_somm
	 */
	public ChimereException(Graphes p_grape,Sommets p_somm){
		grape=p_grape;
		somm=p_somm;
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