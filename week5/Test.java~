public class Test
{
	public static void main(String[] args)
	{
		System.out.println("");
		
		Transmitter t1 = new Transmitter(1.0, 0.5, 80.0);
		Transmitter t2 = new Transmitter(8.0, 1.2, 80.0);
		Transmitter t3 = new Transmitter(17.5, 17.0, 80.0);
		 
		Network net = new Network();
		net.add(t1);
		net.add(t2);
		net.add(t3);

		double x1 = 5.0;
		double y1 = 2.0;
		
		double x2 = 3.5;
		double y2 = 18.0;
		
		SignalStrength grid = new SignalStrength(net, 20);
		System.out.println("Average Signal: " +grid.averageSignal());
	
		System.out.println("");
		System.out.println("TESTS FOR Q2: \n");
		SignalMap signalmap = new SignalMap(1, 20, net);
		signalmap.display();
		
		System.out.println("");
		System.out.println("TESTS FOR Q3: \n");
		System.out.println(signalmap.poorSignal());
		
		System.out.println("\n");
		System.out.println("TESTS FOR Q4: \n");
		System.out.println("\n Most important transmitter: " + signalmap.important());
		
		System.out.println("");
		
		Network net2 = new Network();
		
		Transmitter t4 = new Transmitter(2.0, 10.0, 200.0);
	
		net2.add(t4);
		
		System.out.println("TESTS FOR Q5: \n");
		signalmap.compare(net2);
	}
}
