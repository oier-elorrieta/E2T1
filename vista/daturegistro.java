package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import controlador.metodoak;
import modelo.Agentzia;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class daturegistro {

	private JFrame frame;
	private JTable ekiJTable;
	private JTable bidaiJTable;

	/**
	 * Launch the application.
	 */
	public static void pantalla(Agentzia ag) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					daturegistro window = new daturegistro(ag);
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
	public daturegistro(Agentzia ag) {
		initialize(ag);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param ag 
	 */
	private void initialize(Agentzia ag) {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1250, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		;
		String hexColor = metodoak.koloreaHartu(ag).trim();
		try {
			Color color = Color.decode(hexColor);
			panel.setBackground(color);
		} catch (NumberFormatException ex) {            
			panel.setBackground(Color.WHITE);
        }
                
        
		
		panel.setBounds(10, 11, 1214, 689);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
	
		
		JLabel imgLabel = new JLabel(new ImageIcon("C:/Users/in1dm3-d/Desktop/Erronka%202/Prog/Erronka2TalDe1/src/vista/pasaporte.jpg"));
		imgLabel.setBounds(1034, 11, 170, 148);
		panel.add(imgLabel);
		
		JLabel lblBidaiak = new JLabel("BIDAIAK");
		lblBidaiak.setHorizontalAlignment(SwingConstants.CENTER);
		lblBidaiak.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblBidaiak.setBounds(50, 11, 159, 48);
		panel.add(lblBidaiak);
		
		JLabel lblBidaiak_1 = new JLabel("BIDAIAK");
		lblBidaiak_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBidaiak_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblBidaiak_1.setBounds(50, 342, 170, 48);
		panel.add(lblBidaiak_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 400, 780, 250);
		panel.add(scrollPane);
		
		ekiJTable = new JTable();
		ekiJTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(ekiJTable);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(50, 68, 780, 250);
		panel.add(scrollPane_1);
		
		bidaiJTable = new JTable();
		bidaiJTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane_1.setViewportView(bidaiJTable);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(840, 71, 107, 30);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(840, 403, 107, 30);
		panel.add(btnNewButton_1);
	}
}
