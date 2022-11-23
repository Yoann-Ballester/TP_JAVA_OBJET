package fr.afpa.util;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculFactor {

	public static void main(String[] args) {
		
		
	    Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez un nombre pour calculer sa factorielle : ");
		 long number = scanner.nextLong();
		
		 int i;
		 long fact=1;
		 for(i=1;i<=number;i++){
		      fact=fact*i;
		      
		     
			  }
		  if (number>0 && number<21)
		  System.out.println("La factorielle de "+number+" est : "+fact);
		  
		  if (number<=0) {
			  fact=-1;
			  System.out.print("erreur :"+fact);
		  }
			if (number>=21) {				
				fact=-2;
				  System.out.print("erreur :"+fact);
			}
		       
		 
		  }
	
	
	
	
	

		}

