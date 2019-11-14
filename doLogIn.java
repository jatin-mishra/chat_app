package chatProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class doLogIn extends JFrame {
	private JPanel contentPane;
	private JTextField textName;
	private JTextField textIPAddr;
	private JTextField textPort;
	
	// creating the frame here
	public doLogIn() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		setResizable(false);
		setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 13));
		setBackground(Color.BLACK);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 539);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textName.setBounds(97, 102, 188, 30);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(140, 78, 80, 22);
		contentPane.add(lblNewLabel);
		
		textIPAddr = new JTextField();
		textIPAddr.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textIPAddr.setBounds(97, 186, 188, 30);
		contentPane.add(textIPAddr);
		textIPAddr.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(165, 200, 56, 16);
		contentPane.add(label);
		
		JLabel lblIpAddress = new JLabel("IP Address :");
		lblIpAddress.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblIpAddress.setBounds(140, 161, 117, 22);
		contentPane.add(lblIpAddress);
		
		textPort = new JTextField();
		textPort.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPort.setColumns(10);
		textPort.setBounds(97, 270, 188, 30);
		contentPane.add(textPort);
		
		JLabel lblPort = new JLabel("Port :");
		lblPort.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPort.setBounds(140, 247, 117, 22);
		contentPane.add(lblPort);
		
		JLabel IpDesc = new JLabel("eg: 192.168..0.2");
		IpDesc.setBounds(186, 218, 120, 16);
		contentPane.add(IpDesc);
		
		JLabel portDesc = new JLabel("eg: 8806");
		portDesc.setBounds(233, 301, 120, 16);
		contentPane.add(portDesc);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nameOfPerson = textName.getText();
				String IPAddr = textIPAddr.getText();
				int port = Integer.parseInt(textPort.getText());
				login(nameOfPerson,IPAddr,port);
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.setToolTipText("");
		btnLogin.setBackground(new Color(240, 240, 240));
		btnLogin.setBounds(176, 416, 109, 30);
		contentPane.add(btnLogin);
	}
	
	private void login(String name,String ipAddr,int port) {
		dispose();
		new Client(name,ipAddr,port);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					doLogIn frame = new doLogIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
