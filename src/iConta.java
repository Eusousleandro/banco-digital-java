public interface iConta {
    void sacar(double valor);

    void depositar(double valor, Conta conta);

    void transferir(double valor, Conta contaDestino );

}
