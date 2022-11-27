package bookstore.metier;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Livre implements Comparable<Livre> {
	
	
	// var
	private String titre, auteur;
	private int nbPages;
	private double PrixL= -1;	
	private boolean prixFixe=false;
	private boolean disponible=true;
	private TypeDonneesAnnee annee;
	Status status = Status.DISPONIBLE;
	Date dateEmprunt;
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	
	
	static Comptable comptable = new Comptable();
	
	
	// contructeur
	
			
	
	
	public Livre(String unAuteur, String unTitre, int Pages, double Prix, Date dateEmp, TypeDonneesAnnee dparution) {
		auteur = unAuteur;
		titre = unTitre;
		nbPages = Pages;
		
		setPrix(Prix);
		dateEmprunt=dateEmp;
		annee=dparution;
		
		//Comptable.comptabilise(this);
		
	}
	
	public Livre(String unAuteur, String unTitre, int Pages,double Prix) {
		auteur = unAuteur;
		titre = unTitre;
		nbPages = Pages;
		setPrix(Prix);
	}
	
	
	
	public Livre(String unAuteur, String unTitre, int Pages) {
		auteur = unAuteur;
		titre = unTitre;
		nbPages = Pages;
		
		
	}
	
	public Livre(String unAuteur, String unTitre) {
		auteur = unAuteur;
		titre = unTitre;
		
		
	}
	
	public Livre() {
		
	}
	
	
	
	
	public boolean isDisponible() {
		
		if(status==Status.DISPONIBLE) {
		return true;
		}else if (status==Status.PRETE) {
			return false;
		}else {
			return false;
		}
	}

	

	

	// accesseur
	public TypeDonneesAnnee getAnnee() {
		return annee;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public String getAuteur( ) {
		return auteur;
	}
	
	public String getTitre( ) {
		return titre;
	}
	
	public int getNbPages( ) {
		
		return nbPages;
	}
	
	
	public double getPrix( ) {
		return PrixL;
	}
	

	public Date getDateEmprunt() {
		return dateEmprunt;
	}





	


	public void afficheToi() {
		
		toString();
	}
	
	// mutateur
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public void setNBpages(int n) {
		
		if (n<0) {
			System.err.print("erreur n ne peut pas etre negatif");
			return;
		}
		nbPages = n;
	}
	
	public void setAuteur(String a) {
		auteur = a;
	}
	
	public void setTitre(String b) {
		titre = b;
	}
	
	public void setPrix(double c) {
		if (c <0)
		{
			System.err.print("non");
			return;
		}
		if (prixFixe)
		{
			System.err.println("Le prix est fixé");
			return;
		}
		
		
		PrixL = c;
		prixFixe = true;
		
		comptable.comptabilise(this);
		
	}
	
	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	
	


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public void setAnnee(TypeDonneesAnnee annee) {
		this.annee = annee;
	}

		
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nbPages);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livre other = (Livre) obj;
		return nbPages == other.nbPages;
	}


	public int compare(Livre obj) {
		
		if (this.nbPages==obj.nbPages ) {
			return 0;
		}
		else if (this.nbPages>obj.nbPages) {
			return 1;
		}else {
			return -1;
		}
		
		
		
	}	

	@Override
	public int compareTo(Livre livre) {
		if (this.nbPages==livre.nbPages ) {
			return 0;
		}
		else if (this.nbPages>livre.nbPages) {
			return 1;
		}else {
			return -1;
		}
	}


	
	@Override public String toString() {
		
		if (PrixL<0) {
			return("Auteur :"+ auteur+"\n" + "titre : "+ titre +"\n"+ "nombre de pages : "+ nbPages + " \nPrix : "+ "Prix indertermine" + "\ndate emprunt : "+ dateEmprunt + "\nStatut : "+status +"\ndate de parution : "+annee);
		}
			
		else {
			return("Auteur :"+ auteur+"\n" + "titre : "+ titre +"\n"+ "nombre de pages : "+ nbPages + " \nPrix : "+ new DecimalFormat("#.##").format(PrixL)  +"\ndate emprunt : "+ dateEmprunt + "\nStatut : "+status +"\ndate de parution : "+annee);
		}
		
	}
	
	
		public static double getTotalPrix() {
		
		return Comptable.getTotalPrix();
	}

	
	public static void main(String[] args) {
		
		
	}


	


}
