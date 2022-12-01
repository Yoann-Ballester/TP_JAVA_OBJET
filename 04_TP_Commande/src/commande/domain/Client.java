package commande.domain;

import java.text.ParseException;

import java.util.*;

/**
 * 
 */
public class Client extends Personne {
	
	public ArrayList<Commande> cmd = new ArrayList<Commande>();
	//public Commande cmd2;
	/**
	 * Default constructor
	 * @param nom 
	 */
	public Client(String nom, String prenom,Date dateNaiss, int age, Integer idClient, double chiffreAffaire) {
		super(nom,prenom,dateNaiss,age);
		this.idClient = idClient;
		this.chiffreAffaire = chiffreAffaire;
	}
	
	

	public Client() {
		super();
		
	}



	public Client(String nom, String prenom, Date dateNaiss, int idClient) {
		super(nom,prenom,dateNaiss);
		this.idClient = idClient;
	}



	/**
	 * 
	 */
	public Integer idClient;

	/**
	 * 
	 */
	public double chiffreAffaire;

	////////////////////////////

	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

		
	

//	public Commande getCmd2() {
//		return cmd2;
//	}
//
//
//
//	public void setCmd2(Commande cmd2) {
//		this.cmd2 = cmd2;
//	}



	public void setChiffreAffaire(double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}
	
	public void addCommande(Commande cde) {
		this.cmd.add(cde);
	}

	
	
	

	@Override
	public String toString() {
		return super.toString()+"[ idClient=" + idClient + ", chiffreAffaire=" + chiffreAffaire + ", Commande(s)="+cmd+ "]";
	}

	public static void main(String[] args) throws ParseException {
		
		
		
		Article clavierMidiArticle = new Article(412, "clavier midi 61 touches", 347., EnumStatusStock.NON_VIDE);
		Article camionPompier = new Article(189, "camion de pompier rouge", 27., EnumStatusStock.NON_VIDE);

		Commande cdeNoel = new Commande(4, "Chelles", Commande.sdf.parse("20/10/25"), 1);
//
//		cdeNoel.setContient(clavierMidiArticle);
		cdeNoel.setQte(2);
//		System.out.println(cdeNoel);
//
		Commande cdePaques = new Commande(7, "Paris", Commande.sdf.parse("15/04/20"), 1);
//
//		cdePaques.setContient(camionPompier);
//
//		System.out.println(cdePaques);
		
		
		
//		
		ArrayList<Article> articles = new ArrayList<>();
		articles.add(camionPompier);
		articles.add(clavierMidiArticle);
		
//		ArrayList<Article> articles2 = new ArrayList<>();
//		articles2.add(clavierMidiArticle);
		
		cdeNoel.addArticle(clavierMidiArticle);
		cdeNoel.addArticle(camionPompier);
		
		cdePaques.addArticle(clavierMidiArticle);
		
		
		//System.out.println(cdeNoel);
		
		
		ClientParticulier toto = new ClientParticulier("Lariflette", "Toto", Commande.sdf.parse("13/05/22"),721,"Champs");
		ClientParticulier titi = new ClientParticulier("Tartiflette", "Titi", Commande.sdf.parse("13/05/22"),145,"Champs");
		
		
//		ArrayList<Commande> commandes = new ArrayList<Commande>();
//		commandes.add(cdeNoel);
//		commandes.add(cdePaques);
		
		//titi.setCmd2(cdePaques);
		
	//	System.out.println(articles.get(0));
//		
//		for (Commande var:commandes) {
//			System.out.println(var);
//		}
		
		toto.addCommande(cdePaques);
		toto.addCommande(cdeNoel);
		
		
		System.out.println("\n"+toto);
		
		//System.out.println(titi.getCmd2());
		
		
		
		
		for (Article var:articles) {	
			somme = (somme + var.getPrixUnitaire()) ;
		}
		somme=somme*cdeNoel.getQte();
		
		System.out.println("Total somme de cdenoel :"+somme);
	}
	static double somme = 0;
}