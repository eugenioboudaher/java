package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::println;
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Function<Integer, String> intToString = n -> n.toString();
		UnaryOperator<Integer> por120 = n -> n * 120;
		UnaryOperator<String> reversor = s ->new StringBuilder(s).reverse().toString();
		Function<String, Integer> stringToInt = i -> Integer.parseInt(i);
		
		nums.stream()
		.map(por120)
		.map(intToString)
		.map(reversor)
		.map(stringToInt)
		.forEach(print);
		
		
	}
}
