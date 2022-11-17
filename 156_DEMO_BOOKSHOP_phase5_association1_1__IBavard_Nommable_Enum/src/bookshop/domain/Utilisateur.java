package bookshop.domain;

public class Utilisateur implements IBavard, Nommable{
	private String nom;
	private String prenom;
	private String idUtilisateur;
	private Livre emprunt;//association
	
	public Utilisateur(String nom, String prenom, String idUtilisateur, Livre emprunt) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.idUtilisateur = idUtilisateur;
		this.emprunt = emprunt;
	}
	public Utilisateur() {
		this("nom_inconnu","prenom_inconnu","utilisateur_inconnu",null);
//		this.nom = "nom_inconnu";
//		this.prenom = "prenom_inconnu";
//		this.idUtilisateur = "utilisateur_inconnu";
//		this.emprunt = null;
	}
	@Override
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getIdUtilisateur() {
		return idUtilisateur;
	}

	public Livre getEmprunt() {
		return emprunt;
	}



	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setIdUtilisateur(String idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public void setEmprunt(Livre emprunt) {
		this.emprunt = emprunt;
	}



	@Override
	public String toString() {
		return "Utilisateur [nom=" + nom + ", prenom=" + prenom + ", idUtilisateur=" + idUtilisateur + ", emprunt="
				+ " titre_livre =" + ( emprunt == null ?"pas de livre":emprunt.getTitre()) + "]";
	}
	@Override
	public void parle() {
		System.out.println("La cotisation est trop chère");		
	}
	
	public String findTitreLivreCourant() {
		String retour=null;
		
		if( getEmprunt()!= null)
			retour =  getEmprunt().getTitre();
		else
			retour =  "Pas de livre emprunté";
		return retour;	}
	
	
	public static void main(String[] args) {
		Utilisateur u1 = new Utilisateur("MARIE JOSEPH", "Carthy", "34890",null);
		System.out.println("toString() de utilisateur u1 :" + u1);

		System.out.print("L\'utilisateur " + u1.getNom()+ "  "+ u1.getIdUtilisateur() + " dit :");u1.parle();
	
		IBavard b = u1;//transtypage ascendant//up casting  //cast implicite
		//System.out.print("L\'utilisateur " + b.getNom()+ "  "+ b.getIdUtilisateur() + " dit :");b.parle();

		Utilisateur u2 = (Utilisateur) b;//down-casting//cast explicite
		System.out.print("L\'utilisateur " + u2.getNom()+ "  "+ u2.getIdUtilisateur() + " dit :");u2.parle();

	}

}
