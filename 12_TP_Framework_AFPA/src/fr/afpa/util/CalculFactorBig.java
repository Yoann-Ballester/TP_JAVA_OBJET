package fr.afpa.util;

import java.math.BigInteger;

import javax.swing.JOptionPane;

public class CalculFactorBig {
	
			

	public static void main(String[] args) {
					
					
					
		String m = JOptionPane.showInputDialog("Saisir un nombre pour calculer sa factorielle. ");
		int nbr = Integer.parseInt(m);
		
		
		
	
			int i;
			int res=1;
			for (i=1;i<=nbr;i++) {
				
				
				res = res*i;
				
				
			}
			 	if (nbr==0 || nbr==1) {
			 JOptionPane.showMessageDialog(null, "1", "résultat", JOptionPane.PLAIN_MESSAGE);
		}
		
		if (nbr <0) {
			JOptionPane.showMessageDialog(null, "Le nombre saisie ne peut pas etre negatif.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		else {
			
			BigInteger resB= BigInteger.valueOf(res);
			JOptionPane.showMessageDialog(null, resB, "résultat", JOptionPane.PLAIN_MESSAGE);
		}
			
		
	}

}
