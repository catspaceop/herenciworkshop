package objts;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Functions {

	public static boolean havenumber(String str) {
		return str.matches(".*\\d.*");
	}


	public static String validateStringInpt(String fieldName, String entityName) {
		return Functions.validateStringInpt(fieldName, entityName,4);
	}
	
	/**
	 * Try validate the input of string 
	 * @param fieldName
	 * @param entityName
	 * @param minSIze
	 * @return
	 */
	
	public static String validateStringInpt(String fieldName, String entityName, int minSIze) {
		JFrame jf = new JFrame();
		jf.setAlwaysOnTop(true);

		// Validate String
		while (true) {
			String value = (String) JOptionPane.showInputDialog(jf, "Ingrese " + fieldName + " " + entityName);

			// delete black space
			if (value != null) {
				value = value.trim();
			}

			// Validate
			if (value == null) {
				// skip option

				int choise = -1;
				while (choise == -1) {
					choise = JOptionPane.showConfirmDialog(jf, "Desea CANCELAR de la creación " + entityName + "?",
							"Salir", JOptionPane.YES_NO_OPTION);
				}

				// Cancel proccess
				if (choise == 0) {
					return null;
				}

			} else if (value.length() == 0) {
				JOptionPane.showMessageDialog(jf, "No puede dejar en campo vacio o con solo espacios para " + fieldName,
						"Error", JOptionPane.ERROR_MESSAGE);
			} else if (value.length() < minSIze) {
				JOptionPane.showMessageDialog(jf,   fieldName + "debe ser mínimo de" + minSIze, "Error",
						JOptionPane.ERROR_MESSAGE);
			} else if (Functions.havenumber(value)) {
				JOptionPane.showMessageDialog(jf, "No pude ingresar valores númericos para " + fieldName, "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				return value;
			}

		}
	}
	
	
	/**
	 * Try validate the int input
	 * @param fieldName
	 * @param entityName
	 * @return
	 */
	public static Integer validateIntInpt (String fieldName, String entityName) {
		JFrame jf = new JFrame();
		jf.setAlwaysOnTop(true);

		// Validate String
		while (true) {
			String value = (String) JOptionPane.showInputDialog(jf, "Ingrese " + fieldName + " " + entityName);

			// delete black space
			if (value != null) {
				value = value.trim();
			}

			// Validate
			if (value == null) {
				// skip option

				int choise = -1;
				while (choise == -1) {
					choise = JOptionPane.showConfirmDialog(jf, "Desea CANCELAR de la creación " + entityName + "?",
							"Salir", JOptionPane.YES_NO_OPTION);
				}

				// Cancel proccess
				if (choise == 0) {
					return null;
				}

			} else if (value.length() == 0) {
				JOptionPane.showMessageDialog(jf, "No puede dejar en campo vacio o con solo espacios para " + fieldName,
						"Error", JOptionPane.ERROR_MESSAGE);
		
			} else {
				
				try {
					int result = Integer.parseInt(value);
					return result;
				} catch (Exception e) {
					JOptionPane.showMessageDialog(jf, "El valor ingresado no es un numero",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
				
			} 

		}
		
	}
	
	
	public static Object validateSelection (String fieldName, String entityName, Object[] possibilities) {
		JFrame jf = new JFrame();
		jf.setAlwaysOnTop(true);

		// Validate String
		while (true) {
			
			Object optionSelected =  JOptionPane.showInputDialog(
					jf, 
					"Ingrese " + fieldName + " " + entityName,
					"Estado", 
					JOptionPane.QUESTION_MESSAGE,
					null,
					possibilities,
					possibilities[0]);

			// Validate
			if (optionSelected == null) {
				// skip option

				int choise = -1;
				while (choise == -1) {
					choise = JOptionPane.showConfirmDialog(jf, "Desea CANCELAR de la creación " + entityName + "?",
							"Salir", JOptionPane.YES_NO_OPTION);
				}

				// Cancel proccess
				if (choise == 0) {
					return null;
				}

			} else {
				
				return optionSelected;
				
			} 

		}
	}

	public static void main(String[] args) {
		Object [] statusArr = {Student.Status.ACTIVO, Student.Status.INACTIVO};
		 Functions.validateSelection("el estado", "estudiante", statusArr);
	}
	
}
