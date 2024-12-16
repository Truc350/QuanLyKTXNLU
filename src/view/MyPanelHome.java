package view;

import javax.swing.*;
import java.awt.*;

public class MyPanelHome extends JPanel {
    PanelHeaderOfHome header;
    PanelChooseStudentOrManager panelChoose;


    public MyPanelHome(CardLayout cardLayout) {
        setLayout(new BorderLayout());


        header = new PanelHeaderOfHome();
        panelChoose = new PanelChooseStudentOrManager();
        this.add(header, BorderLayout.NORTH);
        this.add(panelChoose, BorderLayout.CENTER);

    }
}
