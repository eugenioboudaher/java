package Stream;


import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;




public class ReduceJava {

	public static void main(String[] args) {
		
		List<Integer> numsList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		int xList = numsList.stream()
		.reduce(soma)
		.get();
		
		int xList2 = numsList.parallelStream()
		.reduce(soma)
		.get();
		
		Integer xList3 = numsList.parallelStream()
		.reduce(2, soma);
		
		Integer xList4 = numsList.stream()
		.reduce(2, soma);
		
		numsList.stream()
		.filter(n-> n > 4)
		.reduce(soma)
		.ifPresent(System.out::println);
		
		System.out.println(xList);
		System.out.println(xList2);
		System.out.println(xList3);
		System.out.println(xList4);
		
		
		
		
				
	}
}
