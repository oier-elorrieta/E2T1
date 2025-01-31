package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import controlador.metodoak;
import modelo.Agentzia;

public class daturegistro {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void pantalla(Agentzia ag) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					daturegistro window = new daturegistro(ag);
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
	public daturegistro(Agentzia ag) {
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
		panel.setBackground(new Color(255, 255, 255));
		;
		String hexColor = metodoak.koloreaHartu(ag).trim();
		try {
			Color color = Color.decode(hexColor);
			panel.setBackground(color);
		} catch (NumberFormatException ex) {            
			panel.setBackground(Color.WHITE);
        }
                
        
		
		panel.setBounds(10, 11, 1214, 689);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
	
		
		JLabel imgLabel = new JLabel(new ImageIcon("C:/Users/in1dm3-d/Desktop/Erronka%202/Prog/Erronka2TalDe1/src/vista/pasaporte.jpg"));
		imgLabel.setBounds(1034, 11, 170, 148);
		panel.add(imgLabel);
	}
}
