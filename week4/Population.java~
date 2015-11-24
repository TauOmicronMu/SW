/**
Represents a population of people and an infection that passes between between them.
*/
import java.util.*;

public class Population
{
	private ArrayList<Person> pop;
	private double infect; // infection rate of the disease
	private double recover; //recovery rate for the disease
	private Random generator; // random number generator
	private int popsize; //Number of people in the population
	private double deathRate; //Death rate of dying from the infection
	
	/**
	Create a population, some of whom may be infected
	@param popsize the population size
	@param initial the proportion of the population initially infected
	@param infect the infection rate
	@param recover the recovery rate
	*/
	public Population(int popsize, double initial, double infect, double recover) 
	{
		this.infect = infect;
		this.recover = recover;
		this.pop = new ArrayList<Person>();
		this.generator = new Random();
		this.popsize = popsize;
		this.deathRate = 0.0; //Defaults to 0.0 when not provided.
		
		for(int i = 0; i < popsize; i++)
		{
			pop.add(new Person());
		}
		
		for(int i = 0; i < popsize; i++)
		{
			if(generator.nextDouble() < initial)
			{
				pop.get(i).setInfected(true);
			}
		}
	
	}
	
	/**
	Create a population, some of whom may be infected
	@param popsize the population size
	@param initial the proportion of the population initially infected
	@param infect the infection rate
	@param recover the recovery rate
	@param deathRate the death rate
	*/
	public Population(int popsize, double initial, double infect, double recover, double deathRate) 
	{
		this.infect = infect;
		this.recover = recover;
		this.pop = new ArrayList<Person>();
		this.generator = new Random();
		this.popsize = popsize;
		this.deathRate = deathRate;
		
		for(int i = 0; i < popsize; i++)
		{
			pop.add(new Person());
		}
		
		for(int i = 0; i < popsize; i++)
		{
			if(generator.nextDouble() < initial)
			{
				pop.get(i).setInfected(true);
			}
		}
	
	}
	
	/** 
	Get the population size
	@return population size
	*/
	public int getPopsize()
	{
		return pop.size();
	}
	
	
	public String toString()
	{
		return "population of " + this.getPopsize() + " people";
	}
	
	/**
	Get infection rate
	@return infection rate
	*/
	public double getInfect()
	{
		return this.infect;
	}
	
	/**
	Get recovery rate
	@return recovery rate
	*/
	public double getRecover()
	{
		return this.recover;
	}
	
	/**
	Get death rate
	@return death rate
	*/
	public double getDeath()
	{
		return this.deathRate;
	}
	
	/**
	Change infection rate
	@param infect new infection rate
	*/
	public void setInfect(double infect)
	{
		this.infect = infect;
	}
	
	/**
	Change recovery rate
	@param recover new recovery rate
	*/
	public void setRecover(double recover)
	{
		this.recover = recover;
	}
	
	/**
	Change death rate
	@param death new death rate
	*/
	public void setDeath(double death)
	{
		this.deathRate = death;
	}
	
	/**
	Is the person at a specific index infected?
	@param index index of the person concerned
	@return whether or not this person is infected
	*/
	public boolean isInfected(int index)
	{
		return pop.get(index).isInfected();
	}
	
	
	/**
	How many people are infected?
	@return how many infected people in the population?
	*/
	public int howManyInfected()
	{
		int count = 0;
		for(int i = 0; i < getPopsize(); i++)
		{
			if(isInfected(i))
			{
				count++;
			}
		}
		return count;
	}
	
	/**
	What proportion of population are infected?
	@return proportion infected
	*/
	public double proportionInfected()
	{
		return ((double)howManyInfected())/getPopsize();
	}
	
	/**
	Update status of population following a period of time
	*/
	public void update()
	{
		ArrayList<Person> alivePeople = new ArrayList<Person>();
		int deadPeopleRemoved = 0;
		int infectedPeople = 0;
		/*
		Check first to see if anyone dies. This way, the dead people can't recover, nor can  
		they infect anyone because they're already dead.(i.e. the wrong proportion of people 
		would die if the death rate wasn't applied at this point in the update process. 
		*/
		for(int i = 0; i < getPopsize(); i++)
		{
			if(isInfected(i))
			{	
				System.out.print(i + " is infected.");
				infectedPeople++;
				if(generator.nextDouble() < deathRate)
				{
					System.out.print(" <- i died");
					deadPeopleRemoved++;
				}
				else
				{
					alivePeople.add(pop.get(i)); //The person did not die.
					System.out.print(" <- i didnt die");
				}
			System.out.println("");
			}
			else
			{
				alivePeople.add(pop.get(i)); //Add all healthy people.
			}
		}	
		System.out.println("Finished checking for death.");
		/*
		Now we have a list with only the alive people in, so we replace the old list with the 
		new one.
		*/
		this.pop = alivePeople;
		System.out.println("");
		System.out.println("Stats");
		System.out.println("----------");
		System.out.println("Total Infected Found: " + infectedPeople);
		System.out.println("Death Count: " + deadPeopleRemoved);
		System.out.println("Death Rate Given: " + this.deathRate);
		/*
		At this point the dead people have been culled so we can sort out the recovery and infection
		rates as per usual.
		*/
		System.out.println("Total pop remaining: " + this.pop.size());
		for(int i = 0; i < getPopsize(); i++)
		{
			if(isInfected(i))
			{
				if(generator.nextDouble() < recover)
				{
					this.pop.get(i).setInfected(false);
				}
			}
			else
			{
				// choose someone to meet
				int j = generator.nextInt(getPopsize());
				if(isInfected(j))
				{
					if(generator.nextDouble() < infect)
					{
						this.pop.get(i).setInfected(true);
					}
				}
			}
		}
		System.out.println("Proportion Infected: " + proportionInfected());
		System.out.println("");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
