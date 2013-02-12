package projet.molecules;

import projet.Aretes;
import projet.Graphes;
import projet.exceptions.ChimereException;

public class Molecules extends Graphes {

	public Molecules(String p_nom) {
		super(p_nom);
	}
	
	public String toString(){
		return "La molécule "+super.nom_graphe+" est composé des atomes:"+
				super.listeSommets()+"et des liaisons: "+super.listeAretes();
	}
	
	public void addArete(Aretes p_aret) throws ChimereException{
		if (p_aret instanceof Liaisons){
			super.addArete((Liaisons)p_aret);
		}else{
			throw new ChimereException(this,p_aret);
		}
	}
}
