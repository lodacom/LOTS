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

	public static Molecules mol=new Molecules();
	public Liaisons lien;
	public Atomes ato1;
	public Atomes ato2;
	
	@Parameters
	public static Collection<Object[]> jeuxTests(){
		return Arrays.asList(new Object [][]
				{
					{
						new Atomes(mol),
						new Atomes(mol),
						new Liaisons(mol,new Atomes(mol),new Atomes(mol))
					}
				}
				);
	}
	
	public MoleculesTests(Atomes p_ato1,Atomes p_ato2,Liaisons p_lien){
		ato1=p_ato1;
		ato2=p_ato2;
		lien=p_lien;
	}
	
	@Test
	public void testAddAtome() {
		mol.addSommet(ato1);
		assertEquals(ato1.getSommet_dans().nom_graphe,mol.nom_graphe);
	}
	
	@Test
	public void testAddLiaison(){
		mol.addArete(lien);
		assertEquals(lien.getArete_dans().nom_graphe,mol.nom_graphe);
	}
	
	@Test
	public void affichage(){
		System.out.println(mol.toString());
	}
}
