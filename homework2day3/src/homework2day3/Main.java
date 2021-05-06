package homework2day3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor(123, "engindemirog@gmail.com", "engin3562" , "Java-React" , "Engin" , "Demiroğ");
		
		Student student = new Student(123456, "mustafaısık12@gmail.com", "mustafa31241", "Java-React", "Mustafa", "Işık", 26.3);
		
		Student student2 = new Student(987654, "omercelenk@gmail.com", "omer32564", "Java-React", "Ömer", "Çelenk", 69.1);
		
		Student student3 = new Student(321546, "melihgundogan@gmail.com", "melih12548" , "Java-React", "Melih", "Gündoğan", 55.6);
		
		UserManager userManager = new UserManager();
		userManager.createAccount(student);
		userManager.delete(student3);
		userManager.logOut(instructor);
		userManager.signIn(student2);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor, instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.add(student2);
		studentManager.add(student3);
		studentManager.homework(student);
		studentManager.homework(student2);
		studentManager.homework(student3);
		
	}
	

}
