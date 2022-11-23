package fr.afpa.util;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

import fr.afpa.math.MathBean;
import fr.afpa.math.MathException;

public class CalculFactor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
MathBean bean = new MathBean();
		try {
			String m = JOptionPane.showInputDialog("Saisir un nombre pour calculer sa factorielle. ");
			long nbr;
			try {
				nbr = Long.parseLong(m);}
			catch (NumberFormatException e) {
				throw new MathException("C PA BON ",e);//.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
				
			
			}
			// System.out.println(((Object)nbr).getClass().getSimpleName());

			

			JOptionPane.showMessageDialog(null, bean.factoriel(nbr), "Résultat", JOptionPane.PLAIN_MESSAGE);

		}  catch (MathException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage()+e.getCause(), "Erreur", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}

	}

}
