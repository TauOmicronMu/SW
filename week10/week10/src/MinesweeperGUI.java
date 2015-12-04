import javax.swing.JFrame;

public class MinesweeperGUI {
	public static void main(String[] args){
		JFrame frame = new JFrame("Minesweeper");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(500, 500);
		
		Minesweeper minesweeper = new Minesweeper(10, 20);
		
		MinesweeperModel model = new MinesweeperModel(minesweeper);
		
		BoardView view = new BoardView(model);
		
		ControlPanel menubar = new ControlPanel(model, view);
		
		frame.add(view);
		
		model.addObserver(view);
		
		frame.setJMenuBar(menubar);
		
		frame.setVisible(true);
	}
}
