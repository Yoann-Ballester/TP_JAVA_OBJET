package commande.domain;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

/**
 * 
 */


public class Commande {

	public ArrayList<Article> articles = new ArrayList<>();
	
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
		return articles;
	}




	public void setContient(ArrayList<Article> article) {
		this.articles = article;
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
				+ dateCommande + ", qte=" + qte + articles+ "]";
	}
	
	public void addArticle(Article artcl) {
		this.articles.add(artcl);
	}


	public static double comm;
	public static double  getTotalCom(ArrayList<Article> articles) {
		for(Article var:articles) {
			comm = Article.getTotalPrix(var);
		}
		return comm;
	}
	
	public  double getTotalCommande() {
		return getTotalCom(articles);
	}

    
public static void main(String[] args) throws ParseException {
	Article a = new Article(145,"ddsgsg",156.,EnumStatusStock.NON_VIDE);
	Article b = new Article(145,"ddsgsg",556.,EnumStatusStock.NON_VIDE);
	Article c = new Article(145,"ddsgsg",56.,EnumStatusStock.NON_VIDE);
	
	ArrayList<Article> articles = new ArrayList<>() ;
	articles.add(a);
	articles.add(b);
	articles.add(c);
	
	Commande cdeNoel = new Commande(4, "Chelles", Commande.sdf.parse("20/10/25"), 1);
	
	cdeNoel.addArticle(c);
	cdeNoel.addArticle(b);
	cdeNoel.addArticle(a);
	
	System.out.println(cdeNoel.getTotalCommande());
	
	
	
}

}