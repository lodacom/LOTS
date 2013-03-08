package projet.info;

import java.util.HashSet;

import projet.Aretes;
import projet.Graphes;
import projet.Sommets;
import projet.exceptions.ChimereException;
import projet.info.Noeuds;
import projet.info.Liens;

public class Reseaux extends Graphes {

	public Reseaux() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Reseaux(String p_nom,HashSet<Sommets> p_sommets,HashSet<Aretes> p_aretes){
		super(p_nom, p_sommets, p_aretes);
	}
	
	public String toString(){
		return "Le réseau "+super.nom_graphe+" est composé des noeuds:"+
				super.listeSommets()+"et des liens: "+super.listeAretes();
	}
	
	public void addArete(Liens p_aret){
		try {
			super.addArete(p_aret);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void createSommet(){
		Noeuds n=new Noeuds();
		addSommet(n);
	}
	
	public void createArete(Sommets p_somm1,Sommets p_somm2) throws ChimereException{
		Liens l=new Liens();
		if ((p_somm1 instanceof Noeuds) &&
			(p_somm2 instanceof Noeuds)){
			super.addArete(l, (Noeuds)p_somm1, (Noeuds)p_somm2);
		}else{
			throw new ChimereException(this,p_somm1);
		}
	}
	
	public void createArete(Noeuds p_somm1,Noeuds p_somm2){
		Liens l=new Liens();
		try {
			super.addArete(l, p_somm1, p_somm2);
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
		if ((p_aret instanceof Liens) &&
				(p_somm1 instanceof Noeuds) &&
				(p_somm2 instanceof Noeuds)){
			super.addArete((Liens)p_aret,
					(Noeuds) p_somm1,
					(Noeuds) p_somm2);
		}else{
			throw new ChimereException(this,p_aret);
		}
	}
	
	public void addArete(Liens p_aret,Noeuds p_somm1,Noeuds p_somm2) throws ChimereException{
		super.addArete(p_aret, p_somm1, p_somm2);
	}
	
	public void addSommet(Noeuds p_somm,Liens p_aret){
		try {
			super.addSommet(p_somm, p_aret);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addSommet(Sommets p_somm,Aretes p_aret) throws ChimereException{
		if ((p_somm instanceof Noeuds) &&
				(p_aret instanceof Liens)){
			super.addSommet((Noeuds)p_somm,(Liens)p_aret);
		}else{
			throw new ChimereException(this,p_somm);
		}
	}
	
	public void addSommet(Noeuds p_somm){
		try {
			super.addSommet(p_somm);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addSommet(Sommets p_somm) throws ChimereException{
		if (p_somm instanceof Noeuds){
			super.addSommet((Noeuds)p_somm);
		}else{
			throw new ChimereException(this,p_somm);
		}
	}
	
	public Noeuds deleteSommet(Noeuds p_sommet){
		return (Noeuds)super.deleteSommet(p_sommet);
	}
	
	public Sommets deleteSommet(Sommets p_sommet){
		if(p_sommet instanceof Noeuds){
			return super.deleteSommet((Noeuds)p_sommet);
		}else{
			return null;
		}
	}
	
	public Liens deleteArete(Liens p_aret){
		return (Liens) super.deleteArete(p_aret);
	}
	
	public Aretes deleteArete(Aretes p_aret){
		if (p_aret instanceof Liens){
			return super.deleteArete((Liens)p_aret);
		}else{
			return null;
		}
	}
}
