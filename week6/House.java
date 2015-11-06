import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;

public class House
{
	private Rectangle building;
	private Line2D.Double leftRoof;
	private Line2D.Double rightRoof;
	private Rectangle door;
	
	/**
		Create he buiding, roof and door of a house.
	*/
	public House(int xCoord, int yCoord, int size)
	{
	    building  = new Rectangle(xCoord, (yCoord + size/2), size, size);
	    leftRoof = new Line2D.Double(xCoord, (yCoord + size/2), 
					    (xCoord + size/2), yCoord);
	    rightRoof = new Line2D.Double(xCoord + size, (yCoord + size/2),
					    (xCoord + size/2), yCoord);
	    door = new Rectangle(xCoord + size/2, yCoord + size,
			 		    size/4, size/4);
	}
	/**
		Draw the house on a graphics object.
	*/
	public void draw(Graphics2D g)
	{
		g.setColor(Color.WHITE);
		g.fill(building);
		g.fill(door);
                g.setColor(Color.BLACK);
	        g.draw(building);
		g.draw(leftRoof);
		g.draw(rightRoof);
		g.draw(door);	
	}
}
