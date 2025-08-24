package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Map1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i * 2);
		}
		
		System.out.println(list);
		
		Stream<Integer> stream = list.stream();
		stream
		.map(n -> n + 3)
		.map(n -> n * 10)
		.forEach(System.out::println);
		
		
	}
}
