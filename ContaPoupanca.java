public class ContaPoupanca extends ContaBancaria {
    
    public ContaPoupanca(String numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Não foi possível concluir a operação");
            return false;
        }

        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " concluído com sucesso.");
            return true;
        } else {
            System.out.println("Não há saldo suficiente para concluir a operação");
            return false;
        }
    }
} 