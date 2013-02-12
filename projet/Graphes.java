package projet;

import java.util.HashSet;
import java.util.Iterator;

import projet.exceptions.ChimereException;

/**
 * Classe permettant de créer des graphes avec des sommmets
 * et des arêtes.
 * Fait sous Eclipse Juno et sous Mac OS X.
 * @author Lolo
 * @version 1.0
 */
public class Graphes {
	public String nom_graphe = "";
	public HashSet<Sommets> sommets;
	public HashSet<Aretes> aretes;
	
	/**
	 * Constructeur de base. On est obligé de donner un nom
	 * au graphe.
	 * @param p_nom
	 */
	public Graphes(String p_nom){
		nom_graphe=p_nom;
		sommets=new HashSet<Sommets>();
		aretes=new HashSet<Aretes>();
	}
	
	public Graphes(String p_nom,HashSet<Sommets> p_sommets,HashSet<Aretes> p_aretes){
		nom_graphe=p_nom;
		sommets=p_sommets;
		aretes=p_aretes;
	}
	
	/**
	 * @return la liste des sommets appartenant
	 * au graphe. Sinon retourne "aucun sommet"
	 */
	protected String listeSommets(){
		if (sommets.isEmpty()){
			return "aucun sommet";
		}else{
			String ret="";
			Iterator<Sommets> i = sommets.iterator();
			while (i.hasNext()){
				ret += i.next().toString()+"\n";
			}
			return ret;
		}
	}
	
	/**
	 * @return la liste des arêtes appartenant au graphe.
	 * Sinon retourne "aucune arête"
	 */
	protected String listeAretes(){
		if (aretes.isEmpty()){
			return "aucune arêtes";
		}else{
			String ret="";
			Iterator<Aretes> i = aretes.iterator();
			while (i.hasNext()){
				ret+=i.next().toString()+"\n";
			}
			return ret;
		}
	}
	
	public String toString(){
		return "Le graphe "+nom_graphe+" est composé des sommets:"+listeSommets()+
				"et des arêtes:"+listeAretes();
	}
	
	/**
	 * Permet d'ajouter une arête dans le graphe
	 * @param p_arete
	 * @throws ChimereException 
	 */
	public void addArete(Aretes p_arete) throws ChimereException{
		/*
		 * (nbr-sommets*(nbr-sommets-1))/2=nbr-aretes
		 */
		aretes.add(p_arete);
	}
	
	/**
	 * Permet d'ajouter un sommet dans le graphe
	 * @param p_sommets
	 */
	public void addSommet(Sommets p_sommets){
		sommets.add(p_sommets);
	}
	
	/**
	 * @param p_arete
	 * @return l'arête qui a été enlevée s'il y a succés. Sinon
	 * renvoi null en cas d'échec.
	 */
	public Aretes deleteArete(Aretes p_arete){
		if (aretes.remove(p_arete)){
			p_arete.setArete_dans(null);
			//l'arête ne référence plus le graphe
			return p_arete;
		}else{
			return null;
		}
	}
	
	/**
	 * @param p_sommet
	 * @return le sommet qui a été enlevé s'il y a succés. Sinon
	 * renvoi null en cas d'échec.
	 */
	public Sommets deleteSommet(Sommets p_sommet){
		if (sommets.remove(p_sommet)){
			p_sommet.setSommet_dans(null);
			//le sommet ne référence plus le graphe
			return p_sommet;
		}else{
			return null;
		}
	}
}
