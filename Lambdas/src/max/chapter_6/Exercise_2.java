package max.chapter_6;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Exercise_2 {
	
	List<Integer> list = new CopyOnWriteArrayList<Integer>();

	public int multiplyThrough(List<Integer> linkedListOfNumbers) {
		this.list = linkedListOfNumbers;
		return linkedListOfNumbers.stream()
				.reduce(5, (асс, х) -> х * асс); 
	}
}
