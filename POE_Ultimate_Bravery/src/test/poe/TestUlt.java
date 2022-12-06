package test.poe;


import poe.random.Gem;
import poe.random.Keystone;

public class TestUlt {

	static int min = 1;
	static int max = 152;

	static int range = (max - min)+1;

	public static int randomGem() {
		return (int) (Math.random() * range) + min;
	}
	
	static int min2 = 1;
	static int max2 = 43;

	static int range2 = (max2 - min2)+1;

	public static int randomGem2() {
		return (int) (Math.random() * range2) + min2;
	}


	
	
	public static int a;
	
	public static int b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gem[] gems = { new Gem("Cyclone", 1, "dex"), new Gem("Blade flurry", 2, "dex"),
				new Gem("Ancestral warchief", 3, "str"), new Gem("Cold snap", 4, "int"), new Gem("Soulrend", 5, "int"), new Gem("Animate Weapon", 6, "dex"), new Gem("Artillery Ballista", 7, "dex")
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
				, new Gem("Viper strike", 62, "dex"), new Gem("Wild strike", 63, "dex"), new Gem("Absolution", 64, "str"), new Gem("Ancestral protector", 65, "str"), new Gem("Bladestorm", 66, "str")
				, new Gem("Boneshatter", 67, "str"), new Gem("Chain hook", 68, "str"), new Gem("Cleave", 69, "str"), new Gem("Consacrated path", 70, "str"), new Gem("Corrupting fever", 71, "str")
				, new Gem("Dminating blow", 72, "str"), new Gem("Earthquake", 73, "str"), new Gem("Exsanguinate", 74, "str"), new Gem("General's Cry", 75, "str"), new Gem("Glacial hammer", 75, "str")
				, new Gem("Ground slam", 76, "str"), new Gem("Heavy strike", 77, "str"), new Gem("Holy flame totem", 78, "str"), new Gem("Ice crash", 79, "str"), new Gem("Infernal blow", 80, "str")
				, new Gem("Molten strike", 81, "str"), new Gem("Perforate", 82, "str"), new Gem("Rage vortex", 83, "str"), new Gem("Reap", 84, "str"), new Gem("Searing bond", 85, "str")
				, new Gem("Shield charge", 86, "str"), new Gem("Shield crush", 87, "str"), new Gem("Shockwave totem", 88, "str"), new Gem("Smite", 89, "str"), new Gem("Static strike", 90, "str")
				, new Gem("Sunder", 91, "str"), new Gem("Sweep", 92, "str"), new Gem("Tectonic slam", 93, "str"), new Gem("Arc", 94, "int"), new Gem("Armageddon brand", 95, "int"), new Gem("Ball lightning", 96, "int")
				, new Gem("Bane", 96, "int"), new Gem("Blazing salvo", 97, "int"), new Gem("Blight", 98, "int"), new Gem("Bodyswap", 99, "int"), new Gem("Crackling lance", 100, "int")
				, new Gem("Creeping frost", 101, "int"), new Gem("Dark pact", 102, "int"), new Gem("Divine ire", 103, "int"), new Gem("Essence drain", 104, "int"), new Gem("Eye of winter", 105, "int")
				, new Gem("Fireball", 106, "int"), new Gem("Firestorm", 107, "int"), new Gem("Flame surge", 108, "int"), new Gem("Flame wall", 109, "int"), new Gem("Flameblast", 110, "int")
				, new Gem("Forbidden rite", 111, "int"), new Gem("Freezing pulse", 112, "int"), new Gem("Frost bolt", 113, "int"), new Gem("Galvanic field", 114, "int"), new Gem("Glacial cascade", 115, "int")
				, new Gem("Hexblast", 116, "int"), new Gem("Hydrosphere", 117, "int"), new Gem("Ice nova", 118, "int"), new Gem("Ice spear", 119, "int"), new Gem("Icicle mine", 120, "int"), new Gem("Incinerate", 121, "int")
				, new Gem("Kinetic blast", 122, "int"), new Gem("Kinetic bolt", 123, "int"), new Gem("Lightning spire trap", 124, "int"), new Gem("Ligtning tendrils", 125, "int")
				, new Gem("Lightning trap", 126, "int"), new Gem("Orb of storm", 127, "int"), new Gem("Penance brand", 128, "int"), new Gem("Power siphon", 129, "int")
				, new Gem("Purifying flame", 130, "int"), new Gem("Pyroclast mine", 131, "int"), new Gem("Righteous fire", 132, "int"), new Gem("Rolling magma", 133, "int")
				, new Gem("Scorching ray", 134, "int"), new Gem("Shock nova", 135, "int"), new Gem("Spark", 136, "int"), new Gem("Storm brand", 137, "int"), new Gem("Sotrm burst", 138, "int")
				, new Gem("Storm call", 139, "int"), new Gem("Stormbind", 140, "int"), new Gem("Stormblast mine", 141, "int"), new Gem("Raise spectre", 142, "int")
				, new Gem("Raise zombie", 143, "int"), new Gem("Summon golem(fire,chaos,ice...)", 144, "int"), new Gem("Summon raging spirit", 145, "int"), new Gem("Summon reaper", 146, "int")
				, new Gem("Summon skeletons", 147, "int"), new Gem("Voltaxic burst", 148, "int"), new Gem("Wave of conviction", 149, "int"), new Gem("Winter orb", 150, "int")
				, new Gem("Wintertide brand", 151, "int"), new Gem("Vortex", 152, "int")
				
				
		};

		Keystone[] keystones = { new Keystone("Acrobatics", 1), new Keystone("Ancestral bond", 2), new Keystone("Vaal pact", 3), new Keystone("Arrow dancing", 4), new Keystone("Avatar of fire", 5), new Keystone("Blood magic", 6)
								, new Keystone("Call to arms", 7), new Keystone("Chaos inoculation", 8), new Keystone("Conduit", 9), new Keystone("Crimson Dance", 10), new Keystone("Divine shield", 11), new Keystone("Eldritch battery", 12)
								, new Keystone("Elemental equilibrium", 13), new Keystone("Elemental overload", 14), new Keystone("Eternal youh", 15), new Keystone("Ghost dance", 16), new Keystone("Ghost reaver", 17)
								, new Keystone("Glancing blows", 18), new Keystone("Hex master", 19), new Keystone("Imbalanced guard", 20), new Keystone("Iron grip", 21), new Keystone("Iron reflexes", 22)
								, new Keystone("Iron will", 23), new Keystone("Lethe shade", 24), new Keystone("Magebane", 25), new Keystone("Mind over matter", 26), new Keystone("Minion instability", 27)
								, new Keystone("Necromantic aegis", 28), new Keystone("Pain attunement", 29), new Keystone("Perfect Agony", 30), new Keystone("Point blank", 31)
								, new Keystone("Precise technique", 32), new Keystone("Resolute technique", 33), new Keystone("Runebinder", 34), new Keystone("Solipsism", 35), new Keystone("Supreme ego", 36)
								, new Keystone("The agnostic", 37), new Keystone("The impaler", 38), new Keystone("Unwavering stance", 39), new Keystone("Versatile combattant", 40)
								, new Keystone("Wicked ward", 41), new Keystone("Wind dancer", 42), new Keystone("Zealot oath", 43)
		
		};
		
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
