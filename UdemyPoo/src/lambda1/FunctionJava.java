package lambda1;

import java.util.function.Function;

public class FunctionJava {

	public static void main(String[] args) {
		
		Function<Integer, String> pOUiFunction = 
			numero -> numero % 2 == 0 ? "Par":"Impar";
		
		System.out.println(pOUiFunction.apply(5));
			
		Function<String, String> resultado = 
				valor -> "O resultado é: " +
						valor;
		
		Function<String, String> empolgado = 
				valor -> valor + "!!!";
						
		String resoltadoFinalString = 
				pOUiFunction
				.andThen(resultado)
				.andThen(empolgado).apply(55);
		
		System.out.println(resoltadoFinalString);
				
		
	}
}
