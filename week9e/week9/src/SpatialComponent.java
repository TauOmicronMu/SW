import javax.swing.JPanel;
import java.awt.BorderLayout;

/**
 * 
 * @author txg523
 *
 */
@SuppressWarnings("serial")
public class SpatialComponent extends JPanel {
	/**
	 * Create a new SpatialComponent.
	 * @param panel The ThresholdPanel
	 * @param npanel 
	 * @param view The SpatialView
	 */
	public SpatialComponent(ThresholdPanel panel, NumberPanel npanel, ButtonPanel bpanel, SpatialView view) {
		super();
		setLayout(new BorderLayout());
		add(npanel, BorderLayout.NORTH);
		add(view, BorderLayout.CENTER);
		add(bpanel, BorderLayout.EAST);
		add(panel, BorderLayout.SOUTH);
		
	}
	
}
