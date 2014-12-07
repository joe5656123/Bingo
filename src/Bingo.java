/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @aut tim
 */
import javax.swing.*;
import java.awt.*;
public class Bingo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Constants.IMGDIR);
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(3);
        //f.add(new JLabel(new ImageIcon(Constants.IMGDIR + "\\1.png")));
        f.add(new BingoBall(54));
        f.setSize(500, 500);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    
}
