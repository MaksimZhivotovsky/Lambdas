package max.chapter_5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.w3c.dom.css.Counter;

import max.Student;
import max.Students;

public class Exercise_2 {

	private Students students = new Students();
	private List<Student> list = new ArrayList<>(students.getStudents());
	private Stream<String> names = Stream.of("John", "Paudedqql", "George", "John",
			"Paul", "John");
	
	public Exercise_2() {
		Optional<String> students = list.stream()
				.map(Student::getFirstName)
				.max(Comparator.comparing(String::length));
		System.out.println(students);
		
		Optional<String> name = names
				.max(Comparator.comparing(String::length));
		System.out.println(name);
		
		Map<String, Integer> counterMap = list.stream()
				.collect(Collectors.toMap(Student::getFirstName, s ->1, Integer::sum));
		System.out.println(counterMap);
		
	}
}
