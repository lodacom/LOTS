package projet.molecules;

import java.util.HashSet;

import projet.Aretes;
import projet.Graphes;
import projet.Sommets;
import projet.exceptions.ChimereException;

public class Molecules extends Graphes {

	public Molecules() {
		super();
	}
	
	public Molecules(String p_nom,HashSet<Sommets> p_sommets,HashSet<Aretes> p_aretes){
		super(p_nom, p_sommets, p_aretes);
	}
	
	public String toString(){
		return "La molécule "+super.nom_graphe+" est composé des atomes:"+
				super.listeSommets()+"et des liaisons: "+super.listeAretes();
	}
	
	public void createSommet(){
		Atomes a=new Atomes();
		addSommet(a);
	}
	
	public void createArete(Sommets p_somm1,Sommets p_somm2) throws ChimereException{
		Liaisons l=new Liaisons();
		if((p_somm1 instanceof Atomes) &&
			(p_somm2 instanceof Atomes)){
			addArete(l,p_somm1,p_somm2);
		}else{
			throw new ChimereException(this,p_somm1);
		}
	}
	
	public void createArete(Atomes p_somm1,Atomes p_somm2){
		Liaisons l=new Liaisons();
		try {
			addArete(l,p_somm1,p_somm2);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	
	/**
	 * @param p_aret
	 * @param p_somm1
	 * @param p_somm2
	 * @throws ChimereException
	 */
	public void addArete(Aretes p_aret,Sommets p_somm1,Sommets p_somm2) throws ChimereException{
		if ((p_aret instanceof Liaisons) &&
				(p_somm1 instanceof Atomes) &&
				(p_somm2 instanceof Atomes)){
			super.addArete((Liaisons)p_aret,
					(Atomes) p_somm1,
					(Atomes) p_somm2);
		}else{
			throw new ChimereException(this,p_aret);
		}
	}
	
	public void addArete(Liaisons p_aret,Atomes p_somm1,Atomes p_somm2) throws ChimereException{
		super.addArete(p_aret,p_somm1,p_somm2);
	}
	
	public void addSommet(Atomes p_somm,Liaisons p_aret){
		try {
			super.addSommet(p_somm, p_aret);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addSommet(Sommets p_somm,Aretes p_aret) throws ChimereException{
		if ((p_somm instanceof Atomes) &&
				(p_aret instanceof Liaisons)){
			super.addSommet((Atomes)p_somm,(Liaisons)p_aret);
		}else{
			throw new ChimereException(this,p_somm);
		}
	}
	
	public void addSommet(Atomes p_somm){
		try {
			super.addSommet(p_somm);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addSommet(Sommets p_somm) throws ChimereException{
		if (p_somm instanceof Atomes){
			super.addSommet((Atomes)p_somm);
		}else{
			throw new ChimereException(this,p_somm);
		}
	}
	
	public Atomes deleteSommet(Atomes p_sommet){
		return (Atomes)super.deleteSommet(p_sommet);
	}
	
	public Sommets deleteSommet(Sommets p_sommet){
		if(p_sommet instanceof Atomes){
			return super.deleteSommet((Atomes)p_sommet);
		}else{
			return null;
		}
	}
	
	public Liaisons deleteArete(Liaisons p_aret){
		return (Liaisons) super.deleteArete(p_aret);
	}
	
	public Aretes deleteArete(Aretes p_aret){
		if (p_aret instanceof Liaisons){
			return super.deleteArete((Liaisons)p_aret);
		}else{
			return null;
		}
	}
}
