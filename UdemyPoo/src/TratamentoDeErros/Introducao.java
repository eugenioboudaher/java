package TratamentoDeErros;

import java.net.PortUnreachableException;
import Stream.AlunoReduce;

public class Introducao {

	public static void main(String[] args) {
		

        AlunoReduce a6 = null;
        
        try {
        	
        	imprimirAluno(a6);
			
		}catch (Exception e) {
			System.out.println("Ocorreu um erro no momento de imprimir");
		}
	
        
		try {
			System.out.println(7 / 0);
		} catch (Exception e) {
			System.out.println("Error divisão PortUnreachableException zeroException -> " + e);
		}
		System.out.println("Oi");
	}
	public static void imprimirAluno (AlunoReduce aluno) {
		System.out.println(aluno.nomeString);
	}
}
