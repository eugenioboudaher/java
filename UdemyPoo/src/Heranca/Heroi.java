package Heranca;

public class Heroi extends Jogador{
	
	int vida = 200;
	
	@Override
	public boolean atacar (Jogador oponente) {
    	int deltax = Math.abs(x - oponente.x);
    	int deltay = Math.abs(y - oponente.y);
    	
    	if (deltax == 0 && deltay == 1) {
    		oponente.vida -= 30;
    		
    	}
    	
    	else if (deltax == 1 && deltay == 0) {
    		oponente.vida -= 30;
    		
    	}
    	
    	else {
    	return false;
    }
		return false;
}
	}

