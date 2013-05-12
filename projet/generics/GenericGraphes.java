package projet.generics;

import java.util.HashSet;
import java.util.Iterator;

import projet.Aretes;
import projet.Sommets;
import projet.exceptions.ChimereException;

/**
 * <pre>
 * Classe permettant de créer des graphes avec des sommmets
 * et des arêtes. Va devoir hériter de InstanceGraphes
 * Fait sous Eclipse Juno et sous Mac OS X.
 * </pre>
 * @author Lolo
 * @version 1.0
 */
public abstract class GenericGraphes <G extends GenericGraphes<G,S,A>,S extends GenericSommets<G,S,A>,A extends GenericAretes<G,S,A>>{
	public String nom_graphe;
	public HashSet<S> sommets;
	public HashSet<A> aretes;
	public static int num;
	
	/**
	 * Constructeur de base. On est obligé de donner un nom
	 * au graphe.
	 * @param p_nom
	 */
	public GenericGraphes(){
		num++;
		nom_graphe="G"+num;
		sommets=new HashSet<S>();
		aretes=new HashSet<A>();
	}
	
	public GenericGraphes(String p_nom,HashSet<S> p_sommets,HashSet<A> p_aretes){
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
			Iterator<S> i = sommets.iterator();
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
			Iterator<A> i = aretes.iterator();
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
	
	public String descriptionGraphe(){
		String ret="";
		if (sommets.size()==0){
			return "Le graphe est vide";
		}else{
			Iterator<S> i = sommets.iterator();
			while (i.hasNext()){
				S somm=i.next();
				ret += somm.toString()+" est relié à:\n"+sommetLinkedTo(somm);
			}
		}
	    return ret;
	}
	
	public String sommetLinkedTo(S p_sommet){
	    String ret="";
	    Iterator<A> i=p_sommet.aret_incidents.iterator();
	    while (i.hasNext()){
	    	A aret=i.next();
	        if (aret.somm1.nom_sommet!=p_sommet.nom_sommet){
	            ret+=aret.somm1.toString()+"\n";
	        }else{
	            ret+=aret.somm2.toString()+"\n";
	        }
	    }
	    return ret;
	}
	
	/**
	 * Fonction permettant de créer un sommet puis de
	 * l'ajouter dans le graphe
	 */
	public abstract void createSommet();

	public abstract void createArete(S p_somm1,S p_somm2) throws ChimereException;
	
	/**
	 * Permet d'ajouter une arête dans le graphe
	 * avec les deux sommets
	 * @param p_arete l'arête que l'on ajoute au graphe
	 * @throws ChimereException 
	 * @deprecated
	 */
	public void addArete(A p_arete) throws ChimereException{
		/*
		 * (nbr-sommets*(nbr-sommets-1))/2=nbr-aretes
		 */
		if (p_arete.getArete_dans()==null){
			p_arete.setArete_dans((G) this);
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
	public void addArete(A p_arete,S p_somm1,S p_somm2) throws ChimereException{
		/*
		 * (nbr-sommets*(nbr-sommets-1))/2=nbr-aretes
		 */
		if (p_arete.getArete_dans()==null){
			p_arete.setArete_dans((G) this);
		}
		p_arete.setSommets(p_somm1, p_somm2);
		p_somm1.setSommet_dans((G) this);
		p_somm2.setSommet_dans((G) this);
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
	public void addSommet(S p_sommets,A p_aret) throws ChimereException{
		if (p_sommets.getSommet_dans()==null){
			p_sommets.setSommet_dans((G) this);
		}
		p_sommets.addArete(p_aret);
		sommets.add(p_sommets);
	}
	
	/**
	 * Permet d'ajouter un sommet au graphe sans arête incidente
	 * @param p_sommets le sommet que l'on ajoute au graphe
	 * @throws ChimereException 
	 */
	public void addSommet(S p_sommets) throws ChimereException{
		if (p_sommets.getSommet_dans()==null){
			p_sommets.setSommet_dans((G) this);
		}
		sommets.add(p_sommets);
	}
	
	/**
	 * @param p_arete
	 * @return l'arête qui a été enlevée s'il y a succés. Sinon
	 * renvoi null en cas d'échec.
	 */
	public A deleteArete(A p_arete){
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
	public GenericSommets<G,S,A> deleteSommet(GenericSommets<G,S,A> p_sommet){
		if (sommets.remove(p_sommet)){
			p_sommet.setSommet_dans(null);
			//le sommet ne référence plus le graphe
			//il faut maintenant supprimer toutes les aretes incidentes
			//du graphe
			Iterator<A> i = (Iterator<A>) p_sommet.aret_incidents.iterator();
			while (i.hasNext()){
				deleteArete(i.next());
			}
			return p_sommet;
		}else{
			return null;
		}
	}
}
