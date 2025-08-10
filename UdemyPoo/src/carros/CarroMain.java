package carros;


public class CarroMain {
	public static void main(String[] args) {
		

		Voyage voyage = new Voyage (120, "branco", 1992);


		voyage.acelerar();
		System.out.println(voyage.velocidadeAtual);


		voyage.ligarTurbo();
		voyage.acelerar();
		System.out.println(voyage.velocidadeAtual);
		
		

	}
}
