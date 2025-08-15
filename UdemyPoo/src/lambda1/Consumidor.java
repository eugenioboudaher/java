package lambda1;

import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;



public class Consumidor {

	public static void main(String[] args) {
		
		
		Produto p1 = new Produto("luva", 3.0, 0.1);
		Produto p2 = new Produto("laço", 2.0, 0.1);
		Produto p3 = new Produto("pincel", 5.0, 0.1);
		Produto p4 = new Produto("guache", 7.0, 0.1);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);

		Consumer<Produto> imprimirConsumer = p -> System.out.printf("Produto: %s ---> Preço: %.2f\n",p.nomeString, p.preDouble);
		
		
		
		produtos.forEach( p -> imprimirConsumer.accept(p));
		produtos.forEach( po -> System.out.println(po.toString()));
	}
}
