import javax.swing.JPanel;
import java.awt.BorderLayout;

/**
 * 
 * @author txg523
 *
 */
public class SpatialComponent extends JPanel {
	private ThresholdPanel panel;
	
	/**
	 * Create a new SpatialComponent.
	 * @param panel The ThresholdPanel
	 */
	public SpatialComponent(ThresholdPanel panel) {
		super();
		this.panel = panel;
		setLayout(new BorderLayout());
		add(this.panel, BorderLayout.SOUTH);
	}
	
}
