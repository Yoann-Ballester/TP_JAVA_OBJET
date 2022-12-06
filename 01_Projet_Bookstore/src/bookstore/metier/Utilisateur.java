package bookstore.metier;

import java.text.ParseException;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;






public class Utilisateur extends Personne  {

	private String idUtilisateur;
	private Livre emprunt;
	private ArrayList<Livre> livres =  new ArrayList<>();

	private int dureeMaxPret = 15;

	public Utilisateur(String nom, String prenom, String idUtilisateur, Livre emprunt) {
		super(nom,prenom);
		this.idUtilisateur = idUtilisateur;
		this.emprunt = emprunt;
	}
	
	

	public Utilisateur(String nom, String prenom, String idUtilisateur) {
		super(nom,prenom);
		
		this.idUtilisateur = idUtilisateur;
	}
	
	public Utilisateur() {
		super();
		
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
	
	

	public ArrayList<Livre> getLivres() {
		return livres;
	}



	public void setLivres(ArrayList<Livre> livres) {
		this.livres = livres;
	}



	public static String IsPretEnRetard(String dateEmprunt) throws ParseException {
		
		 LocalDate dateEmp = LocalDate.parse(dateEmprunt, DateTimeFormatter.ISO_LOCAL_DATE);
	     LocalDate dateRendu = LocalDate.now();

	     Duration diff = Duration.between(dateRendu.atStartOfDay(), dateEmp.atStartOfDay());
	     long difference = diff.toDays();
		 
	     System.out.println(difference + " jours");
		
		if(difference>=-15) {
		return "Le pret n'est pas en retard";
		}else {
			return "Le pret est en retard";
		}
	}

	@Override
	public String toString() {
		return super.toString()+", idUtilisateur=" + idUtilisateur + "\n\nemprunt=\n"
				+ emprunt + "\nListe emprunt="+livres + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Utilisateur u1 = new Utilisateur("Toto", "Titi", "123");
		
		System.out.println(u1);
		
	}

	@Override
	public void parle() {
		System.out.println("Travail terminé!");

	}
	
	public void addLivres(ArrayList<Livre> livre) {
		this.livres = livre;
	}
	
	public void addLivre(Livre livre) {
		this.livres.add(livre);
	}

	
}
