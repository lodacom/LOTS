package projet.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import projet.exceptions.ChimereException;
//................................................
import projet.molecules.Atomes;
import projet.molecules.Liaisons;
import projet.molecules.Molecules;

@RunWith(Parameterized.class)
public class MoleculesTests {

	public static Molecules mol=new Molecules("virus");
	public Liaisons lien;
	public Atomes ato;
	
	@Parameters
	public static Collection<Object[]> jeuxTests(){
		return Arrays.asList(new Object [][]
				{
					{new Atomes("A",mol),new Liaisons("Coucou",mol)}
				}
				);
	}
	
	public MoleculesTests(Atomes p_ato,Liaisons p_lien){
		ato=p_ato;
		lien=p_lien;
	}
	
	@Test
	public void testAddAtome() {
		mol.addSommet(ato);
		assertEquals(ato.getSommet_dans().nom_graphe,mol.nom_graphe);
	}
	
	@Test
	public void testAddLiaison(){
		try {
			mol.addArete(lien);
		} catch (ChimereException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(lien.getArete_dans().nom_graphe,mol.nom_graphe);
	}
	
	@Test
	public void affichage(){
		System.out.println(mol.toString());
	}
}
