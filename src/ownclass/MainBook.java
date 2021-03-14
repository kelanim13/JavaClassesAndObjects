package ownclass;

public class MainBook {

	public static void main(String[] args) {
		
		Book book1 = new Book("Harry Potter", "JK Rowling", 500, "English"); 
		Book book2 = new Book("Hunger Games", "Suzanne Collins", 300, "English"); 
		
		System.out.println(book1.title); 
	}

}
