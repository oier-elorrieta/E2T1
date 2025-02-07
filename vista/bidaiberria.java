package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import modelo.Agentzia;
import modelo.Bidai;
import modelo.DAO;

public class bidaiberria {

	private JFrame frame;
	private JTextField bidaiIzentxtf;
	private JTextField logotxtf;
	private JTextField desktxtf;
	
	public static void pantalla(Agentzia ag) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bidaiberria window = new bidaiberria(ag);
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
	public bidaiberria(Agentzia ag) {
		initialize(ag);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Agentzia ag) {
		    
		    
		    
		    frame = new JFrame();
	        frame.getContentPane().setBackground(new Color(255, 255, 255));
	        frame.setBounds(100, 100, 1250, 750);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().setLayout(null);
	        
	        JPanel panel = new JPanel();
	        panel.setBounds(325, 125, 600, 450);
	        frame.getContentPane().add(panel);
	        panel.setLayout(null);
	        
	        JLabel lblBidaiarenIzena = new JLabel("Bidaiaren Izena");
	        lblBidaiarenIzena.setFont(new Font("Tahoma", Font.BOLD, 18));
	        lblBidaiarenIzena.setBounds(10, 11, 225, 30);
	        panel.add(lblBidaiarenIzena);
	        
	        JLabel lblBidaiaMota = new JLabel("Bidaia Mota");
	        lblBidaiaMota.setFont(new Font("Tahoma", Font.BOLD, 18));
	        lblBidaiaMota.setBounds(10, 41, 225, 30);
	        panel.add(lblBidaiaMota);
	        
	        JLabel lblBidaiaHasiera = new JLabel("Bidaia Hasiera");
	        lblBidaiaHasiera.setFont(new Font("Tahoma", Font.BOLD, 18));
	        lblBidaiaHasiera.setBounds(10, 73, 225, 30);
	        panel.add(lblBidaiaHasiera);
	         MaskFormatter maskFormatter = null;
	            try {
	                // Crear una máscara de formato para la fecha
	                maskFormatter = new MaskFormatter("##/##/####");
	                maskFormatter.setPlaceholderCharacter('_');  // Caracter de placeholder, si se desea

	            } catch (ParseException e) {
	                e.printStackTrace();
	            }
	JLabel lblBidaiAmaiera = new JLabel("Bidaia Amaiera");
	        lblBidaiAmaiera.setFont(new Font("Tahoma", Font.BOLD, 18));
	        lblBidaiAmaiera.setBounds(10, 104, 146, 30);
	        panel.add(lblBidaiAmaiera);
	        
	        JLabel lblEgunak = new JLabel("Egunak");
	        lblEgunak.setFont(new Font("Tahoma", Font.BOLD, 18));
	        lblEgunak.setBounds(10, 132, 146, 30);
	        panel.add(lblEgunak);
	        
	        bidaiIzentxtf = new JTextField();
	        bidaiIzentxtf.setBounds(306, 20, 146, 20);
	        panel.add(bidaiIzentxtf);
	        bidaiIzentxtf.setColumns(10);
	      
	        String[] langarraybox = new String[] { "", "1 - 5", "5 - 10", "10 - 20" };
	        
	        
	        String[] motaarraybox = new String[] { "", "Bidaiak", "Zerbitzuak"};
	        
	        logotxtf = new JTextField();
	        logotxtf.setEnabled(false);
	        logotxtf.setBounds(306, 140, 75, 20);
	        panel.add(logotxtf);
	        logotxtf.setColumns(10);
	        
	        JLabel lblHerrialdea = new JLabel("Herrialdea");
	        lblHerrialdea.setFont(new Font("Tahoma", Font.BOLD, 18));
	        lblHerrialdea.setBounds(10, 159, 146, 30);
	        panel.add(lblHerrialdea);
	        
	        JButton btnatzera = new JButton("<<< ATZERA");
	        btnatzera.setHorizontalAlignment(SwingConstants.LEADING);
	        btnatzera.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	               daturegistro.pantalla(ag);
	                frame.setVisible(false);
	            }
	        });
	        btnatzera.setBounds(10, 417, 115, 23);
	        btnatzera.setFocusPainted(false);
	        
	        btnatzera.setBackground(new Color(240, 240, 240));
	        panel.add(btnatzera);
	        
	        JTextField zerbEztxtf = new JTextField();
	        zerbEztxtf.setColumns(10);
	        zerbEztxtf.setBounds(306, 285, 225, 80);
	        panel.add(zerbEztxtf);  
	        
	        String[] bidmotaarray = new String[] {"B1", "B2"}; 
	        JComboBox bidaiMotaBox = new JComboBox(bidmotaarray);
	        bidaiMotaBox.setMaximumRowCount(4);
	        bidaiMotaBox.setBounds(306, 48, 124, 22);
	        panel.add(bidaiMotaBox);
	        
	       
	        
	      
	        
	        JFormattedTextField bidaiHasitxtf = new JFormattedTextField();
	        bidaiHasitxtf.setBounds(306, 81, 124, 20);
	        panel.add(bidaiHasitxtf);
	        
	        JFormattedTextField bidaiAmaitxtf = new JFormattedTextField();
	        bidaiAmaitxtf.setBounds(306, 112, 124, 20);
	        panel.add(bidaiAmaitxtf);
	        
	        
	        String[] herriarray = new String []{"AR", "AT", "BE"};
	        
	        JComboBox herrialdeaBox = new JComboBox(herriarray);
	        herrialdeaBox.setMaximumRowCount(4);
	        herrialdeaBox.setBounds(306, 166, 124, 22);
	        panel.add(herrialdeaBox);
	        
	        JLabel lblDeskribapena = new JLabel("Deskribapena");
	        lblDeskribapena.setFont(new Font("Tahoma", Font.BOLD, 18));
	        lblDeskribapena.setBounds(10, 244, 146, 30);
	        panel.add(lblDeskribapena);
	        
	        desktxtf = new JTextField();
	        desktxtf.setBounds(10, 285, 225, 80);
	        panel.add(desktxtf);
	        desktxtf.setColumns(10);
	        
	        
	        
	        JLabel lblKanpoanGeratzenDiren = new JLabel("Kanpoan Geratzen");
	        lblKanpoanGeratzenDiren.setFont(new Font("Tahoma", Font.BOLD, 18));
	        lblKanpoanGeratzenDiren.setBounds(306, 223, 200, 30);
	        panel.add(lblKanpoanGeratzenDiren);
	        
	        JLabel lblDirenZerbitzuak = new JLabel("Diren Zerbitzuak");
	        lblDirenZerbitzuak.setFont(new Font("Tahoma", Font.BOLD, 18));
	        lblDirenZerbitzuak.setBounds(306, 244, 200, 30);
	        panel.add(lblDirenZerbitzuak);
	         JFormattedTextField dateField = new JFormattedTextField(maskFormatter);
	            dateField.setColumns(10);
	JLabel lblBidaiaBerria = new JLabel("BIDAIA BERRIA");
	        lblBidaiaBerria.setHorizontalAlignment(SwingConstants.CENTER);
	        lblBidaiaBerria.setFont(new Font("Tahoma", Font.BOLD, 30));
	        lblBidaiaBerria.setBounds(325, 61, 600, 53);
	        frame.getContentPane().add(lblBidaiaBerria);
	       
	            
	        JButton btngorde = new JButton("GORDE");
	        btngorde.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        btngorde.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            
	            	Bidai bidaia = new Bidai(bidaiIzentxtf.getText(),ag.getKodea(), desktxtf.getText(), zerbEztxtf.getText(), bidmotaarray[bidaiMotaBox.getSelectedIndex()], bidaiHasitxtf.getText(), bidaiAmaitxtf.getText(), herriarray[herrialdeaBox.getSelectedIndex()]);
	            	ag.sartuBidaia(bidaia); // gorde arraylistean
	            	DAO.bidaiGordeDB(ag, bidaia); // gorde DBan
	            	daturegistro.pantalla(ag);
	            }
	        });
	        btngorde.setBounds(306, 416, 99, 23);
	        btngorde.setFocusPainted(false);
	        
	        btngorde.setBackground(new Color(240, 240, 240));
	        panel.add(btngorde);
		    
	}



}
