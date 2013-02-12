package animal;

/**
 * @author Lolo
 * @version 1.0
 * Fait sous Eclipse Juno, OS: Mac OS X
 */
public class TestAnimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani=new Herbivore("Vache");
		Aliment ali=new Aliment("herbe");
		try {
			ani.mange(ali);
		} catch (AlimentException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		
		Herbivore her=new Herbivore("Vache");
		Herbe mach=new Herbe("herbe");
		her.mange(mach);
		
		Animal ani2=new Herbivore("Vache");
		Aliment ali2=new Herbe("herbe");
		try {
			ani2.mange(ali2);
		} catch (AlimentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
