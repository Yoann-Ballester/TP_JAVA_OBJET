package bookstore.test;


import bookstore.metier.Livre;

public class TestLivre {
	
	

	public static void main(String[] args) {
		
		
		Livre L1 = new Livre("Uderzo", "Asterix", 100);
		Livre L2 = new Livre("GHjghk", "Cool", 666);
		
//		System.out.println(L1.auteur + " ,"+ L2.auteur);
//		
//		
//		L2.setNBpages(125);
//		L1.setNBpages(321);
//		System.out.println("\n"+L2.getNbPages()+ " "+ L1.getNbPages());
//		
//		System.out.println((L2.getNbPages() + L1.getNbPages()));
//
//		System.out.println("\n"+L1+"\n");
//		
//		
//		
//		Livre L3 = new Livre();
//		
//		L3.setAuteur("Victor hugo");
//		L3.setTitre("dfgfhdfh");
//		L3.setNBpages(786);
//
//		System.out.println(L3);
//		
		Livre L4 = new Livre("Uderzo", "Asterix", 300);
		Livre L5 = new Livre();
		Livre L6 = new Livre("GHjghk", "Cool");
		
		
		
		L5.setNBpages(300);
		L5.setPrix(12.157845);
//		L5.setPrix(15.157845);
		
		//System.out.println(L5.getPrix());
		
		L6.setNBpages(300);
		L6.setPrix(0);
		
//		System.out.println("\n\n"+L5+"\n\n"+L6+"\n\n"+L4);
		
		System.out.println(L4.compare(L5));
		
		
		
	}

}
