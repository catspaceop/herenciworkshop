package objts;

/**
 * 
 * Persona
 *
 */
public class Person {
	
	/**
	 * attributes
	 */
	protected String firstName;
	protected String lastName;
	
	/**
	 * Constructor
	 * 
	 * @param firstName
	 * @param lastName
	 */
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/**
	 * Getters and setters 
	 * 
	 */
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
