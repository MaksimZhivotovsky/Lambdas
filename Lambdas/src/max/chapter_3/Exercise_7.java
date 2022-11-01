package max.chapter_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import max.Student;
import max.Students;

public class Exercise_7 {

	public Exercise_7() {
		Students students = new Students();
		List<Student> list = new ArrayList<>(students.getStudents());
		
		Integer max = list.stream()
				.map(Student::getLastName)
				.map(String::length)
				.max(Comparator.comparing(x -> x)).orElseThrow();
		System.out.println(max);
				
	}
}
