package homework2day3;

public class StudentManager {
	public void add(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " ��renci kayd� olu�turuldu." );
	}
	
	public void homework(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " isimli ��renci �devde %" + student.getProgress() + " ilerleme ger�ekle�tirdi. " );
	}

}
