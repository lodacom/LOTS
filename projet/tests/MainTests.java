package projet.tests;

import projet.Aretes;
import projet.Graphes;
import projet.Sommets;
import projet.exceptions.ChimereException;

public class MainTests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graphes grape=new Graphes();
		Sommets p_somm1=new Sommets();
		Sommets p_somm2=new Sommets();
		Sommets p_somm3=new Sommets();
		Aretes p_arete=new Aretes(grape,p_somm1,p_somm2);
		Aretes p_arete2=new Aretes(grape,p_somm1,p_somm3);
		Aretes p_arete3=new Aretes(grape,p_somm2,p_somm3);
		
		try {
			grape.addArete(p_arete,p_somm1,p_somm2);
			grape.addArete(p_arete2,p_somm1,p_somm3);
			grape.addArete(p_arete3,p_somm2,p_somm3);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(grape.toString());
		System.out.println(grape.descriptionGraphe());
	}

}
