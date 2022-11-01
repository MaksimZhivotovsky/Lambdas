package max.chapter_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import max.Student;
import max.Students;

public class Exercise_3 {

	private Students students = new Students();
	private List<Student> list = new ArrayList<>(students.getStudents());
	
	public Exercise_3() {
		Test test = new Test();
		System.out.println(test.getStudent(151));
		System.out.println(test.getStudentName(11));
	}
	
	private class Test {
		
		public Optional<Student> getStudent(int index) {
			return Optional.ofNullable(list.stream()
					.filter(x -> x.getId() == index)
					.findFirst().orElse(null));
		}
		public Optional<String> getStudentName(int index) {
			return Optional.ofNullable(list.stream()
					.filter(x -> x.getId() == index)
					.map(Student::getFirstName)
					.findFirst().orElse("No Index"));
		}
	}
}
