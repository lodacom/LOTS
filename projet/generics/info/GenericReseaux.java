package projet.generics.info;

import projet.exceptions.ChimereException;
import projet.generics.*;

public class GenericReseaux extends GenericGraphes<GenericReseaux,GenericNoeuds,GenericLiens> {

	public GenericReseaux() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
		return "Le réseau générique "+super.nom_graphe+" est composé des noeuds génériques:"+
				super.listeSommets()+"et des liens génériques: "+super.listeAretes();
	}
	
	public void addArete(GenericLiens p_aret){
		try {
			super.addArete(p_aret);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void createSommet(){
		GenericNoeuds n=new GenericNoeuds();
		addSommet(n);
	}
	
	
	public void createArete(GenericNoeuds p_somm1,GenericNoeuds p_somm2){
		GenericLiens l=new GenericLiens();
		try {
			super.addArete(l, p_somm1, p_somm2);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addArete(GenericLiens p_aret,GenericNoeuds p_somm1,GenericNoeuds p_somm2) throws ChimereException{
		super.addArete(p_aret, p_somm1, p_somm2);
	}
	
	public void addSommet(GenericNoeuds p_somm,GenericLiens p_aret){
		try {
			super.addSommet(p_somm, p_aret);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addSommet(GenericNoeuds p_somm){
		try {
			super.addSommet(p_somm);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public GenericNoeuds deleteSommet(GenericNoeuds p_sommet){
		return (GenericNoeuds) super.deleteSommet(p_sommet);
	}
	
	public GenericLiens deleteArete(GenericLiens p_aret){
		return (GenericLiens) super.deleteArete(p_aret);
	}
}
