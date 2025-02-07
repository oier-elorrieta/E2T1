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

import controlador.metodoak;
import modelo.Agentzia;
import modelo.Bidai;
import modelo.Ekitaldi;

import javax.swing.JTextField;
import javax.swing.UIManager;

public class ostatua {

	JFrame frame;
	private JTextField PrezioOstatuatxtf;
	private JTextField ostatuIrteeraDatatxtf;
	private JTextField ostatuSarreraDatatxtf;
	private JTextField hiriatxtf;

	/**
	 * Launch the application.
	 */
	public static void pantalla(Agentzia ag) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ostatua window = new ostatua(ag);
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
	public ostatua(Agentzia ag) {
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
		panel.setBounds(326, 190, 600, 276);
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
		btnatzera.setBounds(10, 238, 115, 23);
		btnatzera.setFocusPainted(false);

		btnatzera.setBackground(new Color(240, 240, 240));
		panel.add(btnatzera);

		JLabel lblOstatua = new JLabel("OSTATUA");
		lblOstatua.setHorizontalAlignment(SwingConstants.CENTER);
		lblOstatua.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblOstatua.setBounds(326, 126, 600, 53);
		frame.getContentPane().add(lblOstatua);

		JLabel lblEkitaldiIzen = new JLabel("Ekitaldiaren Izena");
		lblEkitaldiIzen.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEkitaldiIzen.setBounds(10, 11, 225, 20);
		panel.add(lblEkitaldiIzen);

		JTextField ekitaldiIzentxtf = new JTextField();
		ekitaldiIzentxtf.setBounds(305, 11, 146, 20);
		panel.add(ekitaldiIzentxtf);
		ekitaldiIzentxtf.setColumns(10);

		JLabel lblGelaMota = new JLabel("Gela Mota");
		lblGelaMota.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGelaMota.setBounds(10, 42, 225, 20);
		panel.add(lblGelaMota);
		
		JComboBox gelaMotaBox = new JComboBox();
		gelaMotaBox.setMaximumRowCount(3);
		gelaMotaBox.setBounds(305, 44, 124, 22);
		panel.add(gelaMotaBox);
		
		JLabel lblHiria = new JLabel("Hiria");
		lblHiria.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHiria.setBounds(10, 73, 225, 20);
		panel.add(lblHiria);
		
		JLabel lblPrezioOstatua = new JLabel("Prezioa");
		lblPrezioOstatua.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPrezioOstatua.setBounds(10, 104, 225, 20);
		panel.add(lblPrezioOstatua);
		
		JButton btnBilatuOstatua = new JButton("Bilatu Bidaia");
		btnBilatuOstatua.setBounds(480, 90, 89, 23);
		panel.add(btnBilatuOstatua);
		
		PrezioOstatuatxtf = new JTextField();
		PrezioOstatuatxtf.setColumns(10);
		PrezioOstatuatxtf.setBounds(305, 107, 146, 20);
		panel.add(PrezioOstatuatxtf);
		
		JLabel lblOstatuSarreraData = new JLabel("Sarrera Data");
		lblOstatuSarreraData.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblOstatuSarreraData.setBounds(10, 135, 225, 20);
		panel.add(lblOstatuSarreraData);
		
		ostatuIrteeraDatatxtf = new JTextField();
		ostatuIrteeraDatatxtf.setColumns(10);
		ostatuIrteeraDatatxtf.setBounds(305, 169, 146, 20);
		panel.add(ostatuIrteeraDatatxtf);
		
		JLabel lblIOstatuIrteeraData = new JLabel("Irteera Data");
		lblIOstatuIrteeraData.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblIOstatuIrteeraData.setBounds(10, 166, 225, 20);
		panel.add(lblIOstatuIrteeraData);
		
		ostatuSarreraDatatxtf = new JTextField();
		ostatuSarreraDatatxtf.setColumns(10);
		ostatuSarreraDatatxtf.setBounds(305, 138, 146, 20);
		panel.add(ostatuSarreraDatatxtf);
		
		JButton btnGorde = new JButton("GORDE");
		btnGorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Ekitaldi eki = new Ekitaldi(0, "Ostatua", String.valueOf(ag.getBidaiak().get(ag.getSelectedindx()).getKode()), hiriatxtf.getText(), Integer.parseInt(PrezioOstatuatxtf.getText()), ekitaldiIzentxtf.getText(), ostatuSarreraDatatxtf.getText(), ostatuIrteeraDatatxtf.getText(), null);
			ag.getBidaiak().get(ag.getSelectedindx()).getEkitaldiak().add(eki);
			metodoak.ostatuaGordeDB(ag, ag.getBidaiak().get(ag.getSelectedindx()), eki);
			}
		});
		btnGorde.setFocusPainted(false);
		btnGorde.setBackground(UIManager.getColor("Button.background"));
		btnGorde.setBounds(314, 238, 115, 23);
		panel.add(btnGorde);
		
		hiriatxtf = new JTextField();
		hiriatxtf.setColumns(10);
		hiriatxtf.setBounds(305, 76, 146, 20);
		panel.add(hiriatxtf);

	}
}
