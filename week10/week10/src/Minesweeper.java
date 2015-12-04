import java.util.Random;

/**
 * Underlying logic for the Minesweeper game.
 * @author txg523
 */
public class Minesweeper {
	private int size;
	private int minesAmount;
	private Cell[][] board;
	private Random random;
	
	/**
	 * Create a new Minesweeper object.
	 * @param size The size of the board.
	 * @param minesAmount The number of mines.
	 */
	public Minesweeper(int size, int minesAmount) {
		//Don't try and create a board with more mines than available cells.
		if(minesAmount > size * size) {
			throw new IllegalArgumentException(""
					+ " You can't have more mines than "
					+ " there are cells in the board. ");
		}
		this.size = size;
		this.minesAmount = minesAmount;
		this.board = new Cell[minesAmount][minesAmount];
		this.random = new Random();
	    reset();
	}
	
	/**
	 * Generates a new board.
	 */
	public void reset() {
		// Generate a blank board.
		for(int i = 0; i < this.board.length; i++) {
			for(int j = 0; j < this.board[i].length; j++) {
				this.board[i][j] = new Cell();
 			}
		}
		// Add the mines.
		int minesPlaced = 0;
		/*
		 * minesAmount/10 scales the number of mines based on the size :)
		 */
		while(minesPlaced != this.minesAmount * (minesAmount /10)) {
			int x = random.nextInt(this.size);
			int y = random.nextInt(this.size);
			// If this cell isn't a mine, place one.
			if(!this.board[x][y].isMine()) {
				this.board[x][y].setMine(true);
				minesPlaced++;
			}
		}
	}
	
	/**
	 * Returns the size of the board.
	 * @return the board size.
	 */
	public int getSize() {
		return this.size;
	}
	
	public void setSize(int n) {
		this.size = n;
	}
	
	/**
	 * Returns whether the cell at (x, y) is revealed.
	 * @param x The x coordinate.
	 * @param y The y coordinate.
	 * @return Whether or not the cell is revealed.
	 */
	public boolean isRevealed(int x, int y) {
		return this.board[x][y].isRevealed();
	}
	
	public void setRevealed(int x, int y, boolean b) {
		this.board[x][y].setRevealed(b);
	}
	
	/**
	 * Returns whether the cell at (x, y) is a mine.
	 * @param x The x coordinate.
	 * @param y The y coordinate.
	 * @return Whether or not the cell is a mine.
	 */
	public boolean isMine(int x, int y) {
		return this.board[x][y].isMine();
	}
	
	/**
	 * Checks to see if the player has revealed a mine (i.e. the player has lost...).
	 * @return Whether or not the player has lost (true means the player has lost, and vice versa).
	 */
	public boolean hasRevealedMine() {
		for(int i = 0; i < this.board.length; i++) {
			for(int j = 0; j < this.board[i].length; j++) {
				if(this.board[i][j].isMine() && this.board[i][j].isRevealed()) {
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Reveals all mines on the game board.
	 */
	public void revealMines() {
		for(int i = 0; i < this.board.length; i++) {
			for(int j = 0; j < this.board.length; j++) {
				if(this.board[i][j].isMine()) {
					this.board[i][j].setRevealed(true);
				}
			}
		}
	}
	
	/**
	 * Reveals the cell at (x, y)
	 * If (x, y) has no adjacent mines, 
	 * reveals all edges in which there are no mines.
	 */
	public void reveal(int x, int y) {
		board[x][y].setRevealed(true);
		
		if(getAdjacentMines(x, y) == 0) {
            for(int i = x - 1; i <= x + 1; i++) {
                for(int j = y - 1; j <= y + 1; j++) {
                	if(i == x && j == y) continue;
                	if(i < 0 || j < 0) continue;
                	if(i >= this.size || j >= this.size) continue;
                	if(!this.board[i][j].isRevealed()) {
                		reveal(i, j);
                	}
                }
            }
		}
		
		if(board[x][y].isMine()) {
			revealMines();
		}
	}
	
	/**
	 * Returns the number of adjacent mines to a mine at (x, y).
	 * @param x The x coordinate.
	 * @param y The y coordinate.
	 * @return The number of mines adjacent to the cell at (x, y)
	 */
	public int getAdjacentMines(int x, int y) {
		int mineCount = 0;
		/*
		 * Loop from -1 to 1 because:
		 * 
		 * ------|-------|-------|
		 * x - 1 |   x   | x + 1 |
		 * y - 1 | y - 1 | y - 1 |
 		 * ------| ------|-------|
		 * x - 1 |   x   | x + 1 |
		 *   y   |   y   |   y   |
		 * ------|-------|-------|
		 * x - 1 |   x   | x + 1 |
		 * y + 1 | y + 1 | y + 1 |
		 * ------|-------|-------|
		 * 
		 */
		for(int i = -1; i < 2; i++) {
			for(int j = -1; j < 2; j++) {
				try {
					if(this.board[x + i][y + j].isMine()) {
						mineCount++;
					}
				}
				catch (IndexOutOfBoundsException e) {}
			}
		}
		return mineCount;
	}
	
	/**
	 * Sets the number of mines to n.
	 * @param n The new number of mines.
	 */
	public void setMines(int n) {
		this.minesAmount = n;
	}
	
	/**
	 * A single cell on the board.
	 * @author txg523
	 */
	private static class Cell {
		private boolean mine;
		private boolean revealed;
		
		private Cell() {
			this.mine = false;
			this.revealed = false;
		}
		
		public boolean isMine() {
			return this.mine;
		}
		
		public boolean isRevealed() {
			return this.revealed;
		}
		
		public void setMine(boolean b) {
			this.mine = b;
		}
		
		public void setRevealed(boolean b) {
			this.revealed = b;
		}
	}
}
