package lambda1;

public class Main {

	public static void main(String[] args) {
		
		Soma soma1 = new Soma();
		Multiplicar multiplicar = new Multiplicar();
		
		System.out.println(soma1.executar(3, 2));
		System.out.println(multiplicar.executar(3, 2));
	}
}
