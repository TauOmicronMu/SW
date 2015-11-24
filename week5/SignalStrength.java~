
/**
Assess signal strength across grid.
*/


public class SignalStrength
{
	private Network net;
	private double[][] signal;
	private int range;
	
	/**
	Store signal strength of network.
	@param net the network of transmitters
	@param range the maximum value of the location coordinates
	*/
	public SignalStrength(Network net, int range)
	{
		this.net = net;
		this.range = range;
		this.signal = new double[range][range];
		
		
		for(int i = 0; i < range; i++)
		{			
			for(int j = 0; j < range; j++)
			{
				signal[i][j] = net.getSignal(i, j);
			}
		}
	}	
	
	/**
	Average signal strength
	@return The average signal strength
	*/
	public double averageSignal()
	{
		double count = 0.0;
		for(int i = 0; i < range; i++)
		{
			for(int j = 0; j < range; j++)
			{
				count = count + signal[i][j];
			
			}
		}
		return count/(range * range);
	}
	
	/**
		Return the signal strength at position, (x, y).
		@param x the x coordinate
		@param y the y coordinate
		@return the signal strength at (x, y).
	*/
	public double getStrength(int x, int y)
	{
		return this.signal[x][y];
	}	
}
		
		
		
		
		
		
