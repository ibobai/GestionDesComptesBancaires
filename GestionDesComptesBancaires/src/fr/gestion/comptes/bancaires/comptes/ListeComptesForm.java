package fr.gestion.comptes.bancaires.comptes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

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
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import fr.gestion.comptes.bancaires.accueil.CreationBanqueForm;
import fr.gestion.comptes.bancaires.cloturer.CloturerCompteForm;
import fr.gestion.comptes.bancaires.accueil.CreationBanqueForm;


import fr.gestion.comptes.bancaires.crediter.CrediterCompteForm;
import fr.gestion.comptes.bancaires.transferer.Transferer;

import fr.gestion.comptes.bancaires.debiter.DebiterCompteForm;
import fr.gestion.comptes.bancaires.modifier.ModifierCompteFormCourant;
import fr.gestion.comptes.bancaires.modifier.ModifierCompteFormEpargne;
import fr.gestion.comptes.bancaires.ouvrir.OuvrirCompteForm;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class ListeComptesForm {

	private JFrame frame;
	private JTable table;
	private JButton btnModifier;
	private JButton btnCredite;
	private JButton btnTransferer;
	private JButton btnCloturer;
	private JButton btnOuvdbiter;
	private JButton btnOuvCompte;
	private JButton btnDeconnexion;
	private JLabel lblNewLabel;
	private JLabel lblListDesCompte;

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
		
		/*
		
		table = new JTable();
		table.setBorder(null);
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
		table.getColumnModel().getColumn(3).setPreferredWidth(154); */
		
		// table 
		
		
		String data[][] = { { "001", "vinod", "Bihar", "India" }, { "002", "Raju", "ABC", "Kanada" },
				{ "003", "Aman", "Delhi", "India" }, { "001", "vinod", "Bihar", "India" },
				{ "002", "Raju", "ABC", "Kanada" }, { "003", "Aman", "Delhi", "India" },
				{ "004", "Ranjan", "Bangloor", "India" }, { "001", "vinod", "Bihar", "India" },
				{ "002", "Raju", "ABC", "Kanada" }, { "003", "Aman", "Delhi", "India" },
				{ "001", "vinod", "Bihar", "India" }, { "002", "Raju", "ABC", "Kanada" },
				{ "003", "Aman", "Delhi", "India" }, { "004", "Ranjan", "Bangloor", "India" },
				{ "001", "vinod", "Bihar", "India" }, { "002", "Raju", "ABC", "Kanada" },
				{ "003", "Aman", "Delhi", "India" }, { "001", "vinod", "Bihar", "India" },
				{ "002", "Raju", "ABC", "Kanada" }, { "003", "Aman", "Delhi", "India" },
				{ "004", "Ranjan", "Bangloor", "India" }, { "001", "vinod", "Bihar", "India" },
				{ "002", "Raju", "ABC", "Kanada" }, { "003", "Aman", "Delhi", "India" },
				{ "001", "vinod", "Bihar", "India" }, { "002", "Raju", "ABC", "Kanada" },
				{ "003", "Aman", "Delhi", "India" }, { "004", "Ranjan", "Bangloor", "India" } };

		String col[] = { "   Num\u00E9ro de Compte  ", "    Type de Compte", "   Cilent", "    Solde" };
		JTable table = new JTable(data, col);
		table.setFont(new Font("Verdana", Font.PLAIN, 12));
		table.setPreferredScrollableViewportSize(new Dimension(500, 200));
		table.setFillsViewportHeight(true);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		// frame.getContentPane().add(scrollPane);

		JTableHeader header = table.getTableHeader();
		header.setBackground(new Color(123, 167, 220));
		header.setFont(new Font("Verdana", Font.BOLD, 14) );
		
		
////////////////////////////////////////// TABLE ///////////////////////////////////////////////////////////////////////////////////////////
		
		btnModifier = new JButton("Modifier");
		btnModifier.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Cursor  cur1 = new Cursor(Cursor.HAND_CURSOR);
				btnModifier.setCursor(cur1);
				
			}
		});
		btnModifier.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnModifier.setBackground(new Color(131, 224, 229));
		btnModifier.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                frame.setVisible(false);
                ModifierCompteFormCourant listC = new ModifierCompteFormCourant();
                listC.main(null);
            }
        });
		
		btnCredite = new JButton("Créditer");
		btnCredite.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Cursor  cur1 = new Cursor(Cursor.HAND_CURSOR);
				btnCredite.setCursor(cur1);
			}
		});
		btnCredite.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnCredite.setBackground(new Color(131, 224, 229));
		btnCredite.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                frame.setVisible(false);
                CrediterCompteForm listC = new CrediterCompteForm();
                listC.main(null);
            }
        });
		 
		btnTransferer = new JButton("Transf\u00E9rer");
		btnTransferer.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Cursor  cur1 = new Cursor(Cursor.HAND_CURSOR);
				btnTransferer.setCursor(cur1);
			}
		});
		btnTransferer.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnTransferer.setBackground(new Color(131, 224, 229));
		btnTransferer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                frame.setVisible(false);
                Transferer listC = new Transferer();
                listC.main(null);
            }
        });
		
		
		btnCloturer = new JButton("Cloturer");
		btnCloturer.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Cursor  cur1 = new Cursor(Cursor.HAND_CURSOR);
				btnCloturer.setCursor(cur1);
			}
		});
		btnCloturer.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnCloturer.setBackground(new Color(131, 224, 229));
		btnCloturer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                frame.setVisible(false);
                CloturerCompteForm listC = new CloturerCompteForm();
                listC.main(null);
            }
        });
		
		
		btnOuvdbiter = new JButton("D\u00E9biter");
		btnOuvdbiter.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {

				Cursor  cur1 = new Cursor(Cursor.HAND_CURSOR);
				btnOuvdbiter.setCursor(cur1);
				
			}
		});
		btnOuvdbiter.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnOuvdbiter.setBackground(new Color(131, 224, 229));
		btnOuvdbiter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                frame.setVisible(false);
                DebiterCompteForm listC = new DebiterCompteForm();
                listC.main(null);
            }
        });
		
		btnOuvCompte = new JButton("Ouvrir un compte");
		btnOuvCompte.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				
					Cursor  cur1 = new Cursor(Cursor.HAND_CURSOR);
					btnOuvCompte.setCursor(cur1);
					
				}
			});
			
		btnOuvCompte.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnOuvCompte.setBackground(new Color(131, 224, 229));
		
		btnOuvCompte.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                frame.setVisible(false);
				OuvrirCompteForm listC = new OuvrirCompteForm();
                listC.main(null);
            }
        });
		
		btnDeconnexion = new JButton("D\u00E9connexion");
		btnDeconnexion.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Cursor  cur1 = new Cursor(Cursor.HAND_CURSOR);
				btnDeconnexion.setCursor(cur1);
				
			}
		});
     	btnDeconnexion.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnDeconnexion.setBackground(new Color(118, 199, 240));
		btnDeconnexion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                frame.setVisible(false);
				CreationBanqueForm listC = new CreationBanqueForm();
                listC.main(null);
            }
        });
		
		lblNewLabel = new JLabel("");
		lblListDesCompte = new JLabel("Gestion de la liste des Comptes");
		lblListDesCompte.setOpaque(true);
		lblListDesCompte.setHorizontalAlignment(SwingConstants.CENTER);
		lblListDesCompte.setFont(new Font("Verdana", Font.BOLD, 30));
		lblListDesCompte.setBackground(new Color(118, 199, 240));

		
		
	
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(185)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnOuvCompte, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnOuvdbiter, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 513, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnTransferer, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCredite, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCloturer, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
					.addGap(218))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1188, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(17)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1250, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(29, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(536)
					.addComponent(btnDeconnexion, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(570, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(332)
					.addComponent(lblListDesCompte, GroupLayout.PREFERRED_SIZE, 574, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(378, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(25)
					.addComponent(lblListDesCompte, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(88)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(26)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnOuvCompte, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCredite, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnTransferer, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnOuvdbiter, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCloturer, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(75, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDeconnexion, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(26))))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 1300, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
