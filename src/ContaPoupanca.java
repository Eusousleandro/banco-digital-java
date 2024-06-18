public abstract class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Conta Poupança ***");
        super.imprimirInformacoesComun();
    }

    public abstract void depositar();
}
