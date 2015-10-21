
public class Infection
{

	public static void main(String[] args)
	{
		Person p = new Person();
		System.out.println(p); // well person
		
		p.setInfected(true);
		System.out.println(p);  // sick person
		
		Population pop = new Population(100, 0.1, 0.85, 0.2);
		System.out.println(pop);  // population of 100 people
		System.out.println(pop.howManyInfected()); // about 10
		
		//run simulation for several time steps
		for(int i = 0; i < 10; i++)
		{
			pop.update();
		}
		System.out.println("");
		System.out.println("Tests for Question 2");
		System.out.println("Testing modified inital constructor");
		Population pop2 = new Population(100, 0.1, 0.85, 0.5);
		System.out.println(pop2 + " <- Instance successfully created.");
		System.out.println("Testing getDeath() and setDeath(0.05)");
		System.out.println(pop2.getDeath());
	    pop2.setDeath(0.05); 
		System.out.println(pop2.getDeath());
		System.out.println("Testing 2nd Constructor");
		Population pop3 = new Population(100, 0.1, 0.85, 0.2, 0.5);
		System.out.println(pop3 + " <- Instance successfully created."); 
		System.out.println("Testing getDeath() and setDeath(0.05)");
		System.out.println(pop3.getDeath());
	    pop3.setDeath(0.05); 
		System.out.println(pop3.getDeath());
		System.out.println("Testing with death");
		
		System.out.println("Setting death rate to 0.25...");
		pop3.setDeath(0.25);	
		
		//run simulation for several time steps
		for(int i = 0; i < 10; i++)
		{
			pop3.update();
		}
	}
}
