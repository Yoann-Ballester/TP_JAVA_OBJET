package test.poe;


import poe.random.Gem;
import poe.random.Keystone;

public class TestUlt {

	static int min = 1;
	static int max = 63;

	static int range = (max - min)+1;

	public static int randomGem() {
		return (int) (Math.random() * range) + min;
	}
	
	static int min2 = 1;
	static int max2 = 2;

	static int range2 = (max2 - min2)+1;

	public static int randomGem2() {
		return (int) (Math.random() * range2) + min2;
	}


	
	
	public static int a;
	
	public static int b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gem[] gems = { new Gem("cyclone", 1, "dex"), new Gem("blade flurry", 2, "dex"),
				new Gem("warchief totem", 3, "str"), new Gem("cold snap", 4, "int"), new Gem("soulrend", 5, "int"), new Gem("Animate Weapon", 6, "dex"), new Gem("Artillery Ballista", 7, "dex")
				, new Gem("Barrage", 8, "dex"), new Gem("Bear trap", 9, "dex"), new Gem("Blade Blast", 10, "dex"), new Gem("Blade trap", 11, "dex"), new Gem("Blade vortex", 12, "dex")
				, new Gem("Bladefall", 13, "dex"), new Gem("Blast rain", 14, "dex"), new Gem("Blink Arrow", 15, "dex"), new Gem("Burning arrow", 16, "dex"), new Gem("Caustic arrow", 17, "dex")
				, new Gem("Charged dash", 18, "dex"), new Gem("Cobra lash", 19, "dex"), new Gem("Cremation", 20, "dex"), new Gem("Detonate dead", 21, "dex"), new Gem("Double strike", 22, "dex")
				, new Gem("Dual Strike", 23, "dex"), new Gem("Elemental hit", 24, "dex"), new Gem("Ensnarin arrow", 25, "dex"), new Gem("Ethereal knives", 26, "dex")
				, new Gem("Explosive arrow", 27, "dex"), new Gem("Fire trap ",28 , "dex"), new Gem("Flamethrower trap", 29, "dex") , new Gem("Flicker strike", 30, "dex")
				, new Gem("Frenzy", 31, "dex") , new Gem("Frost blades", 32, "dex"), new Gem("Galvanic arrow", 33, "dex") , new Gem("Herald of agony", 34, "dex")
				, new Gem("Ice shot", 35, "dex"), new Gem("Ice trap", 36, "dex"), new Gem("Lacerate", 37, "dex"), new Gem("Lancing steel", 38, "dex"), new Gem("Lightning arrow", 39, "dex")
				, new Gem("Lightning strike", 40, "dex"), new Gem("Mirror arrow", 41, "dex"), new Gem("Pestilent strike", 42, "dex"), new Gem("Poisonous conconction", 43, "dex")
				, new Gem("Puncture", 44, "dex"), new Gem("Rain of arrows", 45, "dex"), new Gem("Reave", 46, "dex"), new Gem("Scourge arrow", 47, "dex"), new Gem("Seismic trap", 38, "dex")
				, new Gem("Shattering steel", 49, "dex") , new Gem("Shrapnel ballista", 50, "dex"), new Gem("Siege ballista", 51, "dex"), new Gem("Spectral helix", 52, "dex")
				, new Gem("Spectral shield throw", 53, "dex"), new Gem("Spectral throw", 54, "dex"), new Gem("Split arrow", 55, "dex"), new Gem("Splitting steel", 56, "dex")
				, new Gem("Storm rain", 57, "dex"), new Gem("Tornado", 58, "dex"), new Gem("Tornado shot", 59, "dex"), new Gem("Toxic rain", 60, "dex"), new Gem("Venom gyre", 61, "dex")
				, new Gem("Viper strike", 62, "dex"), new Gem("Wild strike", 63, "dex")
				
				
		};

		Keystone[] keystones = { new Keystone("Acrobatics", 1), new Keystone("Vaal pact", 2)};
		
		a=randomGem();
		
		System.out.println(a);
		
		for (Gem var : gems) {

			if (a == var.getId()) {
				System.out.println( var.getNom() );
				break;
			} else {
				//System.out.println(var.getNom());
			}
				
		}
		
		
	b=randomGem2();
	
	System.out.println(b);
		
		for (Keystone var2 : keystones) {

			if (b == var2.getId()) {
				System.out.println( var2.getNom());
				break;
			} else {
				//System.out.println(var2.getNom());
			}
				
		}

		
	}

}
