package lambda1;

public class Produto {

	final String nomeString;
	final Double preDouble;
	final Double desDouble;
	Double priceFinalDouble;
	
	public Produto(String nomeString, Double preDouble, Double desDouble) {
		this.nomeString = nomeString;
		this.preDouble = preDouble;
		this.desDouble = desDouble;
		this.priceFinalDouble = preDouble * (1 - desDouble);
	}


	@Override
	public String toString() {
		return String.format("Nome: %s --> Desconto: %.2f --> Preço final: R$ %.2f", this.nomeString,
				this.desDouble, this.priceFinalDouble);
	}
	
	
	
}
