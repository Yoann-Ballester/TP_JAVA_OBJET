package bookshop.domain;

import java.time.LocalDate;

public class TestLivre_Constructeur_MPolymorphe {

	public static void main(String[] args) {
		Livre L1 = new Livre();
		System.out.println("Mon premier livre (toString):" + L1);
		System.out.println();System.out.println();

		Livre L2 = new Livre("Astérix","Uderzo", "Dargo", 64, null, true);

		System.out.println("Mon deuxième livre (toString):" + L2);
		System.out.println();
		///////////////////////////////
		//test des constructeurs
		//Livre L3 = new Livre("tintin","Uderzoo", "Dargoo", 67, LocalDate.now(), true);
		Livre L3 = new Livre(null,"Uderzoo", "Dargoo", 67, LocalDate.now(), true);
		System.out.println("Mon troisième livre (toString):" + L3);
		L3.setTitre("tintin");
		System.out.println("Mon troisième livre (toString):" + L3);
		System.out.println();

		Livre L4 = new Livre("Quatre","Uderzaa", "Dargaa", 98, LocalDate.now());

		System.out.println("Mon quatre livre (toString):" + L4);
		System.out.println();

		//L2.nbPages = -15;
		//L2.setNbPages(154);
		System.out.println("Mon deuxième livre (toString):" + L2);
		System.out.println("\n");
		
		/////////////////////////////
		//TEST DU equals()
		
		//Livre L2 = new Livre("Astérix","Uderzo", "Dargo", 64, null, true);

		System.out.println();
		//Livre L6 = new Livre("Astérix","Uderzo", "Dargo", 64, null, true);
		//System.out.println("L6 identique à L2");
		Livre L6 = new Livre("Astérix","bbbbb", "bbbbb", 64, null, true);
		System.out.println("Mon sixième livre (toString):" + L6);
		System.out.println();
		
		if(L2.equals(L6))
			System.out.println("Les 2 livres sont égaux");
		else 
			System.out.println("Les 2 livres sont différents");
//////////////////////////////////
// Test du equals dont on hérite
//		Livre L7 = L2;
//		/*if(L7.equals(L2))*/
//		if(L2.equals(L7))
//			System.out.println("Les 2 livres sont égaux");
//		else 
//			System.out.println("Les 2 livres sont différents");
//		
		//TEST DU hashCode()
		System.out.println("valeur du hashCode de L2 :0x" + Integer.toHexString(L2.hashCode()));
		//557041912//0x2133c8f8
		System.out.println("valeur du hashCode de L6 :0x" + Integer.toHexString(L6.hashCode()));
		//557041912//0x2133c8f8

		L2=null;
		//L2.finalize(); ????????
		
//		Livre L = null;
//		for(int i=1; i<100000; i++){
//			L = new Livre();
//			//System.out.println("nouveau livre");
//		}
//		System.out.println("nouveau livre :" + L);

	}

}
