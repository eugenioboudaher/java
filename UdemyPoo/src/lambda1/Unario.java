package lambda1;

import java.util.function.UnaryOperator;

public class Unario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> m2 = n -> n + 2;
		UnaryOperator<Integer> mv2 = n -> n * 2;
		UnaryOperator<Integer> me2 = n -> n * n;
		
		System.out.println(
				m2.andThen(mv2)
				.andThen(me2)
				.apply(0));
		
		int resultado = me2
				.compose(mv2)
				.compose(m2)
				.apply(0);
		
		System.out.println(resultado);
				
	}
	
}
