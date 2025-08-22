package lambda1;


import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;


public class Desafio {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto("Carro", 100000.0, 0.1);
		
		DoubleUnaryOperator r = 
				p -> p < 2500 ? p * 0.915 : p;
		DoubleUnaryOperator f = 
				p -> p < 3000 ? p - 100 : p - 50;
		DoubleFunction<String> a =
				num -> String.format("R$ %.2f", num);
		
		System.out.println(
			    a.apply(
			        r.andThen(f).applyAsDouble(produto.getFinalPrice())
			    )
			);

		
		
				
				
				
	}

}
