package TratamentoDeErros;

public class Validar {
	
	
	private void validar () {}

	public static void usuario (AlunoReduce aluno) {
		if (aluno == null) {
			throw new IllegalAccessError();			
		}	
		if (aluno.nomeString == null || aluno.nomeString.trim().isEmpty()) {
			throw new StringVazia("nome");
		}
		
		if (aluno.nota < 0.0) {
			throw new NumeroNegativoException("nota");
		}
	}
}

