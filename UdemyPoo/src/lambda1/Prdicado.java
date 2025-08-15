package lambda1;

import java.util.function.Predicate;

public class Prdicado {
	
	public static void main(String[] args) {
		
		Predicate<Produto> isCaroPredicate = prod -> 
		(prod.preDouble * (1 - prod.desDouble)) >= 50;
		
		Produto produto = new Produto("note", 100.0, 0.11);
		System.out.println(isCaroPredicate.test(produto));
		
		
	}
}
