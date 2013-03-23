package projet.generics;

import projet.Graphes;

/**
 * <pre>
 * Classe générique pour les sommets. Le paramètre G correspondra
 * au type concret {@link Graphes} (et ses sous-types).
 * </pre>
 * @author Lolo
 *
 * @param <G> type générique (son type concret sera {@link Graphes})
 */
public class GenericSommets<G extends Graphes> {

	public G graphes;
	
	public GenericSommets(G p_graphes){
		graphes=p_graphes;
	}
}
