import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            SysConta sysConta = new SysConta();
            Conta conta = null;

            System.out.println("\n==== Conta Santander ====\n");


            boolean running = false;
            while(!running){
                System.out.println("\n1. Cadastro");
                System.out.println("2. consultar Saldo");
                System.out.println("3. Saque");
                System.out.println("4. Depósito");
                System.out.println("5. Sair");
                System.out.print("Qual o peração deseja realizar? ");

                int op = input.nextInt();
                input.nextLine();

                switch (op){
                    case 1:
                        double saldo = 0.0;
                        System.out.println("Insira os dados para cadastro de conta:\n");
                        System.out.print("Número da conta: ");
                        int numero = input.nextInt();
                        System.out.print("Número da agência: ");
                        String agencia = input.next();
                        System.out.print("Insira o nome do titular: ");
                        String nomeTitular = input.next();
                        System.out.print("Insira o saldo: ");
                        saldo = input.nextDouble();

                        conta = new Conta(numero, agencia,nomeTitular, saldo );
                        sysConta.addConta(conta);
                        break;

                    case 2:
                        sysConta.consultarContas();
                        break;

                    case 3:
                        System.out.print("Insira o número da conta: ");
                        int contaSaque = input.nextInt();
                        System.out.print("Insira a agência: ");
                        String agenciaSaque = input.next();
                        System.out.print("Insira o valor: ");
                        double valorSaque = input.nextDouble();
                        sysConta.realizarSaque(contaSaque, agenciaSaque, valorSaque);
                        break;

                    case 4:
                        System.out.print("Insira o número da conta: ");
                        int contaDeposito = input.nextInt();
                        System.out.print("Insira a agência: ");
                        String agenciaDeposito = input.next();
                        System.out.print("Insira o valor: ");
                        double valorDeposito = input.nextDouble();
                        sysConta.realizarDeposito(contaDeposito, agenciaDeposito, valorDeposito);
                        break;

                    case 5:
                        running = true;
                        break;
                }

            }

        }catch(Exception e){
            System.out.println("Entranda inválida: "+e.getMessage());
        }

    }
}
