import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BoardView extends JPanel implements Observer {
	private MinesweeperModel model;
	private JButton[][] cells;
	
	public BoardView(MinesweeperModel model) {
		super();
		
		this.model = model;
		
		this.cells = new JButton[this.model.getSize()][this.model.getSize()];
		
		setLayout(new GridLayout(this.model.getSize(), this.model.getSize()));
		
		for(int i = 0; i < this.cells.length; i++) {
			for(int j = 0; j < this.cells[i].length; j++){
				this.cells[i][j] = new JButton(" ");
				
				final int x = i;
				final int y = j;
				
				this.cells[i][j].addActionListener(e -> model.reveal(x, y));
				
				add(this.cells[i][j]);
			}
		}
	}
	
	public void resetBoard() {
		System.out.println(model.getSize());
		for(int i = 0; i < model.getSize(); i++) {
			for(int j = 0; j < model.getSize(); j++) {
				this.model.setRevealed(i, j);
				this.cells[i][j].setEnabled(true);
				this.cells[i][j].setText(" ");
			}
		}
	}
	
	public void update(Observable obs, Object obj) {
		//If the player has lost, stop them taking any more moves.
		boolean lost = false;
		
		for(int i = 0; i < model.getSize(); i++) {
			for(int j = 0; j < model.getSize(); j++) {
				if(model.isRevealed(i, j)) {
					if(model.isMine(i, j)) {
						//If they have revealed a mine, they have lost.
						lost = true;
					}
				}
				this.cells[i][j].repaint(); 
			}
		}
		if(lost) {
			for(int i = 0; i < model.getSize(); i++) {
				for(int j = 0; j < model.getSize(); j++) {
					if(this.model.isMine(i, j)) {
						this.cells[i][j].setText("M");
					}
					else {
						this.cells[i][j].setText("" + this.model.getAdjacentMines(i, j));
					}
					this.cells[i][j].setEnabled(false);
				}
			}
	    }
		
		//Disable any revealed cells and display their value.
		for(int i = 0; i < model.getSize(); i++) {
			for(int j = 0; j < model.getSize(); j++) {
				if(this.model.isRevealed(i, j)) {
					if(this.model.isMine(i, j)) {
						this.cells[i][j].setText("M");
					}
					else {
						this.cells[i][j].setText("" + this.model.getAdjacentMines(i, j));
					}
					this.cells[i][j].setEnabled(false);
				}
			}
		}
	}
}
