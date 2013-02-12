package projet.molecules;

import projet.Sommets;

public class Atomes extends Sommets {

	public Atomes(String p_nom_sommet) {
		super(p_nom_sommet);
	}
	
	public Atomes(String p_nom_sommet, Molecules p_mol) {
		super(p_nom_sommet, p_mol);
	}

	public String toString(){
		return super.toString();
	}
}
