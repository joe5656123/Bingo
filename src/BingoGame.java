
import java.awt.Frame;
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
    
    private Machine machine;
    private BingoBoard board;
    
    
    public BingoGame() {
        setSize(500,500);
        setTitle("Bingo Fun Time");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setVisible(true);
                
    }
}
