package projet.generics.info;

import projet.generics.*;

public class GenericLiens extends GenericAretes<GenericReseaux,GenericNoeuds,GenericLiens> {

	public GenericLiens() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GenericLiens(GenericReseaux p_res, GenericNoeuds p_noeud1,GenericNoeuds p_noeud2) {
		super(p_res,p_noeud1,p_noeud2);
	}
	
	public String toString(){
		return super.toString();
	}
	
	public void setSommets(GenericNoeuds p_somm1,GenericNoeuds p_somm2){
		super.setSommets(p_somm1, p_somm2);
	}
}
