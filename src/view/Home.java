package view;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {
    MyMainPanel mainPanel;

    public Home() throws HeadlessException {
        setTitle("Dormitory management system");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setSize(600,600);
        this.setResizable(false);
        mainPanel = new MyMainPanel();
        getContentPane().add(mainPanel,BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        Home frame = new Home();
    }
}
