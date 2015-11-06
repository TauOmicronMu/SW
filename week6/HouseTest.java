import javax.swing.JFrame;
import java.util.ArrayList;
public class HouseTest
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(2048, 512);
		frame.setTitle("Assignment Week 6");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	        //HouseComponent comp = new HouseComponent(200, 100, 200);
                StreetComponent comp = new StreetComponent(200, 100, 200, 225, 5);
		frame.add(comp);;
              
		frame.setVisible(true);
	}
}
