package homework2day3;

public class Instructor extends User{
	private String firstName;
	private String lastName;
	
	public Instructor(int id, String email, String password, String course, String firstName, String lastName) {
		super(id, email, password, course);
		this.firstName = firstName;
		this.lastName = lastName;
	}

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
