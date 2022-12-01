package bookstore.test;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import bookstore.metier.Livre;
import bookstore.metier.Status;
import bookstore.metier.TypeDonneesAnnee;
import bookstore.metier.Utilisateur;

public class TestUtilisateur {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		TypeDonneesAnnee a1 = new TypeDonneesAnnee(2022);
		TypeDonneesAnnee a2 = new TypeDonneesAnnee(2023);
		//System.out.println(a1);
		
		Livre L1 = new Livre("Aaaaa", "Bbbbb", 126,  15.56, LocalDate.parse("2022-12-25", DateTimeFormatter.ISO_LOCAL_DATE), a1);
		
	
		Livre L2 = new Livre("Ccccc", "Ddddd", 125, 17.56);

		Utilisateur u1 = new Utilisateur("Toto", "LePGM", "36153615", L1);

//		u1.setEmprunt(L2);
//		L2.setDisponible(false);

		u1.getEmprunt().setStatus(Status.PRETE);

		System.out.println(u1);

		System.out.println("\n" + u1.getEmprunt().isDisponible());
		
		u1.parle();
		
		System.out.println("\n"+a1.equals(a2));
		
		System.out.println(a1.hashCode());

	}

}
