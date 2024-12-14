package gop1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GDSVDangKi extends JFrame {
    private JTable studentTable;
    private JTextField filterField;
    private JButton filterButton;
    private JButton backButton; // Nút Quay về
    private JMenuItem exitMenuItem;
    private JMenuItem manageMenuItem;
    private JMenuItem roomManageMenuItem;
    private JPanel mainPanel; // Panel chứa giao diện chính
    private JLabel backgroundImage;

    public GDSVDangKi() {
        setTitle("Quản Lý Sinh Viên");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Tạo nền ảnh
        ImageIcon originalIcon = new ImageIcon("src/img/hinhanh.jpg");
        Image scaledImage = originalIcon.getImage().getScaledInstance(800, 500, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        backgroundImage = new JLabel(scaledIcon);
        backgroundImage.setBounds(0, 0, 800, 500);
        setContentPane(backgroundImage); // Đặt nền ảnh làm nền chính
        backgroundImage.setLayout(null);

        // Tạo panel chính
        mainPanel = new JPanel(null);
        mainPanel.setOpaque(false); // Cho phép hiển thị nền phía sau
        mainPanel.setBounds(0, 0, 800, 500);
        backgroundImage.add(mainPanel);

        // Thanh menu
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        exitMenuItem = new JMenuItem("Exit");
        manageMenuItem = new JMenuItem("Quản Lý");
        roomManageMenuItem = new JMenuItem("Quản Lý Phòng");

        fileMenu.add(manageMenuItem);
        fileMenu.add(roomManageMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        // Thanh tìm kiếm (di chuyển lên trên)
        filterField = new JTextField();
        filterField.setBounds(20, 20, 600, 30);
        mainPanel.add(filterField);

        filterButton = new JButton("Lọc");
        filterButton.setBounds(640, 20, 100, 30);
        mainPanel.add(filterButton);

        // Bảng danh sách
        studentTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(studentTable);
        scrollPane.setBounds(20, 60, 760, 300);
        mainPanel.add(scrollPane);

        backButton = new JButton("Quay về");
        backButton.setBounds(20, 380, 100, 30); // Kích thước nút
        backButton.setBackground(new Color(220, 53, 69)); // Màu đỏ đẹp hơn
        backButton.setForeground(Color.WHITE); // Chữ màu trắng
        backButton.setFont(new Font("Arial", Font.BOLD, 14)); // Font chữ đậm
        backButton.setFocusPainted(false); // Loại bỏ viền khi chọn
        backButton.setBorder(BorderFactory.createLineBorder(new Color(200, 40, 50), 2, true)); // Viền bo tròn

        // Hiệu ứng hover
        backButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                backButton.setBackground(new Color(255, 87, 104)); // Màu sáng hơn khi hover
            }

            @Override
            public void mouseExited(MouseEvent e) {
                backButton.setBackground(new Color(220, 53, 69)); // Quay lại màu ban đầu
            }
        });
        mainPanel.add(backButton);
        setLocationRelativeTo(null);
    }

    public JTable getStudentTable() {
        return studentTable;
    }

    public JTextField getFilterField() {
        return filterField;
    }

    public JButton getFilterButton() {
        return filterButton;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public JMenuItem getExitMenuItem() {
        return exitMenuItem;
    }

    public JMenuItem getManageMenuItem() {
        return manageMenuItem;
    }

    public JMenuItem getRoomManageMenuItem() {
        return roomManageMenuItem;
    }

    public void showMainView() {
        mainPanel.setVisible(true);
        revalidate();
        repaint();
    }

    public void showDetailPanel(JPanel detailPanel) {
        mainPanel.setVisible(false);
        backgroundImage.add(detailPanel);
        detailPanel.setVisible(true);
        revalidate();
        repaint();
    }

    public JLabel getBackgroundImage() {
        return backgroundImage;
    }
}
