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
	
	public void createArete(Sommets p_somm2) throws ChimereException{
		Liaisons l=new Liaisons();
		addArete(l);
		if (p_somm2 instanceof Atomes){
			p_somm2.addArete(l);
			l.setSommets(this, p_somm2);
		}else{
			throw new ChimereException();
		}
	}
	
	public void createArete(Atomes p_somm2){
		Liaisons l=new Liaisons();
		addArete(l);
		p_somm2.addArete(l);
		l.setSommets(this, p_somm2);
	}
	
	public void addArete(Aretes p_aret) throws ChimereException{
		if (p_aret instanceof Liaisons){
			super.addArete((Liaisons)p_aret);
		}else{
			throw new ChimereException();
		}
	}
	
	public void addArete(Liaisons p_aret){
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
