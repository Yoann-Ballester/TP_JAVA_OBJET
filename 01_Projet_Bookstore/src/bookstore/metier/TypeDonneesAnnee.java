package bookstore.metier;

import java.util.Objects;

public class TypeDonneesAnnee {
	
	private int annee;

	
	
	public TypeDonneesAnnee(int annee)  throws IllegalArgumentException{
		super();
		
	setAnnee(annee);
		
	}
			
		
		
	

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) throws IllegalArgumentException {
		if (annee<0) {
			System.err.println("Annee doit etre > (superieur) à 0");
			this.annee=0;
		} else
		this.annee = annee;
		
	}

	@Override
	public String toString() {
		return "[annee=" + annee + "]";
	}





	@Override
	public int hashCode() {
		return Objects.hash(annee);
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TypeDonneesAnnee other = (TypeDonneesAnnee) obj;
		return annee == other.annee;
	}
	
	
	
}
