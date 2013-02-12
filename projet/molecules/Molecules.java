package projet.molecules;

import projet.Aretes;
import projet.Graphes;
import projet.Sommets;
import projet.exceptions.ChimereException;

public class Molecules extends Graphes {

	public Molecules(String p_nom) {
		super(p_nom);
	}
	
	public String toString(){
		return "La molécule "+super.nom_graphe+" est composé des atomes:"+
				super.listeSommets()+"et des liaisons: "+super.listeAretes();
	}
	
	public void addArete(Aretes p_aret,Sommets p_somm1,Sommets p_somm2) throws ChimereException{
		if ((p_aret instanceof Liaisons) &&
				(p_somm1 instanceof Atomes) &&
				(p_somm2 instanceof Atomes)){
			super.addArete((Liaisons)p_aret,
					(Atomes) p_somm1,
					(Atomes) p_somm2);
		}else{
			throw new ChimereException(this,p_aret);
		}
	}
}
