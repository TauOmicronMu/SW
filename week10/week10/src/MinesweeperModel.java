import java.util.Observable;

/**
 * Observable model of the Minesweeper class.
 * @author txg523
 */
public class MinesweeperModel extends Observable {
	private Minesweeper minesweeper;
	
	/**
	 * Create a new MinesweeperModel
	 * @param minesweeper the minesweeper program.
	 */
	public MinesweeperModel(Minesweeper minesweeper) {
		super();
		this.minesweeper = minesweeper;
	}
	
	/**
	 * Wrapper for the method by the same name in the Minesweeper class.
	 * Creates a new board and populates it with mines.
	 */
	public void reset() {
		this.minesweeper.reset();
		setChanged();
		notifyObservers();
	}
	
	/**
	 * Wrapper for the method by the same name in the Minesweeper class.
	 * @return The size of the board.
	 */
	public int getSize() {
		return this.minesweeper.getSize();
	}
	
	/**
	 * Wrapper for the method by the same name in the Minesweeper class.
	 * @param x The x coordinate
	 * @param y The y coordinate
	 * @return Whether or not the cell has been revealed.
	 */
	public boolean isRevealed(int x, int y) {
		return this.minesweeper.isRevealed(x, y);
	}
	
	public void setRevealed(int x, int y, boolean b) {
		this.minesweeper.setRevealed(x, y, b);
	}
	
	/**
	 * Wrapper for the method by the same name in the Minesweeper class.
	 * @param x The x coordinate
	 * @param y The y coordinate
	 * @return Whether or not the cell is a mine.
	 */
	public boolean isMine(int x, int y) {
		return this.minesweeper.isMine(x, y);
	}
	
	/**
	 * Wrapper for the method by the same name in the Minesweeper class.
	 * @return Whether or not the player has revealed a mine.
	 */
	public boolean hasRevealedMine() {
		return this.minesweeper.hasRevealedMine();
	}
	
	/**
	 * Wrapper for the method by the same name in the Minesweeper class.
	 * Reveals all mines on the board.
	 */
	public void revealMines() {
		this.minesweeper.revealMines();
		setChanged();
		notifyObservers();
	}
	
	/**
	 * Wrapper for the method by the same name in the Minesweeper class.
	 * Reveals the entire board.
	 */
	public void reveal(int x, int y) {
		this.minesweeper.reveal(x, y);
		setChanged();
		notifyObservers();
	}
	
	/**
	 * Wrapper for the method by the same name in the Minesweeper class.
	 * @param x The x coordinate
	 * @param y The y coordinate
	 * @return The number of adjacent mines to the cell at (x, y).
	 */
	public int getAdjacentMines(int x, int y) {
		return this.minesweeper.getAdjacentMines(x, y);
	}	
	
	/**
	 * Wrapper for the method by the same name in the Minesweeper class.
	 * @param n The new number of mines.
	 */
	public void setMines(int n) {
		this.minesweeper.setMines(n);
		this.reset();
	}
}
