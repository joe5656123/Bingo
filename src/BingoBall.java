
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BingoBall extends JLabel {
    private int number;
    
    public BingoBall() {
        this.number = (new java.util.Random().nextInt(74) + 1);
        this.setIcon(new ImageIcon(Constants.IMGDIR + "\\" + this.number + ".png"));
    }
    public BingoBall(int number) {
        this.number = number; 
        this.setIcon(new ImageIcon(Constants.IMGDIR + "\\" + this.number + ".png"));
    }
    
    public int getNumber() {
        return number;
    }
}

class Machine {
    private ArrayList < BingoBall > balls;
    public Machine() {
        this.randomizeBalls();
    }
    public void randomizeBalls() {
        balls = new ArrayList < BingoBall >();
        for(int i = 1; i < 75; i++){
            balls.add(new BingoBall(i));
        }
        Collections.shuffle(balls);
    }
    public BingoBall getBall() {
        if (!balls.isEmpty())
            return this.balls.remove(0);
        else {
            JOptionPane.showMessageDialog(null, "You have drawn every ball from the machine... You win, I hope you feel good about yourself");
            //System.exit(0);
            return null;
        }
    }
}