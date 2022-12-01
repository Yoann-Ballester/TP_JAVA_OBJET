package bookstore.test;

import java.util.ArrayList;

import bookstore.metier.Livre;
import bookstore.metier.Status;
import bookstore.metier.Utilisateur;

public class TestEmprunt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Livre L1 = new Livre("Aaaa", "Tintin");
		Livre L2 = new Livre("Bbbbb", "Asterix");
		Livre L3 = new Livre("Ccccc", "Ddddd");
		
		
		ArrayList<Livre> livres = new ArrayList<>();
		livres.add(L1);
		livres.add(L2);
		
		Utilisateur u1 = new Utilisateur("Toto","tata", "1");
		
		Utilisateur u2 = new Utilisateur("Zorro","tata", "2");
		
		
		u2.setEmprunt(L3);
		L3.setStatus(Status.PRETE);
		
		
		//u1.addLivres(livres);
		
		u1.addLivre(L1);
		u1.addLivre(L2);

		
		System.out.println(u1);
		
		System.out.println("\n"+u2);
		




	}

}
