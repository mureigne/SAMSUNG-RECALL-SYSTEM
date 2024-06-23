package pages;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeviceInfo {

	private JFrame frmDeviceInformation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeviceInfo window = new DeviceInfo();
					window.frmDeviceInformation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DeviceInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDeviceInformation = new JFrame();
		frmDeviceInformation.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\murei\\OneDrive\\Documents\\codes\\SAMSUNG Recall Management\\photos used\\samsungLogo.png"));
		frmDeviceInformation.setTitle("Device Information");
		frmDeviceInformation.getContentPane().setBackground(new Color(240, 240, 240));
		frmDeviceInformation.setBounds(100, 100, 700, 650);
		frmDeviceInformation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeviceInformation.getContentPane().setLayout(null);
		
		JLabel samsungLogo = new JLabel("");
		samsungLogo.setIcon(new ImageIcon("C:\\Users\\murei\\OneDrive\\Documents\\codes\\SAMSUNG Recall Management\\photos used\\samsungLogo.png"));
		samsungLogo.setBounds(10, 10, 150, 78);
		frmDeviceInformation.getContentPane().add(samsungLogo);
		
		JPanel PHOTO = new JPanel();
		PHOTO.setBackground(new Color(192, 192, 192));
		PHOTO.setBounds(20, 108, 150, 150);
		frmDeviceInformation.getContentPane().add(PHOTO);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(13, 38, 167));
		separator.setBackground(new Color(13, 38, 167));
		separator.setBounds(0, 87, 686, 22); // Adjusted width to fit the window size
		frmDeviceInformation.getContentPane().add(separator);
		
		JLabel lblOwnerID = new JLabel("OWNER ID:");
		lblOwnerID.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblOwnerID.setBounds(185, 108, 150, 25);
		frmDeviceInformation.getContentPane().add(lblOwnerID);
		
		JLabel lblProductName = new JLabel("PRODUCT NAME:");
		lblProductName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblProductName.setBounds(185, 149, 150, 25);
		frmDeviceInformation.getContentPane().add(lblProductName);
		
		JLabel lblPurchaseDate = new JLabel("PURCHASE DATE:");
		lblPurchaseDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPurchaseDate.setBounds(185, 190, 150, 25);
		frmDeviceInformation.getContentPane().add(lblPurchaseDate);
		
		JLabel lblSerialNumber = new JLabel("SERIAL NUMBER:");
		lblSerialNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSerialNumber.setBounds(185, 233, 150, 25);
		frmDeviceInformation.getContentPane().add(lblSerialNumber);
		
		JLabel lblYourDevicesCondition = new JLabel("YOUR DEVICE'S CONDITION:");
		lblYourDevicesCondition.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblYourDevicesCondition.setBounds(20, 297, 378, 25);
		frmDeviceInformation.getContentPane().add(lblYourDevicesCondition);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(20, 332, 646, 78);
		frmDeviceInformation.getContentPane().add(panel_1);
		
		JButton btnBack = new JButton("Back to Main Menu");
		btnBack.setBackground(new Color(13, 38, 167));
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBounds(218, 493, 250, 35);
		frmDeviceInformation.getContentPane().add(btnBack);
		
		// Action listener for the btnBack button
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mainMenu = new MainMenu();
				mainMenu.main(null);
				frmDeviceInformation.dispose();
			}
		});
	}
}
