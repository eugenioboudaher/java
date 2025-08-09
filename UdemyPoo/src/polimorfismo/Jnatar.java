package polimorfismo;

public class Jnatar {
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(100);
		Arroz arroz = new Arroz(0.5);
		Feijao feijao = new Feijao(0.3);
		Sorvete sorvete = new Sorvete(1);
		
		convidado.comer(arroz);
		convidado.comer(feijao);
		convidado.comer(sorvete);
	}
}
