package animal.domain;

public class Animal {

	
	
	private String nom = "";
	
	
	

	public Animal(String nom) {
		super();
		this.nom = nom;
	}
	
	public Animal() {
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	@Override
	public String toString() {
		
		if (nom=="") {
			return "Je suis un animal.";
		}
		return "Je suis un animal de nom " + nom+".";
	}
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		
		System.out.println(a1);
	}
	
}
