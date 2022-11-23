package fr.afpa.tool;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;


public class UtilitaireBookstore {
	
	public static LocalDate date
    = LocalDate.parse("2022-10-26");
	
	public static LocalDate dureeMaxEmprunt = date.plusDays(15);
	
	public static void dateNow() {
		System.out.println("date (actuelle) correspondant au jour ou le livre est rendu : "+java.time.LocalDate.now());
	}

	public static void dureeMaxPret() {
		
		
		
		System.out.println("Duree max d'emprunt du livre : " + dureeMaxEmprunt);
		
		
	}
	
	public static void verifPret() {
		
		LocalDate date1 = java.time.LocalDate.now();
		int result = date1.compareTo(dureeMaxEmprunt);
		
		if (result == 0 || result < 0)
			System.out.println("Le livre est rendu dans les temps.");
		else 
			System.out.println("Le livre est rendu en retard.");
	}
	
	
	public static  int getAge (LocalDate dateNais, LocalDate dateNow) {
		
	 dateNais = LocalDate.parse("1995-07-07");
	 dateNow = LocalDate.parse("2022-11-02");
	
	
	
	Period diff = Period.between(dateNais, dateNow);
	int years= Math.abs(diff.getYears());
	
	System.out.println(years + " ans");	
	
	return years;
	
	}
	
	
	public static int getAge (LocalDateTime dateNais,LocalDateTime dateNow) {
		
		 dateNais = LocalDateTime.parse("1995-07-07T22:32:38.536");
		 dateNow = LocalDateTime.parse("2022-11-02T11:47:18.536");
		
		
		
		int diff = dateNais.compareTo(dateNow);
		
	
		
		System.out.println(diff);	
		
		return diff;
		
		}
	
	
	public static void dateEmpruntEffectif() {
		System.out.println("Date d'emprunt du livre : " + date);
	}
	
	public static void main(String[] args) {

		
		dateNow();
		
		dureeMaxPret();
		
		dateEmpruntEffectif();
		
		verifPret();
		
		getAge(date, date);
		
		
		
	}
}
