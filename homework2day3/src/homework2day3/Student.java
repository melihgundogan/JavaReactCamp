package homework2day3;

public class Student extends User{
	private String firstName;
	private String lastName;
	private double progress;
	
	public Student(int id, String email, String password, String course, String firstName, String lastName,
			double progress) {
		super(id, email, password, course);
		this.firstName = firstName;
		this.lastName = lastName;
		this.progress = progress;
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

	public double getProgress() {
		return progress;
	}

	public void setProgress(double progress) {
		this.progress = progress;
	}

}
