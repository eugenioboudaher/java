package Stream;

public class Media {

	private double total;
	private int quantidade;
	
	
	public Media adicionar (double valor) {
		total += valor;
		quantidade++;
		return this;
	}
	
	public double getValor () {
		return total / quantidade;
	}
	
	public static Media combinar(Media m01, Media m02) {
		Media resultante = new Media();
		resultante.quantidade = m01.quantidade + 		m02.quantidade;
		resultante.total = m01.total + 		m02.total;
		return resultante;
	
	
	}
}
