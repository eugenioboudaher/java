package lambda1;

import java.util.List;
import java.util.Arrays;

public class ForEach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lala", "Lelé", "Lili", "Loló");
		
		aprovados.forEach(aluno -> {System.out.println(aluno);});
		System.out.println("----------------------------");
		aprovados.forEach(System.out::println);
		System.out.println("----------------------------");
		aprovados.forEach(name -> System.out.println(concatenar(name)));
		System.out.println("----------------------------");
		aprovados.forEach(ForEach::imprimir);
	}
	
	public static String concatenar(String i) {
		return i + " !!!";
	}
	public static void imprimir(String i) {
		System.out.println("Meu nome é " + i);
	}

}
