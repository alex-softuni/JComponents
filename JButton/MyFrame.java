package JButton;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    MyFrame()  {
        ImageIcon icon = new ImageIcon("src/JButton/RESIZED.png");
        ImageIcon icon2 = new ImageIcon("src/JButton/logo.png");


        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 300, 150);
        button.addActionListener(this);
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-5);
        button.setForeground(new Color(100, 55, 125));
        button.setBackground(new Color(25, 55, 25));
        button.setBorder(BorderFactory.createEtchedBorder());


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            label.setVisible(true);
        }
    }
}
