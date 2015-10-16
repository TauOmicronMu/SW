public class TestArrayList
{
	public static void main(String[] args)
	{
		MyArrayList al = new MyArrayList();
		for(int i=0; i<50; i++)
		{
			al.addString("" + i);
		}
		System.out.println("");
		System.out.println("Testing addString()");
		al.addString("CAKE");
		System.out.println("AddString() didn't throw an exception.");
		System.out.println("Testing getString() [In bounds]");
		System.out.println("String 15: " + al.getString(14));
		System.out.println("Testing getString() [Out of bounds]");
		System.out.println("String 61: " + al.getString(60));
		System.out.println("Testing complete - MyArrayList works ^-^");
		System.out.println("");
	}
}
