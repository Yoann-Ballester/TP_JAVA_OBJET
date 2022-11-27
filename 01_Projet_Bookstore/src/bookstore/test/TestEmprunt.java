package bookstore.test;

import bookstore.metier.Livre;
import bookstore.metier.Status;
import bookstore.metier.Utilisateur;

public class TestEmprunt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Livre L1 = new Livre("Aaaa", "Tintin");
		Livre L2 = new Livre("Bbbbb", "Asterix");
		
		Utilisateur u1 = new Utilisateur("Toto","tata", "1", L2);
		L2.setStatus(Status.PRETE);
		Utilisateur u2 = new Utilisateur("Zorro","tata", "1", L1);
		L1.setStatus(Status.PRETE);
		
		
		System.out.println(u1+"\n"+u2);
		
		
		u1.setEmprunt(null);
		u2.setEmprunt(null);
		L1.setStatus(Status.DISPONIBLE);
		L2.setStatus(Status.DISPONIBLE);
		
		System.out.println(u1+"\n"+u2);
		
		u1.setEmprunt(L1);
		L1.setStatus(Status.PRETE);
		System.out.println(u1+"\n"+u2);

	}

}
