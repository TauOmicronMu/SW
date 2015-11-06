import javax.swing.JFrame;
import java.util.ArrayList;
public class HouseTest
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(1024, 2048);
		frame.setTitle("Assignment Week 6");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		HouseComponent comp = new HouseComponent(200, 100, 200);

		frame.setVisible(true);
	}
}
