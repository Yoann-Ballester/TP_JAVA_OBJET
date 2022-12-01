package commande.domain;

import java.text.ParseException;
import java.util.*;

/**
 * 
 */
public class Personne {

	/**
	 * Default constructor
	 */
	public Personne() {
	}

	/**
	 * 
	 */
	private String nom;

	/**
	 * 
	 */
	private String prenom;

	/**
	 * 
	 */
	private Date dateNaiss;

	public Personne(String nom, String prenom, Date dateNaiss, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.age = age;
	}
	
	

	public Personne(String nom, String prenom, Date dateNaiss) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
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

	public Date getDateNaiss() {
		return dateNaiss;
	}

	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	public int getAge() {
		return age;
	}

	public void setAge(String dateNaiss) throws ParseException {
		this.age = TypeAge.getAge(dateNaiss);
	}

	/**
	 * 
	 */
	public int age;

	@Override
	public String toString() {
		return "[nom=" + nom + ", prenom=" + prenom + ", dateNaiss=" + dateNaiss + ", age=" + age + "]";
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws ParseException {
		Personne a = new Personne("Toto","Tata",Commande.sdf.parse("10/12/96"), TypeAge.getAge("10/12/96"));
		
		System.out.println(a);
	}
	
	
	
	

}