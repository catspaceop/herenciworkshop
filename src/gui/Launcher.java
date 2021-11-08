package gui;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import objts.AdministrativeStaff;
import objts.FullTimeProfessor;
import objts.PGeneralServices;
import objts.ProfessorHC;
import objts.Student;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Launcher {

	
	private JFrame frame;
	private ArrayList<Student> studenArrayList;
	private ArrayList<PGeneralServices> pGSArrayList;
	private ArrayList<AdministrativeStaff> aSArrayList;
	private ArrayList<ProfessorHC> pHCArrayList;
	private ArrayList<FullTimeProfessor> fTPArrayList;

	JTable tableStudents = new JTable();
	JTable tablePSG = new JTable();
	JTable tableAS = new JTable();
	JTable tablePHC = new JTable();
	JTable tableFTP = new JTable();
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
		initializeLists();
		initializeGui();
		// tablas
		loadTableStudent();
		loadTableAS();
		loadTableFTP();
		loadTablePHC();
		loadTablePSG();
	}

	private void initializeLists(){
		this.studenArrayList = new ArrayList<Student>();
		this.pGSArrayList = new ArrayList<PGeneralServices>();
		this.aSArrayList = new ArrayList<AdministrativeStaff>();
		this.pHCArrayList = new ArrayList<ProfessorHC>();
		this.fTPArrayList = new ArrayList<FullTimeProfessor>();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializeGui() {

		// init frame
		frame = new JFrame();
		frame.setSize(650,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(10, 5));
		
		JPanel panelBtns = new JPanel();
		frame.getContentPane().add(panelBtns, BorderLayout.WEST);
		panelBtns.setLayout(new GridLayout(8, 1, 0, 0));
		

			// Buttons
			JButton btnCStudent = new JButton("Estudiante");
			panelBtns.add(btnCStudent);
			JButton btnCServiciosG = new JButton("Servicios generales");
			panelBtns.add(btnCServiciosG);
			JButton btnCPAdminis = new JButton("Personal administrativo");
			panelBtns.add(btnCPAdminis);
			JButton btnCDocenteHC = new JButton("Docente hora cátedra");
			panelBtns.add(btnCDocenteHC);
			JButton btnCDocenteTC = new JButton("Docente tiempo competo");
			panelBtns.add(btnCDocenteTC);
			JButton btninfo = new JButton("Acerca de");
			panelBtns.add(btninfo);
			JButton btnSalir = new JButton("Salir");
			panelBtns.add(btnSalir);
			
			JTabbedPane tabbedPaneTables = new JTabbedPane(JTabbedPane.TOP);
			frame.getContentPane().add(tabbedPaneTables, BorderLayout.CENTER);
			
			JScrollPane scrollPaneStudent = new JScrollPane();
			tabbedPaneTables.addTab("Estudiantes", null, scrollPaneStudent, null);
			
			
			scrollPaneStudent.setViewportView(tableStudents);
			
			JScrollPane scrollPanePSG = new JScrollPane();
			tabbedPaneTables.addTab("P. General Serv.", null, scrollPanePSG, null);
			
			
			scrollPanePSG.setViewportView(tablePSG);
			
			JScrollPane scrollPaneAS = new JScrollPane();
			tabbedPaneTables.addTab("P. Administracion", null, scrollPaneAS, null);
			
			
			scrollPaneAS.setViewportView(tableAS);
			
			JScrollPane scrollPanePHC = new JScrollPane();
			tabbedPaneTables.addTab("Docente Hora c", null, scrollPanePHC, null);
			
			
			scrollPanePHC.setViewportView(tablePHC);
			
			JScrollPane scrollPaneFTP = new JScrollPane();
			tabbedPaneTables.addTab("Docente Full Time", null, scrollPaneFTP, null);
			
			
			scrollPaneFTP.setViewportView(tableFTP);
			
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
			
					// create Docente Tiempo Completo
					btnCDocenteTC.addActionListener(new ActionListener () {
						public void actionPerformed(ActionEvent arg0) {
							FullTimeProfessor tempVal = FTPCreator.create();
							if(tempVal != null) {
								fTPArrayList.add(tempVal);
								loadTableFTP();
							}
						}
					});
			
					// create Docente Hora Catedra
					btnCDocenteHC.addActionListener(new ActionListener () {
						public void actionPerformed(ActionEvent arg0) {
							ProfessorHC tempVal = PHCCreator.create();
							if(tempVal != null) {
								pHCArrayList.add(tempVal);
								loadTablePHC();
							}
						}
					});
			
					// create Personal Administrativo
					btnCPAdminis.addActionListener(new ActionListener () {
						public void actionPerformed(ActionEvent arg0) {
							AdministrativeStaff tempVal = ASCreator.create();
							if(tempVal != null) {
								aSArrayList.add(tempVal);
								loadTableAS();
							}
						}
					});
			
					// create Servicio General
					btnCServiciosG.addActionListener(new ActionListener () {
						public void actionPerformed(ActionEvent arg0) {
							PGeneralServices tempVal = PGSCreator.create();
							if(tempVal != null) {
								pGSArrayList.add(tempVal);
								loadTablePSG();
							}
						}
					});
			
					// EVENTS ////////////////////////////////////////
			
					// create student
					btnCStudent.addActionListener(new ActionListener () {
						public void actionPerformed(ActionEvent arg0) {
							Student tempST = StudentCreator.create();
							if (tempST != null) {
								studenArrayList.add(tempST);
								loadTableStudent();
							}
						}
					});
		
	}

	
	/**
	 * Table configs
	 * 
	 */
	
	private void loadTableStudent() {
		String[] headers = new String[] {"Nombre", "Apellido", "Cod", "Estado"};
		DefaultTableModel modelT = new DefaultTableModel(new Object[][] {}, headers );
		
		for (int i = 0; i < studenArrayList.size(); i++) {
			Student tempST = studenArrayList.get(i);
			modelT.addRow(new Object[] {tempST.getFirstName(), tempST.getLastName(), tempST.getCode(), tempST.getState()});
		}
		tableStudents.setModel(modelT);		
	}
	
	private void loadTablePSG() {
		String[] headers = new String[] {"Nombre", "Apellido", "ID", "Sueldo"};
		DefaultTableModel modelT = new DefaultTableModel(new Object[][] {}, headers );
		
		for (int i = 0; i < pGSArrayList.size(); i++) {
			PGeneralServices tempObj = pGSArrayList.get(i);
			modelT.addRow(new Object[] {tempObj.getFirstName(), tempObj.getLastName(), tempObj.getId(), tempObj.getNetSalary()});
		}
		tablePSG.setModel(modelT);		
	}
	
	private void loadTableAS() {
		String[] headers = new String[] {"Nombre", "Apellido", "ID", "Titulo","Seldo"};
		DefaultTableModel modelT = new DefaultTableModel(new Object[][] {}, headers );
		
		for (int i = 0; i < aSArrayList.size(); i++) {
			AdministrativeStaff tempObj = aSArrayList.get(i);
			modelT.addRow(new Object[] {tempObj.getFirstName(), tempObj.getLastName(), tempObj.getId(), tempObj.getJobTitle(), tempObj.getNetSalary()});
		}
		tableAS.setModel(modelT);		
	}
	
	private void loadTablePHC() {
		String[] headers = new String[] {"Nombre", "Apellido", "ID", "Horas Dictadas", "Sueldo"};
		DefaultTableModel modelT = new DefaultTableModel(new Object[][] {}, headers );
		
		for (int i = 0; i < pHCArrayList.size(); i++) {
			ProfessorHC tempObj = pHCArrayList.get(i);
			modelT.addRow(new Object[] {tempObj.getFirstName(), tempObj.getLastName(), tempObj.getId(), tempObj.getHoursDictated(), tempObj.getNetSalary()});
		}
		tablePHC.setModel(modelT);		
	}
	
	private void loadTableFTP() {
		String[] headers = new String[] {"Nombre", "Apellido", "ID", "Titulo", "Horas Investigacion", "Sueldo"};
		DefaultTableModel modelT = new DefaultTableModel(new Object[][] {}, headers );
		
		for (int i = 0; i < fTPArrayList.size(); i++) {
			FullTimeProfessor tempObj = fTPArrayList.get(i);
			modelT.addRow(new Object[] {tempObj.getFirstName(), tempObj.getLastName(), tempObj.getId(), tempObj.getJobTitle(), tempObj.getResearchHours(), tempObj.getNetSalary()});
		}
		tableFTP.setModel(modelT);		
	}
	
	

}
