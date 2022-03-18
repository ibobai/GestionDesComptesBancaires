package fr.gestion.comptes.bancaires.transferer;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.JTableHeader;

import fr.gestion.comptes.bancaires.comptes.ListeComptesForm;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class Transferer {

	private JFrame frame;
	private JLabel lblTransferer;
	private JLabel lblChampsNumDeCompte;
	private JLabel lblMontant;
	private JLabel lblNumDeCompte;
	private JButton btnNewButton_1;
	private JButton btnRoutour;
	
	private JTextField txtMontant;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transferer window = new Transferer();
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
	public Transferer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(190, 247, 251));
		frame.setBackground(new Color(0, 191, 255));
		frame.setBounds(100, 100, 1300, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnValider = new JButton("Valider");
		btnValider.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Cursor  cur1 = new Cursor(Cursor.HAND_CURSOR);
				btnValider.setCursor(cur1);
			}
		});
		btnValider.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnValider.setBackground(new Color(118, 199, 240));
	
		btnValider.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent arg0) {
	                frame.setVisible(false);
	                ListeComptesForm listC = new ListeComptesForm();
	                listC.main(null);
	            }
	        });
			

		lblTransferer = new JLabel("Transf\u00E9rer");
		lblTransferer.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransferer.setFont(new Font("Verdana", Font.BOLD, 30));
		lblTransferer.setOpaque(true);
		lblTransferer.setBackground(new Color(118, 199, 240));
		


		
		
		
		

		lblChampsNumDeCompte = new JLabel("  1112311555");
		lblChampsNumDeCompte.setHorizontalAlignment(SwingConstants.CENTER);
		lblChampsNumDeCompte.setBackground(new Color(255, 255, 255));
		lblChampsNumDeCompte.setOpaque(true);

		lblMontant = new JLabel("Montant :");
		lblMontant.setOpaque(true);
		lblMontant.setHorizontalAlignment(SwingConstants.CENTER);
		lblMontant.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMontant.setBackground(new Color(131, 224, 229));

		lblNumDeCompte = new JLabel("Num\u00E9ro du compte Emetteur :");
		lblNumDeCompte.setOpaque(true);
		lblNumDeCompte.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumDeCompte.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumDeCompte.setBackground(new Color(131, 224, 229));


		btnNewButton_1 = new JButton("<-------");
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                frame.setVisible(false);
                ListeComptesForm listC = new ListeComptesForm();
                listC.main(null);
            }
        });


		btnRoutour = new JButton("<-------");
		btnRoutour.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {Cursor  cur1 = new Cursor(Cursor.HAND_CURSOR);
			btnRoutour.setCursor(cur1);
			}
		});
		btnRoutour.setBackground(new Color(192, 192, 192));
		btnRoutour.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		btnRoutour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                frame.setVisible(false);
                ListeComptesForm listC = new ListeComptesForm();
                listC.main(null);
            }
        });
		
		

		txtMontant = new JTextField();
		txtMontant.setToolTipText("");
		txtMontant.setColumns(10);
		System.out.println(txtMontant.getText());

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

		// Layout

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(101)
					.addComponent(btnRoutour)
					.addPreferredGap(ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 782, GroupLayout.PREFERRED_SIZE)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblMontant, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
								.addGap(37)
								.addComponent(txtMontant, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblNumDeCompte, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
								.addGap(48)
								.addComponent(lblChampsNumDeCompte, GroupLayout.PREFERRED_SIZE, 470, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnValider, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
							.addGap(190)))
					.addContainerGap(257, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(523, Short.MAX_VALUE)
					.addComponent(lblTransferer, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
					.addGap(493))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTransferer, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(53)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblChampsNumDeCompte, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNumDeCompte, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(48)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMontant, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtMontant, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnRoutour)
						.addComponent(btnValider, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
					.addGap(41))
		);
		frame.getContentPane().setLayout(groupLayout);

	}

}
