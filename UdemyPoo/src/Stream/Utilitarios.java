package Stream;

import java.util.function.UnaryOperator;

public interface Utilitarios {

	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeira = n -> n.charAt(0) + " ";
	public final static UnaryOperator<String> grito = n -> n + "!!!";
}
