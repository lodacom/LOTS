package projet;

import java.util.HashSet;

import projet.exceptions.ChimereException;

/**
 * <pre>
 * Classe permettant de créer des sommets et de les associer 
 * avec un graphe.
 * </pre>
 * @author Lolo
 * @version 1.0
 */
public class Sommets {
	public String nom_sommet;
	public Graphes sommet_dans;
	public HashSet<Aretes> aret_incidents;
	public static int num;
	
	/**
	 * Constructeur de base. On donne un nom
	 */
	public Sommets(){
		num++;
		nom_sommet="S"+num;
		sommet_dans=null;
		aret_incidents=new HashSet<Aretes>();
	}
	
	public Sommets(Graphes p_sommet_dans){
		num++;
		nom_sommet="S"+num;
		setSommet_dans(p_sommet_dans);
		try {
			p_sommet_dans.addSommet(this);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		aret_incidents=new HashSet<Aretes>();
	}

	/**
	 * Fonction permettant de créer une arête avec
	 * ses deux sommets incidents
	 * @param p_somm2 le deuxième sommet incident
	 * @throws ChimereException 
	 */
	public void createArete(Sommets p_somm2) throws ChimereException{
		Aretes a=new Aretes();
		try{
		addArete(a);
		p_somm2.addArete(a);
		}catch (ChimereException e){
			e.printStackTrace();
		}
		a.setSommets(this, p_somm2);
	}
	
	public void addArete(Aretes p_aret) throws ChimereException{
		aret_incidents.add(p_aret);
	}
	
	public void addArete(Aretes p_aret,Sommets p_somm2){
		try {
			p_somm2.addArete(p_aret);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p_aret.setSommets(this,p_somm2);
		aret_incidents.add(p_aret);
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
