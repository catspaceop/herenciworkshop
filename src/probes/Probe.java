
package probes;

import objts.AdministrativeStaff;
import objts.FullTimeProfessor;
import objts.PGeneralServices;
import objts.ProfessorHC;
import objts.Student;

public class Probe {
	
	public static void main(String[] args) {
		// create student
		new Student("Juan Lucas", "Garcia Torres", 43134, Student.Status.ACTIVO).print();
		new Student("Alfredo", "Surpiales", 343243, Student.Status.INACTIVO).print();
				
		// docentes hora cátedra
		new ProfessorHC("Profe 1", "Somura", 143241234, 12).print();;
		
		
		// Personal administrativo
		new AdministrativeStaff("Admin P 1", "Dep1", 13412341, AdministrativeStaff.JobTitle.TECHNICIAN).print();;
		new AdministrativeStaff("Admind P 2", "Dep2", 1241234, AdministrativeStaff.JobTitle.TECHNOLOGIST).print();
		new AdministrativeStaff("Adminfs P 3", "Dep3", 545245, AdministrativeStaff.JobTitle.PROFESSIONAL).print();
		new AdministrativeStaff("Adminfda P 4", "Dep4", 69852345, AdministrativeStaff.JobTitle.SPECIALIST).print();
		new AdministrativeStaff("Adminggfg P 5", "Dep5", 9387524, AdministrativeStaff.JobTitle.MAGISTER).print();
		new AdministrativeStaff("Adminadfas P 6", "Dep6", 29735234, AdministrativeStaff.JobTitle.DOCTOR).print();
		
		// Docentes De tiempo completo
		new FullTimeProfessor("Profesor TC1", "LSTNM 1", 1344, AdministrativeStaff.JobTitle.TECHNICIAN, 14).print();
		new FullTimeProfessor("Profesor TC2", "LSTNM 2", 4134, AdministrativeStaff.JobTitle.TECHNOLOGIST, 24).print();
		new FullTimeProfessor("Profesor TC3", "LSTNM 3", 435234, AdministrativeStaff.JobTitle.PROFESSIONAL, 34).print();
		new FullTimeProfessor("Profesor TC4", "LSTNM 4", 1554, AdministrativeStaff.JobTitle.SPECIALIST, 67).print();
		new FullTimeProfessor("Profesor TC5", "LSTNM 5", 5234, AdministrativeStaff.JobTitle.MAGISTER, 5).print();
		new FullTimeProfessor("Profesor TC6", "LSTNM 6", 45234, AdministrativeStaff.JobTitle.DOCTOR, 55).print();
		
		//Servicio general
		new PGeneralServices("PGS srv1", "LSdf1 1", 2341234).print();
		
	}

}
