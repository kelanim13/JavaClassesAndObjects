package custom;

public class Show {
	
	//Instance variables
	
	private String title; 
	private String cast; 
	private Integer seasons; 
	
	//Empty constructor
	
	public Show()
	{
		title = "miscellaneous"; 
		cast = ""; 
		seasons = 0; 
	}
	
	// 2 of 3 variables
	
	public Show(String showCast, Integer showSeasons)
	{
		this.cast = showCast; 
		this.seasons = showSeasons; 
	}
	
	//all 3 variables
	
	public Show(String showTitle, String tvCast, Integer tvSeasons)
	{
		this.title = showTitle; 
		this.cast = tvCast; 
		this.seasons = tvSeasons; 
	}
	
	//Get Methods
	
	public String getTitle()
	{
		return title; 
	}
	
	public String getCast()
	{
		return cast; 
	}
	
	public Integer getSeasons()
	{
		return seasons; 
	}
	
	//Set Methods
	
	public void setTitle(String title)
	{
		this.title = title; 
	}
	
	public void setCast(String cast)
	{
		this.cast = cast; 
	}
	
	public void setSeasons(Integer seasons)
	{
		this.seasons = seasons; 
	}
	
	//Method that returns a boolean
	boolean isSeasonLong()
	{
		if(seasons > 15)
		{
			return true; 
		}
		return false; 
	}
	
	//Method that returns a string
	
	public String showReview()
	{
		return this.title + "is an excellent show!" + "Even though there are" + this.seasons + "seasons," + this.cast + "is top notch!"; 	
	}
}


