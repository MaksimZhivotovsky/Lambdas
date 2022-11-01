package max.chapter_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import max.Student;
import max.Students;

public class Exercise_2 {

	public Exercise_2() {
		Students students = new Students();
		List<Student> list = new ArrayList<Student>(students.getStudents());
		
		List<String> name = list.stream()
				.map(Student::getFirstName)
				.collect(Collectors.toList());
		System.out.println(name);
		
		Long count = list.stream()
				.count();
		System.out.println(count);
	}
}
