package fr.afpa.math;

public class MathException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MathException(String message) {
		super(message);
	}

	public MathException() {
		super("Un probleme generique sur l'application Math est survenu");
	}

	
	
	public MathException(String message, Throwable cause) {
		super(message, cause);
	}

	public static void main(String[] args) {

		System.out.println(new MathException("OH"));
		System.out.println(new MathException());
		
	}
}
