package animal.domain;

public class Mammifere extends Animal{
	
	public Mammifere(String nom) throws AnimalException {
		super(nom);
	}
	
	 public Mammifere() {
		
		super();
	}
	
	@Override
	public String toString() {
	
		return super.toString() + " Je suis un mammifere.";
	}
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Mammifere m;
		try {
			m = new Mammifere("Patataaaaaa");
			System.out.println(m);
		} catch (AnimalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
