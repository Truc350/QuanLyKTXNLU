package gop1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Model passwordModel;
    private PasswordView passwordView;
    private Model mainModel;
    private View mainView;
    private ExitDialog mainExitDialog;

    public Controller(Model passwordModel, PasswordView passwordView) {
        this.passwordModel = passwordModel;
        this.passwordView = passwordView;

        passwordView.getConfirmButton().addActionListener(new ConfirmButtonListener());
    }

    private void openMainView() {
        mainModel = new Model();
        mainView = new View();
        mainExitDialog = new ExitDialog(mainView);

        // Main View listeners
        mainView.setExitMenuItemListener(new ExitMenuItemListener());
        mainView.setManageMenuItemListener(new ManageMenuItemListener());
        mainView.setRoomManageMenuItemListener(new RoomManageMenuItemListener());

        // ExitDialog listeners
        mainExitDialog.setThoatButtonListener(new ExitDialogThoatButtonListener());
        mainExitDialog.setHuyButtonListener(new ExitDialogHuyButtonListener());

        mainView.setVisible(true);
    }

    private void openStudentManagementView() {
        Model studentModel = new Model();
        StudentView studentView = new StudentView();
        ExitDialog studentExitDialog = new ExitDialog(studentView);

        // Student View listeners
        studentView.getBtnStudentList().addActionListener(new StudentListButtonListener(studentView));
        studentView.getBtnRegisteredStudents().addActionListener(new RegisteredStudentsButtonListener(studentView));
        studentView.setExitMenuItemListener(new StudentExitMenuItemListener(studentExitDialog));
        studentExitDialog.setThoatButtonListener(new ExitDialogThoatButtonListener());
        studentExitDialog.setHuyButtonListener(new ExitDialogHuyButtonListener());
        studentView.getBtnBack().addActionListener(new BackButtonListener(studentView));

        studentView.setVisible(true);
    }

    // Inner Classes for Listeners

    private class ConfirmButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String password = passwordView.getPasswordInput();
            if (password.isEmpty()) {
                passwordView.displayMessage("Mật khẩu không được để trống!");
            } else if (password.length() != 6) {
                passwordView.displayMessage("Mật khẩu phải có đúng 6 ký tự!");
            } else {
                passwordView.displayMessage("Mật khẩu đã được xác nhận!");
                passwordView.dispose();
                openMainView();
            }
        }
    }

    private class ExitMenuItemListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainExitDialog.setVisible(true);
        }
    }

    private class ManageMenuItemListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            openStudentManagementView();
        }
    }

    private class RoomManageMenuItemListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(mainView, mainModel.getRoomManage());
        }
    }

    private class ExitDialogThoatButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private class ExitDialogHuyButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainExitDialog.setVisible(false);
        }
    }

    private class StudentListButtonListener implements ActionListener {
        private StudentView studentView;

        public StudentListButtonListener(StudentView studentView) {
            this.studentView = studentView;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(studentView, "Hiển thị Danh sách Sinh Viên Đang Ở");
        }
    }

    private class RegisteredStudentsButtonListener implements ActionListener {
        private StudentView studentView;

        public RegisteredStudentsButtonListener(StudentView studentView) {
            this.studentView = studentView;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(studentView, "Hiển thị Danh Sách Sinh Viên Đăng Ký");
        }
    }

    private class StudentExitMenuItemListener implements ActionListener {
        private ExitDialog studentExitDialog;

        public StudentExitMenuItemListener(ExitDialog studentExitDialog) {
            this.studentExitDialog = studentExitDialog;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            studentExitDialog.setVisible(true);
        }
    }

    private class BackButtonListener implements ActionListener {
        private StudentView studentView;

        public BackButtonListener(StudentView studentView) {
            this.studentView = studentView;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            studentView.dispose();
            mainView.setVisible(true);
        }
    }
}
