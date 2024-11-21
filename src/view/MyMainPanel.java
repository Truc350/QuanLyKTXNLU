package view;

import javax.swing.*;
import java.awt.*;

public class MyMainPanel extends JPanel {
    MyPanelHome panelHome ;
    JLabel labelStudent , labelManager;

    public MyMainPanel() {
        setLayout(new BorderLayout());
        panelHome = new MyPanelHome();
        this.add(panelHome, BorderLayout.CENTER);





    }
}
