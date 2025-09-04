package Stream;

public class AlunoReduce {
	
	final String nomeString;
	final double nota;
	final boolean bomComportamento;
	
	
	public AlunoReduce(String nomeString, double nota, 		boolean bomComportamento) {

		this.nomeString = nomeString;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}
	
	
	public AlunoReduce(String nomeString, double nota) {

		this(nomeString, nota, true);

	}
	
	
}
