package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;



public class Map3 {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::println;
		
		List<String> marcas =
				Arrays.asList
				("BMW ",
				 "Citroen ",
				 "Raenault ",
				 "Chevrolet ");
		

		
		marcas.stream()
		.map(n -> n + "!!!")
		.map(n -> n.toUpperCase())
		.forEach(print);
		
		marcas.stream()
		.map(Utilitarios.maiuscula)
		.map(Utilitarios.primeira)
		.map(Utilitarios.grito)
		.forEach(print);
		
		
		
		
		
	}
}
