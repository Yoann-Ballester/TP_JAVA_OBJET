package animal.domain;

public class Homme extends Mammifere{

	
	
	
	
	
	public Homme() {
		super();
	}

	

	public Homme(String nom) {
		super(nom);
	}



	@Override
	public String toString() {
		
		if (getNom()=="")
			return super.toString()+" Je suis un homme.";
		
		return super.toString()+" Je suis un homme";
	}

	public static void main(String[] args) {
		
		Homme h1 = new Homme("Jean patrick le ouf");
		
		System.out.println(h1);
		
	}

}
