package classes;

import customclass.Show;
import pet.Pet;

public class Main {

	public static void main(String[] args) {
		
		Pet dog = new Pet("Kato", 13, "Steamboat Springs, CO", "Golden Retriever"); 
		
		dog.getPetName();
		dog.getPetAge();
		dog.getPetLocation();
		
		dog.setAge(9);
		dog.setLocation("Honolulu, HI");
		dog.setName("Buddy");
		
		dog.getPetAge();  
		dog.getPetName();
		
		Pet cat = new Pet("Hapa", 15, "Oak Creek, CO", "Long-Haired");
		
		cat.getPetName();
		cat.getPetAge();
		cat.getPetLocation();
		
		
		
		Show criminalMinds = new Show("Criminal Minds", "Mathew Gray Gubler", 15);   
		
		System.out.println(criminalMinds.getCastMember()); 
		System.out.println(criminalMinds.getTitle()); 
		System.out.println(criminalMinds.getSeasons());
		System.out.println(criminalMinds.showReview());
		
		
		Show gilmoreGirls = new Show("Gilmore Girls", "Lauren Graham", 7); 
		
		System.out.println(gilmoreGirls.getTitle()); 
		System.out.println(gilmoreGirls.getCastMember()); 
		
		Show greysAnatomy = new Show("Grey's Anatomy", "Ellen Pompeo", 17);   
		
		System.out.println(greysAnatomy.getSeasons()); 
		System.out.println(greysAnatomy.getCastMember()); 
		
		Show lawAndOrder = new Show("Law and Order SVU", "Mariska Hargitay", 22); 
		
		lawAndOrder.setCast("Kelli Giddish");
		System.out.println(lawAndOrder.getCastMember()); 
	}
}
