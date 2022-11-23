package animal.domain;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Homme extends Mammifere{

	
	
	
	
	
	public Homme() {
		super();
	}

	

	public Homme(String nom) throws AnimalException{
		super(nom);
	}



	@Override
	public String toString() {
		
		if (getNom()=="")
			return super.toString()+" Je suis un homme.";
		
		return super.toString()+" Je suis un homme";
	}

	public String parle() {
		return (getNom() + " parle :" + "Yo les tatas, c'est GEGE!");
	}
	
	
	public static void main(String[] args) {
		
		Homme h1;
		try {
			h1 = new Homme("Jean patrick le ouf");
			System.out.println(h1);
			
			
			System.out.println(h1.parle());
		} catch (AnimalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
		
	}

}
