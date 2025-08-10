package lambda1;

public class Soma implements Calculo{

	@Override
	public double executar(double a, double b) {
		double resultado = a + b;
		return resultado;
	}
}
