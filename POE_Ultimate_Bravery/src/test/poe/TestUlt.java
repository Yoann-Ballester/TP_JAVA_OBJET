package test.poe;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import poe.random.Gem;

public class TestUlt {
	
	
	
	static int  min=1;
	static int max=5;
	
	public static int randomGem() {
		  return (int) (min + Math.random()*max);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		List<Gem> gems = Arrays.asList(new Gem("cyclone",1,"dex"), new Gem("blade flurry",2,"dex"), new Gem("warchief totem", 3, "str"), new Gem("cold snap",4,"int"),new Gem("soulrend",5,"int"));
		
		for(Gem var:gems) {
			
			System.out.println(var);
			
		}
		//System.out.println(randomGem());
		
		if(randomGem()==1) {
			System.out.println();
		}
		
		
	}

}
