import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

@SuppressWarnings("serial")
public class ControlPanel extends JMenuBar {
    private MinesweeperModel model;
    private BoardView view;

    /**
     * Creates a new ControlPanel
     * @param model The MinesweeperModel
     */
    public ControlPanel(MinesweeperModel model, BoardView view) {
        this.model = model;
        
        ButtonGroup buttonGroup = new ButtonGroup();
        JMenu difficulty = new JMenu("Difficulty");
        JMenuItem easy = new JRadioButtonMenuItem("Easy");
        JMenuItem exit = new JMenuItem("Exit");
        
        JMenu game = new JMenu("Game");
        
        JMenuItem hard = new JRadioButtonMenuItem("Hard");
        JMenuItem medium = new JRadioButtonMenuItem("Medium");
        JMenuItem restart = new JMenuItem("Restart");
        JMenuItem reveal = new JMenuItem("Reveal Mines");
       
        reveal.addActionListener( event -> this.model.revealMines());
        restart.addActionListener( event -> this.resetBoard());
        exit.addActionListener( event -> System.exit(0));
        
        ActionListener difficultyListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numMines = Integer.parseInt(e.getActionCommand());
                setNumMines(numMines);
            }
       };
        
        game.add(reveal);
        game.add(restart);
        game.add(exit);
        
        add(game);

        medium.setSelected(true);
        easy.setActionCommand("10");
        easy.addActionListener(difficultyListener);
        medium.setActionCommand("15");
        medium.addActionListener(difficultyListener);
        hard.setActionCommand("20");
        hard.addActionListener(difficultyListener);
        
        buttonGroup.add(easy);
        buttonGroup.add(medium);
        buttonGroup.add(hard);
        
        difficulty.add(easy);
        difficulty.add(medium);
        difficulty.add(hard);
        
        add(difficulty);

    }
    /**
     * Resets the board.
     */
    public void resetBoard() {
        this.model.reset();
        this.view.resetBoard();
    }
    /**
     * Sets the number of mines.
     * @param numMines the new number of mines.
     */
    private void setNumMines(int numMines) {
        model.setMines(numMines);
        this.resetBoard();
    }
}