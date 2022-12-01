package bookstore.test;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import bookstore.metier.Livre;
import bookstore.metier.Utilisateur;

public class TestDateEmprunt {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		
		
		
		Livre L1 = new Livre("Aaaaa","Bbbbbb",123, 12.25 , LocalDate.parse("2022-09-25", DateTimeFormatter.ISO_LOCAL_DATE), null);
		
		
		
		System.out.println(Utilisateur.IsPretEnRetard("2022-11-25"));
		
		System.out.println(Utilisateur.IsPretEnRetard("2022-11-01"));
		
		System.out.println(L1.getDateEmprunt());
		
		
	}

}
