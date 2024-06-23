package pages;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import com.toedter.calendar.JDateChooser;
import javax.swing.SwingConstants;

public class BookAppointment {

    private JFrame frmBookAppointment;
    private JTextField textFieldName;
    private JTextField textFieldContact;
    private JTextField textFieldEmail;
    private JDateChooser dateChooser;
    private ButtonGroup timeGroup;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BookAppointment window = new BookAppointment();
                    window.frmBookAppointment.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public BookAppointment() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmBookAppointment = new JFrame();
        frmBookAppointment.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\murei\\OneDrive\\Documents\\codes\\SAMSUNG Recall Management\\photos used\\samsungLogo.png"));
        frmBookAppointment.setTitle("Book an Appointment");
        frmBookAppointment.getContentPane().setBackground(new Color(255, 255, 255));
        frmBookAppointment.setBounds(100, 100, 728, 500);
        frmBookAppointment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmBookAppointment.getContentPane().setLayout(null);

        int frameWidth = frmBookAppointment.getContentPane().getWidth();
        int frameHeight = frmBookAppointment.getContentPane().getHeight();

        JLabel lblBookAppointment = new JLabel("Book an Appointment");
        lblBookAppointment.setHorizontalAlignment(SwingConstants.CENTER);
        lblBookAppointment.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblBookAppointment.setBounds(232, 10, 250, 25);
        frmBookAppointment.getContentPane().add(lblBookAppointment);

        JLabel lblName = new JLabel("Name:");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblName.setBounds(174, 52, 100, 25);
        frmBookAppointment.getContentPane().add(lblName);

        textFieldName = new JTextField();
        textFieldName.setBounds(324, 52, 200, 25);
        frmBookAppointment.getContentPane().add(textFieldName);
        textFieldName.setColumns(10);

        JLabel lblContact = new JLabel("Contact Info:");
        lblContact.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblContact.setBounds(174, 92, 100, 25);
        frmBookAppointment.getContentPane().add(lblContact);

        textFieldContact = new JTextField();
        textFieldContact.setBounds(324, 92, 200, 25);
        frmBookAppointment.getContentPane().add(textFieldContact);
        textFieldContact.setColumns(10);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblEmail.setBounds(174, 132, 100, 25);
        frmBookAppointment.getContentPane().add(lblEmail);

        textFieldEmail = new JTextField();
        textFieldEmail.setBounds(324, 132, 200, 25);
        frmBookAppointment.getContentPane().add(textFieldEmail);
        textFieldEmail.setColumns(10);

        JLabel lblBranch = new JLabel("Branch:");
        lblBranch.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblBranch.setBounds(174, 172, 100, 25);
        frmBookAppointment.getContentPane().add(lblBranch);

        JComboBox<String> comboBoxBranch = new JComboBox<>();
        comboBoxBranch.setFont(new Font("Tahoma", Font.PLAIN, 15));
        comboBoxBranch.setBounds(324, 172, 200, 25);
        frmBookAppointment.getContentPane().add(comboBoxBranch);

        // Add branches to the dropdown menu
        comboBoxBranch.addItem("Manila");
        comboBoxBranch.addItem("Quezon City");
        comboBoxBranch.addItem("Batangas Area");
        comboBoxBranch.addItem("Lucena Area");
        comboBoxBranch.addItem("Cebu");
        comboBoxBranch.addItem("Iloilo");
        comboBoxBranch.addItem("Davao Region");

        JLabel lblDate = new JLabel("Date:");
        lblDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblDate.setBounds(174, 212, 100, 25);
        frmBookAppointment.getContentPane().add(lblDate);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(324, 212, 200, 25);
        frmBookAppointment.getContentPane().add(dateChooser);

        JLabel lblTime = new JLabel("Time:");
        lblTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblTime.setBounds(174, 252, 100, 25);
        frmBookAppointment.getContentPane().add(lblTime);

        JPanel timePanel = new JPanel();
        timePanel.setBounds(324, 252, 200, 100);
        frmBookAppointment.getContentPane().add(timePanel);
        timePanel.setLayout(null);

        // Add radio buttons for time slots
        timeGroup = new ButtonGroup();
        String[] times = { "9:00 AM", "10:00 AM", "11:00 AM", "1:00 PM", "2:00 PM", "3:00 PM", "4:00 PM" };
        String[] unavailableTimes = { "10:00 AM", "3:00 PM" };

        int xPosition = 0;
        int yPosition = 0;
        for (String time : times) {
            JRadioButton radioButton = new JRadioButton(time);
            radioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
            radioButton.setBounds(xPosition, yPosition, 100, 25);
            if (isUnavailable(time, unavailableTimes)) {
                radioButton.setEnabled(false);
                radioButton.setForeground(Color.RED);
            }
            timeGroup.add(radioButton);
            timePanel.add(radioButton);
            yPosition += 30;
            if (yPosition >= 90) {
                yPosition = 0;
                xPosition += 100;
            }
        }

        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBackground(new Color(13, 38, 167));
        btnSubmit.setForeground(new Color(255, 255, 255));
        btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnSubmit.setBounds(307, 372, 100, 30);
        frmBookAppointment.getContentPane().add(btnSubmit);

        JButton btnBack = new JButton("Back to Main Menu");
        btnBack.setBackground(new Color(13, 38, 167));
        btnBack.setForeground(new Color(255, 255, 255));
        btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnBack.setBounds(257, 412, 200, 30);
        frmBookAppointment.getContentPane().add(btnBack);

        // Action listener for the btnBack button
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MainMenu mainMenu = new MainMenu();
                mainMenu.main(null);
                frmBookAppointment.dispose();
            }
        });

        // Action listener for the btnSubmit button
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add functionality to submit the appointment details
                // For now, we will just display a confirmation message
                String name = textFieldName.getText();
                String contact = textFieldContact.getText();
                String email = textFieldEmail.getText();
                String branch = (String) comboBoxBranch.getSelectedItem();
                String date = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
                String time = getSelectedTime();

                if (name.isEmpty() || contact.isEmpty() || email.isEmpty() || branch == null || date.isEmpty() || time == null) {
                    JOptionPane.showMessageDialog(frmBookAppointment, 
                        "Please fill out all fields.", 
                        "Incomplete Form", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frmBookAppointment, 
                        "Appointment booked for " + name + " at " + branch + " on " + date + " at " + time + ".\n" +
                        "A confirmation email has been sent to " + email + ".",
                        "Appointment Confirmation", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    private boolean isUnavailable(String time, String[] unavailableTimes) {
        for (String unavailable : unavailableTimes) {
            if (time.equals(unavailable)) {
                return true;
            }
        }
        return false;
    }

    private String getSelectedTime() {
        for (java.util.Enumeration<AbstractButton> buttons = timeGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
}
