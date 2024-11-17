package view;

import javax.swing.*;
import java.awt.*;

public class MyPanelHome extends JPanel {
    PanelHeaderOfHome header;
    PanelChooseStudentOrManager panelChoose;

    public MyPanelHome() {
        setLayout(new BorderLayout());
        this.add(header, BorderLayout.NORTH);

    }
}
