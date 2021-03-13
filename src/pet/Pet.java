package pet;

public class Pet {
	
	//Instance variables
	
	private String name; 
	private Integer age; 
	private String location; 
	private String type; 
	
	//Empty constructor
	
	public Pet() {
		name = "Kula"; 
		age = 7; 
		location = "Sao Paolo"; 
		type = "Golden Retriever"; 
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
	
	public void setName(String newName)
	{
		this.name = newName; 
	}
	
	public void setAge(Integer newAge)
	{
		if (age >= 1 && age <= 16)
		{
			this.age = newAge; 
		}
		else
		{
			this.age = 2; 
		}
		
	}
	
	public void setLocation(String newLocation)
	{
		this.location = newLocation; 
	}

}
