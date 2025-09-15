package TratamentoDeErros;

public class checkadaVsNaoChecada {

    public static void main(String[] args) {
        // Capturando exceção não verificada (unchecked)
        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println("Erro 1 capturado: " + e.getMessage());
        }

        // Capturando exceção verificada (checked)
        try {
            geraErro2();
        } catch (Exception e) {
            System.out.println("Erro 2 capturado: " + e.getMessage());
        }

        // Linha final do programa
        System.out.println("Fim --------------------");
    }

    // Método que lança exceção não verificada (unchecked)
    static void geraErro1() {
        throw new RuntimeException("Erro 1");
    }

    // Método que lança exceção verificada (checked)
    static void geraErro2() throws Exception {
        throw new Exception("Erro 2");
    }
}
