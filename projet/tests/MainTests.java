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
		Aretes p_arete=new Aretes(grape,p_somm1,p_somm2);
		
		try {
			grape.addArete(p_arete,p_somm1,p_somm2);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(grape.toString());
	}

}
