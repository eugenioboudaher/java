package lambda1;

import java.util.function.Predicate;

public class Predicado2 {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isParPredicate = number ->
		number % 2 == 0;
		
		Predicate<Integer> isTres = number ->
		number >= 100 && number < 1000;
		
		int a = 222;
		int b = 22;
		int c = 225;
		System.out.println(isParPredicate.and(isTres).test(a));
		System.out.println(isParPredicate.or(isTres).test(b));
		System.out.println(isParPredicate.and(isTres).negate().test(c));
		System.out.println(isParPredicate.and(isTres).test(a));
		System.out.println(isParPredicate.or(isTres).test(b));
	
		
		
				
	}
	
}
