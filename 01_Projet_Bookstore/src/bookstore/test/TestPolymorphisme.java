package bookstore.test;


import bookstore.metier.Auteur;
import bookstore.metier.Personne;
import bookstore.metier.Utilisateur;

public class TestPolymorphisme {

	public static void main(String[] args) {

		Auteur a1 =new Auteur("Toto", "LeDeglingo");
		Utilisateur u1= new Utilisateur("John", "Ceeenaaa","");
		
		a1.parle();
		u1.parle();
		
		System.out.println();
		
		Personne p1 = new Auteur();
		Personne p2 = new Utilisateur();
		
		p1.parle();
		p2.parle();
		
	}

}
