public class Conta {
    Integer numero;
    String agencia;
    String nomeTitular;
    double saldo;

    public Conta(Integer numero, String agencia, String nomeTitular, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // --- MÉTODO TOSTRING() ---
    @Override // Boa prática para indicar que estamos sobrescrevendo um método
    public String toString() {
        return "Conta {" +
                "Número da Conta: " + numero +
                ", Agência: '" + agencia + '\'' +
                ", Titular: '" + nomeTitular + '\'' +
                ", Saldo: R$" + String.format("%.2f", saldo) +
                '}';
    }

    public void saque(double valor) {
        this.saldo -= valor;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }
}
