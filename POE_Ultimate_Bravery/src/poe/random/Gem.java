package poe.random;

public class Gem {

	private   String nom;
	private  int id;
	private String type;

	public Gem(String nom, int id, String type) {
		super();
		this.nom = nom;
		this.id = id;
		this.type = type;
	}
	
	public Gem() {
		super();
		}

	public  String getNom() {
		return nom;
	}

	public String getType() {
		return type;
	}

	public  int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Gem [nom=" + nom + ", id=" + id + ", type=" + type + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gem g1 = new Gem("Cyclone",12,"str");
		
		System.out.println(g1);

	}

}
