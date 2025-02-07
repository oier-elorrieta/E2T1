package controlador;

import java.awt.EventQueue;

import javax.swing.JFrame;

import vista.ongietorri;

public class main {


	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ongietorri window = new ongietorri();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
