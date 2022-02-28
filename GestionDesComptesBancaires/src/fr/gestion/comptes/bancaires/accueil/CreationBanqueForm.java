package fr.gestion.comptes.bancaires.accueil;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;

public class CreationBanqueForm {

	private JFrame frame;
	private JTextField txtUtilisateur;
	private JTextField txtMotDePasse;
	private JButton btnNewButton;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtGestionBancaire;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreationBanqueForm window = new CreationBanqueForm();
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
	public CreationBanqueForm() {
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
		
		txtMotDePasse = new JTextField();
		txtMotDePasse.setBounds(77, 176, 86, 20);
		txtMotDePasse.setHorizontalAlignment(SwingConstants.CENTER);
		txtMotDePasse.setBackground(new Color(190, 247, 251));
		txtMotDePasse.setText("Mot de passe");
		frame.getContentPane().add(txtMotDePasse);
		txtMotDePasse.setColumns(10);
		
		txtUtilisateur = new JTextField();
		txtUtilisateur.setHorizontalAlignment(SwingConstants.CENTER);
		txtUtilisateur.setBounds(77, 132, 86, 20);
		txtUtilisateur.setBackground(new Color(190, 247, 251));
		txtUtilisateur.setText("Utilisateur");
		frame.getContentPane().add(txtUtilisateur);
		txtUtilisateur.setColumns(10);
		
		btnNewButton = new JButton("Valider");
		btnNewButton.setBounds(202, 207, 65, 23);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea txtrIsbBank = new JTextArea();
		txtrIsbBank.setLineWrap(true);
		txtrIsbBank.setBounds(166, 41, 132, 57);
		txtrIsbBank.setBackground(new Color(190, 247, 251));
		txtrIsbBank.setFont(new Font("SansSerif", Font.BOLD, 26));
		txtrIsbBank.setText("ISB BANK");
		frame.getContentPane().add(txtrIsbBank);
		
		textField = new JTextField();
		textField.setBounds(192, 132, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(192, 176, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		txtGestionBancaire = new JTextField();
		txtGestionBancaire.setHorizontalAlignment(SwingConstants.CENTER);
		txtGestionBancaire.setForeground(new Color(0, 0, 0));
		txtGestionBancaire.setBackground(new Color(190, 247, 251));
		txtGestionBancaire.setText("Gestion Bancaire");
		txtGestionBancaire.setBounds(0, 0, 96, 20);
		frame.getContentPane().add(txtGestionBancaire);
		txtGestionBancaire.setColumns(10);
	}
}
