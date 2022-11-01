package max.chapter_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import max.Student;
import max.Students;

public class Exercise_1 {
	
	private Students students = new Students();
	private List<Student> list = new ArrayList<>(students.getStudents());
	
	public Exercise_1() {
		Test test = new Test();
		System.out.println(test.getFirstName());
		System.out.println(test.getStudent(3));
		System.out.println(test.getAllStudent());
	}

	
	private class Test implements Performance {

		@Override
		public String getFirstName() {
			return list.stream()
					.map(Student::getFirstName)
					.findFirst().get();
		}

		@Override
		public Student getStudent(int id) {
			return  list.get(id);
		}

		@Override
		public List<Student> getAllStudent() {
			return list.stream()
					.collect(Collectors.toList());
		}
		
	}
 	
	private interface Performance {
		public String getFirstName();
		public Student getStudent(int id);
		public List<Student> getAllStudent(); 
	}
}
