import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class VirusComponent extends JComponent
{
	private double[] proportion;
	private int frameSize;
	
	public VirusComponent(double[] proportion, int frameSize)
	{
		super();
		this.proportion = proportion;
		this.frameSize = frameSize;
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		
		for(int i = 0; i < proportion.length; i++)
		{
			
		}
	}
}
