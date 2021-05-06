package homework2day3;

public class InstructorManager {
	public void add(User user , Instructor instructor) {
		System.out.println("Id: " + user.getId() + " Adý - Soyadý: " + instructor.getFirstName() + " " + instructor.getLastName() + user.getCourse() + " kursuna eðitmen kaydý oluþturdu.");
	}

}
