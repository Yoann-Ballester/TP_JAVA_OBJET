package fr.afpa.math;



public class TestMath {

	public static void main(String[] args) {

		factorielTestZero();
		factorielTest1();
		factorielTest20();
		factorielTest21();
		factorielTestMoinsUn();
		factorielTest45();
//		
	}
	
	public static void factorielTestZero() {
		if (Math.factoriel(0)==1) {
			System.out.println(" : Test OK");
	}else {
		System.err.println(" :Test NOK : La factoriel de zero vaut 1");
	}
}
		
		public static void factorielTest1() {
			if (Math.factoriel(1)==1) {
				System.out.println(" : Test OK");
		}else {
			System.err.println(" :Test NOK : La factoriel de 1 vaut 1");
		}	
	}
		
		public static void factorielTest20() {
			if (Math.factoriel(20)==(long) 20*19*18*17*16*15*14*13*12*11*10*9*8*7*6*5*4*3*2*1) {
				System.out.println(" : Test OK");
		}else {
			System.err.println(" :Test NOK : La factoriel de 20 vaut 2432902008176640000");
		}	
	}
		
		public static void factorielTest21() {
			if (Math.factoriel(21)==-2) {
				System.out.println(" : Test OK");
		}else {
			System.err.println(" :Test NOK : Le resultat est -2 car la capacite du long est depassé");
		}	
	}
		
		public static void factorielTest45() {
			if (Math.factoriel(45)==-2) {
				System.out.println(" : Test OK");
		}else {
			System.err.println(" :Test NOK : Le resultat est -2 car la capacite du long est depassé");
		}	
	}
		
		public static void factorielTestMoinsUn() {
			if (Math.factoriel(-1)==-1) {
				System.out.println(" : Test OK");
		}else {
			System.err.println(" :Test NOK : Le resultat est -2 car la capacite du long est depassé");
		}	
	}
		
}
