import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.*;
import java.awt.Font;

public class VirusComponent extends JComponent
{
	private double[] proportion;
	private int frameSize;
	private int offset;
	
	public VirusComponent(double[] proportion, int frameSize, int offset)
	{
		super();
		this.proportion = proportion;
		this.frameSize = frameSize;
		this.offset = offset;
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		
		Line2D line = new Line2D.Float(offset, offset, offset, frameSize+offset);
	    g2.draw(line);
	    
	    Line2D line2 = new Line2D.Float(offset, frameSize+offset, frameSize+offset, frameSize+offset);
	    g2.draw(line2);
	    
	    g2.setFont(new Font("TimesRoman", Font.BOLD, 24));
	    g2.drawString("Infections", offset-50, offset-20);
	    g2.drawString("Time", (frameSize+offset)/2, frameSize+offset+30);
	    
		//iterate over the list of proportions
		for(int i = 0; i < proportion.length; i++)
		{
			    Rectangle.Double pixel = new Rectangle.Double((double)i + offset, frameSize - this.proportion[i]*frameSize + offset, 5, 5);
			    
			    g2.fill(pixel);	
		}
	}
}
