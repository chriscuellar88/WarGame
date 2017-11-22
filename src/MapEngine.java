import java.util.ArrayList;
import java.util.Arrays;

public class MapEngine
{
		

	public static void main (String[] args)
	
	{
		
		int[][] testMap = new int[3][5];
		ArrayList<String> colorTest = new ArrayList<String>();

		
	// Load map from file
				for (int x = 0; x < testMap.length; x++) 
				{
				    for (int y = 0; y < testMap[0].length; y++) 
				    {
				        testMap[x][y] = 3;
				    }
				}
						testMap[2][2] = 1;
	// Assign each number a tile
				
				for (int x = 0; x < testMap.length; x++) 
				{
				    for (int y = 0; y < testMap[0].length; y++) 
				    {
				       int tileID = testMap[x][y];
				       
				       if(tileID == 3)
				       {
				    	Tile water;
				    	water = new Tile(3);
				    	colorTest.add(water.getColor());
				       }
				       
				       else if (tileID == 1)
				       {
				    	Tile plains;
				    	plains = new Tile(1);
				    	colorTest.add(plains.getColor());
				       }
				    }
				}
				
	// Print out
				for (int x = 0; x < testMap.length; x++) 
				{
				    for (int y = 0; y < testMap[0].length; y++) 
				    {
				    	System.out.print(testMap[x][y]);
				    	
				    }
				    System.out.println();
				}
				System.out.print(Arrays.toString(colorTest.toArray()));
	}
}
