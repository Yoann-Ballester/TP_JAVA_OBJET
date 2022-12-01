package bookstore.metier;

public abstract class Personne implements Ibavard{

	protected String nom;
	protected String prenom;
	
	

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Personne() {
		super();
	}

	@Override
	public abstract void parle();
	
	
	
	@Override
	public String toString() {
		return "[nom=" + nom + ", prenom=" + prenom +"]";
	}

	public static void main(String[] args) {
		
		
//		Personne p1 = new Personne("Jean Patrick", "le dingo");
//		
//		System.out.println(p1);
//		p1.parle();
	}

}