package pages;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JSeparator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {

	private JFrame frmMainMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frmMainMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMainMenu = new JFrame();
		frmMainMenu.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\murei\\OneDrive\\Documents\\codes\\SAMSUNG Recall Management\\photos used\\samsungLogo.png"));
		frmMainMenu.setTitle("Main Menu");
		frmMainMenu.getContentPane().setBackground(new Color(255, 255, 255));
		frmMainMenu.setBounds(100, 100, 1200, 700);
		frmMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainMenu.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(13, 38, 167));
		separator.setBackground(new Color(13, 38, 167));
		separator.setBounds(0, 98, 1186, 22);
		frmMainMenu.getContentPane().add(separator);
		
		JLabel samsungLogo = new JLabel("");
		samsungLogo.setIcon(new ImageIcon("C:\\Users\\murei\\OneDrive\\Documents\\codes\\SAMSUNG Recall Management\\photos used\\samsungLogo.png"));
		samsungLogo.setBounds(10, 10, 150, 78);
		frmMainMenu.getContentPane().add(samsungLogo);
		
		JButton btnInfo = new JButton("VIEW DEVICE INFORMATION");
		btnInfo.setForeground(new Color(13, 38, 167));
		btnInfo.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnInfo.setBounds(99, 270, 444, 50);
		frmMainMenu.getContentPane().add(btnInfo);
		
		JButton btnAppointment = new JButton("BOOK AN APPOINTMENT");
		btnAppointment.setForeground(new Color(13, 38, 167));
		btnAppointment.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAppointment.setBounds(99, 350, 444, 50);
		frmMainMenu.getContentPane().add(btnAppointment);
		
		JButton btnSwap = new JButton("SWAP ITEMS");
		btnSwap.setForeground(new Color(13, 38, 167));
		btnSwap.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSwap.setBounds(99, 430, 444, 50);
		frmMainMenu.getContentPane().add(btnSwap);
		
		JLabel mainMenubg = new JLabel("");
		mainMenubg.setIcon(new ImageIcon("C:\\Users\\murei\\OneDrive\\Documents\\codes\\SAMSUNG Recall Management\\photos used\\mainMenu.png"));
		mainMenubg.setBounds(0, 93, 1186, 570);
		frmMainMenu.getContentPane().add(mainMenubg);
		
		// Action listener for the btnInfo button
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeviceInfo deviceInfo = new DeviceInfo();
				deviceInfo.main(null);
				frmMainMenu.dispose();
			}
		});
		
		btnAppointment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookAppointment bookAppointment = new BookAppointment();
				bookAppointment.main(null);
				frmMainMenu.dispose();
			}
		});
	}
}
