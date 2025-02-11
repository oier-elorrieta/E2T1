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
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import modelo.Agentzia;
import modelo.DAO;
import modelo.Ekitaldi;

import javax.swing.JTextField;
import javax.swing.UIManager;

public class jarduera {

	JFrame frame;
	private JTextField jardueraDatatxtf;
	private JTextField prezioJardueratxtf;
	private JTextField deskJardueratxtf;

	/**
	 * Launch the application.
	 * @param ag 
	 */
	public static void pantalla(Agentzia ag) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jarduera window = new jarduera(ag);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param ag 
	 */
	public jarduera(Agentzia ag) {
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
		panel.setBounds(325, 125, 600, 269);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnatzera = new JButton("<<< ATZERA");
		btnatzera.setHorizontalAlignment(SwingConstants.LEADING);
		btnatzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekitaldiaukeratu.pantalla(ag);
				frame.setVisible(false);
			}
		});
		btnatzera.setBounds(10, 231, 115, 23);
		btnatzera.setFocusPainted(false);

		btnatzera.setBackground(new Color(240, 240, 240));
		panel.add(btnatzera);

		JLabel lblJarduera = new JLabel("JARDUERA");
		lblJarduera.setHorizontalAlignment(SwingConstants.CENTER);
		lblJarduera.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblJarduera.setBounds(325, 61, 600, 53);
		frame.getContentPane().add(lblJarduera);

		JLabel lblEkitaldiIzen = new JLabel("Ekitaldiaren Izena");
		lblEkitaldiIzen.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEkitaldiIzen.setBounds(10, 11, 225, 20);
		panel.add(lblEkitaldiIzen);

		JTextField ekitaldiIzentxtf = new JTextField();
		ekitaldiIzentxtf.setBounds(305, 11, 146, 20);
		panel.add(ekitaldiIzentxtf);
		ekitaldiIzentxtf.setColumns(10);
		
		 
		
		JLabel lblDeskribapena = new JLabel("Deskripzioa");
		lblDeskribapena.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDeskribapena.setBounds(10, 69, 225, 20);
		panel.add(lblDeskribapena);
		
		JLabel lblPrezioJarduera = new JLabel("Prezioa");
		lblPrezioJarduera.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPrezioJarduera.setBounds(10, 132, 225, 20);
		panel.add(lblPrezioJarduera);
		
		jardueraDatatxtf = new JTextField();
		jardueraDatatxtf.setColumns(10);
		jardueraDatatxtf.setBounds(305, 165, 146, 20);
		panel.add(jardueraDatatxtf);
		
		JLabel lblDataJarduera = new JLabel("Jarduera Data");
		lblDataJarduera.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDataJarduera.setBounds(10, 163, 225, 20);
		panel.add(lblDataJarduera);
		
		prezioJardueratxtf = new JTextField();
		prezioJardueratxtf.setColumns(10);
		prezioJardueratxtf.setBounds(305, 134, 146, 20);
		panel.add(prezioJardueratxtf);
		
		deskJardueratxtf = new JTextField();
		deskJardueratxtf.setColumns(10);
		deskJardueratxtf.setBounds(305, 42, 225, 80);
		panel.add(deskJardueratxtf);

		JButton btnGorde = new JButton("GORDE");
		btnGorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ekitaldi eki = new Ekitaldi(0,"Jarduera", String.valueOf(ag.getBidaiak().get(ag.getSelectedindx()).getKode()), ekitaldiIzentxtf.getText() , jardueraDatatxtf.getText(),Integer.parseInt(prezioJardueratxtf.getText()));
				ag.getBidaiak().get(ag.getSelectedindx()).getEkitaldiak().add(eki); //sartu agentziaren bidaiarraylistean, bidai bateko ekitaldiarray hartu eta ekitaldi bat sartu
				DAO.jardueraGordeDB(ag, ag.getBidaiak().get(ag.getSelectedindx()), eki);
			}
		});
		btnGorde.setFocusPainted(false);
		btnGorde.setBackground(UIManager.getColor("Button.background"));
		btnGorde.setBounds(314, 231, 115, 23);
		panel.add(btnGorde);
		
		
	}
}
