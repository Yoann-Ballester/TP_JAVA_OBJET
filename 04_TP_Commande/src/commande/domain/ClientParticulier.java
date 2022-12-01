package commande.domain;


import java.text.ParseException;
import java.util.*;

/**
 * 
 */
public class ClientParticulier extends Client {
	
	
	

    /**
     * Default constructor
     */
    public ClientParticulier() {
    	super();
    }
    
    public ClientParticulier(String nom, String prenom,Date dateNaiss, int age, Integer idClient, double chiffreAffaire, String adressePersonelle) {
		super(nom,prenom,dateNaiss,age,idClient,chiffreAffaire);
		this.adressePersonelle = adressePersonelle;
	}
    
   



	public ClientParticulier(String nom, String prenom, Date datenaiss, int idClient, String adressePersonelle) {
		super(nom,prenom,datenaiss,idClient);
		this.adressePersonelle = adressePersonelle;
	}





	/**
     * 
     */
    public String adressePersonelle;

	

	public String getAdressePersonelle() {
		return adressePersonelle;
	}

	public void setAdressePersonelle(String adressePersonelle) {
		this.adressePersonelle = adressePersonelle;
	}

	@Override
	public String toString() {
		return super.toString()+" [adressePersonelle=" + adressePersonelle + "]";
	}


    
    public static void main(String[] args) throws ParseException {
		
    	ClientParticulier a = new ClientParticulier();
    	a.setNom("Titi");
    	a.setPrenom("Toto");
    	a.setDateNaiss(Commande.sdf.parse("10/10/90"));
    	a.setIdClient(144);
    	a.setAdressePersonelle("Paris");
    	a.setAge("12/08/65");
    	System.out.println(a);
    	
    	
	}
    

}