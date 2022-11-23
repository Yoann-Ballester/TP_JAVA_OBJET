package fr.afpa.math;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class MathBeanTest {



	

	@Test void factorieltestZero() {
		MathBean bean = new MathBean();
		try {
			assertEquals(bean.factoriel(0),1,"La factorielle de 0 vaut 1");
		} catch (MathException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	////////////////////////////////
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		MathBean bean = new MathBean();

		int nbr1 = -5;
		try {
			System.out.println("La factorielle de " + nbr1 + " est : " + bean.factoriel(nbr1));
		} catch (MathException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		

		// max capacité 7654
//		int nbr2 = 3000;
//		System.out.println("\nLa factorielle de " + nbr2 + " est : " + bean.factorielBig(nbr2));

//		int f = 456;
//		System.out.println(" \nresultat de la conversion de " + f + " euros en "
//				+ Convert.euroToDollar(BigDecimal.valueOf(f)) + " dollars");
	}
}
