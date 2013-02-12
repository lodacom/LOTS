package projet;

/**
 * @author Lolo
 * @version 1.0
 * Classe permettant de créer des arêtes
 * et les associer avec un graphe.
 */
public class Aretes {
	public String nom_arete;
	public Graphes arete_dans;
	public Sommets somm1;
	public Sommets somm2;
	
	/**
	 * Constructeur de base. On donne un nom à l'arête.
	 * @param p_nom_arete
	 */
	public Aretes(String p_nom_arete){
		nom_arete=p_nom_arete;
	}
	
	/**
	 * Constructeur qui permet d'associer une arête
	 * à un graphe.
	 * @param p_nom_arete
	 * @param p_arete_dans
	 */
	public Aretes(String p_nom_arete,Graphes p_arete_dans){
		nom_arete=p_nom_arete;
		arete_dans=p_arete_dans;
	}
	
	public String toString(){
		return nom_arete;
	}
	
	public Graphes getArete_dans() {
		return arete_dans;
	}

	public void setArete_dans(Graphes arete_dans) {
		this.arete_dans = arete_dans;
	}
}
