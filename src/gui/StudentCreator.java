package gui;

import objts.Functions;
import objts.Student;
import objts.Student.Status;

/**
 * 
 * Creador de estudiantes
 *
 */
public class StudentCreator {

	/**
	 * 
	 * @return Un estudiante o null si se cancela
	 */
	public static Student create() {


		String entity = "del estudiante"; 
		// fist name
		String firstName = Functions.validateStringInpt("el nombre", entity);
		if (firstName == null) 
			return null;
		
		// Last name
		String lastName = Functions.validateStringInpt("el apellido", entity);
		if (lastName == null) 
			return null;
		
		// code
		Integer code = Functions.validateIntInpt("el código", entity);
		if (code == null) 
			return null;
		
		// Estado
		Object [] statusArr = {Student.Status.ACTIVO, Student.Status.INACTIVO};
		Student.Status status = (Status) Functions.validateSelection("el estado", entity, statusArr);
		if (status == null)
			return null;
		 
//		new Student(firstName, lastName, code, status).print();
		return new Student(firstName, lastName, code, status);
	}

	public static void main(String[] args) {
		StudentCreator.create();
	}
}
