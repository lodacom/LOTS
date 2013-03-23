package projet.generics;

import projet.Aretes;
import projet.Sommets;

/**
 * <pre>
 * Classe générique pour les graphes. Le paramètre S correspondra au 
 * type concret {@link Sommets} (et ses sous-types). Le paramètre A
 * correspondra au type concret {@link Aretes} (et ses sous types)
 * </pre>
 * @author Lolo
 *
 * @param <S> type générique (son type concret sera {@link Sommets})
 * @param <A> type générique (son type concret sera {@link Aretes})
 */
public class GenericGraphes<S extends Sommets,A extends Aretes> {
	public S sommets;
	public A aretes;
	
	public GenericGraphes(S p_sommets,A p_aretes){
		sommets=p_sommets;
		aretes=p_aretes;
	}
}
