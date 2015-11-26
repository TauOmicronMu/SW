import java.util.Observable;

/**
 * Model of SpatialNetwork.
 * @author txg523
 *
 */
public class SpatialModel extends Observable {
	
	private SpatialNetwork network;
	
	/**
	 * Create a new SpatialModel.
	 * @param network the SpatialNetwork.
	 */
	public SpatialModel(SpatialNetwork network) {
		super();
		this.network = network;
	}
	
	/**
	 * Wrapper for the method of the same name in SpatialNetwork.
	 * @param index The index of the spot.
	 * @return The x coordinate of the spot at the index.
	 */
	public double getX(int index) {
		return this.network.getX(index);
	}

	/**
	 * Wrapper for the method of the same name in SpatialNetwork.
	 * @param index The index of the spot.
	 * @return The y coordinate of the spot at the index.
	 */
	public double getY(int index) {
		return this.network.getY(index);
	}
	
	/**
	 * Wrapper for the method of the same name in SpatialNetwork.
	 * @return The number of nodes in the network.
	 */
	public int getNumberOfPoints() {
		return this.network.getNumberOfPoints();
	}
	
	/**
	 * Wrapper for the method of the same name in SpatialNetwork.
	 * @param number the new threshold for node connectivity.
	 */
	public void setNumberOfPoints(int number) {
		this.network.setNumberOfPoints(number);
		setChanged();
		notifyObservers();
	}

	/**
	 * Wrapper for the method of the same name in SpatialNetwork.
	 * @return the current threshold for node connectivity.
	 */
	public double getThreshold() {
		return this.network.getThreshold();
	}
	
	/**
	 * Wrapper for the method of the same name in SpatialNetwork.
	 * @param threshold thew new threshold for node connectivity.
	 */
	public void setThreshold(double threshold) {
		this.network.setThreshold(threshold);
		setChanged();
		notifyObservers();
	}
	
	/**
	 * Wrapper for the method of the same name in SpatialNetwork.
	 * @param index
	 * @return
	 */
	public Spot getSpot(int index) {
		return this.network.getSpot(index);
	}
	
	/**
	 * Wrapper for the method of the same name in SpatialNetwork.
	 * @param a The first spot
	 * @param b The second spot
	 * @return
	 */
	public boolean isConnected(Spot a, Spot b) {
		return this.network.isConnected(a, b);
	}
	
	/**
	 * Wrapper for the method of the same name in SpatialNetwork.
	 */
	public void reset() {
		network.reset();
		setChanged();
		notifyObservers();
	}
}
