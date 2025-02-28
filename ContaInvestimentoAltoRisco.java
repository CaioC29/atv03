public class ContaInvestimentoAltoRisco extends ContaInvestimento {
    private static final double TAXA_SAQUE = 0.05; // 5%
    private static final double SALDO_MINIMO = 10000.0;

    public ContaInvestimentoAltoRisco(String numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Não foi possível concluir a operação");
            return false;
        }

        if (saldo < SALDO_MINIMO) {
            System.out.println("Voçê precisa de pelo menos R$ " + SALDO_MINIMO + " para realizar o saque.");
            return false;
        }

        double valorComTaxa = valor * (1 + TAXA_SAQUE);
        
        if (valorComTaxa <= saldo) {
            saldo -= valorComTaxa;
            System.out.println("Saque de R$ " + valor + " concluído com sucesso.");
            System.out.println("Taxa de saque: R$ " + String.format("%.2f", valor * TAXA_SAQUE));
            return true;
        } else {
            System.out.println("Não há saldo suficiente para concluir a operação");
            return false;
        }
    }
} 