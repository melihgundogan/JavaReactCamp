package homework2day3;

public class InstructorManager {
	public void add(User user , Instructor instructor) {
		System.out.println("Id: " + user.getId() + " Ad� - Soyad�: " + instructor.getFirstName() + " " + instructor.getLastName() + user.getCourse() + " kursuna e�itmen kayd� olu�turdu.");
	}

}
