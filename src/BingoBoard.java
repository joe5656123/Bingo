
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
    
        
    public boolean determineIfWin() {
        // Check Rows:        
        for (int i = 0; i < 5; i++) {
            if (board[i][0].isStamped() && board[i][1].isStamped() && board[i][2].isStamped() && board[i][3].isStamped() && board[i][4].isStamped()) {
                return true;
            }
        }
        
        // Check Columns:
        for (int i = 0; i < 5; i++) {
            if (board[0][i].isStamped() && board[1][i].isStamped() && board[2][i].isStamped() && board[3][i].isStamped() && board[4][i].isStamped()) {
                return true;
            }
        }
        
        // Check Diagonals:
        if (board[0][0].isStamped() && board[1][1].isStamped() && board[2][2].isStamped() && board[3][3].isStamped() && board[4][4].isStamped()) {
            return true;
        }
        
        if (board[4][0].isStamped() && board[3][1].isStamped() && board[2][2].isStamped() && board[1][3].isStamped() && board[0][4].isStamped()) {
            return true;
        }
        return false;
    }
}
