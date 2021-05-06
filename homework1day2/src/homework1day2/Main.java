package homework1day2;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "C# + ANGULAR", "Engin DEMÝROÐ", 60);
		
		Course course2 = new Course(2, "JAVA + REACT", "Engin DEMÝROÐ", 60);
		
		Course course3 = new Course(3, "Programlamaya Giriþ Ýçin Temel Kurs", "Engin DEMÝROÐ",1);
		
		Course[] courses = {course1, course2, course3};
		
		for (Course course : courses) {
			
			System.out.println(course.courseName);
		}
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.register(course1);
		
		courseManager.register(course2);
		
		courseManager.register(course3);
		
	

	}

}
