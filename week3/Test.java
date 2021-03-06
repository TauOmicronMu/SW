import java.util.*;

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
		Student bob = new Student("Bob Mascheranas", 24680);
		
		System.out.println(alf);
		System.out.println(alf.getName());
		System.out.println(alf.getId());
		
		System.out.println("changing id");
		alf.setId(54321);
		System.out.println(alf);
		
		alf.setModule(0, sw);
		alf.setModule(1, new Module("Foundations", "Dan Ghica"));
		alf.setModule(2, new Module("Intro to AI", "Volker Sorge"));
		
		bob.setModule(0, sw);
		bob.setModule(1, new Module("Foundations", "Dan Ghica"));
		bob.setModule(2, new Module("Intro to AI", "Volker Sorge"));
		
		TutorGroup TG = new TutorGroup("Nick Hawes");
		
		System.out.println("Does sw = sw?");
		System.out.println(sw.equals(sw));
		
		System.out.println("Is alf on sw?");
		System.out.println(alf.onModule(sw));
		
		System.out.println("Check: TutorGroup toString()");
		System.out.println(TG);
		
		System.out.println("Check: TutorGroup getStudents()");
		System.out.println(TG.getStudents());
		
		System.out.println("Check: TutorGroup addStudent()");
		TG.addStudent(bob);
		System.out.println(TG.getStudents());

		System.out.println("Check: TutorGroup setTutor()");
		TG.setTutor("Achim Jung");
		System.out.println(TG);

		System.out.println("Check: TutorGroup getTutor()");
	 	System.out.println(TG.getTutor());
		
		//System.out.println(alf.getModule(1));
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println(alf.getModule(i));
		}		
		
	}
}
