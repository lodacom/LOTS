package projet.info;

import projet.Aretes;
import projet.Sommets;
import projet.info.Noeuds;
import projet.info.Reseaux;

public class Liens extends Aretes {

	public Liens() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Liens(Reseaux p_res, Noeuds p_noeud1,Noeuds p_noeud2) {
		super(p_res,p_noeud1,p_noeud2);
	}
	
	public String toString(){
		return super.toString();
	}
	
	public void setSommets(Noeuds p_somm1,Noeuds p_somm2){
		super.setSommets(p_somm1, p_somm2);
	}
	
	public void setSommets(Sommets p_somm1,Sommets p_somm2){
		if ((p_somm1 instanceof Noeuds) &&
			(p_somm2 instanceof Noeuds)){
			super.setSommets((Noeuds)p_somm1, (Noeuds)p_somm2);
		}
	}
}
