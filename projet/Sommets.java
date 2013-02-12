package projet;

import java.util.HashSet;

/**
 * @author Lolo
 * @version 1.0
 * Classe permettant de créer des sommets et de les associer 
 * avec un graphe.
 */
public class Sommets {
	public String nom_sommet;
	public Graphes sommet_dans;
	public HashSet<Aretes> aret_incidents;
	
	/**
	 * Constructeur de base. On donne un nom
	 * @param p_nom_sommet
	 */
	public Sommets(String p_nom_sommet){
		nom_sommet=p_nom_sommet;
	}
	
	public Sommets(String p_nom_sommet, Graphes p_sommet_dans){
		nom_sommet=p_nom_sommet;
		setSommet_dans(p_sommet_dans);
	}

	public void addArete(Aretes p_aret){
		aret_incidents.add(p_aret);
	}
	
	public void deleteSommet(){
		
	}
	
	public String toString(){
		return nom_sommet;
	}
	
	public Graphes getSommet_dans() {
		return sommet_dans;
	}

	public void setSommet_dans(Graphes sommet_dans) {
		this.sommet_dans = sommet_dans;
	}
}
