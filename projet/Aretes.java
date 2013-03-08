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
	public static int num;
	
	/**
	 * Constructeur de base. On donne un nom à l'arête.
	 * @param p_nom_arete
	 */
	public Aretes(){
		num++;
		nom_arete="A"+num;
		arete_dans=null;
		somm1=null;
		somm2=null;
	}
	
	/**
	 * Constructeur qui permet d'associer une arête
	 * à un graphe.
	 * @param p_nom_arete
	 * @param p_arete_dans
	 */
	public Aretes(Graphes p_arete_dans,Sommets p_somm1,Sommets p_somm2){
		num++;
		nom_arete="A"+num;
		arete_dans=p_arete_dans;
		somm1=p_somm1;
		somm2=p_somm2;
	}
	
	public String toString(){
		return nom_arete;
	}
	
	/**
	 * Permet d'initialiser les sommets de l'arête
	 * @param p_somm1 le premier sommet de l'arête
	 * @param p_somm2 le deuxième sommet de l'arête
	 */
	public void setSommets(Sommets p_somm1,Sommets p_somm2){
		somm1=p_somm1;
		somm2=p_somm2;
	}
	
	/**
	 * Permet d'initialiser un seul sommet
	 * @param p_somm le sommet 1 ou 2 qui sera initialisé
	 * en fonction de la disponibilité
	 */
	public void setSommet(Sommets p_somm){
		if (somm1==null){
			somm1=p_somm;
		}else{
			somm2=p_somm;
		}
	}
	
	public Graphes getArete_dans() {
		return arete_dans;
	}

	public void setArete_dans(Graphes arete_dans) {
		this.arete_dans = arete_dans;
	}
	
}
