import java.util.ArrayList;
import java.util.List;

public class SysConta {

    List<Conta> contas;

    public SysConta() {
        contas = new ArrayList<>();
    }

    // Adicionar conta
    public void addConta(Conta conta){
        contas.add(conta);
        System.out.println("Olá "+
                conta.getNomeTitular()+
                ", obrigado por criar uma conta em nosso banco, sua agência é "+
                conta.getAgencia()+", conta "+
                conta.getNumero()+" e seu saldo "+
                conta.getSaldo()+" já está disponível para saque");
    }


    // Remover conta
    public void removerConta(String nomeTitular){
        Conta contaRemover = null;
        for (Conta conta : contas) {
            if (conta.getNomeTitular().equals(nomeTitular)) {
                contaRemover = conta;
                break;
            }
        }
        contas.remove(contaRemover);
        System.out.println("Conta removido com sucesso");
    }


    public void consultarContas() {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada no momento.");
            return;
        }
        System.out.println("\n==== Contas Cadastradas ====");
        for (Conta conta : contas) {
            System.out.println(conta); // Certifique-se de ter um método toString() em sua classe Conta
        }
        System.out.println("============================");
    }

    // Adicionando um método para buscar uma conta
    public Conta buscarConta(int numeroConta, String agencia) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta && conta.getAgencia().equals(agencia)) {
                return conta; // Retorna a conta se encontrada
            }
        }
        return null; // Retorna null se a conta não for encontrada
    }

    // Método para realizar saque através de SysConta
    public boolean realizarSaque(int numeroConta, String agencia, double valor) {
        Conta conta = buscarConta(numeroConta, agencia);
        if (conta != null) {
            // Delega a operação de saque para a instância de Conta
            conta.saque(valor);
            System.out.println("Saque realizada com sucesso. Saldo restante: "+conta.getSaldo());
            return true;
        } else {
            System.out.println("Conta não encontrada. Verifique o número da conta e a agência.");
            return false;
        }
    }

    // Método para realizar depósito através de SysConta
    public boolean realizarDeposito(int numeroConta, String agencia, double valor) {
        Conta conta = buscarConta(numeroConta, agencia);
        if (conta != null) {
            // Delega a operação de depósito para a instância de Conta
            conta.deposito(valor);
            System.out.println("Depósito realizado com sucesso. Saldo atual: "+conta.getSaldo());
            return true;
        } else {
            System.out.println("Conta não encontrada. Verifique o número da conta e a agência.");
            return false;
        }
    }


}
