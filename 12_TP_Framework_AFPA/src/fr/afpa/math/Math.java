package fr.afpa.math;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.swing.JOptionPane;

public class Math {

	public static void main(String[] args) {
		
		int nbr1 = 20;
		System.out.println("La factorielle de "+nbr1+" est : "+factoriel(nbr1));
		
		//max capacité 7654
		int nbr2 =3000;
		System.out.println("La factorielle de "+nbr2+" est : "+factorielBig(nbr2));
		
		int f=456;
		System.out.println(" \nresultat de la conversion de "+f+" euros en "+Convert.euroToDollar(BigDecimal.valueOf(f))+" dollars");
	}

	
static long factoriel(long number) {
		
		if (number==0 || number ==1) {
			return 1;
		}
		if (number > 20) {
			return -2;
		}
		if (number < 0) {
			return -1;
		}
		else {
			return number*factoriel(number-1);
		}
		
	}


public static BigInteger factorielBig(int nbr) throws IllegalArgumentException {
	
	
	BigInteger b= new BigInteger("1");
	if (nbr==0 || nbr ==1) {
		return b;
	}
	
	
	//BigInteger o= new BigInteger("-2");
	if (nbr>7654) {
		
		throw new StackOverflowError("Capacité depassée");
	}
	
	
	//BigInteger p= new BigInteger("-1");
	if (nbr < 0) {
		throw new IllegalArgumentException("Le nombre saisie ne peut pas être négatif");
	}
	
	
else {
	BigInteger w;
	w = BigInteger.valueOf(nbr);
	
	return w.multiply(factorielBig(nbr-1));

	}
	
	
}



}
