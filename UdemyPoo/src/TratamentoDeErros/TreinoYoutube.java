package TratamentoDeErros;

import java.util.ArrayList;
import java.util.List;

public class TreinoYoutube {

	public static void main(String[] args) {
		int[] numeros = new int[] {10, 20, 30};
		int[] peso = new int[] {1, 2, 3, 5};
		try {
			System.out.println("Numeros: ");
			List<Integer> resultadoTotal = new ArrayList<>();
			for (int i = 0; i < 3; i++ ) {
				resultadoTotal.add(numeros[i] / peso[i]);
			}
			System.out.println(resultadoTotal);
			System.out.println(numeros[2]);
		} catch (Exception e) {
			System.out.println("Erro de elementos " + e.getMessage());
		}
		System.out.println("fim");
	}
}
