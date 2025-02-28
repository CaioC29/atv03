public abstract class ContaBancaria {
    protected String numeroConta;
    protected String titular;
    protected double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("R$ " + valor + " depositado com sucesso.");
        } else {
            System.out.println("Não foi possível concluir o deposito.");
        }
    }

    public abstract boolean sacar(double valor);

    public void exibirInformacoes() {
        System.out.println("----Info Conta----");
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + String.format("%.2f", saldo));
    }

    public double getSaldo() {
        return saldo;
    }
} 