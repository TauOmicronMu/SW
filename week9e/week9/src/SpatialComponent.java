import javax.swing.JPanel;
import java.awt.BorderLayout;

/**
 * 
 * @author txg523
 *
 */
public class SpatialComponent extends JPanel {
	private ThresholdPanel panel;
	private SpatialView view;
	
	/**
	 * Create a new SpatialComponent.
	 * @param panel The ThresholdPanel
	 * @param view The SpatialView
	 */
	public SpatialComponent(ThresholdPanel panel, SpatialView view) {
		super();
		this.panel = panel;
		this.view = view;
		setLayout(new BorderLayout());
		add(this.panel, BorderLayout.SOUTH);
		add(this.view, BorderLayout.NORTH);
		
	}
	
}