package carros;

public class Fusca extends Carro implements Luxo{
	
	int ano;
	
	public Fusca (int velocidadeMaxima, String cor, int ano) {
		super(velocidadeMaxima, cor);
		this.ano = ano;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public void ligarAr() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void desligarAr() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
