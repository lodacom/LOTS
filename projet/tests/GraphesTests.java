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

	public static Graphes grape=new Graphes();
	public Sommets somm1;
	public Sommets somm2;
	public Aretes aret;
	
	@Parameters
	public static Collection<Object[]> jeuxTests(){
		return Arrays.asList(new Object [][]
				{
					{
						new Sommets(grape),
						new Sommets(grape),
						new Aretes(grape,new Sommets(grape),new Sommets(grape))
					},
					{
						new Sommets(grape),
						new Sommets(grape),
						new Aretes(grape,new Sommets(grape),new Sommets(grape))
					}
				}
				);
	}
	
	public GraphesTests(Sommets p_somm1,Sommets p_somm2,Aretes p_arete){
		somm1=p_somm1;
		somm2=p_somm2;
		aret=p_arete;
	}
	
	@Test
	public void testAddSommet(){
		try {
			grape.addSommet(somm1);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(somm1.getSommet_dans().nom_graphe,grape.nom_graphe);
	}
	
	@Test
	public void testAddArete(){
		try {
			grape.addArete(aret,somm1,somm2);
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
		assertNotNull(grape.deleteSommet(somm1));
		assertNull(somm1.getSommet_dans());
	}
	
	@Test
	public void testDeleteArete(){
		assertNotNull(grape.deleteArete(aret));
		assertNull(aret.getArete_dans());
	}
}
