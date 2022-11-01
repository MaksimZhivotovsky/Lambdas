package max.chapter_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import max.Student;
import max.Students;

public class Exercise_1 {

	public Exercise_1() {
		Students students = new Students();
		List<Student> list = new ArrayList<>(students.getStudents());
		
		int count = list.stream()
				.map(Student::getAge)
				.reduce(0, (x, y) -> x + y);
		System.out.println(count);
		List<String> map = list.stream()
				.map(Student::getFirstName)
				.collect(Collectors.toList());
		System.out.println(map);
		List<Student> curse = list.stream()
				.filter(x -> x.getCourse() < 3)
				.collect(Collectors.toList());
		System.out.println(curse);
	}
}
