package fr.gestion.comptes.bancaires.comptes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class ListeComptesForm {

	private JFrame frame;
	private JTextField txtGestionDeLa;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnOuvdbiter;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JLabel lblNewLabel;

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
		
		txtGestionDeLa = new JTextField();
		txtGestionDeLa.setBackground(new Color(118, 199, 240));
		txtGestionDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		txtGestionDeLa.setFont(new Font("Verdana", Font.BOLD, 30));
		txtGestionDeLa.setText("Gestion de la liste des comptes");
		txtGestionDeLa.setColumns(10);
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setFont(new Font("Verdana", Font.PLAIN, 15));
		table.setBackground(new Color(118, 199, 240));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Type de compte", "Numero de compte", "Lib\u00E9ll\u00E9 Client", "Solde"},
				{"", "", "", null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(154);
		table.getColumnModel().getColumn(1).setPreferredWidth(154);
		table.getColumnModel().getColumn(2).setPreferredWidth(154);
		table.getColumnModel().getColumn(3).setPreferredWidth(154);
		
		btnNewButton = new JButton("Modifier");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(131, 224, 229));
		
		btnNewButton_1 = new JButton("Cr\u00E9diter");
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnNewButton_1.setBackground(new Color(131, 224, 229));
		
		btnNewButton_2 = new JButton("Transf\u00E9rer");
		btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnNewButton_2.setBackground(new Color(131, 224, 229));
		
		btnNewButton_3 = new JButton("Cloturer");
		btnNewButton_3.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnNewButton_3.setBackground(new Color(131, 224, 229));
		
		btnOuvdbiter = new JButton("D\u00E9biter");
		btnOuvdbiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOuvdbiter.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnOuvdbiter.setBackground(new Color(131, 224, 229));
		
		btnNewButton_5 = new JButton("Ouvrir un compte");
		btnNewButton_5.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnNewButton_5.setBackground(new Color(131, 224, 229));
		
		btnNewButton_6 = new JButton("D\u00E9connexion");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnNewButton_6.setBackground(new Color(118, 199, 240));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ListeComptesForm.class.getResource("/res/ISN_BANK_logo_sans_trais.png")));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(344)
					.addComponent(txtGestionDeLa, GroupLayout.PREFERRED_SIZE, 616, GroupLayout.PREFERRED_SIZE)
					.addGap(336))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(185)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnOuvdbiter, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 513, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
					.addGap(218))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1188, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(17)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 1250, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(29, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(536)
					.addComponent(btnNewButton_6, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(558, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addComponent(txtGestionDeLa, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(26)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnOuvdbiter, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(75, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_6, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(26))))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 1300, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
