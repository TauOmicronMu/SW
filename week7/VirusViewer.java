import javax.swing.JFrame;

public class VirusViewer
{		
	public static void main(String[] args)
	{
		Population pop = new Population(100, 0.1, 0.85, 0.2);
		double[] proportion = new double[1000];
		for(int i = 0; i < proportion.length; i++)
		{
			proportion[i] = pop.proportionInfected();
			pop.update();
		}
		
		int frameSize = 1000;
		int offset = 200;
		
		JFrame frame = new JFrame();
		
		frame.setSize(frameSize + offset*2, frameSize + offset*2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		VirusComponent virus = new VirusComponent(proportion, frameSize, offset);
		
		frame.add(virus);
		
		frame.setVisible(true);
	}	
		
}
