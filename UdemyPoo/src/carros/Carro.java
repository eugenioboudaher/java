package carros;

public class Carro {
	int velocidadeMaxima;
	String cor;
	int velocidadeAtual = 0;
	private double aceleracaoIndex = 1;
	
	protected Carro (int velocidadeMaxima, String cor) {
		this.velocidadeMaxima = velocidadeMaxima;
		this.cor = cor;
	}
	
	public void acelerar () {
		if (velocidadeAtual < this.velocidadeMaxima) {
			velocidadeAtual += 20 * aceleracaoIndex;
			System.out.println("Velocidade de: " + velocidadeAtual + " Km/h");
		}else {
			System.out.println("Velocidade de: " + velocidadeAtual + " Km/h");
		}
	};
	public void freiar () {
		if (velocidadeAtual > 0) {
			velocidadeAtual -= 20;
			System.out.println("Velocidade de: " + velocidadeAtual + " Km/h");
		}else {
			velocidadeAtual = 0;
			System.out.println("Velocidade de: " + velocidadeAtual + " Km/h");
		}
	}

	public double getAceleracaoIndex() {
		return aceleracaoIndex;
	}

	public void setAceleracaoIndex(double aceleracaoIndex) {
		this.aceleracaoIndex = aceleracaoIndex;
	};
	
	
	
	
}
