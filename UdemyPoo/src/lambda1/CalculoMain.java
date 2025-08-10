package lambda1;

public class CalculoMain {
	
	public static void main(String[] args) {
		
		Calculo somaCalculo = (x, y) -> {
			return x + y;
		};
		
		somaCalculo = (x, y) -> x * y;
		
		
		System.out.println(somaCalculo.executar(2,50));
		System.out.println(somaCalculo.executar(2,50));
	}
}
