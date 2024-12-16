package view;

import javax.swing.*;
import java.awt.*;

public class MyMainPanel extends JPanel {
    MyPanelHome panelHome ;
    JLabel labelStudent , labelManager;
    CardLayout cardLayout;
    PageLogin pageLogin;
    SVLoginOrSignIn svLoginOrSignIn;
    PageChooseRoom pageChooseRoom;
    PageTTCNcuaSVDaO svTTCNcuaSVDaO;

    public MyMainPanel() {
        cardLayout = new CardLayout();
        panelHome = new MyPanelHome(cardLayout);


        this.add(panelHome, BorderLayout.CENTER);// hien thi ban dau






    }
}
