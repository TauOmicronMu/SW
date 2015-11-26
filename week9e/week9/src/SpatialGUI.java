import javax.swing.JFrame;

/**
 * A gui to display a Spacial network
 * @author txg523
 *
 */
public class SpatialGUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(750, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SpatialNetwork network = new SpatialNetwork(250, 75.0);
		SpatialModel model = new SpatialModel(network);
		SpatialView view = new SpatialView(model);
		
		ThresholdPanel panel = new ThresholdPanel(model, 0, 1000, 250);
		
		SpatialComponent comp = new SpatialComponent(panel);
		
		frame.add(view);
		frame.add(comp);
		frame.setVisible(true);
	}
}
