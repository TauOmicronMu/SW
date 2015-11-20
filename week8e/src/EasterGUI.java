import javax.swing.JFrame;


public class EasterGUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Easter Calculator");
	    frame.setSize(250,250);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    Easter easter = new Easter(0);
	   
	    EasterComponent comp = new EasterComponent(easter, 0, 2015, 0);;
	    
	    frame.add(comp);
	    
	    frame.setVisible(true);
	}
}
