package vista;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Registroa {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void pantalla() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registroa window = new Registroa();
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
	public Registroa() {
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
		koloretxtf.getDocument().addDocumentListener(new DocumentListener() {
            
            public void insertUpdate(DocumentEvent e) {
                actualizarColor();
            }
            public void removeUpdate(DocumentEvent e) {
                actualizarColor();
            }
            public void changedUpdate(DocumentEvent e) {
                actualizarColor();
            }
            private void actualizarColor() {
                String hexColor = koloretxtf.getText().trim();
                try {
                    // Convertir el color hexadecimal a un objeto Color
                    Color color = Color.decode(hexColor);
                    // Establecer el color de fondo del txtColorPicker
                    panel.setBackground(color);
                } catch (NumberFormatException ex) {
                    
                	panel.setBackground(Color.WHITE);
                }
            }
        });
		
		panel.setBounds(10, 11, 1214, 689);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
	}

}
