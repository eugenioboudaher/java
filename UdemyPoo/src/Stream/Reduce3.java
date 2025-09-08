package Stream;

import java.util.Arrays;
import java.util.List;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
	
	public static void main(String[] args) {
		
		
		AlunoReduce a1 = new AlunoReduce("Ana", 7.3);
		AlunoReduce a2 = new AlunoReduce("Luna", 5.1);
		AlunoReduce a3 = new AlunoReduce("Gui", 2.1);
		AlunoReduce a4 = new AlunoReduce("Gabi", 10.0);
		
		
		List<AlunoReduce> alunosAlunoReduces = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<AlunoReduce> aprovado = a -> a.nota >= 7;
		Function<AlunoReduce, Double> apenasNota = a -> a.nota;
		BiFunction<Media, Double, Media> calcularMediaBiFunction = (media, nota) -> 			media.adicionar(nota);
		BinaryOperator<Media> combinar = (m1, m2) -> Media.combinar(m1, m2);
		
		

	}
}
