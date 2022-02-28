package fr.gestion.comptes.bancaires.comptes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListeComptesForm {

	private JFrame frame;
	private JTextField txtIsnBank;
	private JTextField txtGestionDeLa;
	private JTextField txtTypeDeCompte;
	private JTextField txtNumeroDeCompte;
	private JTextField txtLibellClient;
	private JTextField txtSole;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListeComptesForm window = new ListeComptesForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ListeComptesForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(190, 247, 251));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtIsnBank = new JTextField();
		txtIsnBank.setBackground(new Color(190, 247, 251));
		txtIsnBank.setText("ISN BANK");
		txtIsnBank.setBounds(0, 0, 86, 20);
		frame.getContentPane().add(txtIsnBank);
		txtIsnBank.setColumns(10);
		
		txtGestionDeLa = new JTextField();
		txtGestionDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		txtGestionDeLa.setText("Gestion de la liste des compte");
		txtGestionDeLa.setBounds(124, 11, 252, 42);
		frame.getContentPane().add(txtGestionDeLa);
		txtGestionDeLa.setColumns(10);
		
		txtTypeDeCompte = new JTextField();
		txtTypeDeCompte.setText("Type de compte");
		txtTypeDeCompte.setHorizontalAlignment(SwingConstants.CENTER);
		txtTypeDeCompte.setBounds(0, 64, 86, 20);
		frame.getContentPane().add(txtTypeDeCompte);
		txtTypeDeCompte.setColumns(10);
		
		txtNumeroDeCompte = new JTextField();
		txtNumeroDeCompte.setText("Numero de compte");
		txtNumeroDeCompte.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumeroDeCompte.setBounds(96, 64, 104, 20);
		frame.getContentPane().add(txtNumeroDeCompte);
		txtNumeroDeCompte.setColumns(10);
		
		txtLibellClient = new JTextField();
		txtLibellClient.setText("Libell\u00E9 client");
		txtLibellClient.setHorizontalAlignment(SwingConstants.CENTER);
		txtLibellClient.setBounds(220, 64, 86, 20);
		frame.getContentPane().add(txtLibellClient);
		txtLibellClient.setColumns(10);
		
		txtSole = new JTextField();
		txtSole.setText("Sole");
		txtSole.setHorizontalAlignment(SwingConstants.CENTER);
		txtSole.setBounds(326, 64, 86, 20);
		frame.getContentPane().add(txtSole);
		txtSole.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(0, 95, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(96, 95, 104, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(220, 95, 86, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(326, 95, 86, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(0, 126, 86, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(96, 126, 104, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(220, 126, 86, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(326, 126, 86, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNewButton = new JButton("Ouvrir un compte");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setToolTipText("");
		btnNewButton.setBounds(10, 156, 116, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Modifier");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(180, 156, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("D\u00E9biter");
		btnNewButton_2.setBounds(10, 183, 116, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Crediter");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(180, 183, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Tensf\u00E9rer");
		btnNewButton_4.setBounds(323, 156, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Cloturer");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(323, 183, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("Deconnexion");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setBounds(162, 224, 136, 23);
		frame.getContentPane().add(btnNewButton_6);
	}
}
