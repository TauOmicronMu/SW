import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.ArrayList;

/**
	Component containing an arraylist of houses.
*/
class StreetComponent extends JComponent
{
	private ArrayList<House> street;
	
	/**
		Creates a component with an arraylist of houses
		@param xCoord x coordinate of first house
		@param yCoord y coordinate of first house
		@param size the size of each house
		@param distance the distance between houses
		@param number the number of houses
	*/
	public StreetComponent(int xCoord, int yCoord, int size,
				int distance, int number)
	{
		super();
		street = new ArrayList<House>();
		for(int i = 0; i < number; i++)
		{
			street.add(new House((xCoord + i*distance), yCoord, 
						size));; 
		}	
	}
	
	/**	
		paint component on graphics object
		@param g the graphics object
	*/
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		
		for(int i = 0; i < this.street.size(); i++)
		{
			this.street.get(i).draw(g2);
		}
	}
}
