package projet;

import java.util.ArrayList;

/**
 * @author Lolo
 * @version 1.0
 * Classe permettant de créer des sommets et de les associer 
 * avec un graphe.
 */
public class Sommets {
	public String nom_sommet;
	public Graphes sommet_dans;
	public ArrayList<Sommets> somm_incidents;
	
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

	public void addSommet(Sommets p_somm){
		somm_incidents.add(p_somm);
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
