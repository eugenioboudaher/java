package carros;



public class Voyage extends Carro implements Esportivo, Luxo{

	int ano;
	boolean turbo = false;
	boolean ar = false;
	
	public Voyage(int velocidadeMaxima, String cor, int ano) {
		super(velocidadeMaxima, cor);
		this.ano = ano;
	}
	
	@Override
	public void ligarTurbo() {		
		turbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		turbo = false;
			
	}
	
	@Override
	public void ligarAr() {
		ar = true;	
	}
	
	@Override
	public void desligarAr() {
		ar = false;
		
	}
	
	@Override
	public void acelerar () {
		if (turbo && !ar) {
			setAceleracaoIndex(2);
			velocidadeAtual += 20 * getAceleracaoIndex();
		}else if (turbo && ar) {
			setAceleracaoIndex(1.5);
			velocidadeAtual += 20 * getAceleracaoIndex();
		}else if (!turbo && ar) {
			setAceleracaoIndex(0.9);
			velocidadeAtual += 20 * getAceleracaoIndex();
		}else {
			setAceleracaoIndex(1);
			velocidadeAtual += 20 * getAceleracaoIndex();
		}
		
		
		
		
		
		
		
	}
}
