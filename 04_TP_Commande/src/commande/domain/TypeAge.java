package commande.domain;

import java.text.ParseException;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TypeAge {

	
	// https://www.delftstack.com/fr/howto/java/java-subtract-dates/
	
	
	
	
	public static int getAge(String dateNaiss) throws ParseException {
		
	
		Date firstDate = Commande.sdf.parse("29/11/22");
		Date seconDate = Commande.sdf.parse(dateNaiss);
		
		long diff = firstDate.getTime() - seconDate.getTime();
		TimeUnit time = TimeUnit.DAYS;
		long difference = time.convert(diff,TimeUnit.MILLISECONDS);
		
		int age = (int) (difference/360);
		
		return age;
	}

public static void main(String[] args) throws ParseException {
	
	
	System.out.println(getAge("10/10/90"));
}
}

