package objts;

/**
 * 
 * Personal ded Servicio General
 *
 */
public class PGeneralServices extends Employee{
	

	/**
	 * Constructor
	 * 
	 * @param firstName
	 * @param lastName
	 * @param id
	 */
	public PGeneralServices(String firstName, String lastName, int id) {
		super(firstName, lastName, id);
	}

	/**
	 * Get Salario neto
	 */
	@Override
	public double getNetSalary() {
		return Employee.SSM ;
	}
	
	/**
	 * printer
	 */
	public void print() {
		System.out.println("|###############################");
		System.out.println("| Personal de Servicios generales-----");
		System.out.println("| CODE:....... " + this.getId());
		System.out.println("| FIRST NAME:. " + this.getFirstName());
		System.out.println("| LAST NAME:.. " + this.getLastName());
		System.out.println("| Net Salary:. " + this.getNetSalary());
		System.out.println("---------------------------------");
	}
}
