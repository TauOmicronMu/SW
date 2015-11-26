import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 * A panel containing a slider and a label describing what it does.
 * The slider changes the value of the Threshold, and the picture
 * will redraw accordingly.
 * @author txg523
 *
 */
public class ThresholdPanel extends JPanel implements Observer {
	private JLabel label;
	private JSlider slider;
	private SpatialModel model;
	
	public ThresholdPanel(int min, int max, int init) {
		label = new JLabel();
		label.setText("Threshold");
		slider = new JSlider(min, max, init);
		slider.addChangeListener(event -> model.setThreshold(slider.getValue()));
	}
	
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		model.setThreshold(model.getThreshold());
	}
}
