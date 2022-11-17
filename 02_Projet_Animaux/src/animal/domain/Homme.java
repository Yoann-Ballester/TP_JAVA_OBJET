package animal.domain;

public class Homme extends Animal{

	
	
	
	
	
	public Homme() {
		super();
	}

	

	public Homme(String nom) {
		super(nom);
	}



	@Override
	public String toString() {
		
		if (getNom()=="")
			return "Je suis un homme.";
		
		return "Je suis un homme de nom "+getNom()+".";
	}

	public static void main(String[] args) {
		
		Homme h1 = new Homme("Jean patrick le ouf");
		
		System.out.println(h1);
		
	}

}
