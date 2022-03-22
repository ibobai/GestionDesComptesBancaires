package fr.gestion.comptes.bancaires.comptes;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

import fr.gestion.comptes.bancaires.accueil.CreationBanqueForm;
import fr.gestion.comptes.bancaires.cloturer.CloturerCompteForm;
import fr.gestion.comptes.bancaires.crediter.CrediterCompteForm;
import fr.gestion.comptes.bancaires.debiter.DebiterCompteForm;
import fr.gestion.comptes.bancaires.modifier.ModifierCompteFormCourant;
import fr.gestion.comptes.bancaires.ouvrir.OuvrirCompteForm;
import fr.gestion.comptes.bancaires.transferer.Transferer;
import java.awt.event.MouseAdapter;
import javax.swing.table.DefaultTableModel;

public class ListeComptesForm {

	private JFrame frame;
	private JTable table;
	private JButton btnModifier;
	private JButton btnCredite;
	private JButton btnTransferer;
	private JButton btnCloturer;
	private JButton btnDiter;
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
		frame.setResizable(false);

		frame.getContentPane().setBackground(new Color(190, 247, 251));

		/*
		 * 
		 * table = new JTable(); table.setBorder(null);
		 * table.setColumnSelectionAllowed(true); table.setFont(new Font("Verdana",
		 * Font.PLAIN, 15)); table.setBackground(new Color(118, 199, 240));
		 * table.setModel(new DefaultTableModel( new Object[][] { {"Type de compte",
		 * "Numero de compte", "Lib\u00E9ll\u00E9 Client", "Solde"}, {"", "", "", null},
		 * {null, null, null, null}, {null, null, null, null}, {null, null, null, null},
		 * {null, null, null, null}, {null, null, null, null}, {null, null, null, null},
		 * {null, null, null, null}, }, new String[] { "New column", "New column",
		 * "New column", "New column" } ));
		 * table.getColumnModel().getColumn(0).setPreferredWidth(154);
		 * table.getColumnModel().getColumn(1).setPreferredWidth(154);
		 * table.getColumnModel().getColumn(2).setPreferredWidth(154);
		 * table.getColumnModel().getColumn(3).setPreferredWidth(154);
		 */

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
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"001", "vinod", "Bihar", "India"},
				{"002", "Raju", "ABC", "Kanada"},
				{"003", "Aman", "Delhi", "India"},
				{"001", "vinod", "Bihar", "India"},
				{"002", "Raju", "ABC", "Kanada"},
				{"003", "Aman", "Delhi", "India"},
				{"004", "Ranjan", "Bangloor", "India"},
				{"001", "vinod", "Bihar", "India"},
				{"002", "Raju", "ABC", "Kanada"},
				{"003", "Aman", "Delhi", "India"},
				{"001", "vinod", "Bihar", "India"},
				{"002", "Raju", "ABC", "Kanada"},
				{"003", "Aman", "Delhi", "India"},
				{"004", "Ranjan", "Bangloor", "India"},
				{"001", "vinod", "Bihar", "India"},
				{"002", "Raju", "ABC", "Kanada"},
				{"003", "Aman", "Delhi", "India"},
				{"001", "vinod", "Bihar", "India"},
				{"002", "Raju", "ABC", "Kanada"},
				{"003", "Aman", "Delhi", "India"},
				{"004", "Ranjan", "Bangloor", "India"},
				{"001", "vinod", "Bihar", "India"},
				{"002", "Raju", "ABC", "Kanada"},
				{"003", "Aman", "Delhi", "India"},
				{"001", "vinod", "Bihar", "India"},
				{"002", "Raju", "ABC", "Kanada"},
				{"003", "Aman", "Delhi", "India"},
				{"004", "Ranjan", "Bangloor", "India"},
			},
			new String[] {
				"   Num\u00E9ro de Compte  ", "    Type de Compte", "   Cilent", "    Solde"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		

		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setFont(new Font("Verdana", Font.PLAIN, 12));
		table.setPreferredScrollableViewportSize(new Dimension(500, 200));
		table.setFillsViewportHeight(true);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		// frame.getContentPane().add(scrollPane);

		JTableHeader header = table.getTableHeader();
		header.setBackground(new Color(123, 167, 220));
		header.setFont(new Font("Verdana", Font.BOLD, 14));

////////////////////////////////////////// TABLE ///////////////////////////////////////////////////////////////////////////////////////////

		btnModifier = new JButton("Modifier");
		btnModifier.setEnabled(false);
		btnModifier.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Cursor cur1 = new Cursor(Cursor.HAND_CURSOR);
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

		btnCredite = new JButton("Crediter");
		btnCredite.setEnabled(false);
		btnCredite.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Cursor cur1 = new Cursor(Cursor.HAND_CURSOR);
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
		btnTransferer.setEnabled(false);
		btnTransferer.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Cursor cur1 = new Cursor(Cursor.HAND_CURSOR);
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
		btnCloturer.setEnabled(false);
		btnCloturer.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Cursor cur1 = new Cursor(Cursor.HAND_CURSOR);
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

		btnDiter = new JButton("Debiter");
		btnDiter.setEnabled(false);
		btnDiter.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {

				Cursor cur1 = new Cursor(Cursor.HAND_CURSOR);
				btnDiter.setCursor(cur1);

			}
		});
		btnDiter.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnDiter.setBackground(new Color(131, 224, 229));
		btnDiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				DebiterCompteForm listC = new DebiterCompteForm();
				listC.main(null);
			}
		});
		
		
		


		// Contrôle table

//		table.getSelectionModel().addListSelectionListener(
//		        new ListSelectionListener() {
//		            public void valueChanged(ListSelectionEvent event) {
//		                int viewRow = table.getSelectedRow();
//		                if (viewRow < 0) {
//		                    //Selection got filtered away.
//		                    System.out.println(viewRow);
//		                } else {
//		                    int modelRow = 
//		                        table.convertRowIndexToModel(viewRow);
//
//		                }
//		            }
//		        }
//		);
		
		//table.setEnabled(false);
//		ListSelectionModel cellSelectionModel = table.getSelectionModel();
//		cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//
//		cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
//			public void valueChanged(ListSelectionEvent e) {
//				String selectedData = null;
//
//				int[] selectedRow = table.getSelectedRows();
//				int[] selectedColumns = table.getSelectedColumns();
//				for (int i = 0; i < selectedRow.length; i++) {
//					for (int j = 0; j < selectedColumns.length; j++) {
//						selectedData = (String) table.getValueAt(selectedRow[i], selectedColumns[j]);
//					}
//				}
//				System.out.println("Selected: " + selectedData);
//			}
//
//		});
		
//		
//		ListSelectionModel model = table.getSelectionModel();
//		model.addListSelectionListener(new ListSelectionListener() {
//
//			@Override
//			public void valueChanged(ListSelectionEvent arg0) {
//				// TODO Auto-generated method stub
//				if(model.isSelectionEmpty()) {
//					System.out.println("Here you must desactivate the buttons");
//				}else if (!model.isSelectionEmpty()) {
//					int selectedRow = model.getSelectedItemsCount();
//					System.out.println("The selected row is : "+selectedRow);
//				}
//			}
//			
//		});
		

//		table.addMouseListener(new MouseAdapter() {
//			public void mousePressed(MouseEvent e) {
//				String selectedCellValue = (String) table.getValueAt(table.getSelectedRow(), table.getSelectedColumn());
//				System.out.println(selectedCellValue);
//			}
//
//		});

		///////// OUVRIR UN COMPTE
		///////// #######################################################################################

		btnOuvCompte = new JButton("Ouvrir un compte");
		btnOuvCompte.setEnabled(false);
		btnOuvCompte.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {

				Cursor cur1 = new Cursor(Cursor.HAND_CURSOR);
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

		////// DECONNEXION
		////// ###############################################################################################"""

		btnDeconnexion = new JButton("D\u00E9connexion");
		btnDeconnexion.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Cursor cur1 = new Cursor(Cursor.HAND_CURSOR);
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
		
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Row clicked ! ");
				btnModifier.setEnabled(true);
				btnCredite.setEnabled(true);
				btnTransferer.setEnabled(true);
				btnCloturer.setEnabled(true);
				btnDiter.setEnabled(true);
				btnOuvCompte.setEnabled(true);

				



//				int i = table.getSelectedRow();
//				TableModel tm = table.getModel();
//				System.out.println(tm.getValueAt(i, 0).toString());
//				System.out.println(tm.getValueAt(i, 1).toString());
//				System.out.println(tm.getValueAt(i, 2).toString());
//				System.out.println(tm.getValueAt(i, 3).toString());


			}
		});

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(185)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnOuvCompte, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDiter, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 517, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCredite, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCloturer, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnTransferer, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
					.addGap(218))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1190, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(17)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1250, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(33, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(536)
					.addComponent(btnDeconnexion, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(574, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(332)
					.addComponent(lblListDesCompte, GroupLayout.PREFERRED_SIZE, 574, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(394, Short.MAX_VALUE))
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
								.addComponent(btnDiter, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTransferer, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCloturer, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(76, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnDeconnexion, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(26))))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 1300, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
