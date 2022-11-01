package max;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Students {

	private List<Student> students;
	
//	private long id;
//	private String firstName;
//	private String lastName;
//	private int age;
//	private String email;
//	private byte course;
	public Students() {
		if(students == null) {
			students = new ArrayList<>();
			students.add(new Student(1l, "Ivan", "Ivanov", 25, "ivanov@mail.ru", 3));
			students.add(new Student(11l, "Ivan", "Ivanov", 25, "ivanov@mail.ru", 3));
			students.add(new Student(2l, "Petr", "Petrov", 30, "petrov@mail.ru", 4));
			students.add(new Student(2l, "Petr", "Petrov", 30, "petrov@mail.ru", 4));
			students.add(new Student(3l, "Maria", "Ivanova", 33, "maria@mail.ru", 3));
			students.add(new Student(4l, "Dima", "Ylianov", 20, "dima@mail.ru", 2));
			students.add(new Student(5l, "Aleksandr", "Pridannikov", 24, "sasha@mail.ru", 1));
			students.add(new Student(6l, "Yura", "Nikolaevskiy", 23, "yura@mail.ru", 1));
			students.add(new Student(7l, "Kolay", "Nigryl", 24, "kolay@mail.ru", 5));
			students.add(new Student(8l, "Olay" , "Chycheva", 18, "olay@mail.ru", 5));
			students.add(new Student(9l, "Kolia", "Docent", 43, "kolia@mail.ru", 2));
			students.add(new Student(10l, "Basia", "Basin", 26, "basia@mail.ru", 1));
		}
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public int hashCode() {
		return Objects.hash(students);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(students, other.students);
	}
	
	
}
