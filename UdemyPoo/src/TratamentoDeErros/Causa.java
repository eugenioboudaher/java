package TratamentoDeErros;

public class Causa {

	public static void main(String[] args) {
		try {
			metodo1(null);
		} catch (IllegalArgumentException e) {
			if (e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
		
	}
	static void metodo1 (AlunoReduce aluno) {
		try {
			metodo2(aluno);
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
	}
	static void metodo2 (AlunoReduce aluno) {
		if (aluno == null) {
			throw new NullPointerException("Aluno está nulo");
		}
		System.out.println(aluno.nomeString);
	}
}
