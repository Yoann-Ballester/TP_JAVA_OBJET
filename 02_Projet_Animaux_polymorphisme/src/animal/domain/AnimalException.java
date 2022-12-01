package animal.domain;

public class AnimalException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AnimalException() {
		super("Un probleme general est survenu sur l'application Animal");
	}
	
	public AnimalException(String message) {
		super(message);
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(new AnimalException("coin coin"));
		
		System.out.println(new AnimalException());
	}

}
