package max.chapter_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import max.Student;
import max.Students;

public class Exercise_8 {

	public Exercise_8() {
		Students students = new Students();
		List<Student> list = new ArrayList<>(students.getStudents());
		
		Integer map = list.stream()
				.map(Student::getCourse)
				.reduce(0, (x, y) -> x +y);
		System.out.println(map);
		
		List<Student> lastName = list.stream()
				.filter(x -> x.getAge() > 30)
				.collect(Collectors.toList());
		System.out.println(lastName);
		
		Set<Student> lastName1 = list.stream()
//				.map(Student::getFirstName)
				.filter(x  -> Collections.frequency(list, x) > 1)
				.collect(Collectors.toSet());
		System.out.println(lastName1);
	}
}
