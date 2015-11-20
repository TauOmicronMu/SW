import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

/**
 * 
 * @author txg523
 *
 */
public class EasterComponent extends JPanel {
	/**
	 * Create a new EasterComponent
	 * @param easter the Easter object
	 * @param min the minimum value for the slider
	 * @param max the maximum value for the slider
	 * @param initial the initial value for the slider
	 */
	public EasterComponent(Easter easter, int min, int max, int initial) {
		super();
		
		// Create model
		EasterModel model = new EasterModel(easter);
		
		// Create view
		EasterView easterview = new EasterView(model);
		
		// Make view observe model
		model.addObserver(easterview);
		
		// Create slider
		JSlider slider = new JSlider(min, max, initial);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing((max-min)/4);
		slider.setPaintLabels(true);
		slider.setLabelTable(slider.createStandardLabels((max-min)/4));
		
		// Create listener
		SliderListener listen = new SliderListener(model, slider);
		
		// Make listeners listen to slider
		slider.addChangeListener(listen);
		
		// Place view and slider on panel
		add(slider);
		add(easterview);
	}
}
