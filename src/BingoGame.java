
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class BingoGame extends JFrame {
    private ArrayList<BingoBall> drawnBalls;
    private Machine machine;
    private BingoBoard board;
    private JPanel buttonsPanel;
    private JLabel picturePerfect;
    
    
    public BingoGame() {
        setSize(425, 250);
        setTitle("Bingo Fun Time");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        board = new BingoBoard();
        machine = new Machine();
        drawnBalls = new ArrayList<BingoBall>();
        add(board, BorderLayout.SOUTH);
        board.setVisible(true);
        
        buttonsPanel = new JPanel();
        buttonsPanel.setBackground(Color.CYAN);
        
        JButton draw = new JButton("DRAW");
        draw.addActionListener(new DrawListener(this));
        buttonsPanel.add(draw);
        
        // Label for image funtimeeee
        picturePerfect = new JLabel(new ImageIcon(Constants.IMGDIR + "\\Blue.png"));
        buttonsPanel.add(picturePerfect);
        
        
        JButton sayBingo = new JButton("SAY BINGO!");
        sayBingo.addActionListener(new SayBingoListener(this));
        buttonsPanel.add(sayBingo);
        
        add(buttonsPanel, BorderLayout.CENTER);
        
        setVisible(true);
    }
    
    public ArrayList<BingoBall> getDrawnBalls() {
        return drawnBalls;
    }
    
    public void drawNewBall() {
        BingoBall b = machine.getBall();
        drawnBalls.add(b);
        picturePerfect.setIcon(new ImageIcon(Constants.IMGDIR + "\\" + b.getNumber() + ".png"));
    }
    
    public class DrawListener implements ActionListener {
        private BingoGame game;
        public DrawListener(BingoGame g) {
            game = g;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            game.drawNewBall();
        }
    }
    
    public class SayBingoListener implements ActionListener {
        private BingoGame game;
        public SayBingoListener(BingoGame g) {
            game = g;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(this.game, game.getSize().height + " " + game.getSize().width);
            if (game.board.determineIfWin()) {
                JOptionPane.showMessageDialog(this.game, "You've won all the glory this round!\nPress OK to exit the game.");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(this.game, "You jumped the gun... BONGO!!!");
            }
        }
    }
}
