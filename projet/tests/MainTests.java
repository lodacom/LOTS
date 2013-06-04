package projet.tests;

import projet.*;
import projet.exceptions.ChimereException;
import projet.generics.molecules.GenericAtomes;
import projet.generics.molecules.GenericLiaisons;
import projet.generics.molecules.GenericMolecules;
import projet.molecules.*;

public class MainTests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graphes grape=new Graphes();
		Sommets p_somm1=new Sommets();
		Sommets p_somm2=new Atomes();
		Sommets p_somm3=new Sommets();
		Aretes p_arete=new Aretes();
		Aretes p_arete2=new Aretes();
		Aretes p_arete3=new Aretes();
		
		try {
			grape.addSommet(p_somm2);
			//grape.addArete(p_arete,p_somm1,p_somm2);
			grape.addArete(p_arete2,p_somm1,p_somm3);
			//grape.addArete(p_arete3,p_somm2,p_somm3);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(grape.toString());
		System.out.println(grape.descriptionGraphe());
		
		Molecules mol=new Molecules();
		Sommets p_somm4=new Atomes();
		Sommets p_somm5=new Atomes();
		Liaisons p_arete4= new Liaisons();
		try {
			mol.addArete(p_arete4, p_somm4, p_somm5);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("............................................");
		System.out.println(mol.toString());
		System.out.println(mol.descriptionGraphe());
		
		GenericMolecules molG=new GenericMolecules();
		GenericAtomes p_somm6=new GenericAtomes();
		GenericAtomes p_somm7=new GenericAtomes();
		GenericLiaisons p_arete5=new GenericLiaisons();
		try {
			molG.addArete(p_arete5, p_somm6, p_somm7);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("............................................");
		System.out.println(molG.toString());
		System.out.println(molG.descriptionGraphe());
	}

}
