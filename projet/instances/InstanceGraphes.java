package projet.instances;

import projet.Aretes;
import projet.Sommets;
import projet.generics.GenericGraphes;

/**
 * <pre>
 * Classe permettant "l'instance" de manière implicite la classe
 * générique {@link GenericGraphes}
 * </pre>
 * @author Lolo
 *
 */
public class InstanceGraphes extends GenericGraphes<Sommets,Aretes>{
	
	public InstanceGraphes(Sommets p_sommets,Aretes p_aretes){
		super(p_sommets,p_aretes);
	}
}
