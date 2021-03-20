package JLabel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // JLabel = a GUI display area for string of text, an image, or both

        ImageIcon image = new ImageIcon("src/JLabel/waomen.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);

        JLabel label = new JLabel(); // creates label
        label.setText("Bro, do you even code?"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(77);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
        label.setBounds(100,100,500,500);// sets x,y position within frame as well as dimensions


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setSize(500, 500);
       // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();


    }
}
