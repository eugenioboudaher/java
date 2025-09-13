package TratamentoDeErros;


import java.io.FileNotFoundException;


public class TreinoYoutube2 {

	public static void main(String[] args) throws FileNotFoundException{
		
		String file = null;
		read(file);
		
	}
	
	private static void read (String name) {	
		try {
			System.out.println(name.length());
		} catch (Exception e) {
			System.out.println("Valor nulo");
		}

	}
}
