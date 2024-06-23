package pages;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class StartPage {

	private JFrame frmStartPage;
	private JTextField textFieldSerial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartPage window = new StartPage();
					window.frmStartPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StartPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStartPage = new JFrame();
		frmStartPage.setTitle("Start Page\r\n");
		frmStartPage.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\murei\\OneDrive\\Documents\\codes\\SAMSUNG Recall Management\\photos used\\samsungLogo.png"));
		frmStartPage.getContentPane().setBackground(new Color(255, 255, 255));
		frmStartPage.setBounds(100, 100, 1200, 700);
		frmStartPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStartPage.getContentPane().setLayout(null);
		
		JLabel StartPageBanner = new JLabel("");
		StartPageBanner.setVerticalAlignment(SwingConstants.TOP);
		StartPageBanner.setIcon(new ImageIcon("C:\\Users\\murei\\OneDrive\\Documents\\codes\\SAMSUNG Recall Management\\photos used\\StartPageBanner.png"));
		StartPageBanner.setBounds(0, 258, 1186, 405);
		frmStartPage.getContentPane().add(StartPageBanner);
		
		JLabel samsungLogo = new JLabel("");
		samsungLogo.setIcon(new ImageIcon("C:\\Users\\murei\\OneDrive\\Documents\\codes\\SAMSUNG Recall Management\\photos used\\samsungLogo.png"));
		samsungLogo.setBounds(10, 10, 150, 78);
		frmStartPage.getContentPane().add(samsungLogo);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(13, 38, 167));
		panel.setBounds(0, 93, 1186, 175);
		frmStartPage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCheck = new JLabel("CHECK YOUR DEVICE'S CONDITION");
		lblCheck.setForeground(new Color(255, 255, 255));
		lblCheck.setBounds(20, 10, 489, 38);
		panel.add(lblCheck);
		lblCheck.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblSerial = new JLabel("ENTER A DEVICE'S SERIAL NUMBER");
		lblSerial.setForeground(new Color(255, 255, 255));
		lblSerial.setBounds(30, 60, 400, 25);
		panel.add(lblSerial);
		lblSerial.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textFieldSerial = new JTextField();
		textFieldSerial.setBounds(30, 90, 300, 25);
		panel.add(textFieldSerial);
		textFieldSerial.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldSerial.setColumns(10);
		lblSerial.setLabelFor(textFieldSerial);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(30, 130, 100, 25);
		panel.add(btnReset);
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBounds(228, 130, 100, 25);
		panel.add(btnSubmit);
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		// Action listener for the reset button
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldSerial.setText("");
			}
		});
		
		// Action listener for the submit button
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String serial = textFieldSerial.getText();
				if (serial.isEmpty()) {
					JOptionPane.showMessageDialog(frmStartPage, "Please enter the device's serial number.", "Input Required", JOptionPane.WARNING_MESSAGE);
				} else {
					// Proceed to the MainMenu frame
					MainMenu mainMenu = new MainMenu();
					mainMenu.main(null);
					frmStartPage.dispose();
				}
			}
		});
	}
}
