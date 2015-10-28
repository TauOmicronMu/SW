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
					System.out.print("-");
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
	
	/**
		Works out which transmitter is the most important.
		@return the most important transmitter.
	*/
	public Transmitter important()
	{
		System.out.println("[TRACE] BEGIN TRACE: SignalMap.important()");
		
		//Track the worst coverage for signal.
		double worstCoverage = poorSignal();
		System.out.println("[TRACE] Original worstCoverage = " + worstCoverage);
		
		//Create a 'blank' transmitter, that we will overwrite with any more important transmitters.
		Transmitter importantTransmitter = new Transmitter(0, 0, 0);
		System.out.println("[TRACE] Original importantTransmitter = " + importantTransmitter);
		
		//For every transmitter in network... (i is the transmitter that we're testing importance for at this point).
		for(int i = 0; i < this.network.size(); i++)
		{
			//Create a new network that we will populate with all but one network each time.;
			Network temporaryNetwork = new Network(); //Creates a new, empty network.
			System.out.println("[TRACE] new empty network created");
			
			//Populate the new network with everything except the ith transmitter.
			System.out.println("[TRACE] populating new network");
			for(int j = 0; j < this.network.size(); j++)
			{
				//If it isn't the transmitter for which we're testing...
				if(j != i)
				{
					//Add the transmitter to the new network.
					System.out.println("[TRACE] j != i");
					temporaryNetwork.add(this.network.getTransmitter(j));
					System.out.println("[TRACE] current network: " + temporaryNetwork);
				}
			}
			
			//Check to see if this transmitter is more important than the subsequent transmitters...
			//First of all, create a SignalMap with temporaryNetwork.
			SignalMap temporarySignalMap = new SignalMap(this.threshold, this.size, temporaryNetwork);
			System.out.println("[TRACE] New signal map created");	
			if(temporarySignalMap.poorSignal() > worstCoverage)
			{
				//Update the worst coverage variable.
				worstCoverage = temporarySignalMap.poorSignal();
				System.out.println("[TRACE] worstCoverage = " + worstCoverage);
				
				//Update the most important transmitter.
				System.out.println("[TRACE] importantTransmitter is at index i = " + i);
				importantTransmitter = this.network.getTransmitter(i);
				System.out.println("[TRACE] importantTrasmitter = " + importantTransmitter);
			}
		}
		System.out.println("[TRACE] END TRACE: SignalMap.important()");
		//Return the most important transmitter.
		return importantTransmitter;
	}
	
	/**
		Displays a map showing where newNetwork has stronger signal than this.network
		@param newNetwork the network to compare the current one to.
	*/
	public void compare(Network newNetwork)
	{	
		//Creates a SignalStrength object for the current network.
		SignalStrength originalSignalStrength = new SignalStrength(this.network, this.size);
		
		//Creates a SignalStrength object for the new network.
		SignalStrength newSignalStrength = new SignalStrength(newNetwork, this.size);
		
		//Loop through both SignalStrength objects and compare.
		for(int i = 0; i < this.size; i++)
		{
			for(int j = 0; j < this.size; j++)
			{	
				if(newSignalStrength.getStrength(i, j) > originalSignalStrength.getStrength(i, j))
				{
					System.out.print("X");
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println("");
		}
	}
}
