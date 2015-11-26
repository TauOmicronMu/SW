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
		this.panel = panel;
	}
	setLayout(new BorderLayout());
	add(this.panel, BorderLayout.SOUTH);
	
}
