public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente() {
            @Override
            public void transferir(double valor, Conta contaDestino) {

            }

            @Override
            public void imprimirExtrato(Cliente cliente) {

            }
        };
        cc.depositar(100);

        Conta poupanca = new MyContaPoupanca();
        cc.transferir(100,
                poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

    private static class MyContaPoupanca extends ContaPoupanca {
        @Override
        public void depositar() {

        }

        @Override
        public void transferir(double valor, Conta contaDestino) {

        }
    }
}
