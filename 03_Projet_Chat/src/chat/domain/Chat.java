package chat.domain;


import animal.domain.Mammifere;

public class Chat extends Mammifere{

	public Chat() {
		super();
	}
	
public Chat(String nom) {
		super(nom);
	}


@Override
public String toString() {
	
	return "Je suis un chat de nom "+getNom();
	
}	


@Override
public String parle() {
	return getNom()+" parle :miaou miaou";
}
	
	public static void main(String[] args) {
		
		
		Chat cat = new Chat("felix");
		
		System.out.println(cat);
	}
	

}


