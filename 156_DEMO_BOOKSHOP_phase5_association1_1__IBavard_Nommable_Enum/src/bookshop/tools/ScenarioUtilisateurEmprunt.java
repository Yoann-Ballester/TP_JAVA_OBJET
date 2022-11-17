package bookshop.tools;

import java.time.LocalDate;

import bookshop.domain.EnumStatusLivre;
import bookshop.domain.Livre;
import bookshop.domain.Utilisateur;

public class ScenarioUtilisateurEmprunt {

	public static void main(String[] args) {
		//////////////////////////////////
		//SCENARIO DE TEST POUR ASSOC 1-1
		// 1) EMPRUNT DE LIVRE
		//	affichage du titre de livre emprunté
		// 2) RETOUR DE LIVRE par convention: ref de livre à null
		// 3) EMPRUNT d'un autre LIVRE
		//	affichage du titre de livre emprunté
		//	Attention: test la ref de livre null pour éviter NullPointerException

		System.out.println();
		System.out.println();
		System.out.println("**********************************");
		System.out.println("*****     ASSOC 1-1 unidir  ******");
		System.out.println("**********************************");
		System.out.println("*****     EMPRUNT DE LIVRE *******");
		System.out.println("**********************************");
		
		Livre L1 = new Livre("Torgal","Van Hamme", "Le Lombard", 98, null, true);
		System.out.println("Mon premier livre (toString):" + L1);
		
		Livre L2 = new Livre("Astérix","Uderzo", "Dargaud", 64, null, true);
		System.out.println("Mon deuxième livre (toString):" + L2);
		System.out.println();

		Utilisateur u1 = new Utilisateur("MARIE JOSEPH", "Carthy", "34890",null);
		System.out.println("toString() de utilisateur u1 :" + u1);

		///////////////////////////////////////////////////
		//EMPRUNT DE LIVRE
		System.out.println("u1 emprunte un livre L1");
		System.out.println("-----------------------");
		u1.setEmprunt(L1);
		u1.getEmprunt().setDisponible(false);//On navigue l'association
		u1.getEmprunt().setStatus(EnumStatusLivre.PRETE);
		u1.getEmprunt().setDateEmprunt(LocalDate.now());
		
		System.out.println("toString() de utilisateur u1 :" + u1);
		System.out.println("Mon premier livre (toString):" + L1);

		System.out.println();
		System.out.println("**********************************");
		System.out.println("*****      RETOUR DE LIVRE *****");
		System.out.println("**********************************");
		//On rend le livre
		System.out.println("u1 rend son livre");
		System.out.println("-----------------");
		u1.getEmprunt().setDisponible(true);
		u1.getEmprunt().setStatus(EnumStatusLivre.DISPONIBLE);

		u1.setEmprunt(null); //Désormais, attention au NullPointerException

		//On emprunte un autre livre
		System.out.println();
		System.out.println("*****************************************");
		System.out.println("*****   EMPRUNT D'UN AUTRE LIVRE    *****");
		System.out.println("*****************************************");
		u1.setEmprunt(L2);
		u1.getEmprunt().setDisponible(false);
		u1.getEmprunt().setStatus(EnumStatusLivre.PRETE);
		u1.getEmprunt().setDateEmprunt(LocalDate.now());
		System.out.println("toString() de utilisateur u1 :" + u1);

		//affichage du titre du livre emprunté
		if( u1.getEmprunt()!= null)
			System.out.println("Le livre emprunté :" + u1.getEmprunt().getTitre());
		else
			System.out.println("Pas de livre emprunté");

		//Méthode d'instance pouvant être développée
		//public String findTitreLivreCourant();
		System.out.println("Livre courant de u1 :" + u1.findTitreLivreCourant() );
		
		EnumStatusLivre saisie = EnumStatusLivre.valueOf("PRETE");
		

	}
}
