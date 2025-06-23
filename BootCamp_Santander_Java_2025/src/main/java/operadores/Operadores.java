package operadores;

public class Operadores {
    public static void main(String[] args) {

        String nome = "Nicholas ";
        String nome2 = "Nicholas ";

        boolean comparacao = nome == nome2;

        System.out.print("Os nomes são iguais: "+comparacao);

        int num1 = 2;
        int num2 = 3;

        boolean comparacao2 = num1 != num2;
        System.out.print("\nos números são iguais? "+comparacao2);

        boolean comparacao3 = num1 > num2;
        System.out.println("\nO numero " +num1+" é maior que "+num2+" : "+comparacao3);

        boolean comparacao4 = num1 < num2;
        System.out.println("\nO numero " +num1+" é maior que "+num2+" : "+comparacao3);

        boolean comparacao5 = num1 == num2;

    }
}
