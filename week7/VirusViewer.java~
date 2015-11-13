import javax.swing.JFrame;

public class VirusViewer
{		
	public static void main(String[] args)
	{
		Population pop = new Population(100, 0.7, 0.40, 0.25);
		double[] proportion = new double[1000];
		for(int i = 0; i < proportion.length; i++)
		{
			proportion[i] = pop.proportionInfected();
			pop.update();
		}
		
		int frameSize = 1000;
		/*int offset = 200;*/
		
		JFrame frame = new JFrame();
		
		frame.setSize(frameSize, frameSize);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		VirusComponent virus = new VirusComponent(proportion, frameSize);
		
		frame.add(virus);
		
		frame.setVisible(true);
	}	
		
}
