package projet.tests;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
//................................................
import projet.Aretes;
import projet.Graphes;
import projet.Sommets;
import projet.exceptions.ChimereException;

/**
 * Classe de test pour les graphes fait en JUnit.
 * @author Lolo
 * @version 1.0
 */
@RunWith(Parameterized.class)
public class GraphesTests {

	public static Graphes grape=new Graphes("essai");
	public Sommets somm;
	public Aretes aret;
	
	@Parameters
	public static Collection<Object[]> jeuxTests(){
		return Arrays.asList(new Object [][]
				{
					{new Sommets("A",grape),new Aretes("Coucou",grape)},
					{new Sommets("B",grape),new Aretes("Salut",grape)}
				}
				);
	}
	
	public GraphesTests(Sommets p_somm,Aretes p_arete){
		somm=p_somm;
		aret=p_arete;
	}
	
	@Test
	public void testAddSommet(){
		grape.addSommet(somm);
		assertEquals(somm.getSommet_dans().nom_graphe,grape.nom_graphe);
	}
	
	@Test
	public void testAddArete(){
		try {
			grape.addArete(aret);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(aret.getArete_dans().nom_graphe,grape.nom_graphe);
	}
	
	@Test
	public void affichage(){
		System.out.println(grape.toString());
	}
	
	@Test
	public void testDeleteSommet(){
		grape.deleteSommet(somm);
		assertNull(somm.getSommet_dans());
	}
	
	@Test
	public void testDeleteArete(){
		grape.deleteArete(aret);
		assertNull(aret.getArete_dans());
	}
}
