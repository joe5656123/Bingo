
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joe
 */
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
        return this.balls.remove(0);
    }
}