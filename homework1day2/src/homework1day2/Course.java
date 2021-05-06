package homework1day2;

public class Course {
	
	public Course() {
		System.out.println("Kurslar karþýnýzdadýr.");
	}
	
	public Course(int id, String courseName, String instructorName, double day) {
		this();
		this.id = id;
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.day = day;
	}	
	
	int id;
	String courseName;
	String instructorName;
	double day;

}
