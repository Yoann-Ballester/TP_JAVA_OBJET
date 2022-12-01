package commande.domain;


import java.util.*;

/**
 * 
 */
public class Article implements Payable{

	
	public Commande contenu;
	
	
    /**
     * Default constructor
     */
    public Article() {
    }
    
    
    

    public Article( Integer noArticle, String description, double prixUnitaire,
			EnumStatusStock etatStock) {
		super();
		
		this.noArticle = noArticle;
		this.description = description;
		this.prixUnitaire = prixUnitaire;
		this.etatStock = etatStock;
	}



	/**
     * 
     */
    public Integer noArticle;

    /**
     * 
     */
    public String description;

    /**
     * 
     */
    public double prixUnitaire;

    public Integer getNoArticle() {
		return noArticle;
	}

	public void setNoArticle(Integer noArticle) {
		this.noArticle = noArticle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public EnumStatusStock getEtatStock() {
		return etatStock;
	}

	public void setEtatStock(EnumStatusStock etatStock) {
		this.etatStock = etatStock;
	}

	@Override
	public String toString() {
		return "Article [noArticle=" + noArticle + ", description=" + description + ", prixUnitaire=" + prixUnitaire
				+ ", etatStock=" + etatStock + "]";
	}
	


	/**
     * 
     */
    public EnumStatusStock etatStock;


	@Override
	public void setPrixUnitaire() {
		// TODO Auto-generated method stub
		
	}
	
	static double somme = 0;
	public static void main(String[] args) {
		Article a = new Article(145,"ddsgsg",156.,EnumStatusStock.NON_VIDE);
		Article b = new Article(145,"ddsgsg",556.,EnumStatusStock.NON_VIDE);
		Article c = new Article(145,"ddsgsg",56.,EnumStatusStock.NON_VIDE);
		
		ArrayList<Article> articles = new ArrayList<>() ;
		articles.add(a);
		articles.add(b);
		articles.add(c);
		
		
		for (Article var:articles) {	
			
			somme = somme + var.getPrixUnitaire();
		}
		System.out.println(somme);
		
		//System.out.println(articles.get(1).getPrixUnitaire());
	}

}