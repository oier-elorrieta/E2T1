package vista;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class daturegistro {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void pantalla() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					daturegistro window = new daturegistro();
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
	public daturegistro() {
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
		panel.setBackground(new Color(255, 255, 255));
		;
		String hexColor = agentziasortu.koloreHartu().trim();
		try {
			Color color = Color.decode(hexColor);
			panel.setBackground(color);
		} catch (NumberFormatException ex) {            
			panel.setBackground(Color.WHITE);
        }
                
        
		
		panel.setBounds(10, 11, 1214, 689);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
	}

}
