package objts;

/**
 *
 * Empleado
 *
 */
public class Employee extends Person {
	/**
	 * Attribs
	 */
	protected static final double SSM = 980655;

	protected int id;

	/**
	 * Constructor
	 * 
	 * @param firstName
	 * @param lastName
	 * @param id
	 */
	public Employee(String firstName, String lastName, int id) {
		super(firstName, lastName);
		this.id = id;
	}

	/**
	 * Getters and setters
	 *
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * get salario neto
	 * Declaración
	 * @return
	 */
	public double getNetSalary() {
		return 0;
	}
}
