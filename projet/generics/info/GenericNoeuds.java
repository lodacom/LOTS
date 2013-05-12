package projet.generics.info;

import projet.exceptions.ChimereException;
import projet.generics.*;

public class GenericNoeuds extends GenericSommets<GenericReseaux,GenericNoeuds,GenericLiens> {

	public GenericNoeuds() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GenericNoeuds(GenericReseaux p_mol) {
		super(p_mol);
	}
	
	public void createArete(GenericNoeuds p_somm2){
		GenericLiens l=new GenericLiens();
		try{
		addArete(l);
		p_somm2.addArete(l);
		}catch (ChimereException e){
			e.getMessage();
		}
		l.setSommets(this, p_somm2);
	}
	
	public void addArete(GenericLiens p_aret) throws ChimereException{
		super.addArete(p_aret);
	}
	
	public String toString(){
		return super.toString();
	}
}
