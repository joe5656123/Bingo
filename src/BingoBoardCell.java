
import java.awt.Graphics;
import javax.swing.JButton;

public class BingoBoardCell extends JButton {
    
   private int number;
   
   public BingoBoardCell(int n) {
       number = n;
       setText(getChar() + " " + number);
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
   
   @Override
   public void paintComponent(Graphics g) {
       // TODO: Paint the Component with letter \n number
   }
   @Override
   public void repaint() {
       
   }
}