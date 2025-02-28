public class ContaSalario extends ContaCorrente {
    private int saquesGratuitosRestantes;
    private static final double TAXA_SAQUE = 5.0;

    public ContaSalario(String numeroConta, String titular, double saldoInicial, double limiteChequeEspecial) {
        super(numeroConta, titular, saldoInicial, limiteChequeEspecial);
        this.saquesGratuitosRestantes = 1;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Não foi possível concluir a operação.");
            return false;
        }

        double valorTotal = valor;
        if (saquesGratuitosRestantes <= 0) {
            valorTotal += TAXA_SAQUE;
            System.out.println("R$ " + TAXA_SAQUE + " de taxa de saque aplicada.");
        }

        if (valorTotal <= (saldo + limiteChequeEspecial)) {
            saldo -= valorTotal;
            if (saquesGratuitosRestantes > 0) {
                saquesGratuitosRestantes--;
                System.out.println("Saque realizado);
            }
            System.out.println("Saque de R$ " + valor + " concluído com sucesso.");
            return true;
        } else {
            System.out.println("Não há saldo suficiente para concluir a operação");
            return false;
        }
    }
} 