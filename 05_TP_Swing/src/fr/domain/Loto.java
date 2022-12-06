package fr.domain;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Loto {

	private JFrame frmFdj;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loto window = new Loto();
					window.frmFdj.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Loto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFdj = new JFrame();
		frmFdj.setTitle("Fdj");
		frmFdj.setBounds(100, 100, 805, 456);
		frmFdj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFdj.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\TP_JAVA_OBJET\\05_TP_Swing\\images\\téléchargement.png"));
		lblNewLabel.setBounds(178, 11, 414, 123);
		frmFdj.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Premier tirage");
		chckbxNewCheckBox.setSelected(true);
		boolean a=chckbxNewCheckBox.isSelected();
	
		
		chckbxNewCheckBox.setBounds(178, 143, 155, 23);
		frmFdj.getContentPane().add(chckbxNewCheckBox);
		
		
		
		
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Second tirage");
		chckbxNewCheckBox_1.setBounds(422, 143, 227, 23);
		frmFdj.getContentPane().add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("Tirage du 03/12/2022");
		lblNewLabel_1.setBounds(41, 199, 120, 23);
		frmFdj.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(29, 243, 30, 20);
		frmFdj.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText("32");
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(82, 243, 30, 20);
		frmFdj.getContentPane().add(textField_1);
		
		textField_1.setText("19");
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(146, 243, 30, 20);
		frmFdj.getContentPane().add(textField_2);
		textField_2.setText("34");
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(213, 243, 30, 20);
		frmFdj.getContentPane().add(textField_3);
		textField_3.setText("26");
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(271, 243, 30, 20);
		frmFdj.getContentPane().add(textField_4);
		textField_4.setText("27");
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(323, 243, 30, 20);
		frmFdj.getContentPane().add(textField_5);
		textField_5.setText("9");
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBounds(29, 294, 30, 20);
		frmFdj.getContentPane().add(textField_6);
		textField_6.setText("16");
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setColumns(10);
		textField_7.setBounds(82, 294, 30, 20);
		frmFdj.getContentPane().add(textField_7);
		textField_7.setText("22");
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setColumns(10);
		textField_8.setBounds(146, 294, 30, 20);
		frmFdj.getContentPane().add(textField_8);
		textField_8.setText("24");
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setColumns(10);
		textField_9.setBounds(213, 294, 30, 20);
		frmFdj.getContentPane().add(textField_9);
		textField_9.setText("26");
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setColumns(10);
		textField_10.setBounds(271, 294, 30, 20);
		frmFdj.getContentPane().add(textField_10);
		textField_10.setText("47");
		
		JLabel lblNewLabel_2 = new JLabel("Chance");
		lblNewLabel_2.setBounds(321, 217, 46, 14);
		frmFdj.getContentPane().add(lblNewLabel_2);
		
		
		
		if (a==true) {
			
			lblNewLabel_2.setText("Chance");
			
		}else {
			lblNewLabel_2.setText("");
		}
		
	}
}
