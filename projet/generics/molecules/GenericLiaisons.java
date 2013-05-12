package projet.generics.molecules;

import projet.generics.GenericAretes;

public class GenericLiaisons extends GenericAretes<GenericMolecules,GenericAtomes,GenericLiaisons> {

	public GenericLiaisons() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GenericLiaisons(GenericMolecules p_mol, GenericAtomes p_ato1,GenericAtomes p_ato2) {
		super(p_mol,p_ato1,p_ato2);
	}
	
	public String toString(){
		return super.toString();
	}
	
	public void setSommets(GenericAtomes p_somm1,GenericAtomes p_somm2){
		super.setSommets(p_somm1, p_somm2);
	}
	
}
