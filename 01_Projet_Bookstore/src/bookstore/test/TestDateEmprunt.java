package bookstore.test;

import java.text.ParseException;


import bookstore.metier.Livre;

public class TestDateEmprunt {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		
		
		
		Livre L1 = new Livre("Aaaaa","Bbbbbb",123, 12.25 , Livre.sdf.parse("26/5/22"), null);
		
		
		
		
		
		System.out.println(L1.getDateEmprunt());
		
		L1.setDateEmprunt(Livre.sdf.parse("03/2/26"));
		
		System.out.println(L1.getDateEmprunt());
	}

}
