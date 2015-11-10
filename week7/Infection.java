
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
		for(int i = 0; i < 40; i++)
		{
			pop.update();
			System.out.println(pop.proportionInfected());
		}
		
	}
}
