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
	public String nom_graphe;
	public HashSet<Sommets> sommets;
	public HashSet<Aretes> aretes;
	public static int num;
	
	/**
	 * Constructeur de base. On est obligé de donner un nom
	 * au graphe.
	 * @param p_nom
	 */
	public Graphes(){
		num++;
		nom_graphe="G"+num;
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
		return "Le graphe "+nom_graphe+" est composé des sommets:\n"+listeSommets()+
				"et des arêtes:\n"+listeAretes();
	}
	
	/**
	 * Fonction permettant de créer un sommet puis de
	 * l'ajouter dans le graphe
	 */
	public void createSommet(){
		Sommets s=new Sommets();
		try {
			addSommet(s);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void createArete(Sommets p_somm1,Sommets p_somm2) throws ChimereException{
		Aretes a=new Aretes();
		try {
			addArete(a,p_somm1,p_somm2);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Permet d'ajouter une arête dans le graphe
	 * avec les deux sommets
	 * @param p_arete l'arête que l'on ajoute au graphe
	 * @throws ChimereException 
	 * @deprecated
	 */
	public void addArete(Aretes p_arete) throws ChimereException{
		/*
		 * (nbr-sommets*(nbr-sommets-1))/2=nbr-aretes
		 */
		if (p_arete.getArete_dans()==null){
			p_arete.setArete_dans(this);
		}
		//on ajoute l'arête dans le graphe
		aretes.add(p_arete);
	}
	
	/**
	 * Permet d'ajouter une arête dans le graphe
	 * avec les deux sommets
	 * @param p_arete l'arête que l'on ajoute au graphe
	 * @param p_somm1 le premier sommet de l'arête
	 * @param p_somm2 le deuxième sommet de l'arête
	 * @throws ChimereException 
	 */
	public void addArete(Aretes p_arete,Sommets p_somm1,Sommets p_somm2) throws ChimereException{
		/*
		 * (nbr-sommets*(nbr-sommets-1))/2=nbr-aretes
		 */
		if (p_arete.getArete_dans()==null){
			p_arete.setArete_dans(this);
		}
		p_arete.setSommets(p_somm1, p_somm2);
		p_somm1.setSommet_dans(this);
		p_somm2.setSommet_dans(this);
		p_somm1.addArete(p_arete);
		p_somm2.addArete(p_arete);
		//on ajoute l'arête dans le graphe
		aretes.add(p_arete);
		//on ajoute les sommets dans le graphe
		sommets.add(p_somm1);
		sommets.add(p_somm2);
	}
	
	/**
	 * Permet d'ajouter un sommet dans le graphe avec son arête incidente
	 * @param p_sommets le sommet que l'on ajoute au graphe
	 * @param p_aret_incidents l'arête incidente au sommet
	 * @throws ChimereException 
	 * @deprecated
	 */
	public void addSommet(Sommets p_sommets,Aretes p_aret) throws ChimereException{
		if (p_sommets.getSommet_dans()==null){
			p_sommets.setSommet_dans(this);
		}
		p_sommets.addArete(p_aret);
		sommets.add(p_sommets);
	}
	
	/**
	 * Permet d'ajouter un sommet au graphe sans arête incidente
	 * @param p_sommets le sommet que l'on ajoute au graphe
	 * @throws ChimereException 
	 */
	public void addSommet(Sommets p_sommets) throws ChimereException{
		if (p_sommets.getSommet_dans()==null){
			p_sommets.setSommet_dans(this);
		}
		sommets.add(p_sommets);
	}
	
	/**
	 * @param p_arete
	 * @return l'arête qui a été enlevée s'il y a succés. Sinon
	 * renvoi null en cas d'échec.
	 */
	public Aretes deleteArete(Aretes p_arete){
		if (aretes.remove(p_arete)){
			//l'arête ne référence plus le graphe
			p_arete.setArete_dans(null);
			//l'arête ne référence plus ses deux sommets
			p_arete.setSommets(null, null);
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
			//il faut maintenant supprimer toutes les aretes incidentes
			//du graphe
			Iterator<Aretes> i = p_sommet.aret_incidents.iterator();
			while (i.hasNext()){
				deleteArete(i.next());
			}
			return p_sommet;
		}else{
			return null;
		}
	}
}
