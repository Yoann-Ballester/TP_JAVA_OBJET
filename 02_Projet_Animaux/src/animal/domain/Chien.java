package animal.domain;

public class Chien extends Animal{

	public Chien(String nom) {
		super(nom);
	}
	
	 public Chien() {
		
		super();
	}


	@Override
	public String toString() {
		return "Je suis un chien de nom "+getNom()+".";
	}


	public static void main(String[] args) {
		
		Chien c1 = new Chien("medor");
		
		System.out.println(c1);
		
	}
}
