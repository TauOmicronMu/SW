import java.util.ArrayList;

/**
 * Represents the points of a random spatial network with a given number
 * of nodes and a given threshold.
 * @author txg523
 *
 */
public class SpatialNetwork {
	private ArrayList<Spot> points;
	private int numberOfPoints;
	private double threshold;
	
	/**
	 * Create a new SpatialNetwork
	 * @param numberOfPoints the number of nodes that the network is comprised of.
	 * @param threshold the threshold for connectivity of nodes.
	 */
	public SpatialNetwork(int numberOfPoints, double threshold) {
		this.setNumberOfPoints(numberOfPoints);
		this.setThreshold(threshold);
	}
	
	/**
	 * Get the x coordinate of the spot at the given index.
	 * @param index The index, i, of the spot in the ArrayList.
	 * @return the x coordinate of the spot at the given index.
	 */
	public double getX(int index) {
		return this.points.get(index).getX();
	}
	
	/**
	 * Get the y coordinate of the spot at the given index.
	 * @param index The index, i, of the spot in the ArrayList.
	 * @return the y coordinate of the spot at the given index.
	 */
	public double getY(int index) {
		return this.points.get(index).getY();
	}

	/**
	 * Returns the number of nodes in the network.
	 * @return the number of nodes in the network.
	 */
	public int getNumberOfPoints() {
		return numberOfPoints;
	}

	/**
	 * Changes the number of nodes in a network.
	 * @param numberOfPoints the new number of nodes.
	 */
	public void setNumberOfPoints(int numberOfPoints) {
		this.numberOfPoints = numberOfPoints;
	}
	
	/**
	 * Return whether two points are connected or not, using Pythagoras' for the distance.
	 * @param a The first point.
	 * @param b The second point.
	 * @return True (connected) or false (not connected).
	 */
	public boolean isConnected(Spot a, Spot b) {
		return (Math.sqrt( (a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()) ) < this.threshold);
	}
	
	/**
	 * Returns the current threshold value
	 * @return threshold - the current threshold value.
	 */
	public double getThreshold() {
		return threshold;
	}

	/**
	 * Changes the threshold value.
	 * @param threshold the new threshold.
	 */
	public void setThreshold(double threshold) {
		this.threshold = threshold;
	}
}

