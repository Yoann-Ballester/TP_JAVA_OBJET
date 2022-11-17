package bookstore.metier;

public class Utilisateur extends Personne implements Nommable {

	private String idUtilisateur;
	private Livre emprunt;

	private int dureeMaxPret = 15;

	public Utilisateur(String nom, String prenom, String idUtilisateur, Livre emprunt) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.idUtilisateur = idUtilisateur;
		this.emprunt = emprunt;
	}

	public Utilisateur(String nom, String prenom, String idUtilisateur) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.idUtilisateur = idUtilisateur;
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(String idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public Livre getEmprunt() {
		return emprunt;
	}

	public void setEmprunt(Livre emprunt) {
		this.emprunt = emprunt;
	}

	public int getDureeMaxPret() {
		return dureeMaxPret;
	}

	public void setDureeMaxPret(int dureeMaxPret) {
		this.dureeMaxPret = dureeMaxPret;
	}

	public boolean IsPretEnRetard() {

		return true;
	}

	@Override
	public String toString() {
		return "Utilisateur [nom=" + nom + ", prenom=" + prenom + ", idUtilisateur=" + idUtilisateur + "\n\nemprunt=\n"
				+ emprunt + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void parle() {
		System.out.println("Travail terminé!");

	}

}
