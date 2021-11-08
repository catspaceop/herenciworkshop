package gui;

import objts.AdministrativeStaff;
import objts.Functions;
import objts.AdministrativeStaff.JobTitle;

/**
 * 
 * Creador de Personal administrativo
 *
 */
public class ASCreator {


	/**
	 * 
	 * @return Administrative Staff
	 */
	public static AdministrativeStaff create() {
//		String firstName, String lastName, int id, JobTitle jobTitle
		String entity = "el personal administrativo";

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
		
		return new AdministrativeStaff(firstName, lastName, identfier, selectedJT);
	}

}
