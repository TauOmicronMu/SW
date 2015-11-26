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
		
		SpatialNetwork network = new SpatialNetwork(75, 1000, 75);
		SpatialModel model = new SpatialModel(network);
		SpatialView view = new SpatialView(model);
		
		ThresholdPanel panel = new ThresholdPanel(model, 0, 250, 75);
		NumberPanel npanel = new NumberPanel(model, 0, 250, 75);
		ButtonPanel bpanel = new ButtonPanel(model);
		
		model.addObserver(view);
		model.addObserver(npanel);
		model.addObserver(panel);
		
		SpatialComponent comp = new SpatialComponent(panel, npanel, bpanel, view);
		
		frame.add(comp);
		frame.setVisible(true);
	}
}
