package animal.domain;

public class Chien extends Mammifere{

	public Chien(String nom) throws AnimalException{
		super(nom);
	}
	
	 public Chien() {
		
		super();
	}


	@Override
	public String toString() {
		return super.toString() + " Je suis un chien";
	}

	
	public String parle() {
		return (getNom() + " parle :" + "WOUF WOUF");
	}
	

	public static void main(String[] args) {
		
		Chien c1;
		try {
			c1 = new Chien("medor");
			System.out.println(c1.parle());
		} catch (AnimalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
