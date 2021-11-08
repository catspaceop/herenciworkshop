package gui;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Launcher {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Launcher window = new Launcher();
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
	public Launcher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// init frame
		frame = new JFrame();
		frame.setSize(250,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
	

		// Buttons
		JButton btnCStudent = new JButton("Estudiante");
		JButton btnCServiciosG = new JButton("Servicios generales");
		JButton btnCPAdminis = new JButton("Personal administrativo");
		JButton btnCDocenteHC = new JButton("Docente hora cátedra");
		JButton btnCDocenteTC = new JButton("Docente tiempo competo");
		JButton btnSalir = new JButton("Salir");
		JButton btninfo = new JButton("Acerca de");

		// EVENTS ////////////////////////////////////////

		// create student
		btnCStudent.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});

		// create Servicio General
		btnCServiciosG.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});

		// create Personal Administrativo
		btnCPAdminis.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});

		// create Docente Hora Catedra
		btnCDocenteHC.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});

		// create Docente Tiempo Completo
		btnCDocenteTC.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});

		// create Salir
		btnSalir.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(1);
			}
		});

		// create info
		btninfo.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(
					null, 
					"Crstian David Ariza\n260201013\nMaría José Rodríguez\n260201004",
					"Acerca de!!", 
					JOptionPane.INFORMATION_MESSAGE
				);
			}
		});
		
		// Add to frame
		frame.getContentPane().add(btnCStudent);
		frame.getContentPane().add(btnCServiciosG);
		frame.getContentPane().add(btnCPAdminis);
		frame.getContentPane().add(btnCDocenteHC);
		frame.getContentPane().add(btnCDocenteTC);
		frame.getContentPane().add(btninfo);
		frame.getContentPane().add(btnSalir);
		
	}

}
