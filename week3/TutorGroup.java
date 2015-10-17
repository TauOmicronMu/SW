import java.util.*;

public class TutorGroup
{
// attributes

	private String tutor;
	private ArrayList<Student> students;

// constructor

	public TutorGroup(String tutor)
	{
		this.tutor = tutor;
		this.students = new ArrayList<Student>();
	}

// toString method
	
	public String toString()
	{
		return "Tutor: " + this.tutor + ", students: " + this.students;
	}
	
// get methods
		
	public ArrayList<Student> getStudents()
	{
		return this.students;
	}

	public String getTutor()
	{
		return this.tutor;
	}
		
// set methods

	public void setTutor(String tutor)
	{
		this.tutor = tutor;
	}

// misc methods

	public void addStudent(Student student)
	{
		this.students.add(student);
	}

}	
