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
import javax.swing.JPanel;

public class BookAppointment {

	private JFrame frmBookAppointment;
	private JTextField textFieldName;
	private JTextField textFieldContact;
	private JTextField textFieldDate;
	private JTextField textFieldTime;

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
		frmBookAppointment.setBounds(100, 100, 450, 400);
		frmBookAppointment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBookAppointment.getContentPane().setLayout(null);
		
		JLabel lblBookAppointment = new JLabel("Book an Appointment");
		lblBookAppointment.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBookAppointment.setBounds(100, 11, 250, 25);
		frmBookAppointment.getContentPane().add(lblBookAppointment);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblName.setBounds(50, 60, 100, 25);
		frmBookAppointment.getContentPane().add(lblName);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(150, 60, 200, 25);
		frmBookAppointment.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblContact = new JLabel("Contact Info:");
		lblContact.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblContact.setBounds(50, 100, 100, 25);
		frmBookAppointment.getContentPane().add(lblContact);
		
		textFieldContact = new JTextField();
		textFieldContact.setBounds(150, 100, 200, 25);
		frmBookAppointment.getContentPane().add(textFieldContact);
		textFieldContact.setColumns(10);
		
		JLabel lblBranch = new JLabel("Branch:");
		lblBranch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBranch.setBounds(50, 140, 100, 25);
		frmBookAppointment.getContentPane().add(lblBranch);
		
		JComboBox<String> comboBoxBranch = new JComboBox<>();
		comboBoxBranch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxBranch.setBounds(150, 140, 200, 25);
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
		lblDate.setBounds(50, 180, 100, 25);
		frmBookAppointment.getContentPane().add(lblDate);
		
		textFieldDate = new JTextField();
		textFieldDate.setBounds(150, 180, 200, 25);
		frmBookAppointment.getContentPane().add(textFieldDate);
		textFieldDate.setColumns(10);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTime.setBounds(50, 220, 100, 25);
		frmBookAppointment.getContentPane().add(lblTime);
		
		textFieldTime = new JTextField();
		textFieldTime.setBounds(150, 220, 200, 25);
		frmBookAppointment.getContentPane().add(textFieldTime);
		textFieldTime.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(new Color(13, 38, 167));
		btnSubmit.setForeground(new Color(255, 255, 255));
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSubmit.setBounds(168, 273, 100, 30);
		frmBookAppointment.getContentPane().add(btnSubmit);
		
		JButton btnBack = new JButton("Back to Main Menu");
		btnBack.setBackground(new Color(13, 38, 167));
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBounds(119, 313, 200, 30);
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
				String branch = (String) comboBoxBranch.getSelectedItem();
				String date = textFieldDate.getText();
				String time = textFieldTime.getText();
				
				// You can add code to save these details to a database or send them to a server
				
				javax.swing.JOptionPane.showMessageDialog(frmBookAppointment, 
					"Appointment booked for " + name + " at " + branch + " on " + date + " at " + time + ".",
					"Appointment Confirmation", javax.swing.JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
}
