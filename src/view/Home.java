package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame {
    SVLoginOrSignIn mainPanel;
    CardLayout cards;
//
    public Home() throws HeadlessException {
        setTitle("Dormitory management system");
        CardLayout cards = new CardLayout();

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setResizable(false);
        mainPanel = new SVLoginOrSignIn();
//        getContentPane().add(mainPanel,BorderLayout.CENTER);
        getContentPane().add(mainPanel,BorderLayout.CENTER);

        this.setLocationRelativeTo(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        Home frame = new Home();
    }
}
