package gui;

import objts.Functions;
import objts.ProfessorHC;

/**
 * 
 * Docecnde Hora Catedra Creator
 *
 */
public class PHCCreator {
	
	/**
	 * 
	 * creator
	 */
	public static ProfessorHC create() {
//		String firstName, String lastName, int id, int hoursDictated
		String entity = "el Docente Hora Catedra";

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
		
		Integer hours = Functions.validateIntInpt("las horas inpuestas ", entity);
		if (hours == null)
			return null;
		
		return new ProfessorHC(firstName, lastName, identfier, hours); 
	}

}
