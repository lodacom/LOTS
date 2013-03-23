package projet.generics;

import projet.Graphes;
import projet.Sommets;

/**
 * <pre>
 * Classe générique pour les arêtes. Le paramètre G correspondra
 * au type concret {@link Graphes} (et ses sous-types). Le paramètre S
 * correspondra au type concret {@link Sommets} (et ses sous-types).
 * </pre>
 * @author Lolo
 *
 * @param <G> type générique (son type concret sera Graphes)
 * @param <S> type générique (son type concret sera Sommets)
 */
public class GenericAretes<G extends Graphes,S extends Sommets> {
	public G graphes;
	public S sommmets1;
	public S sommets2;
	
	public GenericAretes(G p_graphes,S p_sommets1,S p_sommets2){
		graphes=p_graphes;
		sommmets1=p_sommets1;
		sommets2=p_sommets2;
	}
}
