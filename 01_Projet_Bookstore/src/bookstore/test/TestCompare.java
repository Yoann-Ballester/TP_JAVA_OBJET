package bookstore.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import bookstore.metier.Livre;

public class TestCompare {

	public static void main(String[] args) {

		Livre L1 = new Livre("Tata", "TOTO", 126, 12.13);
		Livre L2 = new Livre("TITI", "tutu", 324, 17.13);
		Livre L3 = new Livre("Aaaa", "Bbbbb", 76, 17.13);
		Livre L4 = new Livre("Cccc", "Dddd", 197, 17.13);
		Livre L5 = new Livre("Eeee", "Fffff", 354, 17.13);

		ArrayList<Livre> list = new ArrayList<>();

		list.add(L5);
		list.add(L4);
		list.add(L3);
		list.add(L2);
		list.add(L1);

		// System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		
		for (Livre val : list) {
			System.out.println("\n" + val);
		}

		// System.out.println(L1.compareTo(L2));

	}
}
