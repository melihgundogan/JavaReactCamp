package homework2day3;

public class User {
	private int id;
	private String email;
	private String password;
	private String course;
	
	public User(int id, String email, String password, String course) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
