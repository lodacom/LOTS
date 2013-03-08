package projet.molecules;

import projet.Aretes;
import projet.Sommets;
import projet.exceptions.ChimereException;

public class Atomes extends Sommets {

	public Atomes() {
		super();
	}
	
	public Atomes(Molecules p_mol) {
		super(p_mol);
	}
	
	public void addArete(Aretes p_aret) throws ChimereException{
		if (p_aret instanceof Liaisons){
			super.addArete((Liaisons)p_aret);
		}else{
			throw new ChimereException(this,p_aret);
		}
	}
	
	public String toString(){
		return super.toString();
	}
}
