package objts;

/**
 * 
 * Estudiante
 *
 */
public class Student extends Person{
	
	
	/**
	 * 
	 * Enum Status
	 *
	 */
	public static enum Status {ACTIVO, INACTIVO}
	
	
	/**
	 * Attribs
	 */
	private int code;
	private Status state;
	
	
	/**
	 * Cosntuctor
	 * 
	 * @param firstName
	 * @param lastName
	 * @param code
	 * @param state
	 */
	public Student(String firstName, String lastName, int code, Status state) {
		super(firstName, lastName);
		this.code = code;
		this.state = state;
	}
	
	
	/**
	 * Getters and Setters
	 */
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Status getState() {
		return state;
	}
	public void setState(Status state) {
		this.state = state;
	}
	
	/**
	 * Print
	 */
	public void print() {
		System.out.println("|###############################");
		System.out.println("| STUDENT-----");
		System.out.println("| CODE:....... " + this.getCode());
		System.out.println("| FIRST NAME:. " + this.getFirstName());
		System.out.println("| LAST NAME:.. " + this.getLastName());
		System.out.println("| LAST NAME:.. " + this.getState());
		System.out.println("| STATUS:..... " + this.getState());
		System.out.println("---------------------------------");
	}
	
	
	
	
	
}
