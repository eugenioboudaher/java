package TratamentoDeErros;




public class TreinoYoutube23 {
	
	public  static void divide(double a, double b) throws ArithmeticException{
		if (b == 0) {
			throw new ArithmeticException("Invalid division");
		}else {
			System.out.println(a / 2);
		}
	}

	public static void main(String[] args)  {
		
		try {
			divide(5, 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
