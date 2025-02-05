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
import javax.swing.JTextField;
import javax.swing.UIManager;

public class ekitaldiaukeratu {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void pantalla() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ekitaldiaukeratu window= new ekitaldiaukeratu();
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
	public ekitaldiaukeratu() {
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

		JLabel lblHegaldia = new JLabel("AUKERATU EKITALDIA");
		lblHegaldia.setHorizontalAlignment(SwingConstants.CENTER);
		lblHegaldia.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblHegaldia.setBounds(325, 171, 600, 53);
		frame.getContentPane().add(lblHegaldia);
		
		JButton btnOstatua = new JButton("Ostatua");
		btnOstatua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ostatua.pantalla();
			}
		});
		JButton btnJoan = new JButton("Joanekoa");
		btnJoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				hegaldiJoan.pantalla();
			}
		});
		btnJoan.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnJoan.setVisible(false);
		btnJoan.setFocusPainted(false);
		btnJoan.setBorderPainted(false);
		btnJoan.setBackground(Color.WHITE);
		btnJoan.setBounds(426, 288, 183, 68);
		frame.getContentPane().add(btnJoan);
		
		btnOstatua.setFont(new Font("Verdana", Font.PLAIN, 23));
		btnOstatua.setFocusPainted(false);
		btnOstatua.setBorderPainted(false);
		btnOstatua.setBackground(Color.WHITE);
		btnOstatua.setBounds(426, 367, 364, 68);
		frame.getContentPane().add(btnOstatua);
		JButton btnJoanEtorri = new JButton("Joan Etorrikoa");
		btnJoanEtorri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				hegaldiJoanEtorri.pantalla();
			}
		});
		btnJoanEtorri.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnJoanEtorri.setFocusPainted(false);
		btnJoanEtorri.setVisible(false);
		btnJoanEtorri.setBorderPainted(false);
		btnJoanEtorri.setBackground(Color.WHITE);
		btnJoanEtorri.setBounds(607, 288, 183, 68);
		frame.getContentPane().add(btnJoanEtorri);
		
		JButton btnHegaldi = new JButton("Hegaldia");
		btnHegaldi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHegaldi.setVisible(false);
				btnJoanEtorri.setVisible(true);
				btnJoan.setVisible(true);
				
				;
			}
		});
		btnHegaldi.setFont(new Font("Verdana", Font.PLAIN, 23));
		btnHegaldi.setFocusPainted(false);
		btnHegaldi.setBorderPainted(false);
		btnHegaldi.setBackground(Color.WHITE);
		btnHegaldi.setBounds(426, 286, 364, 68);
		frame.getContentPane().add(btnHegaldi);

		JButton btnJar = new JButton("Jarduera");
		btnJar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				jarduera.pantalla();
			}
		});
		btnJar.setFont(new Font("Verdana", Font.PLAIN, 23));
		btnJar.setFocusPainted(false);
		btnJar.setBorderPainted(false);
		btnJar.setBackground(Color.WHITE);
		btnJar.setBounds(426, 446, 364, 68);
		frame.getContentPane().add(btnJar);
		
		
		
		
		
	
	}
}
