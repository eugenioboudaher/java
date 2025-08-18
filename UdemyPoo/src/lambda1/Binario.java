package lambda1;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;



public class Binario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = 
				( n1, n2) -> 
				(n1 + n2)/2;
				
		BiFunction<Double, Double, String> r = 
				(n1, n2) -> ((n1 + n2) / 2) >= 7
				? "Aprovado" : "Reprovado";
				
		System.out.println(r.apply(7.5, 6.0));
		
		Function<Double, String> conceito = 
				n -> n >= 7 ? "Aprooved" : "Fail";
				
		System.out.println(media.andThen(conceito)
				.apply(8.0, 7.3));
	}
}
