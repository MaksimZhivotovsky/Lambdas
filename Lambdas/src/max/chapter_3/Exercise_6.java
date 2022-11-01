package max.chapter_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exercise_6 {

	public Exercise_6() {
		
		String string = "sacaldaoijamcmac";
		
		char[] massiv = string.toCharArray();
		long count = Stream.of(string.split(""))
				.count();
		System.out.println(count);
	}
}
