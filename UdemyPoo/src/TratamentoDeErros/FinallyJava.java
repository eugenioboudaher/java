package TratamentoDeErros;

import java.util.Scanner;

public class FinallyJava {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Digite o divisor do 7: ");
			System.out.println(7 / sc.nextInt());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finalment...");
			sc.close();
		}
		
		System.out.println("Fim");
	}
	
}
