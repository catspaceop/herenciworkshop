package objts;

/**
 * 
 * Profesor de tiempo completo
 *
 */
public class FullTimeProfessor extends AdministrativeStaff {

	/**
	 * Attribs
	 */
	private static double HOURLYPRICE = 52000;
	private double researchHours;

	/**
	 * Constructor
	 * 
	 * @param firstName
	 * @param lastName
	 * @param id
	 * @param jobTitle
	 * @param hOURLYPRICE
	 * @param researchHours
	 */
	public FullTimeProfessor(String firstName, String lastName, int id, JobTitle jobTitle, double researchHours) {
		super(firstName, lastName, id, jobTitle);
		this.researchHours = researchHours;
	}

	/**
	 * Getters and setters
	 * 
	 */

	public double getResearchHours() {
		return researchHours;
	}

	public void setResearchHours(double researchHours) {
		this.researchHours = researchHours;
	}

	/**
	 * Calculate
	 */
	@Override
	public double getNetSalary() {
		return (super.getNetSalary() + FullTimeProfessor.HOURLYPRICE * this.researchHours);
	}

	

	/**
	 * printer
	 */
	public void print() {
		
		System.out.println("|###############################");
		System.out.println("| Professor Full Time-----");
		System.out.println("| ID:............. " + this.getId());
		System.out.println("| First Name:..... " + this.getFirstName());
		System.out.println("| Last Name:...... " + this.getLastName());
		System.out.println("| Job Title:...... " + this.getJobTitle());
		System.out.println("| Research Hours:. " + this.getResearchHours());
		System.out.println("| Salary:......... " + this.getNetSalary());
		System.out.println("---------------------------------");
	}
}
