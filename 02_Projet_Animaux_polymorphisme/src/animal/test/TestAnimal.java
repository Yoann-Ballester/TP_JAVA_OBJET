package animal.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import animal.domain.Animal;
import animal.domain.AnimalException;
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
		

//		Animal [] test = new Animal[2];
//		
//		test[0] = new Chien("Robert");		
//		test[1] = new Homme("Gege");	
//		
//		
//		Arrays.sort(test, Collections.reverseOrder());
//		
//
//		for (Animal z:test) {
//			 
//			 System.out.println(z);
//		 }
//		
//
//System.out.println("\n");
// System.out.println(test[0].parle());
// System.out.println(test[1].parle());
// 
// 
// System.out.println("\n");
 
 
 
 try {
	 ArrayList<Animal> animalo = new ArrayList<>();
	animalo.add(new Homme("Robertoooo"));
	animalo.add(new Chien( "Medor"));
	
	Collections.sort(animalo, Collections.reverseOrder());
	 
	 
	 for (Animal var:animalo) {
		 
		 System.out.println(var.parle());
	 }
	 
} catch (AnimalException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
 
 
  //Collections.sort(animalo);

 
 
 
 try {
	Animal a = new Animal("joooohn Ceeeenaaaaaaaaaaaa");
	System.out.println(a);
} catch (AnimalException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
 
 
 
 
 
 
		
		//System.out.println(animaux[1].compareTo(animaux[2]));
		
		
	}

}
