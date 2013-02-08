package animal;

public class Herbivore extends Animal {

	public Herbivore(String p_nom) {
		super(p_nom);
		// TODO Auto-generated constructor stub
	}
	
	public void mange(Aliment ali) throws AlimentException{
		if (ali instanceof Herbe){
			super.mange(ali);
		}else{
			throw new AlimentException(this,ali);
		}
	}
	
	/**
	 * @param ali
	 * Cette méthode mange permet d'éviter de passer par la vérification
	 * de la méthode au-dessus si le type statique de l'aliment est bien
	 * Herbe
	 */
	public void mange(Herbe ali){
		try {
			super.mange(ali);
		} catch (AlimentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	public String toString(){
		return super.nom;
	}

}
