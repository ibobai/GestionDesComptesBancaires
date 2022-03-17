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

import fr.gestion.comptes.bancaires.comptes.ListeComptesForm;
import fr.gestion.comptes.bancaires.modifier.ModifierCompteFormCourant;

import javax.swing.JLabel;

public class CrediterCompteForm {

	private JLabel lblcrediterUnCompte;
	private JFrame frame;
	private JTextField inputCrediterUnCompte;
	private JTextField inputSolde;
	private JTextField InputMontant;
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
	
	
		
		inputCrediterUnCompte = new JTextField();
		inputCrediterUnCompte.setColumns(10);
		
		inputSolde = new JTextField();
		inputSolde.setColumns(10);
		
		JButton btnValiderCrediterUnCompte = new JButton("Valider");
		btnValiderCrediterUnCompte.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnValiderCrediterUnCompte.setBackground(new Color(118, 199, 240));
		btnValiderCrediterUnCompte.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                frame.setVisible(false);
                ListeComptesForm listC = new ListeComptesForm();
                listC.main(null);
            }
        });
		
		
		
		JLabel lblCrediterCompte = new JLabel("Cr\u00E9diter un compte");
		lblCrediterCompte.setOpaque(true);
		lblCrediterCompte.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrediterCompte.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblCrediterCompte.setBackground(new Color(131, 224, 229));

		
		JLabel lblSolde = new JLabel("Solde");
		lblSolde.setOpaque(true);
		lblSolde.setHorizontalAlignment(SwingConstants.CENTER);
		lblSolde.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblSolde.setBackground(new Color(131, 224, 229));
		
		JLabel lblMontant = new JLabel("Montant");
		lblMontant.setOpaque(true);
		lblMontant.setHorizontalAlignment(SwingConstants.CENTER);
		lblMontant.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblMontant.setBackground(new Color(131, 224, 229));
		
		InputMontant = new JTextField();
		InputMontant.setColumns(10);
		
		btnNewButton = new JButton("<-------");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                frame.setVisible(false);
                ListeComptesForm listC = new ListeComptesForm();
                listC.main(null);
            }
        });
		

    	lblcrediterUnCompte = new JLabel("Crediter un compte");
		lblcrediterUnCompte.setFont(new Font("Verdana", Font.BOLD, 30));
		lblcrediterUnCompte.setBackground(new Color(118, 199, 240));
		lblcrediterUnCompte.setHorizontalAlignment(SwingConstants.CENTER);
		lblcrediterUnCompte.setOpaque(true);


		
		
/////////////  Layout	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		
		

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(222)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCrediterCompte, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSolde, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMontant, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
					.addGap(77)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(InputMontant)
						.addComponent(inputSolde)
						.addComponent(inputCrediterUnCompte, GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE))
					.addContainerGap(144, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(64)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
					.addComponent(btnValiderCrediterUnCompte, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
					.addGap(428))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(496, Short.MAX_VALUE)
					.addComponent(lblcrediterUnCompte, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
					.addGap(188))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(117)
					.addComponent(lblcrediterUnCompte, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(114)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCrediterCompte, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(inputCrediterUnCompte, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSolde, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(inputSolde, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMontant, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(InputMontant, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
					.addGap(71)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnValiderCrediterUnCompte, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
					.addGap(49))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
