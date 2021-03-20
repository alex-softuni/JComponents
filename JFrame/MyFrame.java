package JFrame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        this.setTitle("JFrame title goes here..."); // this sets title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setSize(420, 420); // sets the x and y dimension of frame
        this.setVisible(true); // make frame visible
        this.setResizable(false); // prevent frame from being resized

        // creates an ImageIcon
        ImageIcon image = new ImageIcon("C:\\Users\\REBEL\\Desktop\\Project Media Player\\Icon\\logo.png");
        this.setIconImage(image.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(155,255,0)); // change color of background

    }
}
