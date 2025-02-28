public class Main {
    public static void main(String[] args) {
        System.out.println("\nConta Corrente");
        ContaCorrente cc = new ContaCorrente("001", "Fulano", 2000.0, 400.0);
        cc.exibirInformacoes();
        cc.sacar(1400.0);
        cc.exibirInformacoes();

        System.out.println("\nConta Poupanca");
        ContaPoupanca cp = new ContaPoupanca("002", "Rodrigo", 1250.0, 110.0);
        cp.exibirInformacoes();
        cp.sacar(1400.0);
        cp.exibirInformacoes();
	cp.sacar(1100.0);
	cp.exibirInformacoes();

        System.out.println("\nConta Investimento");
        ContaInvestimento ci = new ContaInvestimento("003", "Rogério", 1100.0);
        ci.exibirInformacoes();
        ci.sacar(480.0);
        ci.exibirInformacoes();

        System.out.println("\nConta Salário");
        ContaSalario cs = new ContaSalario("004", "Marcelo", 1320.0, 115.0);
        cs.exibirInformacoes();
        cs.sacar(150.0);
        cs.exibirInformacoes();

        System.out.println("\nConta Investimento de Alto Risco");
        ContaInvestimentoAltoRisco ciar = new ContaInvestimentoAltoRisco("005", "Miguel", 15000.0);
        ciar.exibirInformacoes();
        ciar.sacar(1500.0);
        ciar.exibirInformacoes();
    }
} 