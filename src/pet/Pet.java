package pet;

public class Pet {
	
	//Instance variables
	
	private String name; 
	private Integer age; 
	private String location; 
	private String type; 
	
	//Empty constructor
	
	public Pet() {
		name = ""; 
		age = 0; 
		location = ""; 
		type = ""; 
	}
	
	//All attributes
	
	public Pet(String petName, Integer petAge, String location, String type)
	{
		this.name = petName; 
		this.age = petAge; 
		this.location = location; 
		this.type = type; 
	}
	
	//Get Methods
	
	public void getPetName() 
	{
		System.out.println("My pet's name: " + name); 
	}
	
	public void getPetAge() 
	{
		System.out.println("My pet's age: " + age); 
	}
	
	public void getPetLocation()
	{
		System.out.println("My pet's location: " + location); 
	}
	
	//Set Methods
	
	public void changeName(String newName)
	{
		this.name = newName; 
	}
	
	public void changeAge(Integer newAge)
	{
		this.age = newAge; 
	}
	
	public void changeLocation(String newLocation)
	{
		this.location = newLocation; 
	}

}
