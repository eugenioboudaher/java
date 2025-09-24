package TratamentoDeErros;

@SuppressWarnings("serial")
public class StringVazia extends RuntimeException{

	private String nomeAtributo;
	
	public  StringVazia(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}
	

	public String getMessage() {
		return String.format("O atributo %s está negativo", nomeAtributo);
	}
}
