package lambda1;

import java.util.function.Function;

public class Desafio2 {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto("Carro", 100000.0, 0.1);
		
		Function<Produto, Double> preco = p -> p.getFinalPrice();
		Function<Double, Double> precoDesc = p ->
		p < 2500 ? p * 0.985 : p;
		Function<Double, Double> precoFrete = p ->
		p < 2500 ? p - 100 : p - 50;
		Function<Double, String> formatPrice = p ->
		String.format("R$ %.2f", p);
		
		System.out.println(
				preco
				.andThen(precoDesc)
				.andThen(precoFrete)
				.andThen(formatPrice).apply(produto)
		);
   	}
}
