package chat.test;

import java.util.ArrayList;
import java.util.Collections;

import animal.domain.Animal;
import animal.domain.Chien;
import animal.domain.Homme;
import chat.domain.Chat;

public class TestChat {

	public static void main(String[] args) {

		ArrayList<Animal> animalo = new ArrayList<>();
		animalo.add(new Animal("Truc"));
		animalo.add(new Chien("Medor"));
		animalo.add(new Homme("Robert"));
		animalo.add(new Chat("Felix"));

		// Collections.sort(animalo);
		// Collections.sort(animalo, Collections.reverseOrder());

		for (Animal var : animalo) {

			System.out.println(var.parle());
		}
		
	
	}

}
