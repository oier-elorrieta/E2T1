package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import modelo.Agentzia;
import modelo.Bidai;
import modelo.DAO;
import modelo.Ekitaldi;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controlador.main;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.net.URI;
import java.net.URL;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class daturegistro {

	private JButton btnEsk;
	private JFrame frame;
	private JTable ekiJTable;
	private JTable bidaiJTable;
	private JLabel imgLabel;
	private JPanel panel;
	private JButton btnBidaiEzb;
	private JButton btnEkiEzb; 

	
	private ArrayList<Bidai> bidaiak;

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
	 * 
	 * @param ag
	 */
	private void initialize(Agentzia ag) {

		frame = new JFrame();
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1250, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));

		String hexColor = DAO.koloreaHartu(ag).trim();
		try {
			Color color = Color.decode(hexColor);
			panel.setBackground(color);
		} catch (NumberFormatException ex) {
			panel.setBackground(Color.WHITE);
		}

		panel.setBounds(10, 11, 1214, 689);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		imgLabel = new JLabel();
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
		modeleki.addColumn("Deskribapena");
		modeleki.addColumn("Data");
		modeleki.addColumn("Prezioa €");
		ekiJTable = new JTable(modeleki);
		ekiJTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnBidaiEzb.setEnabled(false);
				btnEkiEzb.setEnabled(true);
				bidaiak.get(ag.getSelectedindx()).setSelectedindx(ekiJTable.getSelectedRow());
			}
		
		});
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
		btnekiberri.setBounds(840, 403, 145, 30);
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
				btnEsk.setEnabled(true);
				btnBidaiEzb.setEnabled(true);
				btnEkiEzb.setEnabled(false);
				ag.setSelectedindx(bidaiJTable.getSelectedRow());
				
				ekitaldiakKargatu(ag, modeleki);
				

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
		btnBidaiBerri.setBounds(840, 67, 145, 30);
		panel.add(btnBidaiBerri);
		 btnEsk = new JButton("ESKAINTZA SORTU");
		btnEsk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eskaintzaSortu(ag);
			}
		});
		btnEsk.setBounds(840, 648, 135, 30);
		panel.add(btnEsk);

		JButton btnNewButton_1_1_1 = new JButton("DESKONEKTATU");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton_1_1_1.setBounds(1069, 648, 135, 30);
		panel.add(btnNewButton_1_1_1);
		DAO.bidaiKargatuDB(ag);
		bidaiak = bidaiakKargatu(bidaiJTable, model, ag);
		
		btnBidaiEzb = new JButton("X");
		btnBidaiEzb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DAO.ezabatuBidaia(ag);
				for (int i = 0 ; i < bidaiak.size(); i++) {
					if(bidaiak.get(i).getKode() == bidaiak.get(ag.getSelectedindx()).getKode()) {
						bidaiak.remove(i);
					}
				}
			
				frame.setVisible(false);
				pantalla(ag);
			}
		});
		btnBidaiEzb.setBounds(840, 107, 56, 21);
		btnBidaiEzb.setEnabled(false); 
		panel.add(btnBidaiEzb);
		
		btnEkiEzb = new JButton("X");
		btnEkiEzb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DAO.ezabatuEkitaldi(ag);
				ArrayList<Ekitaldi> ekitaldiak = bidaiak.get(ag.getSelectedindx()).getEkitaldiak();
				for (int i = 0 ; i < ekitaldiak.size(); i++) {
					if(ekitaldiak.get(i).getEkikode() == ekitaldiak.get(ag.getSelectedindx()).getEkikode()) {
						ekitaldiak.remove(i);
						
					}
				}
				
				ekitaldiakKargatu(ag, modeleki);
			}
		});
		btnEkiEzb.setBounds(840, 443, 56, 21);
		btnEkiEzb.setEnabled(false); 
		panel.add(btnEkiEzb);
		

		logoKargatu(ag);
	}

	private void logoKargatu(Agentzia ag) {

		try {
			// Obtener la URL del logo de la caché (acceso estático)

			String logoUrl = ag.getLogo();// Accedemos al logo desde Cache

			if (logoUrl != null && !logoUrl.isEmpty()) {
				// Convertir la URL a URI y luego a URL
				URI uri = new URI(logoUrl);
				URL url = uri.toURL(); // Convertimos URI a URL

				// Crear un ImageIcon con la URL
				ImageIcon imageIcon1 = new ImageIcon(url);

				// Crear el JLabel
				imgLabel = new JLabel();

				// Establecer el tamaño del JLabel según el layout o manualmente
				imgLabel.setBounds(1034, 11, 170, 148); // Establecemos el tamaño fijo (puedes ajustarlo según lo
														// necesites)

				// Escalar la imagen al tamaño del JLabel (con el mismo enfoque que en el botón)
				Image image1 = imageIcon1.getImage().getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(),
						Image.SCALE_SMOOTH);
				imageIcon1.setImage(image1);

				// Establecer el icono redimensionado en el JLabel
				imgLabel.setIcon(imageIcon1);

				panel.add(imgLabel);

			} else {

				System.out.println("Logotipoaren URLa ez da baliozkoa edo ez dago erabilgarri.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Bidai> bidaiakKargatu(JTable bidaiJTable, DefaultTableModel model, Agentzia ag) {
		ArrayList<Bidai> bidaiak = ag.getBidaiak();

		for (int i = 0; i < bidaiak.size(); i++) {
			Bidai b = bidaiak.get(i);
			model.addRow(new Object[] { b.getIzena(), b.getBidmota(), b.getIraupena(), b.getHasidata(), b.getAmaidata(),
					b.getHerrihelmuga() });
		}
		return bidaiak;
	}

	public void ekitaldiakKargatu(Agentzia ag, DefaultTableModel modeleki) {
		for (int i = modeleki.getRowCount() - 1; i >= 0; i--) {
			modeleki.removeRow(i);
		}

		ArrayList<Ekitaldi> ekiarray = ag.getBidaiak().get(ag.getSelectedindx()).getEkitaldiak();
		for (int x = 0; x < ekiarray.size(); x++) {
			Ekitaldi eki = ekiarray.get(x);
			if (eki.getIzena().equals("Ostatua")) {
				modeleki.addRow(new Object[] { "Ostatua", eki.getHotizena(), eki.getOssardata(), eki.getOsprezio() });
			}
			if (eki.getIzena().equals("Jarduera")) {
				modeleki.addRow(new Object[] { "Jarduera", eki.getJardesk(), eki.getJardata(), eki.getJarprezio() });
			
			}if (eki.getIzena().equals("JoanekoHegaldia")) {
				modeleki.addRow(new Object[] { "JoanekoHegaldia", eki.getIrtordu(), eki.getIrtdata(), eki.getHprezio() });
			}
			
			if (eki.getBkode() > 0) {
				modeleki.addRow(new Object[] { "JoanEtorrikoHegaldia", eki.getBirtordu(), eki.getBirtdata(), eki.getBprezio() });
			}
			
			
	}
	}
    public static boolean eskaintzaSortu(Agentzia ag){
        boolean sent = false;
    	try {
    	
    	File f = new File("C:\\Users\\in1dm3-d\\Desktop\\Erronka 2\\Prog\\Erronka2TalDe1\\src\\Eskaintza.txt");
    	FileWriter wf = new FileWriter(f);
    	Bidai selectedbidaia = ag.getBidaiak().get(ag.getSelectedindx());
    	ArrayList<Ekitaldi> ekitaldiaktxt = selectedbidaia.getEkitaldiak();
        String txt = ag.getIzena()+ ": \n" + selectedbidaia.getIzena() + ", "+ selectedbidaia.getDesk()+ ", "+ selectedbidaia.getHasidata()+ ", "+ selectedbidaia.getZerbez()+ ". \n" ;
        for(int i = 0; i < ekitaldiaktxt.size(); i++) {
        	txt = txt + ekitaldiaktxt.get(i).getIzena() + "\n";
        }
        
        wf.write(txt);
    
        sent = true;
        wf.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return sent;
    }
}