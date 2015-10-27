/**
	Represents a 2D array that indicates areas of poor signal.
*/
public class SignalMap
{
	//Attributes
	
	private boolean[][] map;
	private double threshold;
	private int size;
	private Network network;

	//Constructor

	/**
		Creates a new SignalMap.
		@param threshold the point at which a signal becomes poor
		@param size the size of the array
		@param net the network representing signal
	*/
	public SignalMap(double threshold, int size, Network net)
	{
		this.threshold = threshold;
		this.size = size;
		this.network = net;
		this.map = new boolean[size][size];
		
		//populate the map with booleans based on the signal threshold.
		
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				if(this.network.getSignal(i, j) < threshold)
				{
					this.map[i][j] = false;
				}
				else
				{
					this.map[i][j] = true;
				}
			}
		}
	}
	
	/**
		Prints the array showing those areas with poor signal.
	*/
	public void display()
	{
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				if(this.map[i][j] == false)
				{
					System.out.print("X");
				} 
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	
	/**
		Calculates the fraction of the map with a poor signal.
		@return proportion of the map with poor signal.
	*/
	public double poorSignal()
	{
		double total = 0.0;
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				if(this.map[i][j] == false)
				{
					total++;
				}
			}
		} 
		return total/(double)(size * size); 
	}
}
