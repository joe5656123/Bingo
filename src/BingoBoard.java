
import java.awt.GridLayout;
import java.util.*;
import javax.swing.JPanel;

public class BingoBoard extends JPanel {
    
    BingoBoardCell[][] board;
    
    public BingoBoard() {
        this.setLayout(new GridLayout(5,5));
        generateBoard();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                add(board[j][i]);
            }
        }
    }
            
    public void generateBoard() {
        // TODO: This
        ArrayList<Integer> temp = new ArrayList<Integer>();
        board = new BingoBoardCell[5][5];
        
        // Populate the B
        for (int i = 1; i <= 15; i++) {
            temp.add(i);
        }
        Collections.shuffle(temp);
        for (int i = 0; i < 5; i++) {
            board[0][i] = new BingoBoardCell(temp.remove(0));
        }
        
        // Populate the I
        temp.removeAll(temp);
        for (int i = 16; i <= 30; i++) {
            temp.add(i);
        }
        Collections.shuffle(temp);
        for (int i = 0; i < 5; i++) {
            board[1][i] = new BingoBoardCell(temp.remove(0));
        }
        
        // Populate the N
        temp.removeAll(temp);
        for (int i = 31; i <= 45; i++) {
            temp.add(i);
        }
        Collections.shuffle(temp);
        for (int i = 0; i < 5; i++) {
            board[2][i] = new BingoBoardCell(temp.remove(0));
        }
        
        // Populate the G
        temp.removeAll(temp);
        for (int i = 46; i <= 60; i++) {
            temp.add(i);
        }
        Collections.shuffle(temp);
        for (int i = 0; i < 5; i++) {
            board[3][i] = new BingoBoardCell(temp.remove(0));
        }
        
        // Populate the O
        temp.removeAll(temp);
        for (int i = 61; i <= 75; i++) {
            temp.add(i);
        }
        Collections.shuffle(temp);
        for (int i = 0; i < 5; i++) {
            board[4][i] = new BingoBoardCell(temp.remove(0));
        }
    }
}
