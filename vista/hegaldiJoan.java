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
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import modelo.Agentzia;
import modelo.Aireportu;
import modelo.DAO;
import modelo.Ekitaldi;

import javax.swing.JTextField;
import javax.swing.UIManager;

public class hegaldiJoan {

	JFrame frame; 
	private JTextField joanekoDatatxtf;
	private JTextField hegaldiKodeatxtf;
	private JComboBox airelintextField;
	private JTextField prezioHegalditxtf;
	private JTextField irteeraOrduatxtf;
	private JTextField iraupenatxtf;

	/**
	 * Launch the application.
	 * @param ag 
	 */
	public static void pantalla(Agentzia ag) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hegaldiJoan window = new hegaldiJoan(ag);
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
	public hegaldiJoan(Agentzia ag) {
		initialize(ag);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param ag 
	 */
	private void initialize(Agentzia ag) {

		frame = new JFrame();
		frame.getContentPane().setLocation(-325, -127);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1250, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(325, 125, 600, 362);
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
		btnatzera.setBounds(10, 329, 115, 23);
		btnatzera.setFocusPainted(false);

		btnatzera.setBackground(new Color(240, 240, 240));
		panel.add(btnatzera);

		JLabel lblHegaldia = new JLabel("JOANEKO HEGALDIA");
		lblHegaldia.setHorizontalAlignment(SwingConstants.CENTER);
		lblHegaldia.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblHegaldia.setBounds(325, 61, 600, 53);
		frame.getContentPane().add(lblHegaldia);

		JLabel lblEkitaldiIzen = new JLabel("Ekitaldiaren Izena");
		lblEkitaldiIzen.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEkitaldiIzen.setBounds(10, 11, 225, 20);
		panel.add(lblEkitaldiIzen);

		JTextField ekitaldiIzentxtf = new JTextField();
		ekitaldiIzentxtf.setBounds(305, 11, 146, 20);
		panel.add(ekitaldiIzentxtf);
		ekitaldiIzentxtf.setColumns(10);
		
		JLabel lblJatorriAireportu = new JLabel("Jatorrizko Aireportua");
		lblJatorriAireportu.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblJatorriAireportu.setBounds(10, 42, 225, 20);
		panel.add(lblJatorriAireportu);
		
		ArrayList<Aireportu> aireportuak = DAO.aireportuakKargatuDB();
		String[] aireportuizenak = new String[aireportuak.size()];
		for (int i = 0; i < aireportuak.size(); i++) {
	    	  aireportuizenak[i] = aireportuak.get(i).getHiria();
	       }
		JComboBox jatorriAirportuBox = new JComboBox(aireportuizenak);
		jatorriAirportuBox.setMaximumRowCount(3);
		jatorriAirportuBox.setBounds(305, 44, 124, 22);
		panel.add(jatorriAirportuBox);
		
		JLabel lblHelmugaAireportu = new JLabel("Helmuga Aireportua");
		lblHelmugaAireportu.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHelmugaAireportu.setBounds(10, 73, 225, 20);
		panel.add(lblHelmugaAireportu);
		
		
		JComboBox helmugaAireportuBox = new JComboBox(aireportuizenak);
		helmugaAireportuBox.setMaximumRowCount(3);
		helmugaAireportuBox.setBounds(305, 75, 124, 22);
		panel.add(helmugaAireportuBox);
		
		JButton btnBilatuBidaia = new JButton("Bilatu Bidaia");
		btnBilatuBidaia.setBounds(477, 50, 96, 23);
		panel.add(btnBilatuBidaia);
		
		JLabel lblJoanekoData = new JLabel("Joaneko Data");
		lblJoanekoData.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblJoanekoData.setBounds(10, 104, 225, 20);
		panel.add(lblJoanekoData);
		
		joanekoDatatxtf = new JTextField();
		joanekoDatatxtf.setColumns(10);
		joanekoDatatxtf.setBounds(305, 107, 146, 20);
		panel.add(joanekoDatatxtf);
		
		JLabel lblHegaldiKodea = new JLabel("Hegaldi Kodea");
		lblHegaldiKodea.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHegaldiKodea.setBounds(10, 135, 225, 20);
		panel.add(lblHegaldiKodea);
		
		hegaldiKodeatxtf = new JTextField();
		hegaldiKodeatxtf.setColumns(10);
		hegaldiKodeatxtf.setBounds(305, 138, 146, 20);
		panel.add(hegaldiKodeatxtf);
		
		JLabel lblAirelinea = new JLabel("Airelinea");
		lblAirelinea.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAirelinea.setBounds(10, 166, 225, 20);
		panel.add(lblAirelinea);
		
		
		ArrayList<String[]> airelineak = DAO.airelineakKargatuDB();
		String[] airelineakizenak = new String[airelineak.size()];
		for (int i = 0; i < airelineak.size(); i++) {
			airelineakizenak[i] = airelineak.get(i)[1];
	       }
		airelintextField = new JComboBox(airelineakizenak);
		airelintextField.setBounds(305, 169, 146, 20);
		panel.add(airelintextField);
		
		JLabel lblPrezioaHegaldi = new JLabel("Prezioa");
		lblPrezioaHegaldi.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPrezioaHegaldi.setBounds(10, 197, 225, 20);
		panel.add(lblPrezioaHegaldi);
		
		prezioHegalditxtf = new JTextField();
		prezioHegalditxtf.setColumns(10);
		prezioHegalditxtf.setBounds(305, 200, 146, 20);
		panel.add(prezioHegalditxtf);
		
		JLabel lblIrteeraOrdua = new JLabel("Irteera Ordua");
		lblIrteeraOrdua.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblIrteeraOrdua.setBounds(10, 228, 225, 20);
		panel.add(lblIrteeraOrdua);
		
		irteeraOrduatxtf = new JTextField();
		irteeraOrduatxtf.setColumns(10);
		irteeraOrduatxtf.setBounds(305, 231, 146, 20);
		panel.add(irteeraOrduatxtf);
		
		JLabel Iraupena = new JLabel("Iraupena");
		Iraupena.setFont(new Font("Tahoma", Font.BOLD, 18));
		Iraupena.setBounds(10, 259, 225, 20);
		panel.add(Iraupena);
		
		iraupenatxtf = new JTextField();
		iraupenatxtf.setColumns(10);
		iraupenatxtf.setBounds(305, 262, 146, 20);
		panel.add(iraupenatxtf);
		
		JButton btnGorde = new JButton("GORDE");
		btnGorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Ekitaldi eki = new Ekitaldi(0,"JoanekoHegaldia", String.valueOf(ag.getBidaiak().get(ag.getSelectedindx()).getKode()), hegaldiKodeatxtf.getText(), airelineak.get(airelintextField.getSelectedIndex())[0]  , aireportuak.get(jatorriAirportuBox.getSelectedIndex()).getAireportu_kod(), aireportuak.get(helmugaAireportuBox.getSelectedIndex()).getAireportu_kod(),iraupenatxtf.getText(), irteeraOrduatxtf.getText(), joanekoDatatxtf.getText(), Double.parseDouble(prezioHegalditxtf.getText()));
				ag.getBidaiak().get(ag.getSelectedindx()).getEkitaldiak().add(eki); //sartu agentziaren bidaiarraylistean, bidai bateko ekitaldiarray hartu eta ekitaldi bat sartu
				DAO.joanekoaGordeDB(ag, ag.getBidaiak().get(ag.getSelectedindx()), eki);
				frame.setVisible(false);
				daturegistro.pantalla(ag);
			}
		});
		btnGorde.setFocusPainted(false);
		btnGorde.setBackground(UIManager.getColor("Button.background"));
		btnGorde.setBounds(314, 329, 115, 23);
		panel.add(btnGorde);

	}
}
