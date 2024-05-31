//Super Classe ou Pai -> Herança
public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int Sequence = 1; // Acrescenta números sequencialmente

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente ) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Sequence++; // Acrescenta números sequencialmente
        this.cliente = cliente;
    }
    //Implementação do Método IConta
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    // Encapsulamento "Gets/Sets
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    protected void imprimirInfComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
