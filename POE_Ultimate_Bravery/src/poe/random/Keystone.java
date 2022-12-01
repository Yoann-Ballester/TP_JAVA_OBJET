package poe.random;

public class Keystone {

	
	private   String nom;
	private  int id;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Keystone(String nom, int id) {
		super();
		this.nom = nom;
		this.id = id;
	}
	
	public Keystone() {
		super();
		
	}
	@Override
	public String toString() {
		return "Keystone [nom=" + nom + ", id=" + id + "]";
	}
	
	public static void main(String[] args) {
		
		Keystone k = new Keystone("Acrobatics",1);
		System.out.println(k);
	}
}
