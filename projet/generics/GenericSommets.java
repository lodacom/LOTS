package projet.generics;

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
public abstract class GenericSommets <G extends GenericGraphes<G,S,A>,S extends GenericSommets<G,S,A>,A extends GenericAretes<G,S,A>>{
	public String nom_sommet;
	public G sommet_dans;
	public HashSet<A> aret_incidents;
	public static int num;
	
	/**
	 * Constructeur de base. On donne un nom
	 * @param p_nom_sommet
	 */
	public GenericSommets(){
		num++;
		nom_sommet="S"+num;
		sommet_dans=null;
		aret_incidents=new HashSet<A>();
	}
	
	public GenericSommets(G p_sommet_dans){
		num++;
		nom_sommet="S"+num;
		setSommet_dans(p_sommet_dans);
		try {
			p_sommet_dans.addSommet((S) this);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		aret_incidents=new HashSet<A>();
	}

	/**
	 * Fonction permettant de créer une arête avec
	 * ses deux sommets incidents
	 * @param p_somm2 le deuxième sommet incident
	 * @throws ChimereException 
	 */
	public abstract void createArete(S p_somm2) throws ChimereException;
	
	public void addArete(A p_aret) throws ChimereException{
		aret_incidents.add(p_aret);
	}
	
	public void addArete(A p_aret,S p_somm2){
		try {
			p_somm2.addArete(p_aret);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p_aret.setSommets((S) this,p_somm2);
		aret_incidents.add(p_aret);
	}
	
	public String toString(){
		return nom_sommet;
	}
	
	public GenericGraphes<G,S,A> getSommet_dans() {
		return sommet_dans;
	}

	public void setSommet_dans(G sommet_dans) {
		this.sommet_dans = sommet_dans;
	}
}
