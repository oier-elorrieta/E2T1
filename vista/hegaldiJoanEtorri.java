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

public class hegaldiJoanEtorri {

	JFrame frame;
	private JTextField joanekoDatatxtf;
	private JTextField hegaldiKodeJoantxtf;
	private JComboBox textField;
	private JTextField preziobueltatxtf;
	private JTextField irteeraOrduatxtf;
	private JTextField iraupenatxtf;
	private JTextField etorriDatatxtf;
	private JTextField hegaldiKodeEtorritxtf;
	private JComboBox airelineaBueltatxtf;
	private JTextField bueltaOrduatxtf;
	private JTextField bueltaIraupenatxtf;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 * @param ag 
	 */
	public static void pantalla(Agentzia ag) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hegaldiJoanEtorri window = new hegaldiJoanEtorri(ag);
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
	public hegaldiJoanEtorri(Agentzia ag) {
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
		panel.setBounds(212, 115, 800, 403);
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
		btnatzera.setBounds(10, 366, 115, 23);
		btnatzera.setFocusPainted(false);

		btnatzera.setBackground(new Color(240, 240, 240));
		panel.add(btnatzera);

		JLabel lblHegaldia = new JLabel("JOAN ETORRIKO HEGALDIA");
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
		lblJatorriAireportu.setBounds(10, 73, 225, 20);
		panel.add(lblJatorriAireportu);
		
		ArrayList<Aireportu> aireportuak = DAO.aireportuakKargatuDB();
		String[] aireportuizenak = new String[aireportuak.size()];
		for (int i = 0; i < aireportuak.size(); i++) {
	    	  aireportuizenak[i] = aireportuak.get(i).getHiria();
	       }
		
		JComboBox jatorriAirportuBox = new JComboBox(aireportuizenak);
		jatorriAirportuBox.setMaximumRowCount(3);
		jatorriAirportuBox.setBounds(305, 75, 124, 22);
		panel.add(jatorriAirportuBox);
		
		JLabel lblHelmugaAireportu = new JLabel("Helmuga Aireportua");
		lblHelmugaAireportu.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHelmugaAireportu.setBounds(10, 104, 225, 20);
		panel.add(lblHelmugaAireportu);
		
		JComboBox helmugaAireportuBox = new JComboBox(aireportuizenak);
		helmugaAireportuBox.setMaximumRowCount(3);
		helmugaAireportuBox.setBounds(305, 106, 124, 22);
		panel.add(helmugaAireportuBox);
		
		JButton btnBilatuBidaia = new JButton("Bilatu Bidaia");
		btnBilatuBidaia.setBounds(480, 90, 89, 23);
		panel.add(btnBilatuBidaia);
		
		JLabel lblJoanekoData = new JLabel("Joaneko Data");
		lblJoanekoData.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblJoanekoData.setBounds(10, 135, 225, 20);
		panel.add(lblJoanekoData);
		
		joanekoDatatxtf = new JTextField();
		joanekoDatatxtf.setColumns(10);
		joanekoDatatxtf.setBounds(305, 138, 146, 20);
		panel.add(joanekoDatatxtf);
		
		JLabel lblHegaldiKodeJoan = new JLabel("Hegaldi Kodea");
		lblHegaldiKodeJoan.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHegaldiKodeJoan.setBounds(10, 166, 225, 20);
		panel.add(lblHegaldiKodeJoan);
		
		hegaldiKodeJoantxtf = new JTextField();
		hegaldiKodeJoantxtf.setColumns(10);
		hegaldiKodeJoantxtf.setBounds(305, 169, 146, 20);
		panel.add(hegaldiKodeJoantxtf);
		
		JLabel lblAirelinea = new JLabel("Airelinea");
		lblAirelinea.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAirelinea.setBounds(10, 197, 225, 20);
		panel.add(lblAirelinea);
		
		
		ArrayList<String[]> airelineak = DAO.airelineakKargatuDB();
		String[] airelineakizenak = new String[airelineak.size()];
		for (int i = 0; i < airelineak.size(); i++) {
			airelineakizenak[i] = airelineak.get(i)[1];
	       }
		textField = new JComboBox(airelineakizenak);
		textField.setBounds(305, 200, 146, 20);
		panel.add(textField);
		
		JLabel lblPrezioTotala = new JLabel("Prezio Buelta");
		lblPrezioTotala.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPrezioTotala.setBounds(480, 228, 146, 20);
		panel.add(lblPrezioTotala);
		
		preziobueltatxtf = new JTextField();
		preziobueltatxtf.setColumns(10);
		preziobueltatxtf.setBounds(636, 231, 146, 20);
		panel.add(preziobueltatxtf);
		
		JLabel lblIrteeraOrdua = new JLabel("Irteera Ordua");
		lblIrteeraOrdua.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblIrteeraOrdua.setBounds(10, 259, 225, 20);
		panel.add(lblIrteeraOrdua);
		
		irteeraOrduatxtf = new JTextField();
		irteeraOrduatxtf.setColumns(10);
		irteeraOrduatxtf.setBounds(305, 262, 146, 20);
		panel.add(irteeraOrduatxtf);
		
		JLabel Iraupena = new JLabel("Iraupena");
		Iraupena.setFont(new Font("Tahoma", Font.BOLD, 18));
		Iraupena.setBounds(10, 290, 225, 20);
		panel.add(Iraupena);
		
		iraupenatxtf = new JTextField();
		iraupenatxtf.setColumns(10);
		iraupenatxtf.setBounds(305, 293, 146, 20);
		panel.add(iraupenatxtf);
		
		JLabel lblEtorriData = new JLabel("Etorri Data");
		lblEtorriData.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEtorriData.setBounds(480, 135, 146, 20);
		panel.add(lblEtorriData);
		
		etorriDatatxtf = new JTextField();
		etorriDatatxtf.setColumns(10);
		etorriDatatxtf.setBounds(636, 138, 146, 20);
		panel.add(etorriDatatxtf);
		
		JLabel lblHegaldiKodeEtorri = new JLabel("Hegaldi Kodea");
		lblHegaldiKodeEtorri.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHegaldiKodeEtorri.setBounds(480, 166, 146, 20);
		panel.add(lblHegaldiKodeEtorri);
		
		hegaldiKodeEtorritxtf = new JTextField();
		hegaldiKodeEtorritxtf.setColumns(10);
		hegaldiKodeEtorritxtf.setBounds(636, 169, 146, 20);
		panel.add(hegaldiKodeEtorritxtf);
		
		JLabel lblAirelineaBuelta = new JLabel("Airelinea Buelta");
		lblAirelineaBuelta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAirelineaBuelta.setBounds(480, 197, 146, 20);
		panel.add(lblAirelineaBuelta); 
		
		airelineaBueltatxtf = new JComboBox(airelineakizenak);
		airelineaBueltatxtf.setBounds(636, 200, 146, 20);
		panel.add(airelineaBueltatxtf);
		
		JLabel lblBueltaOrdutegia = new JLabel("Buelta Ordua");
		lblBueltaOrdutegia.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBueltaOrdutegia.setBounds(480, 259, 146, 20);
		panel.add(lblBueltaOrdutegia);
		
		bueltaOrduatxtf = new JTextField();
		bueltaOrduatxtf.setColumns(10);
		bueltaOrduatxtf.setBounds(636, 262, 146, 20);
		panel.add(bueltaOrduatxtf);
		
		JLabel lblBueltaIraupena = new JLabel("Buelta Iraupena");
		lblBueltaIraupena.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBueltaIraupena.setBounds(480, 290, 148, 20);
		panel.add(lblBueltaIraupena);
		
		bueltaIraupenatxtf = new JTextField();
		bueltaIraupenatxtf.setColumns(10);
		bueltaIraupenatxtf.setBounds(636, 293, 146, 20);
		panel.add(bueltaIraupenatxtf);
		
		JLabel lblPrezio = new JLabel("Prezioa");
		lblPrezio.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPrezio.setBounds(10, 228, 146, 20);
		panel.add(lblPrezio);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(305, 230, 146, 20);
		panel.add(textField_2);
		
		
		JButton btnGorde = new JButton("GORDE");
		btnGorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ekitaldi eki = new Ekitaldi(0,"JoanEtorrikoHegaldia", String.valueOf(ag.getBidaiak().get(ag.getSelectedindx()).getKode()), hegaldiKodeJoantxtf.getText(), airelineak.get(textField.getSelectedIndex())[0]   , aireportuak.get(jatorriAirportuBox.getSelectedIndex()).getAireportu_kod(), aireportuak.get(helmugaAireportuBox.getSelectedIndex()).getAireportu_kod(),iraupenatxtf.getText(), irteeraOrduatxtf.getText(), joanekoDatatxtf.getText(), Double.parseDouble(textField_2.getText()),Integer.parseInt(hegaldiKodeEtorritxtf.getText()),  airelineak.get(airelineaBueltatxtf.getSelectedIndex())[0],  aireportuak.get(jatorriAirportuBox.getSelectedIndex()).getHiria(), aireportuak.get(helmugaAireportuBox.getSelectedIndex()).getHiria(), Double.parseDouble(preziobueltatxtf.getText()) , bueltaIraupenatxtf.getText(), bueltaOrduatxtf.getText(), etorriDatatxtf.getText());
				ag.getBidaiak().get(ag.getSelectedindx()).getEkitaldiak().add(eki); //sartu agentziaren bidaiarraylistean, bidai bateko ekitaldiarray hartu eta ekitaldi bat sartu
				DAO.joanEtorrikoaGordeDB(ag, ag.getBidaiak().get(ag.getSelectedindx()), eki);
				frame.setVisible(false);
				daturegistro.pantalla(ag);
			}
		});
		btnGorde.setFocusPainted(false);
		btnGorde.setBackground(UIManager.getColor("Button.background"));
		btnGorde.setBounds(314, 366, 115, 23);
		panel.add(btnGorde);

	}
}
