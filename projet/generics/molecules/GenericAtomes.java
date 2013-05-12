package projet.generics.molecules;

import projet.Aretes;
import projet.Sommets;
import projet.exceptions.ChimereException;
import projet.generics.GenericGraphes;
import projet.generics.GenericSommets;

public class GenericAtomes extends GenericSommets<GenericMolecules,GenericAtomes,GenericLiaisons> {

	public GenericAtomes() {
		super();
	}
	
	public GenericAtomes(GenericMolecules p_mol) {
		super(p_mol);
	}
	
	public void createArete(GenericAtomes p_somm2){
		GenericLiaisons l=new GenericLiaisons();
		addArete(l);
		p_somm2.addArete(l);
		l.setSommets(this, p_somm2);
	}
	
	public void addArete(GenericLiaisons p_aret){
		try {
			super.addArete(p_aret);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String toString(){
		return super.toString();
	}
}
