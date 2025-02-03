package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

public class bidaiberria {

	private JFrame frame;
	private JTextField bidaiIzentxtf;
	private JTextField logotxtf;
	private JTextField textField;
	
	public static void pantalla() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bidaiberria window = new bidaiberria();
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
	public bidaiberria() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		    
		    
		    
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
	                //login.pantalla();
	                frame.setVisible(false);
	            }
	        });
	btnatzera.setBounds(10, 416, 115, 23);
	        btnatzera.setFocusPainted(false);
	        
	        btnatzera.setBackground(new Color(240, 240, 240));
	        panel.add(btnatzera);
	        
	        
	        JButton btngorde = new JButton("GORDE");
	        btngorde.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        btngorde.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                // int langindex = langbox.getSelectedIndex();
	                // int motaindex  = motabox.getSelectedIndex();
	            //    Agentzia ag = new Agentzia( bidaiIzentxtf.getText(), logotxtf.getText(), koloretxtf.getText(), metodoak.langKopAgentziBilatu(langindex)   ,  metodoak.agentziaMotaBilatu(motaindex) , erabiltzailetxtf.getText(), pasahitzatxtf.getText());
	                //metodoak.agentziaberri(ag);
	                //login.pantalla();
	                frame.setVisible(false);
	            }
	        });
	        btngorde.setBounds(306, 416, 99, 23);
	        btngorde.setFocusPainted(false);
	        
	        btngorde.setBackground(new Color(240, 240, 240));
	        panel.add(btngorde);
	        
	        JComboBox langbox_1 = new JComboBox(new Object[]{});
	        langbox_1.setMaximumRowCount(4);
	        langbox_1.setBounds(306, 48, 124, 22);
	        panel.add(langbox_1);
	        
	        JFormattedTextField formattedTextField = new JFormattedTextField();
	        formattedTextField.setBounds(306, 81, 124, 20);
	        panel.add(formattedTextField);
	        
	        JFormattedTextField formattedTextField_1 = new JFormattedTextField();
	        formattedTextField_1.setBounds(306, 112, 124, 20);
	        panel.add(formattedTextField_1);
	        
	        JComboBox langbox_1_1 = new JComboBox(new Object[]{});
	        langbox_1_1.setMaximumRowCount(4);
	        langbox_1_1.setBounds(306, 166, 124, 22);
	        panel.add(langbox_1_1);
	        
	        JLabel lblDeskribapena = new JLabel("Deskribapena");
	        lblDeskribapena.setFont(new Font("Tahoma", Font.BOLD, 18));
	        lblDeskribapena.setBounds(10, 244, 146, 30);
	        panel.add(lblDeskribapena);
	        
	        textField = new JTextField();
	        textField.setBounds(10, 285, 225, 80);
	        panel.add(textField);
	        textField.setColumns(10);
	        
	        JTextField textField_1 = new JTextField();
	        textField_1.setColumns(10);
	        textField_1.setBounds(306, 285, 225, 80);
	        panel.add(textField_1);
	        
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
	       
	            
	
		    
	}

}
