package Stream;

import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class CriandoStreams {
	
	public static void main(String[] args) {
		
		Consumer<Object> printConsumer = System.out::print;
		
		Stream<String> langStream =
				Stream.of("Java ", "Python ", "js\n");
		langStream.forEach(printConsumer);
		
		String [] langs2 = {"Golang ", "Cobol ", "Basic \n"};
		

		Stream.of(langs2).forEach(printConsumer); 
		
		List<String> langs3 = Arrays.asList(
				"C++ ", "C ", "Swift \n");
		
		langs3.forEach(printConsumer);
		langs3.stream().forEach(printConsumer);
		
		
		Arrays.asList(langs2).forEach(printConsumer);
		Arrays.stream(langs2, 1, 2).forEach(printConsumer);
		
		Stream.iterate(0, n -> n + 1)
		.limit(20)
		.forEach(printConsumer);
	}
}
