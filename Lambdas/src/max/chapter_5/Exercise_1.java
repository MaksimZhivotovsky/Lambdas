package max.chapter_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import max.Student;
import max.Students;

public class Exercise_1 {

	private Students students = new Students();
	private List<Student> list = new ArrayList<>(students.getStudents());
	private List<String> names = Arrays.asList("John", "Paudedqql", "George", "John",
			"Paul", "John");
	
	public Exercise_1() {
		
		List<String> name = list.stream()
				.map(Student::getFirstName)
				.map(String::toLowerCase)
				.collect(Collectors.toList());
		System.out.println(name);
		
		Optional<String> count = list.stream()
				.map(Student::getLastName)
				.max(Comparator.comparing(String::length));
				System.out.println(count);
		
		@SuppressWarnings("unchecked")
		List<String> lists = (List<String>) Stream.of(list, names)
				.flatMap(List::stream)
				.collect(Collectors.toList());
		System.out.println(lists);
		
		Map<String, List<String>> listMap = list.stream()
				.collect(Collectors.groupingBy(Student::getLastName,
						Collectors.mapping(Student::getFirstName, Collectors.toList())));
		System.out.println(listMap);
	}
}
