package projet.generics;

/**
 * <pre>
 * Classe permettant de créer des arêtes
 * et les associer avec un graphe.
 * </pre>
 * @author Lolo
 * @version 1.0
 */
public class GenericAretes <G extends GenericGraphes<G,S,A>,S extends GenericSommets<G,S,A>,A extends GenericAretes<G,S,A>>{
	public String nom_arete;
	public G arete_dans;
	public S somm1;
	public S somm2;
	public static int num;
	
	/**
	 * Constructeur de base. On donne un nom à l'arête.
	 * @param p_nom_arete
	 */
	public GenericAretes(){
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
	public GenericAretes(G p_arete_dans,S p_somm1,S p_somm2){
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
	public void setSommets(S p_somm1,S p_somm2){
		somm1=p_somm1;
		somm2=p_somm2;
	}
	
	/**
	 * Permet d'initialiser un seul sommet
	 * @param p_somm le sommet 1 ou 2 qui sera initialisé
	 * en fonction de la disponibilité
	 */
	public void setSommet(S p_somm){
		if (somm1==null){
			somm1=p_somm;
		}else{
			somm2=p_somm;
		}
	}
	
	public GenericGraphes getArete_dans() {
		return arete_dans;
	}

	public void setArete_dans(G arete_dans) {
		this.arete_dans = arete_dans;
	}
	
}
