package fr.gestion.comptes.bancaires.transferer;

import java.awt.Color;
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

public class Transferer {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton_1;
	
	private JTextField textField;


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

		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(118, 199, 240));
	
		btnNewButton.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent arg0) {
	                frame.setVisible(false);
	                ListeComptesForm listC = new ListeComptesForm();
	                listC.main(null);
	            }
	        });
			

		lblNewLabel = new JLabel("Transf\u00E9rer");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 30));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(118, 199, 240));
		


		
		
		
		

		lblNewLabel_2 = new JLabel("  1112311555");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setOpaque(true);

		lblNewLabel_3 = new JLabel("Montant :");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBackground(new Color(131, 224, 229));

		lblNewLabel_5 = new JLabel("Num\u00E9ro du compte Emetteur :");
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBackground(new Color(131, 224, 229));


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


		btnNewButton_1 = new JButton("<-------");
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                frame.setVisible(false);
                ListeComptesForm listC = new ListeComptesForm();
                listC.main(null);
            }
        });
		
		

		textField = new JTextField();
		textField.setColumns(10);

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
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup().addGap(101).addComponent(btnNewButton_1).addPreferredGap(
						ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 782, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 277,
												GroupLayout.PREFERRED_SIZE)
										.addGap(37).addComponent(textField, GroupLayout.PREFERRED_SIZE, 252,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 256,
												GroupLayout.PREFERRED_SIZE)
										.addGap(48).addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 470,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
								.addGap(190)))
				.addContainerGap(257, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup().addContainerGap(523, Short.MAX_VALUE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
						.addGap(493)));
		groupLayout
				.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup().addContainerGap()
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addGap(53)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
								.addGap(18)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(48)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 43,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnNewButton_1).addComponent(btnNewButton,
												GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
								.addGap(41)));
		frame.getContentPane().setLayout(groupLayout);

	}

}
