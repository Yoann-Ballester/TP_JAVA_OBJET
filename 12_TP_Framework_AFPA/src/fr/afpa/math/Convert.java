package fr.afpa.math;

import java.math.BigDecimal;

import javax.swing.JOptionPane;



public class Convert {

	public static void main(String[] args) {
			
	
		
		 String m = JOptionPane.showInputDialog("Saisir une somme en euros. ");
		
		 //int f=Integer.parseInt(m);
		// System.out.print(euroToDollar(BigDecimal.valueOf(f)));
		
		
		 
		 BigDecimal f = new BigDecimal(m);
		 //assertEquals(new BigDecimal(m), f);
		 String s = (euroToDollar(f)).toString();
		 JOptionPane.showMessageDialog(null, s, "résultat", JOptionPane.PLAIN_MESSAGE);
		 }
	


	
	static final BigDecimal conv= new BigDecimal("0.99");
	
	public static BigDecimal euroToDollar(BigDecimal euro) {
		
		return conv.multiply(euro);
	}

}
