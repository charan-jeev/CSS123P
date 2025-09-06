import javax.swing.*;
import java.awt.*;

public class JavaSwingGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Starlink Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 700);
        frame.setLayout(new BorderLayout(10, 10));

        // Set background color similar to the image
        Color bgColor = new Color(220, 230, 240);
        frame.getContentPane().setBackground(bgColor);

        // ===== Top Panel (Satellite ID + Find Satellite) =====
        JPanel topPanel = new JPanel(new BorderLayout(5, 5));
        topPanel.setBackground(bgColor);
        topPanel.setBorder(BorderFactory.createEmptyBorder(15, 20, 10, 20));

        JPanel leftTop = new JPanel(new FlowLayout(FlowLayout.LEFT));
        leftTop.setBackground(bgColor);
        JLabel lblSatelliteID = new JLabel("Satellite ID");
        lblSatelliteID.setForeground(Color.BLUE);
        leftTop.add(lblSatelliteID);
        JTextField txtSatelliteID = new JTextField(15);
        leftTop.add(txtSatelliteID);
        topPanel.add(leftTop, BorderLayout.WEST);

        JButton btnFind = new JButton("Find Satellite");
        btnFind.setPreferredSize(new Dimension(120, 25));
        topPanel.add(btnFind, BorderLayout.EAST);

        // ===== Form Panel (GridLayout 3x4) =====
        JPanel formPanel = new JPanel(new GridLayout(3, 4, 10, 10));
        formPanel.setBackground(bgColor);
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        // Row 1 - Satellite Name (spans across)
        JLabel lblSatelliteName = new JLabel("Satellite Name");
        lblSatelliteName.setForeground(Color.BLUE);
        formPanel.add(lblSatelliteName);
        JTextField txtSatelliteName = new JTextField();
        formPanel.add(txtSatelliteName);
        formPanel.add(new JLabel(""));   // empty for spacing
        formPanel.add(new JLabel(""));   // empty for spacing

        // Row 2 - Longitude and Latitude
        JLabel lblLongitude = new JLabel("Longitude");
        lblLongitude.setForeground(Color.BLUE);
        formPanel.add(lblLongitude);
        JTextField txtLongitude = new JTextField();
        formPanel.add(txtLongitude);
        JLabel lblLatitude = new JLabel("Latitude");
        lblLatitude.setForeground(Color.BLUE);
        formPanel.add(lblLatitude);
        JTextField txtLatitude = new JTextField();
        formPanel.add(txtLatitude);

        // Row 3 - Elevation and Health Status
        JLabel lblElevation = new JLabel("Elevation");
        lblElevation.setForeground(Color.BLUE);
        formPanel.add(lblElevation);
        JTextField txtElevation = new JTextField();
        formPanel.add(txtElevation);
        JLabel lblHealthStatus = new JLabel("Health Status");
        lblHealthStatus.setForeground(Color.BLUE);
        formPanel.add(lblHealthStatus);
        JComboBox<String> cmbHealth = new JComboBox<>(new String[]{"", "Operational", "Degraded", "Offline", "Maintenance"});
        formPanel.add(cmbHealth);

        // ===== Action Buttons Panel (Save, Update, Delete) =====
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        buttonPanel.setBackground(bgColor);

        JButton btnSave = new JButton("Save");
        JButton btnUpdate = new JButton("Update");
        JButton btnDelete = new JButton("Delete");

        // Set consistent button sizes
        Dimension buttonSize = new Dimension(100, 30);
        btnSave.setPreferredSize(buttonSize);
        btnUpdate.setPreferredSize(buttonSize);
        btnDelete.setPreferredSize(buttonSize);

        buttonPanel.add(btnSave);
        buttonPanel.add(btnUpdate);
        buttonPanel.add(btnDelete);

        // ===== Combined Middle Panel =====
        JPanel middlePanel = new JPanel(new BorderLayout());
        middlePanel.setBackground(bgColor);
        middlePanel.add(formPanel, BorderLayout.NORTH);
        middlePanel.add(buttonPanel, BorderLayout.CENTER);

        // ===== Text Area =====
        JTextArea txtArea = new JTextArea(8, 50);
        txtArea.setBackground(Color.GRAY);
        txtArea.setEditable(false);
        txtArea.setBorder(BorderFactory.createLoweredBevelBorder());
        JScrollPane scrollPane = new JScrollPane(txtArea);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        // ===== Bottom Panel (ClearAll Button) =====
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.setBackground(bgColor);
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 15, 0));
        JButton btnClearAll = new JButton("ClearAll");
        btnClearAll.setPreferredSize(new Dimension(100, 30));
        bottomPanel.add(btnClearAll);

        // ===== Add to Frame =====
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(middlePanel, BorderLayout.CENTER);
        frame.add(scrollPane, BorderLayout.SOUTH);
        frame.add(bottomPanel, BorderLayout.PAGE_END);

        // Center the frame on screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}