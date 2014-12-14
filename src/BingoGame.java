
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Timmay
 */
public class BingoGame extends JFrame {
    private ArrayList<BingoBall> drawnBalls;
    private Machine machine;
    private BingoBoard board;
    
    
    public BingoGame() {
        setSize(500,500);
        setTitle("Bingo Fun Time");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(Frame.MAXIMIZED_BOTH);
        this.setLayout(new BorderLayout());
        board = new BingoBoard();
        machine = new Machine();
        drawnBalls = new ArrayList<BingoBall>();
        add(board, BorderLayout.SOUTH);
        board.setVisible(true);
        //this.add(new JButton("PENIS"));
        
        JButton test = new JButton("DRAW");
        test.addActionListener(new DrawListener(this));
        add(test, BorderLayout.NORTH);
        
        
        
        setVisible(true);
    }
    
    public ArrayList<BingoBall> getDrawnBalls() {
        return drawnBalls;
    }
    
    public void drawNewBall() {
        BingoBall b = machine.getBall();
        drawnBalls.add(b);
        JOptionPane.showMessageDialog(null, b.getNumber());
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
}
