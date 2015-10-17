public class MyArrayList
{
	// attributes
	
		String[] strings;
		int arraySize;
		int realSize;
		
	// constructor
	
	public MyArrayList()
	{
		this.arraySize = 10;
		this.strings = new String[this.arraySize];
		this.realSize = 0; //Initially 0 strings.
	}
	
	// get methods	
		
	//Was originally named getString...
	public String get(int n)
	{
		if(n >= 0 && n < this.realSize)
		//If the index is non-negative and in range...
		{
			return strings[n];
		}
		//Would rather throw an exception, but I guess I'll do this...
		System.out.println("That Index is out of bounds.");
		return null;
	}	
		
	// add method
	
	//Was originally named addString...
	public void add(String string)
	{
		if(this.realSize != this.arraySize)
		//If the array isn't full...
		{
			strings[realSize] = string;
			//Add the user's input to the array.
			this.realSize += 1; //Increment the realSize.
		}
		else
		//If the array is full...
		{
			String[] newArray = new String[arraySize+10];
			//Create a new array with a size 10 larger than the original.
			for(int i=0; i < arraySize; i++)
			//Copy elements from the old array across into the larger one.
			{	
				newArray[i] = this.strings[i];
			}
			this.arraySize += 10; //Increase the arraySize by 10.
			//Replace the old array with the larger one.
			this.strings = newArray;
			
			//Add the new string to the array.
			this.strings[this.realSize] = string;
			this.realSize += 1; //Increment the realSize.
		}
		
	}

}
