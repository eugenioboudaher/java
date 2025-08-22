package Stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class CriandoStreams {
	
	public static void main(String[] args) {
		
		Consumer<String> printConsumer = System.out::print;
		
		Stream<String> langStream =
				Stream.of("Java ", "Python ", "js\n");
		langStream.forEach(printConsumer);
		
		String [] langs2 = {"Golang ", "Cobol ", "Basic \n"};
		
		Stream.of(langs2).forEach(printConsumer);  
		
		Arrays.asList(langs2).forEach(printConsumer);
		Arrays.stream(langs2, 1, 2).forEach(printConsumer);
	}
}
