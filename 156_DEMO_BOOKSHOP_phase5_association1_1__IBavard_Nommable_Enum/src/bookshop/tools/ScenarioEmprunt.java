package bookshop.tools;

import java.time.LocalDate;

import bookshop.domain.Livre;

public class ScenarioEmprunt {
	public static void main(String[] args) {
//		Livre L1 = new Livre();
//		System.out.println("Mon premier livre (toString):" + L1);
//		System.out.println();
//		L1.afficheToi();
//		System.out.println();

		Livre L2 = new Livre("Astérix","Uderzo", "Dargo", 64, null, true);

		System.out.println("Mon deuxième livre (toString):" + L2);
		System.out.println();
		//L2.afficheToi();
		
		///////////////////////
		//Scenario d'emprunt
		System.out.println("\nEmprunt du livre L2");
		System.out.println("---------------------");	
		
		//L2.disponible = false;
		L2.setDisponible(false);
		//L2.dateEmprunt = LocalDate.now();
		L2.setDateEmprunt(LocalDate.now());
		System.out.println("Mon deuxième livre (toString):" + L2);
		System.out.println();
		System.out.println("dégradation du livre");
		System.out.println("--------------------");
		//L2.nbPages = L2.nbPages - 3;
		L2.setNbPages(L2.getNbPages() - 3);

		System.out.println("Mon deuxième livre (toString):" + L2);
	
		//QUESTION
		System.out.println("L2 est-il dispo? :" + (L2.isDisponible()?"oui":"non"));
		System.out.println();
		
		
		//Scenario de retour
		System.out.println("\nretour du livre L2");
		System.out.println("---------------------");
		L2.setDisponible(true);
		System.out.println("Mon deuxième livre (toString):" + L2);

		//QUESTION
		System.out.println("L2 est-il dispo? :" + (L2.isDisponible()?"oui":"non"));
		System.out.println();
		

}
}
