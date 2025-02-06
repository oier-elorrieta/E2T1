package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import javax.swing.JTextField;

import controlador.metodoak;
import modelo.Agentzia;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class login {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JTextField erabiltzailetxtf;
	private JTextField pasahitzatxtf;
	private JButton btnsaiohasi;
	private JButton btnagberri;
	private JLabel lblLogIn;

	/**
	 * Launch the application.
	 */
	public static void pantalla() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
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
		panel.setBounds(325, 200, 600, 250);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		lblNewLabel_2 = new JLabel("Pasahitza");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(110, 118, 105, 14);
		panel.add(lblNewLabel_2);
		
		lblNewLabel = new JLabel("Erabiltzailea");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(110, 53, 105, 14);
		panel.add(lblNewLabel);
		
		erabiltzailetxtf = new JTextField();
		erabiltzailetxtf.setBounds(345, 52, 151, 20);
		panel.add(erabiltzailetxtf);
		erabiltzailetxtf.setColumns(10);
		
		pasahitzatxtf = new JPasswordField();
		pasahitzatxtf.setColumns(10);
		pasahitzatxtf.setBounds(345, 117, 151, 20);
		panel.add(pasahitzatxtf);
		
		JLabel lblErrorLogin = new JLabel("Ez dira aurkitu sartu dituzun datuak, mesedez saiatu berriro.");
		lblErrorLogin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblErrorLogin.setVisible(false);
		lblErrorLogin.setForeground(new Color(255, 0, 0));
		lblErrorLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblErrorLogin.setBounds(325, 461, 600, 14);
		frame.getContentPane().add(lblErrorLogin);
		
		
		btnsaiohasi = new JButton("Saioa Hasi");
		btnsaiohasi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String erabiltzaile = erabiltzailetxtf.getText();
				String pasahitza = pasahitzatxtf.getText();
				boolean error = metodoak.saioaKonprobatu(erabiltzaile, pasahitza);
				if(error == false) {
					Agentzia ag = metodoak.agentziaKargatuBD(erabiltzaile, pasahitza);
					daturegistro.pantalla(ag);
					frame.setVisible(false);
				}else {
					lblErrorLogin.setVisible(true);
				}
			}
		});
		btnsaiohasi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnsaiohasi.setBounds(102, 176, 113, 23);
		btnsaiohasi.setFocusPainted(false);
		btnsaiohasi.setBackground(new Color(240, 240, 240));
		panel.add(btnsaiohasi);
		
		btnagberri = new JButton("Agentzia Berria");
		btnagberri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agentziasortu.pantalla();
				frame.setVisible(false);
			}
		});
		btnagberri.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnagberri.setBounds(345, 176, 151, 23);
		btnagberri.setFocusPainted(false);
		btnagberri.setBackground(new Color(240, 240, 240));
		panel.add(btnagberri);
		
		lblLogIn = new JLabel("LOG IN");
		lblLogIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogIn.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblLogIn.setBounds(325, 136, 600, 53);
		frame.getContentPane().add(lblLogIn);
		
		
	
	}
}
