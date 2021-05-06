package homework2day3;

public class StudentManager {
	public void add(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " öðrenci kaydý oluþturuldu." );
	}
	
	public void homework(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " isimli öðrenci ödevde %" + student.getProgress() + " ilerleme gerçekleþtirdi. " );
	}

}
