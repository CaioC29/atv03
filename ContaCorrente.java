public class ContaCorrente extends ContaBancaria {
    protected double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, String titular, double saldoInicial, double limiteChequeEspecial) {
        super(numeroConta, titular, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Não foi possível realizar a operação.");
            return false;
        }

        if (valor <= (saldo + limiteChequeEspecial)) {
            saldo -= valor;
            System.out.println("Saque no valor de R$ " + valor + " concluído.");
            return true;
        } else {
            System.out.println("Não há saldo suficiente para concluir a operação");
            return false;
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Limite de Cheque Especial: R$ " + String.format("%.2f", limiteChequeEspecial));
    }
} 