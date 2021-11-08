package gui;

import objts.Functions;
import objts.PGeneralServices;

public class PGSCreator {
	
	public static PGeneralServices create() {
//		String firstName, String lastName, int id
		
		String entity = "la Persona de Servicio General";
		
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
			
		return new PGeneralServices(firstName, lastName, identfier);
	}
}
