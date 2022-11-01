package max.chapter_6;

import java.util.stream.IntStream;

public class Exercise_1 {

	public  int sequentialSumOfSquares(IntStream range) {
	int х = 0;
	return range
			.parallel()
			.map(x -> х * х)
	.sum(); 
}
}
