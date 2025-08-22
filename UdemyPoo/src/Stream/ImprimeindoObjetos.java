package Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimeindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados =
				 Arrays.asList("Lala", "Lili", "Lolo", "Lulu");
//		------------------------------------------------------
		for (int i = 0; i < aprovados.size(); i++) {
			
			System.out.println(aprovados.get(i));
		}
		System.out.println("---------------------------------");
//		------------------------------------------------------
		Iterator<String> it = aprovados.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
			
		}
		System.out.println("---------------------------------");
//		------------------------------------------------------
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println);
 	}
}
