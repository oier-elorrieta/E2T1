package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ongietorri {

	public JFrame frame;

	public ongietorri() {
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
		
		

		JButton OGbtn = new JButton("Ongi Etorri!!!");
		OGbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						login.pantalla();	
						frame.setVisible(false);
		}
		});
		OGbtn.setBounds(375, 225, 500, 200);
		OGbtn.setBackground(new Color(255, 255, 255));
		OGbtn.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 40));
		OGbtn.setFocusPainted(false);
		OGbtn.setBorderPainted(false);
		frame.getContentPane().add(OGbtn);
		
		
	}
}
