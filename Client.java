package chatProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Client extends JFrame {

	private JPanel contentPane;
	private String name;
	private String IPAddr;
	private int port;

	public Client(String name,String IPAddr,int port) {
		this.name = name;
		this.IPAddr = IPAddr;
		this.port = port;
		createChatGui();
	}
	
	private void createChatGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 656);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setVisible(true);
	}

}
