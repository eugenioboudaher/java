package TratamentoDeErros;

public class NumeroForaIntervalo {

	String nomeAtributo;
	
	public NumeroForaIntervalo (String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}
	

	public String getMessage() {
		return String.format("O atributo %s está negativo", nomeAtributo);
	}
}
