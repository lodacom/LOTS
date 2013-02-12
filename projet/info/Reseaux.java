package projet.info;

import projet.Graphes;

public class Reseaux extends Graphes {

	public Reseaux(String p_nom) {
		super(p_nom);
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
		return "Le réseau "+super.nom_graphe+" est composé des noeuds:"+
				super.listeSommets()+"et des liens: "+super.listeAretes();
	}
}
