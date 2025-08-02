package Heranca;

public class Jogo {
	
	public static void main(String[] args) {
		
		Jogador jogador1 = new Jogador();		


		
		Jogador jogador2 = new Jogador();		
		jogador2.andar(Direcao.NORTE);
		
		
		Heroi heroi = new Heroi();		
		
		
		heroi.atacar(jogador2);
		System.out.println(jogador2.vida);
		System.out.println(heroi.vida);
		
	}
}
