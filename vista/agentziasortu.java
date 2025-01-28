package vista;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import modelo.Agentzia;

import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JSpinner;

public class agentziasortu {

	private JFrame frame;
	private JTextField textField;
	private JTextField koloretxtf;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void pantalla() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					agentziasortu window = new agentziasortu();
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
	public agentziasortu() {
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
		
		JLabel lblNewLabel = new JLabel("Agentziaren Izena");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 225, 30);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Markaren Kolorea");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 69, 225, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Langile Kopurua");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(10, 130, 225, 30);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Agentzia Mota");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(10, 187, 146, 30);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Logoa");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(10, 240, 146, 30);
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(306, 20, 225, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		koloretxtf = new JTextField();
		koloretxtf.setText("#FFFFFF");
		koloretxtf.setColumns(10);
		koloretxtf.setBounds(306, 78, 124, 20);
		panel.add(koloretxtf);
		
		
		JPanel panelkolore = new JPanel();
		panelkolore.setBackground(Color.decode(koloretxtf.getText()));
		panelkolore.setBounds(480, 78, 51, 21);
		panel.add(panelkolore);
		
		JComboBox langbox = new JComboBox();
		String[] langilekopbox = new String[] { "", "1 - 5", "5 - 10", "10 - 20" };
		langbox = new JComboBox<String>(langilekopbox);
		langbox.setMaximumRowCount(4);
		langbox.setBounds(306, 138, 124, 22);
		panel.add(langbox);
		
		
		
		JComboBox motabox = new JComboBox();
		String[] motaarraybox = new String[] { "", "Bidaiak", "Zerbitzuak"};
		motabox = new JComboBox<String>(motaarraybox);
		motabox.setMaximumRowCount(3);
		motabox.setBounds(306, 195, 124, 22);
		panel.add(motabox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(306, 249, 225, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Erabiltzailea");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(10, 300, 146, 30);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Pasahitza");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_1_1.setBounds(306, 300, 146, 30);
		panel.add(lblNewLabel_4_1_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 341, 146, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(306, 341, 146, 20);
		panel.add(textField_3);
		
		JButton btnatzera = new JButton("<<< ATZERA");
		btnatzera.setHorizontalAlignment(SwingConstants.LEADING);
		btnatzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				Agentzia ag = new Agentzia();
			}
		});
		btngorde.setBounds(306, 416, 99, 23);
		btngorde.setFocusPainted(false);
		
		btngorde.setBackground(new Color(240, 240, 240));
		panel.add(btngorde);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 281, 570, 33);
		panel.add(separator);
		
		JLabel lblAgentziaBerria = new JLabel("AGENTZIA BERRIA");
		lblAgentziaBerria.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgentziaBerria.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAgentziaBerria.setBounds(325, 61, 600, 53);
		frame.getContentPane().add(lblAgentziaBerria);
		;
			
	}
}
