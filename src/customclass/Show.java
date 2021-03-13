package customclass;

public class Show {
	
	//Instance variables
	
	private String title; 
	private String cast; 
	private Integer seasons; 
	
	//Empty constructor
	
	public Show()
	{
		title = "NCIS"; 
		cast = "Mark Harmon"; 
		seasons = 8; 
	}
	
	// 2 of 3 variables
	
	public Show(String castMember, Integer showSeasons)
	{
		this.cast = castMember; 
		this.seasons = showSeasons; 
	}
	
	//all 3 variables
	
	public Show(String showTitle, String castMember, Integer showSeasons)
	{
		this.title = showTitle; 
		this.cast = castMember; 
		this.seasons = showSeasons; 
	}
	
	//Get Methods
	
	public String getTitle()
	{
		return title; 
	}
	
	public String getCastMember()
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
	public boolean isSeasonLong()
	{
		if(seasons >= 15)
		{
			return true; 
		}
		return false; 
	}
	
	//Method that returns a string
	
	public String showReview()
	{
		return this.title + " is an excellent show! " + "Even though there are " + this.seasons + " seasons, " + this.cast + " is top notch!"; 	
	}
}


