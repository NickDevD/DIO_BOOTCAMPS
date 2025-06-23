package operadores;

import java.util.Scanner;

public class operadoresAritmeticos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);

        System.out.println("Resultado: " + num1 + " + " + num2 + " = " + (num1 + num2));

    }
}
