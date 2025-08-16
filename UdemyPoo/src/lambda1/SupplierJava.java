package lambda1;

import java.util.List;
import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierJava {

	public static void main(String[] args) {
		
		Supplier<List<String>> listaSupplier = () -> Arrays.asList("Bia", "Ana", "Lua", "Carlos");
		
		System.out.println(listaSupplier.get());
				
	}
}
