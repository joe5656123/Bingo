
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class BingoBoardCell extends JButton {
    
   private int number;
   private ClickListener listener;
   
   public BingoBoardCell(int n) {
       number = n;
       setText(getChar() + " " + number);
       listener = new ClickListener(this);
       addActionListener(listener);
       this.setVisible(true);
    }
   
   
   public int getNumber() {
       return number;
   }
   public void setNumber(int n) {
       number = n;
   }
   
   public char getChar() {
       return Constants.calcLetter(number);
   }
   
   public class ClickListener implements ActionListener {
        private BingoBoardCell cell;
        public ClickListener (BingoBoardCell c) {
            cell = c;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            ArrayList<BingoBall> drawnBalls = Bingo.game.getDrawnBalls();
            for (BingoBall b : drawnBalls) {
                if (cell.number == b.getNumber()) {
                    this.cell.setText("X" + this.cell.getText() + "X");
                    break;
                }
            }
        }
       
   } 
}