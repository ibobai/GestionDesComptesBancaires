package fr.gestion.comptes.bancaires.crediter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrediterCompteForm {

	private JFrame frame;
	private JTextField txtCrditerUnCompte;
	private JTextField txtCrditerLeCompten;
	private JTextField txtSole;
	private JTextField txtMontant;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrediterCompteForm window = new CrediterCompteForm();
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
	public CrediterCompteForm() {
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
		
		txtCrditerUnCompte = new JTextField();
		txtCrditerUnCompte.setHorizontalAlignment(SwingConstants.CENTER);
		txtCrditerUnCompte.setText("Cr\u00E9diter un compte");
		txtCrditerUnCompte.setBounds(163, 35, 139, 37);
		frame.getContentPane().add(txtCrditerUnCompte);
		txtCrditerUnCompte.setColumns(10);
		
		txtCrditerLeCompten = new JTextField();
		txtCrditerLeCompten.setHorizontalAlignment(SwingConstants.CENTER);
		txtCrditerLeCompten.setText("Cr\u00E9diter le compteN\u00B0");
		txtCrditerLeCompten.setBounds(10, 101, 115, 20);
		frame.getContentPane().add(txtCrditerLeCompten);
		txtCrditerLeCompten.setColumns(10);
		
		txtSole = new JTextField();
		txtSole.setHorizontalAlignment(SwingConstants.CENTER);
		txtSole.setText("Solde");
		txtSole.setBounds(10, 132, 115, 20);
		frame.getContentPane().add(txtSole);
		txtSole.setColumns(10);
		
		txtMontant = new JTextField();
		txtMontant.setHorizontalAlignment(SwingConstants.CENTER);
		txtMontant.setText("Montant");
		txtMontant.setBounds(10, 163, 115, 20);
		frame.getContentPane().add(txtMontant);
		txtMontant.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(163, 101, 160, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(163, 132, 160, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(163, 163, 160, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(191, 212, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
