package animal;

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

	}

}
