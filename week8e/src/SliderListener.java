import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderListener implements ChangeListener {

	private EasterModel model;
	private JSlider slider;
	
	public SliderListener(EasterModel model, JSlider slider) {
		this.model = model;
		this.slider = slider;
	}
		
	public void stateChanged(ChangeEvent e) {
		int year = slider.getValue();
		model.setYear(year);
	}
}
