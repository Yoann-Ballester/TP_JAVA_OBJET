package fr.afpa.math;


import java.math.BigInteger;



public class MathBean {

	public static final MathBean bean = new MathBean();

	

	public long factoriel(long number) throws MathException {
		
		
		
		if (number == 0 || number == 1) {
			return 1;
		}
		if (number > 20) {
			throw new MathException("La valeur saisie ne doit pas depasse 20");
		}
		if (number < 0) {
			throw new MathException("Le nombre saisie ne peut pas être négatif");
		} else {
			return number * factoriel(number - 1);
		}

	}

	public BigInteger factorielBig(int nbr) throws IllegalArgumentException {

		BigInteger b = new BigInteger("1");
		if (nbr == 0 || nbr == 1) {
			return b;
		}

		// BigInteger o= new BigInteger("-2");
		if (nbr > 7654) {

			throw new StackOverflowError("Capacité depassée");
		}

		// BigInteger p= new BigInteger("-1");
		if (nbr < 0) {
			throw new IllegalArgumentException("Le nombre saisie ne peut pas être négatif");
		}

		else {
			BigInteger w;
			w = BigInteger.valueOf(nbr);

			return w.multiply(factorielBig(nbr - 1));

		}

	}

}
