package bookstore.metier;

public class Auteur extends Personne{
	
	
	
	public Auteur(String prenom, String nom) {
		super(prenom,nom);
		
	}

	
	

	@Override
	public String toString() {
		return "Auteur [nom=" + nom + ", prenom=" + prenom + "]";
	}

	@Override
	public void parle() {
		System.out.println("Argent");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auteur a1 = new Auteur("Toto", "leDeglingo");
		
		System.out.println(a1.getPrenom()+" "+ a1.getNom()+" dit : ");
		a1.parle();
	}

	
	

}
