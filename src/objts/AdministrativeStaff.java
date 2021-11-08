package objts;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Personal Administrativo
 *
 */
public class AdministrativeStaff extends Employee {

	/**
	 * Enum to Job Title
	 */
	public static enum JobTitle {
		TECHNICIAN, // Tecnico
		TECHNOLOGIST, // Tecnologo
		PROFESSIONAL, // Profesional
		SPECIALIST, // Especialista
		MAGISTER, // Magister
		DOCTOR, // Doctor
	};
	

	/**
	 * Attribs
	 */
	private JobTitle jobTitle;
	
	// Map to use better percentage
	private Map<JobTitle, Double> percentages;


	/**
	 * Constructor
	 * 
	 * @param firstName
	 * @param lastName
	 * @param id
	 * @param jobTitle
	 */
	public AdministrativeStaff(String firstName, String lastName, int id, JobTitle jobTitle) {
		super(firstName, lastName, id);
		this.jobTitle = jobTitle;
		
		// declarate percentages
		this.percentages = new HashMap<JobTitle, Double>();
		this.percentages.put(JobTitle.TECHNICIAN, 1.0);
		this.percentages.put(JobTitle.TECHNOLOGIST,  1.1);
		this.percentages.put(JobTitle.PROFESSIONAL, 1.18);
		this.percentages.put(JobTitle.SPECIALIST,  1.22);
		this.percentages.put(JobTitle.MAGISTER,  1.3);
		this.percentages.put(JobTitle.DOCTOR, 1.5);
	}


	/**
	 * Getters and setters
	 * 
	 */
	public JobTitle getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(JobTitle jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	/**
	 * Sobreescribir el modo de obtener el salario
	 */
	@Override
	public double getNetSalary() {
		return Employee.SSM * this.percentages.get(this.jobTitle);
	}
	
	/**
	 * printer
	 */
	public void print() {
		System.out.println("|###############################");
		System.out.println("| Administrative Staff-----");
		System.out.println("| ID:......... " + this.getId());
		System.out.println("| First Name:. " + this.getFirstName());
		System.out.println("| Last Name:.. " + this.getLastName());
		System.out.println("| Job Title:.. " + this.getJobTitle());
		System.out.println("| Salary:..... " + this.getNetSalary());
		System.out.println("---------------------------------");

	}
	

}
