package animal.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import animal.domain.Animal;
import animal.domain.Chien;
import animal.domain.Homme;
import animal.domain.Mammifere;
import animal.domain.Nommable;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Animal [] animaux = new Animal[3];
//		animaux[0] = new Animal("Trucs");		
//		animaux[1] = new Chien("Médor");		
//		animaux[2] = new Homme("Robert");	
//		
//		for(int i = 0;i<animaux.length; i++) {
//			
//			System.out.println(animaux[i].parle());
//			
//		}
		
//		if (animaux[2] instanceof Nommable) {
//			
//			
//			System.out.println(true);
//			
//		}else {
//			System.out.println(false);
//		}
//		
//		System.out.println(animaux[2].getClass());
		

		Comparable<Animal> [] test = new Animal[3];
		test[0] = new Animal("Trucs");		
		test[1] = new Chien("Robert");		
		test[2] = new Homme("Gege");	
		
		
		Arrays.sort(test, Collections.reverseOrder());
		
for(int i = 0;i<test.length; i++) {
			
			System.out.println(test[i]);
			
		}
		
		//System.out.println(animaux[1].compareTo(animaux[2]));
		
		
	}

}
