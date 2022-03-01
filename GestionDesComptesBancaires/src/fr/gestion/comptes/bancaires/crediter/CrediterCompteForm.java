package fr.gestion.comptes.bancaires.crediter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

public class CrediterCompteForm {

	private JFrame frame;
	private JTextField txtCrditerUnCompte;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;
	private JButton btnNewButton;

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
		frame.setBounds(100, 100, 1300, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtCrditerUnCompte = new JTextField();
		txtCrditerUnCompte.setText("Cr\u00E9diter un compte");
		txtCrditerUnCompte.setHorizontalAlignment(SwingConstants.CENTER);
		txtCrditerUnCompte.setFont(new Font("Verdana", Font.BOLD, 30));
		txtCrditerUnCompte.setColumns(10);
		txtCrditerUnCompte.setBackground(new Color(118, 199, 240));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("Valider");
		btnNewButton_6.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnNewButton_6.setBackground(new Color(118, 199, 240));
		
		JLabel lblNewLabel_3 = new JLabel("Cr\u00E9diter un compte");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_3.setBackground(new Color(131, 224, 229));
		
		JLabel lblNewLabel_3_1 = new JLabel("Solde");
		lblNewLabel_3_1.setOpaque(true);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_3_1.setBackground(new Color(131, 224, 229));
		
		JLabel lblNewLabel_3_2 = new JLabel("Montant");
		lblNewLabel_3_2.setOpaque(true);
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_3_2.setBackground(new Color(131, 224, 229));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		btnNewButton = new JButton("<-------");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(192, 192, 192));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(339, Short.MAX_VALUE)
					.addComponent(txtCrditerUnCompte, GroupLayout.PREFERRED_SIZE, 616, GroupLayout.PREFERRED_SIZE)
					.addGap(329))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(222)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
					.addGap(77)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField)
						.addComponent(textField_2)
						.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE))
					.addContainerGap(144, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(64)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
					.addComponent(btnNewButton_6, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
					.addGap(428))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(86)
					.addComponent(txtCrditerUnCompte, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addGap(131)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
					.addGap(71)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_6, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
					.addGap(49))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
