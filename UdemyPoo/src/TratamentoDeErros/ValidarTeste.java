package TratamentoDeErros;

public class ValidarTeste {

	public static void main(String[] args) {
		
		try {
			AlunoReduce aluno = new AlunoReduce("Ana", -7.0);		
			Validar.usuario(aluno);
		} catch (StringVazia | NumeroNegativoException e) {
			System.out.println(e.getMessage());
		} 
		
		System.out.println("Fim: ");
	}
}
