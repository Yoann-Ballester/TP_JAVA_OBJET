package animal.domain;

public class Mammifere extends Animal{
	
	public Mammifere(String nom) {
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

		
		Mammifere m = new Mammifere("Patate");
		System.out.println(m);
	}

}
