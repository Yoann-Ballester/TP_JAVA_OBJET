package fr.afpa.tool;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import fr.afpa.tool.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



class UtilitaireBookstoreTest {

	@Test void getAgeTest1995() {
		LocalDate dateNais = LocalDate.parse("1995-07-07");
		LocalDate dateNow = LocalDate.parse("2022-11-02");
		
		assertEquals(UtilitaireBookstore.getAge(dateNais, dateNow),27,"L'age doit valoir 27.");
	}
	
	
	
}
