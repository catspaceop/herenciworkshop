package gui;

import objts.AdministrativeStaff;
import objts.FullTimeProfessor;
import objts.Functions;
import objts.AdministrativeStaff.JobTitle;

/**
 * 
 * Docente Tiempo completo
 *
 */
public class FTPCreator {

	public static FullTimeProfessor create () {
//		String firstName, String lastName, int id, JobTitle jobTitle, double researchHours
		String entity = "el Docente Tiempo Completo";

		// Name
		String firstName = Functions.validateStringInpt("el nombre ", entity);
		if (firstName == null)
			return null;

		// lastname
		String lastName = Functions.validateStringInpt("el apellido ", entity);
		if (lastName == null)
			return null;
		
		Integer identfier = Functions.validateIntInpt("el id", entity);
		if (identfier == null)
			return null;
		
		Object [] jobTitles = {
				AdministrativeStaff.JobTitle.TECHNICIAN, 
				AdministrativeStaff.JobTitle.TECHNOLOGIST, 
				AdministrativeStaff.JobTitle.PROFESSIONAL, 
				AdministrativeStaff.JobTitle.SPECIALIST, 
				AdministrativeStaff.JobTitle.MAGISTER, 
				AdministrativeStaff.JobTitle.DOCTOR,
			};
		
		JobTitle selectedJT= (JobTitle) Functions.validateSelection("el estado", entity, jobTitles);
		if (selectedJT == null)
			return null;
		
		Integer hours = Functions.validateIntInpt("las horas de investigacion", entity);
		if (hours == null)
			return null;
		
		return new FullTimeProfessor(firstName, lastName, identfier, selectedJT, hours);
	}
}
