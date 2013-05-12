package projet.generics.molecules;

import projet.exceptions.ChimereException;
import projet.generics.*;

public class GenericMolecules extends GenericGraphes<GenericMolecules,GenericAtomes,GenericLiaisons> {

	public GenericMolecules() {
		super();
	}
	
	public String toString(){
		return "La molécule générique "+super.nom_graphe+" est composé des atomes génériques:"+
				super.listeSommets()+"et des liaisons génériques: "+super.listeAretes();
	}
	
	public void createSommet(){
		GenericAtomes a=new GenericAtomes();
		addSommet(a);
	}
	
	public void createArete(GenericAtomes p_somm1,GenericAtomes p_somm2){
		GenericLiaisons l=new GenericLiaisons();
		try {
			addArete(l,p_somm1,p_somm2);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addArete(GenericLiaisons p_aret){
		try {
			super.addArete(p_aret);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addArete(GenericLiaisons p_aret,GenericAtomes p_somm1,GenericAtomes p_somm2) throws ChimereException{
		super.addArete(p_aret,p_somm1,p_somm2);
	}
	
	public void addSommet(GenericAtomes p_somm,GenericLiaisons p_aret){
		try {
			super.addSommet(p_somm, p_aret);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addSommet(GenericAtomes p_somm){
		try {
			super.addSommet(p_somm);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public GenericAtomes deleteSommet(GenericAtomes p_sommet){
		return (GenericAtomes)super.deleteSommet(p_sommet);
	}
	
	public GenericLiaisons deleteArete(GenericLiaisons p_aret){
		return (GenericLiaisons) super.deleteArete(p_aret);
	}
}
