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
	 * Wrapper for the method of the same name in SpatialNetwork
	 * @return the current threshold for node connectivity.
	 */
	public double getThreshold() {
		return this.network.getThreshold();
	}
}
