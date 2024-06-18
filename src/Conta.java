import java.awt.*;

public abstract class Conta implements iConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero(){
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected List<Conta> getConta() {
        List<Conta> conta = new List<Conta>();
        List conta1 = conta;
        return conta1;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor, Conta conta) {
        this.saldo += valor;
    }

    protected void imprimirInformacoesComun() {
        System.out.println(String.format("Ageência: %d", agencia));
        System.out.println(String.format("Número: %d", numero));
        System.out.println(String.format("Saldo: %2f", saldo));
    }

    public abstract void imprimirExtrato(Cliente cliente);

    public abstract void imprimirExtrato();
}
