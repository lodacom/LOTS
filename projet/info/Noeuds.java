package projet.info;

import projet.Aretes;
import projet.Sommets;
import projet.exceptions.ChimereException;
import projet.info.Liens;

public class Noeuds extends Sommets {

	public Noeuds() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Noeuds(Reseaux p_mol) {
		super(p_mol);
	}
	
	public void createArete(Sommets p_somm2) throws ChimereException{
		Liens l=new Liens();
		addArete(l);
		if (p_somm2 instanceof Noeuds){
			p_somm2.addArete(l);
			l.setSommets(this, p_somm2);
		}else{
			throw new ChimereException(this,l);
		}
	}
	
	public void createArete(Noeuds p_somm2){
		Liens l=new Liens();
		try{
		addArete(l);
		p_somm2.addArete(l);
		}catch (ChimereException e){
			e.getMessage();
		}
		l.setSommets(this, p_somm2);
	}
	
	public void addArete(Aretes p_aret) throws ChimereException{
		if (p_aret instanceof Liens){
			super.addArete((Liens)p_aret);
		}else{
			throw new ChimereException(this,p_aret);
		}
	}
	
	public void addArete(Liens p_aret) throws ChimereException{
		super.addArete(p_aret);
	}
	
	public String toString(){
		return super.toString();
	}
}
