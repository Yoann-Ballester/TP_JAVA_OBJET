package animal.domain;

public interface Nommable {

	public String getNom();
	
	public default void setNom(String nom) throws AnimalException {
		setNom(nom);
	};

}