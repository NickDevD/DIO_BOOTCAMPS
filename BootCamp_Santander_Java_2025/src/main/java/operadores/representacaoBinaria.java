package operadores;

public class representacaoBinaria {
    public static void main(String[] args) {

        var  value1 = 6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro numero da operação %s (representação binária %s)\n",value1, binary1);

        var  value2 = 5;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n",value2, binary2);

        var resultado = value1 | value2;
        var binaryResult = Integer.toBinaryString(resultado);
        System.out.printf("%s | %S = %s (representação binaria %s)\n", value1, value2,resultado,binaryResult);

    }
}
