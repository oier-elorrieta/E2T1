package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class login {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		frame.setBounds(100, 100, 1250, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.add(new JLabel(new ImageIcon("pasaporte.jpg")));
		
		JPanel panel = new JPanel();
		panel.setBounds(325, 200, 600, 250);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNewLabel_2 = new JLabel("Pasahitza");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(110, 118, 105, 14);
		panel.add(lblNewLabel_2);
		
		lblNewLabel = new JLabel("Erabiltzailea");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(110, 53, 105, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(345, 52, 151, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(345, 117, 151, 20);
		panel.add(textField_1);
		
		btnNewButton = new JButton("Saioa Hasi");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(102, 176, 113, 23);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Agentzia Berria");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(345, 176, 151, 23);
		panel.add(btnNewButton_1);
	}
}
