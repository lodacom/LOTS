package projet.molecules;

import projet.Aretes;
import projet.Sommets;

public class Liaisons extends Aretes {

	public Liaisons() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Liaisons(Molecules p_mol, Atomes p_ato1,Atomes p_ato2) {
		super(p_mol,p_ato1,p_ato2);
	}
	
	public String toString(){
		return super.toString();
	}
	
	public void setSommets(Atomes p_somm1,Atomes p_somm2){
		super.setSommets(p_somm1, p_somm2);
	}
	
	public void setSommets(Sommets p_somm1,Sommets p_somm2){
		if ((p_somm1 instanceof Sommets) &&
			(p_somm2 instanceof Sommets)){
			super.setSommets((Atomes)p_somm1, (Atomes)p_somm2);
		}
	}
}
