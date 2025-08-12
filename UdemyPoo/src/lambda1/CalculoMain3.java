package lambda1;

import java.util.function.BinaryOperator;

public class CalculoMain3 {
	
	public static void main(String[] args) {
		
		BinaryOperator<Integer> somaCalculo = (x, y) -> {
			return x + y;
		};
		

		
		
		System.out.println(somaCalculo.apply(2,50));
		somaCalculo = (x, y) -> x * y;
		System.out.println(somaCalculo.apply(2,50));

	}
}
