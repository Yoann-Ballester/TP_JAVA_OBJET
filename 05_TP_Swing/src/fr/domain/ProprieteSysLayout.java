package fr.domain;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class ProprieteSysLayout {

	private JFrame frmProprieteSysteme;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProprieteSysLayout window = new ProprieteSysLayout();
					window.frmProprieteSysteme.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProprieteSysLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProprieteSysteme = new JFrame();
		frmProprieteSysteme.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\TP_JAVA_OBJET\\05_TP_Swing\\images\\st,small,507x507-pad,600x600,f8f8f8.u3_25.jpg"));
		frmProprieteSysteme.setTitle("Propriete systeme");
		frmProprieteSysteme.setBounds(100, 100, 447, 195);
		frmProprieteSysteme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProprieteSysteme.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel Icone = new JPanel();
		frmProprieteSysteme.getContentPane().add(Icone, BorderLayout.WEST);
		GridBagLayout gbl_Icone = new GridBagLayout();
		gbl_Icone.columnWidths = new int[]{0, 0};
		gbl_Icone.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_Icone.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_Icone.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Icone.setLayout(gbl_Icone);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\TP_JAVA_OBJET\\05_TP_Swing\\images\\st,small,507x507-pad,600x600,f8f8f8.u3_100.jpg"));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 2;
		Icone.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JPanel PanCentre = new JPanel();
		frmProprieteSysteme.getContentPane().add(PanCentre, BorderLayout.CENTER);
		PanCentre.setLayout(new BorderLayout(0, 0));
		
		JPanel PanCentreGauche = new JPanel();
		PanCentre.add(PanCentreGauche, BorderLayout.WEST);
		GridBagLayout gbl_PanCentreGauche = new GridBagLayout();
		gbl_PanCentreGauche.columnWidths = new int[]{0};
		gbl_PanCentreGauche.rowHeights = new int[]{0};
		gbl_PanCentreGauche.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_PanCentreGauche.rowWeights = new double[]{Double.MIN_VALUE};
		PanCentreGauche.setLayout(gbl_PanCentreGauche);
		
		JPanel PanCentreCentre = new JPanel();
		PanCentre.add(PanCentreCentre, BorderLayout.CENTER);
		GridBagLayout gbl_PanCentreCentre = new GridBagLayout();
		gbl_PanCentreCentre.columnWidths = new int[]{0, 0, 0};
		gbl_PanCentreCentre.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_PanCentreCentre.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_PanCentreCentre.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		PanCentreCentre.setLayout(gbl_PanCentreCentre);
		
		lblNewLabel = new JLabel("Nom de la machine");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		PanCentreCentre.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		textField.setText("STA6017333");
		textField.setEditable(false);
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		PanCentreCentre.add(textField, gbc_textField);
		
		lblNewLabel_1 = new JLabel("Adresse IP");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		PanCentreCentre.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setText("STA6017333/10.75.25.171");
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		PanCentreCentre.add(textField_1, gbc_textField_1);
		
		lblNewLabel_2 = new JLabel("Utilisateur");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		PanCentreCentre.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setText("77011-05-04");
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 3;
		PanCentreCentre.add(textField_2, gbc_textField_2);
		
		lblNewLabel_3 = new JLabel("Nom de l'OS");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 4;
		PanCentreCentre.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setText("Windows 10");
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 4;
		PanCentreCentre.add(textField_3, gbc_textField_3);
		
		lblNewLabel_4 = new JLabel("Machine virtuelle");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 5;
		PanCentreCentre.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setText("OpenJDK 64-Bit Server VM");
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 5;
		PanCentreCentre.add(textField_4, gbc_textField_4);
	}
}
