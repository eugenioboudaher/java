package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class ReduceJava2 {

	public static void main(String[] args) {
		
		AlunoReduce a1 = new AlunoReduce("Ana", 7.3);
		AlunoReduce a2 = new AlunoReduce("Luna", 5.1);
		AlunoReduce a3 = new AlunoReduce("Gui", 2.1);
		AlunoReduce a4 = new AlunoReduce("Gabi", 10.0);
		
		List<AlunoReduce> alunos = 			Arrays.asList(a1, a2, a3, a4);
		
		Predicate<AlunoReduce> aprovado = a -> a.nota >= 			7;
		Function<AlunoReduce, Double> notaAluno = a -> 			a.nota;
		BinaryOperator<Double> somatoriOperator = (a, b) 			-> a + b;
		
		
		alunos.stream()
		.filter(aprovado)
		.map(notaAluno)
		.reduce(somatoriOperator)
		.ifPresent(System.out::println);
		
		
	}
}
