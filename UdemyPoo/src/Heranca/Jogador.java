package Heranca;

public class Jogador {
    
    int vida = 100;
	int x = 0;
    int y = 0;
    
    public boolean atacar (Jogador oponente) {
    	
    	int deltax = Math.abs(x - oponente.x);
    	int deltay = Math.abs(y - oponente.y);
    	
    	if (deltax == 0 && deltay == 1) {
    		oponente.vida -= 10;
    		
    	}
    	
    	else if (deltax == 1 && deltay == 0) {
    		oponente.vida -= 10;
    		
    	}
    	
    	else {
    	return false;
    }
		return false;
}
    
    
    public boolean andar(Direcao direcao) {
        
        switch (direcao) {
            case NORTE:
                y++;
                break;
            case SUL:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case OESTE:
                x--;
                break;
            default:
                return false; // direção inválida, se necessário
        }
        
        return true;
    }
}
