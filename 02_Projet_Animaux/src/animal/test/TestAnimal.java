package animal.test;

import java.util.Arrays;
import java.util.List;

import animal.domain.Animal;
import animal.domain.Chien;
import animal.domain.Homme;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Animal [] animaux = new Animal[5];
//		animaux[0] = new Animal("Trucs");
//		animaux[1] = new Animal();
//		animaux[2] = new Chien("Médor");
//		animaux[3] = new Homme();
//		animaux[4] = new Homme("Robert");	
		
		
		Animal animaux[] = new Animal[] {new Animal("Trucs"),new Animal(""),new Chien("Médor"),new Homme(""),new Homme("Robert") };
				
//		for(int i = 0; i<animaux.length;i++) {
//			System.out.println(animaux[i]);
//		}
		
		for (Animal var:animaux) {
			System.out.println(var);
		}
		
		System.out.println();
		
		List<Animal> animaux2 = Arrays.asList(new Animal("Trucs"),new Animal(""),new Chien("Médor"), new Homme(""), new Homme("Robert"));
		
		for (Animal var:animaux2) {
			System.out.println(var);
		}
		
		
	}

}
