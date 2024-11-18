package gop1;

public class Model {
    // Properties for PasswordModel
    private String password;

    // Methods for Model
    public String getExit() {
        return "Exit";
    }

    public String getManage() {
        return "Quản Lý Sinh Viên";
    }

    public String getRoomManage() {
        return "Quản Lý Phòng";
    }

    // Methods for PasswordModel
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isValidPassword() {
        return password != null && password.length() == 6;
    }

    // Placeholder for StudentModel
    // Add any properties or methods for StudentModel here in the future.
}
