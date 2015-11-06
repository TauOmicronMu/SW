import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**	
Component containing a house
*/
public class HouseComponent extends JComponent
{
	private House house;
	
	/**
		Create a component with a particular house location and size
		@param xCoord x coordinate of house
		@param yCoord y coordinate of house
		@param size size of house
	*/
	public HouseComponent(int xCoord, int yCoord, int size)
	{
		super();
		house = new House(xCoord, yCoord, size);
	}
	
	/**
		Paint component on graphics object
		@param g the graphics object
	*/
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;

		house.draw(g2);	
	}
}
