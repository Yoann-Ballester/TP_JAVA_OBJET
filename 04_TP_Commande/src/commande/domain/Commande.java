package commande.domain;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

/**
 * 
 */


public class Commande {

	public ArrayList<Article> Article = new ArrayList<>();
	
    /**
     * Default constructor
     */
    public Commande() {
    }
    
    
    

    public Commande(int noCommande, String adresseLivraison, Date dateCommande , Integer qte) throws ParseException {
		super();
		this.noCommande = noCommande;
		this.adresseLivraison = adresseLivraison;
		this.dateCommande = dateCommande;
		this.qte = qte;
	}
    
    
    



	/**
     * 
     */
    public int noCommande;

    /**
     * 
     */
    public String adresseLivraison;

    /**
     * 
     */
    public Date dateCommande;

    /**
     * 
     */
    public Integer qte;
    
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
    
    
    
    
    
    

	public ArrayList<Article> getArticle() {
		return Article;
	}




	public void setContient(ArrayList<Article> article) {
		this.Article = article;
	}




	public int getNoCommande() {
		return noCommande;
	}




	public void setNoCommande(int noCommande) {
		this.noCommande = noCommande;
	}




	public String getAdresseLivraison() {
		return adresseLivraison;
	}




	public void setAdresseLivraison(String adresseLivraison) {
		this.adresseLivraison = adresseLivraison;
	}




	public Date getDateCommande() {
		return dateCommande;
	}




	public void setDateCommande(Date dateCommande) throws ParseException {
		this.dateCommande = dateCommande;
	}




	public Integer getQte() {
		return qte;
	}




	public void setQte(Integer qte) {
		this.qte = qte;
	}




	@Override
	public String toString() {
		return "Commande [noCommande=" + noCommande + ", adresseLivraison=" + adresseLivraison + ", dateCommande="
				+ dateCommande + ", qte=" + qte + Article+ "]";
	}
	
	public void addArticle(Article artcl) {
		this.Article.add(artcl);
	}





    


}