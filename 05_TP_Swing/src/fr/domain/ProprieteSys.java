package fr.domain;

import java.awt.EventQueue;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class ProprieteSys {

	private JFrame frmProprietesSysteme;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProprieteSys window = new ProprieteSys();
					window.frmProprietesSysteme.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProprieteSys() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProprietesSysteme = new JFrame();
		frmProprietesSysteme.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\TP_JAVA_OBJET\\05_TP_Swing\\images\\st,small,507x507-pad,600x600,f8f8f8.u3_25.jpg"));
		frmProprietesSysteme.setTitle("Proprietes systeme");
		frmProprietesSysteme.setBounds(100, 100, 450, 212);
		frmProprietesSysteme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProprietesSysteme.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nom de la machine");
		lblNewLabel.setBounds(98, 34, 112, 14);
		frmProprietesSysteme.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Adresse IP");
		lblNewLabel_1.setBounds(98, 59, 68, 14);
		frmProprietesSysteme.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Utilisateur");
		lblNewLabel_2.setBounds(98, 84, 58, 14);
		frmProprietesSysteme.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nom de l'OS");
		lblNewLabel_3.setBounds(98, 109, 89, 14);
		frmProprietesSysteme.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Machine virtuelle");
		lblNewLabel_4.setBounds(98, 134, 112, 14);
		frmProprietesSysteme.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(220, 31, 204, 20);
		frmProprietesSysteme.getContentPane().add(textField);
		textField.setColumns(10);
		try {
			textField.setText(InetAddress.getLocalHost().getHostName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(220, 56, 204, 20);
		frmProprietesSysteme.getContentPane().add(textField_1);
		textField_1.setColumns(10);	
		
		try {
			textField_1.setText(InetAddress.getLocalHost().toString());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(220, 81, 204, 20);
		frmProprietesSysteme.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		textField_2.setText(System.getProperty("user.name")); 
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(220, 106, 204, 20);
		frmProprietesSysteme.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		textField_3.setText(System.getProperty("os.name"));
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(220, 131, 204, 20);
		frmProprietesSysteme.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		textField_4.setText(System.getProperty("java.vm.name"));
		
		JLabel lblNewLabel_5 = new JLabel("image");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setIcon(new ImageIcon("D:\\TP_JAVA_OBJET\\05_TP_Swing\\images\\st,small,507x507-pad,600x600,f8f8f8.u3_100.jpg"));
		lblNewLabel_5.setBounds(10, 45, 88, 93);
		frmProprietesSysteme.getContentPane().add(lblNewLabel_5);
	}
}
