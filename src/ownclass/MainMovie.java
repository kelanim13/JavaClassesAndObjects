package ownclass;

public class MainMovie {

	public static void main(String[] args) {
		
		Movies movie1 = new Movies("The Hunger Games", "Gary Ross", "PG-13"); 
		Movies movie2 = new Movies("Baby Driver", "Edgar Wright", "R"); 
		Movies movie3 = new Movies("Knives Out", "Rian Johnson", "PG-13"); 
		Movies movie4 = new Movies("Divergent", "Neil Burger", "PG-13"); 
		
		System.out.println(movie1.getTitle()); 
		System.out.println(movie1.getRating()); 
		
		movie1.setDirector("Dave Wazowski");
		System.out.println(movie1.getDirector());
		
		
		

	}

}
