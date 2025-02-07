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
import modelo.Bidai;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1250, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		
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
		
		JLabel lblEkitaldi = new JLabel("EKITALDIAK");
		lblEkitaldi.setHorizontalAlignment(SwingConstants.CENTER);
		lblEkitaldi.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblEkitaldi.setBounds(50, 342, 211, 48);
		panel.add(lblEkitaldi);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 400, 780, 250);
		panel.add(scrollPane);
		
		
		DefaultTableModel modeleki = new DefaultTableModel();
		modeleki.addColumn("Ekitaldiaren Izena");
		modeleki.addColumn("Ekitaldi Mota");
	    modeleki.addColumn("Data");
	    modeleki.addColumn("Prezioa €");
	    ekiJTable = new JTable(modeleki);
	    ekiJTable.getColumnModel().getColumn(3).setPreferredWidth(104);
		ekiJTable.getColumnModel().getColumn(3).setPreferredWidth(94);
		ekiJTable.getColumnModel().getColumn(0).setPreferredWidth(112);
		scrollPane.setViewportView(ekiJTable);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(50, 68, 780, 250);
		panel.add(scrollPane_1);
		
		JButton btnekiberri = new JButton("EKITALDI BERRIA");
		btnekiberri.setEnabled(false);
		btnekiberri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ekitaldiaukeratu.pantalla(ag);
			}
		});
		btnekiberri.setBounds(840, 403, 135, 30);
		panel.add(btnekiberri);
		
		DefaultTableModel model = new DefaultTableModel();
	    model.addColumn("Bidaiak");
	    model.addColumn("Mota");
	    model.addColumn("Egunak");
	    model.addColumn("Hasierako data");
	    model.addColumn("Amaireako data");
	    model.addColumn("Herrialde");
	    bidaiJTable = new JTable(model);
	    bidaiJTable.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		btnekiberri.setEnabled(true);
	    		ag.setSelectedindx(bidaiJTable.getSelectedRow());
	    	}
	    });
		bidaiJTable.getColumnModel().getColumn(3).setPreferredWidth(104);
		bidaiJTable.getColumnModel().getColumn(4).setPreferredWidth(94);
		bidaiJTable.getCellSelectionEnabled();
		bidaiJTable.getRowSelectionAllowed();
		
		scrollPane_1.setViewportView(bidaiJTable);
		
		JButton btnBidaiBerri = new JButton("BIDAIA BERRIA");
		btnBidaiBerri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				bidaiberria.pantalla(ag);
			}
		});
		btnBidaiBerri.setBounds(840, 67, 135, 30);
		panel.add(btnBidaiBerri);
		
		
		
		
		JButton btnNewButton_1_1 = new JButton("ESKAINTZA SORTU");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(840, 648, 135, 30);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("DESKONEKTATU");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ongietorri.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton_1_1_1.setBounds(1069, 648, 135, 30);
		panel.add(btnNewButton_1_1_1);
		metodoak.bidaiKargatuDB(ag);
		datuakKargatu(bidaiJTable, model, ag);
	}
	
	
	public void datuakKargatu(JTable bidaiJTable, DefaultTableModel model, Agentzia ag) {
		model = (DefaultTableModel) bidaiJTable.getModel();
		ArrayList<Bidai> bidaiak = ag.getBidaiak();
        for(int i = 0; i < bidaiak.size(); i++) {
		Bidai b = bidaiak.get(i);
		model.addRow(new Object[]{ b.getIzena() , b.getBidmota() , b.getIraupena() , b.getHasidata() , b.getAmaidata() , b.getHerrihelmuga() });
        }
	}
}
