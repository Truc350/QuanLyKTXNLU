package view;

import javax.swing.*;
import java.awt.*;

public class PanelChooseStudentOrManager  extends  JPanel{
    JButton btnChooseStudent,  btnChooseManager;


    public PanelChooseStudentOrManager() {

        //create button sinh vien

        btnChooseStudent = createOptionPanel("Sinh viên","img/iiconSV.jpg");

        // backround image panel
        JLabel labelBackround = new JLabel(new ImageIcon("img/backroundKTX.jpg"));
        labelBackround.setBounds(150,200,150,150);
        labelBackround.add(btnChooseStudent);



    }

    private JButton createOptionPanel(String sinhViên, String s) {
        return null;
    }
}
