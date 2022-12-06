package fr.domain;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MonApp2 {

	private JFrame frmConnectionAvecVotre;
	private JTextField input;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MonApp2 window = new MonApp2();
					window.frmConnectionAvecVotre.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MonApp2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConnectionAvecVotre = new JFrame();
		frmConnectionAvecVotre.setTitle("Connection avec votre pseudo");
		frmConnectionAvecVotre.setBounds(100, 100, 450, 300);
		frmConnectionAvecVotre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConnectionAvecVotre.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Entrez votre pseudo");
		lblNewLabel.setBounds(6, 9, 104, 14);
		frmConnectionAvecVotre.getContentPane().add(lblNewLabel);
		
		input = new JTextField();
		input.setBounds(120, 6, 304, 20);
		frmConnectionAvecVotre.getContentPane().add(input);
		input.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Voici votre pseudo");
		lblNewLabel_1.setBounds(6, 232, 104, 14);
		frmConnectionAvecVotre.getContentPane().add(lblNewLabel_1);
		
		result = new JTextField();
		result.setEditable(false);
		result.setBounds(120, 229, 304, 20);
		frmConnectionAvecVotre.getContentPane().add(result);
		result.setColumns(10);
		
		JButton btnNewButton = new JButton("Annuler");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(44, 113, 89, 23);
		frmConnectionAvecVotre.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Effacer");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("");
				input.setText("");
				
			}
		});
		btnNewButton_1.setBounds(173, 113, 89, 23);
		frmConnectionAvecVotre.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ok");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(input.getText());
			}
		});
		
		btnNewButton_2.setBounds(297, 113, 89, 23);
		frmConnectionAvecVotre.getContentPane().add(btnNewButton_2);
	}
}
