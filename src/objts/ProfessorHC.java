package objts;

/**
 * 
 * Profesor hora catedra
 * 
 */
public class ProfessorHC extends Employee{

	/**
	 * Attribs
	 */
	private int hoursDictated = 0;
	private static double HOURLYPRICE = 42000;


	/**
	 * Constructor 
	 * 
	 * @param firstName
	 * @param lastName
	 * @param id
	 * @param hoursDictated
	 */
	public ProfessorHC(String firstName, String lastName, int id, int hoursDictated) {
		super(firstName, lastName, id);
		this.hoursDictated = hoursDictated;
	}

	/**
	 * Getters and setters
	 * 
	 */
	public int getHoursDictated() {
		return hoursDictated;
	}

	public void setHoursDictated(int hoursDictated) {
		this.hoursDictated = hoursDictated;
	}
	
	/**
	 * Get Salario Neto
	 */
	@Override
	public double getNetSalary() {
		
		return this.hoursDictated * ProfessorHC.HOURLYPRICE;
	}
	
	/**
	 * printer
	 */
	public void print() {
		
		System.out.println("|###############################");
		System.out.println("| Professor HC-----");
		System.out.println("| ID:......... " + this.getId());
		System.out.println("| First Name:. " + this.getFirstName());
		System.out.println("| Last Name:.. " + this.getLastName());
		System.out.println("| Hours:...... " + this.getHoursDictated());
		System.out.println("| Salary:..... " + this.getNetSalary());
		System.out.println("---------------------------------");
	}
	
	
}
