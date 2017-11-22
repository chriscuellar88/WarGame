
public class Tile 

{
	String name;
	int id;
	String color;
	
	
	public Tile(int tileID)
	{
		id = tileID;
		
		switch (id)
		{
		case 1:
			name = "Plains";
			color = "1c";
			break;
		case 3:
			name = "Water";
			color = "3c";
			break;
		
	
		}	
	}	

	public String getColor() 
		{
			return color;
		}
}
