package view;

import javax.swing.*;
import java.awt.*;

public class PanelChooseStudentOrManager extends JPanel {
    JButton btnChooseStudent, btnChooseManager;
    JPanel panelStudent, panelManager;
    JLabel labelStudent, labelManager,labelBackround, textStudent, textManager,labelLogin;



    public PanelChooseStudentOrManager() {

        this.setLayout(new BorderLayout());
        labelBackround = new JLabel(new ImageIcon("src/img/backroundKTX.jpg"));
        this.add(labelBackround,BorderLayout.CENTER);

        // panel student
        panelStudent = new JPanel(new GridLayout(3,1));
        panelStudent.setPreferredSize(new Dimension(100, 100));
        panelStudent.setOpaque(false);
        btnChooseStudent = new JButton(new ImageIcon("src/img/student1.jpg"));
        btnChooseStudent.setBounds(20,20,100,100);
        panelStudent.add(btnChooseStudent, BorderLayout.CENTER);
        panelStudent.add(labelStudent=new JLabel("Student",JLabel.CENTER));
        //panel manager
        panelManager = new JPanel();
        panelManager.setLayout(new GridLayout(3,1));
        panelManager.setOpaque(false);
        panelManager.setPreferredSize(new Dimension(100, 50));
        btnChooseManager = new JButton(new ImageIcon("src/img/manager1.jpg"));
        btnChooseManager.setBounds(20,20,100,100);
        panelManager.add(btnChooseManager, BorderLayout.CENTER);
        panelManager.add(labelStudent=new JLabel("Manager",JLabel.CENTER));

        // add panel student va panel manager vao panel choose option
        this.add(panelStudent, BorderLayout.WEST);
        this.add(panelManager, BorderLayout.EAST);

        //label login



        labelLogin = new JLabel("Login", JLabel.CENTER);
        labelLogin.setBounds(100,20,600,60);
        labelLogin.setFont(new Font("Arial",Font.BOLD,25));
        labelLogin.setForeground(new Color(59,185,94));

        this.add(labelLogin,BorderLayout.NORTH);


    }


}
