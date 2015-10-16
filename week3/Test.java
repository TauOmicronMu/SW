
public class Test
{
	public static void main(String[] args)
	{
	
		Module sw = new Module("Software Workshop", "Jon Rowe");
		
		System.out.println(sw);
		
		System.out.println(sw.getName());
		System.out.println(sw.getLecturer());
		
		System.out.println("changing lecturer");
		sw.setLecturer("Martin Escardo");
		
		System.out.println(sw);
		
		Student alf = new Student("Alfred Smith", 12345);
		
		System.out.println(alf);
		System.out.println(alf.getName());
		System.out.println(alf.getId());
		
		System.out.println("changing id");
		alf.setId(54321);
		System.out.println(alf);
		
		alf.setModule(0, sw);
		alf.setModule(1, new Module("Foundations", "Dan Ghica"));
		alf.setModule(2, new Module("Intro to AI", "Volker Sorge"));
		
		//System.out.println(alf.getModule(1));
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println(alf.getModule(i));
		}		
		
	}
}