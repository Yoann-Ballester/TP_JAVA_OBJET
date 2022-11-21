package animal.domain;

public  class Animal implements Nommable, Comparable<Animal> {

	private String nom = "";

	public Animal(String nom) {
		super();
		this.nom = nom;
	}

	public Animal() {

	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {

		if (nom == "") {
			return "Je suis un animal.";
		}
		return "Je suis un animal de nom " + nom + ".";
	}

	public  String parle() {
		return (nom + " parle :" + "brrrrrrrrrrrrrrrrrrrrrrr");
	}

	public static void main(String[] args) {

//		Animal a1 = new Animal("patrick");
//		Animal a2 = new Animal("gege");
//
//		
//	System.out.println(a1.compareTo(a2));
	}

	@Override
	public int compareTo(Animal obj) {
		// TODO Auto-generated method stub

		if (obj.getNom().charAt(0)<this.getNom().charAt(0)) {

			return 1;
		}
		
		else if (obj.getNom().charAt(0)==this.getNom().charAt(0)) {
		return 0;
		}else {
			
			return -1;
		}
		
		
	}

}
